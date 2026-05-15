import java.util.ArrayList;

public class Dealership {
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
    public void addVehicle(Vehicle vehicle){

        this.inventory.add(vehicle);
    }
    public ArrayList<Vehicle> getAllVehicles() {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        for (Vehicle v : this.inventory) {
            vehicles.add(v);
        }
        return vehicles;
    }

    public ArrayList<Vehicle> getVehiclesByColor(String color) {
        ArrayList<Vehicle> resultList = new ArrayList<>();

        for (Vehicle currentVehicle : this.inventory) {
            String currentColor = currentVehicle.getColor();

            if (currentColor.equalsIgnoreCase(color)) {
                resultList.add(currentVehicle);
            }
        }
        return resultList;
    }
    public ArrayList<Vehicle> getVehiclesByColor(String color, boolean partialMatch) {
        ArrayList<Vehicle> resultList = new ArrayList<>();

        for (Vehicle currentVehicle : this.inventory) {
            String currentColor = currentVehicle.getColor();
            currentColor = currentColor.toLowerCase();

            if (partialMatch) {

                if (currentColor.contains(color.toLowerCase())) {
                    resultList.add(currentVehicle);
                }
            } else {
                if (currentColor.equalsIgnoreCase(color.toLowerCase())) {
                    resultList.add(currentVehicle);
                }
            }
        }
        return resultList;
    }

    public ArrayList<Vehicle> getVehiclesByPrice(Double min, Double max){
        return null;
    }

    public ArrayList<Vehicle> getVehiclesByMake(String make, String model) {
        return inventory;
    }

    public ArrayList<Vehicle> getVehiclesByYear(int min, int max) {
        return inventory;
    }

    public ArrayList<Vehicle> getVehiclesByType(String vehicleType) {
        return inventory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }
    


    
}
