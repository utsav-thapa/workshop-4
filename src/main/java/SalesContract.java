public class SalesContract extends Contract {

    private static final double FOUR_YEAR_RATE = 0.0425;
    private static final double TWO_YEAR_RATE = 0.0525;
    boolean isFinanced;

    public static final int RECORDING_FEE = 100;
    public static final double SALES_TAX = 0.05;

    public SalesContract(String date, String name, String email, Vehicle vehicle, boolean isFinanced) {
        super(date, name, email,vehicle);
        this.isFinanced = isFinanced;
    }

    /**
     * Return the total cos to of the purchase
     * @return Total cost of purchase without financial charges
     * @implNote Does NOT include finance charges
     */

    @Override
    double getTotalPrice() {
        double totalPrice = this.getVehicle().getPrice();

        //processing fee (recording fee)
        totalPrice += RECORDING_FEE;

        double processingFee;
        if(this.getVehicle().getPrice() < 10_000) {
            processingFee = 295;
        }
        else {
            processingFee = 495;
            }
        totalPrice += processingFee;

        totalPrice *= 1 + SALES_TAX;



        return totalPrice;
        }


    @Override
    double getMonthlyPayment() {
        if (!this.isFinanced) {
            return 0;
        }

        double totalPrice = this.getTotalPrice();
        double monthlyPayment;

        if (this.getVehicle().getPrice() >= 10_000) {
            double paymentTotal = totalPrice * Math.pow(1 + FOUR_YEAR_RATE, 4);
            return paymentTotal / 48;
        } else {
            double paymentTotal = totalPrice * Math.pow(1 + TWO_YEAR_RATE, 4);
            return paymentTotal / 24;
        }
    }
}
