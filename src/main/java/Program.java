import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        Dealership utsavsVintage = new Dealership("Utsav's Vintage","1800 Meleo Lane","123456");

        Vehicle v = new Vehicle(198223,1966,"Corvette","Chevy","Muscle","Red",32648,25000.87);
        utsavsVintage.addVehicle(v);

        v = new Vehicle(198222,1974,"911","Porsche","racer","Black",328648,35000.87);
        utsavsVintage.addVehicle(v);

        ArrayList<Vehicle> allVehicles = utsavsVintage.getAllVehicles();


    }
}
