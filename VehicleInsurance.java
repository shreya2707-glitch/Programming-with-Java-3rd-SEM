class Vehicle {
    String vehicleNumber;
    String ownerName;

    Vehicle(String vehicleNumber, String ownerName) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
    }

    void displayVehicle() {
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Owner Name     : " + ownerName);
    }
}

class CarInsurance extends Vehicle {
    double premium;

    CarInsurance(String vehicleNumber, String ownerName, double premium) {
        super(vehicleNumber, ownerName);   // Calls parent constructor
        this.premium = premium;
    }

    void displayInsurance() {
        super.displayVehicle();           // Calls parent method
        System.out.println("Insurance Premium : " + premium);
    }
}

public class VehicleInsurance {
    public static void main(String[] args) {

        CarInsurance c = new CarInsurance("MH12AB1234", "Shreya Panda", 12000);

        c.displayInsurance();
    }
}