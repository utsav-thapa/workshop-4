public class Vehicle {
    private int vin;
    private int year;
    private String make;
    private String model;
    private String vehicleType;
    private String color;
    private int odometer;
    private double price;

    public Vehicle(int vin, int year, String make, String model, String vehicleType, String color, int odometer, double price) {
        this.vin = vin;
        this.year = year;
        this.make = make;
        this.model = model;
        this.vehicleType = vehicleType;
        this.color = color;
        this.odometer = odometer;
        this.price = price;
    }

    public void allVehicles() {

        System.out.printf("%-10d %-5d %-10s %-8s %-12s %-8s %-12d $%12.2f\n",vin,year,make,model,vehicleType,color,odometer,price);
    }

    public double getPrice() {
        return price;
    }

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public int getOdometer() {
        return odometer;
    }

    public String getVehicleType() {
        return vehicleType;
    }
}
