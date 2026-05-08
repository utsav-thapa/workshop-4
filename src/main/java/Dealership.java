import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Dealership {
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        inventory = new ArrayList<>();
    }
    public void addVehicle(Vehicle vehicle){

    }
    public static ArrayList<Vehicle> vehicles(String FilePath) {
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
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
            System.out.printf("%-10s %-10s %-12s","Dealer","Address","Phone Number");
            System.out.printf("%-10s %-10s %-12s",dealerName,dealerAddress,dealerPhone);

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
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return null;

    }

    public ArrayList<Vehicle> getAllVehicles(){
//        System.out.printf("%-10s %-5s %-10s %-8s %-12s %-8s %-12s %-12s\n","Vin","Year","Make","Model","Vehicle Type","Color","Odometer","Price");
//
//        for(Vehicle s: inventory) {
//            s.allVehicles();
//        }
        return inventory;
    }


}
