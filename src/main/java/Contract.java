public abstract class Contract {
    private String date;
    private String name;
    private String email;
    private Vehicle vehicle;

//    private double total;
//    private double monthlyPayment;

    public Contract(String date, String name, String email, Vehicle vehicle) {
        this.date = date;
        this.name = name;
        this.email = email;
        this.vehicle = vehicle;
    }

    public String getDate() {

        return date;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    abstract double getTotalPrice();
//    this can be public too
//    abstract public double getTotalPrice();

    abstract double getMonthlyPayment();
    //so can this
}
