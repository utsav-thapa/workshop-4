import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class DealershipFileManager {

    public static Dealership getDealership() {
        FileReader fileReader;
        BufferedReader bufferedReader;

        try {
            fileReader = new FileReader("src/main/resources/inventory.csv");
            bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine();
            String[] header = line.split("\\|");
            String dealerName = header[0];
            String dealerAddress = header[1];
            String dealerPhone = header[2];

            Dealership dealership = new Dealership(dealerName,dealerAddress,dealerPhone);


//            System.out.printf("%-10s %-10s %-12s","Dealer","Address","Phone Number");
//            System.out.printf("%-10s %-10s %-12s",dealerName,dealerAddress,dealerPhone);

            while (line != null) {
                String[] eachVehicle = line.split("\\|");
                int vin = Integer.parseInt(eachVehicle[0]);
                int year = Integer.parseInt(eachVehicle[1]);
                String make = eachVehicle[2];
                String model = eachVehicle[3];
                String vehicleType = eachVehicle[4];
                String color = eachVehicle[5];
                int odometer = Integer.parseInt(eachVehicle[6]);
                double price = Double.parseDouble(eachVehicle[7]);

                Vehicle vehicle = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);

                dealership.addVehicle(vehicle);
            }
            return dealership;


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public ArrayList<Vehicle> getAllVehicles(){
//        System.out.printf("%-10s %-5s %-10s %-8s %-12s %-8s %-12s %-12s\n","Vin","Year","Make","Model","Vehicle Type","Color","Odometer","Price");
//
//        for(Vehicle s: inventory) {
//            s.allVehicles();
//        }
        return null;
    }

    public static Dealership saveDealership(Dealership dealership){
        return null;
    }



}
//
//Scanner scanner = new Scanner(System.in);
//        System.out.print("What is the VIN? ");
//int vin = Integer.parseInt(scanner.nextLine());
//
//        System.out.print("What is the year? ");
//int year = Integer.parseInt(scanner.nextLine());
//
//        System.out.print("What is the make of your car? ");
//String make = scanner.nextLine();
//
//        System.out.print("What is the model of the car? ");
//String model = scanner.nextLine();
//
//        System.out.print("What is the vehicle type of the car? ");
//String vehicleType = scanner.nextLine();
//
//        System.out.print("What is the color of the car? ");
//String color = scanner.nextLine();
//
//        System.out.print("How many miles has it travelled so far? (Odometer reading) ");
//int odometer = Integer.parseInt(scanner.nextLine());
//
//        System.out.print("How much $$$?");
//double price = Double.parseDouble(scanner.nextLine());
//
//        try{
//FileWriter fileWriter = new FileWriter("src/main/resources/inventory.csv",true);
//BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//
//String vehicleEntry = String.format("%d|%d|%s|%s|%s|%s|%d|%.2f\n",
//        vin,year,make,model,vehicleType,color,odometer,price);
//            bufferedWriter.write(vehicleEntry);
//            bufferedWriter.close();
//
//            inventory.add(new Vehicle(vin,year,make,model,vehicleType,color,odometer,price));
//
//        } catch (
//IOException e) {
//        throw new RuntimeException(e);
//        }
