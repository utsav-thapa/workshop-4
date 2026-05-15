import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;
    private Scanner scanner = new Scanner(System.in);

    public UserInterface(){

    }

    private void init(){
        System.out.println("Loading dealership file.........");
        this.dealership = DealershipFileManager.getDealership();

    }
    public void display() {
        init();
        displayMenu();

    }

    private void displayMenu() {
        String menuHeader = """
                ===============================================
                                    Utsav's Vintage
                ===============================================""";

        String mainMenu = """
                1. Get by Price
                2. Get by Model
                3. Get by Year
                4. Get by Color
                5. Get by Mileage
                6. Get by Vehicle Type
                7. Add Vehicles
                8. Remove Vehicle
                
                0. Exit the Menu
                """;
        boolean running = true;

        while (running) {
            System.out.println(menuHeader);
            System.out.println(mainMenu);
            int userInput = Integer.parseInt(scanner.nextLine());
            switch (userInput) {
                case 1:
                    processGetByPriceRequest();
                    break;
                case 2:
                    processGetByMakeModelRequest();
                    break;
                case 3:
                    processGetByYearRequest();
                    break;
                case 4:
                    processGetByColorRequest();
                    break;
                case 5:
                    processGetByMileageRequest();
                    break;
                case 6:
                    processGetByVehicleTypeRequest();
                    break;
                case 7:
                    processAddVehicleRequest();
                    break;
                case 8:
                    processRemoveVehicleRequest();
                    break;
                case 0:
                    System.out.println("You have exited the program.");
                    running = false;
                    break;
                default:
                    System.out.println("Are you trying to break the system?");
            }


        }

    }


    private void processRemoveVehicleRequest() {
    }

    private void processAddVehicleRequest() {
        dealership.getAllVehicles();

    }

    private void processGetByVehicleTypeRequest() {

    }

    private void processGetByMileageRequest() {

    }

    private void processGetByColorRequest() {
        System.out.println("What color do you want to search for?");
        String userInput = this.scanner.nextLine();

        System.out.println("wanna see partial matches?");
        String partialMatchInput = this.scanner.nextLine();
        boolean partialMatch = false;
        if(partialMatchInput.equalsIgnoreCase("yes")) {
            partialMatch = true;
        }

        ArrayList<Vehicle> vehiclesByColor = this.dealership.getVehiclesByColor(userInput, partialMatch);
        this.displayVehicles(vehiclesByColor);

    }

    private void processGetByYearRequest() {

    }

    private void processGetByMakeModelRequest() {

    }


    private void processGetByPriceRequest() {
    }
    private void displayVehicles(ArrayList<Vehicle> vehicles) {
        for (Vehicle v: vehicles) {
            System.out.println(v.getCsvString());
        }
    }


}




