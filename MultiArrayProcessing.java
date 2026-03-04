class Vehicle {

    protected String make;
    protected String model;
    protected int    year;

    public Vehicle(String make, String model, int year) {
        this.make  = make;
        this.model = model;
        this.year  = year;
    }

    public void displayInfo() {
        System.out.println("Vehicle Information:");
        System.out.println("  Make  : " + make);
        System.out.println("  Model : " + model);
        System.out.println("  Year  : " + year);
    }
}

class Car extends Vehicle {

    private int numDoors;

    public Car(String make, String model, int year, int numDoors) {
        super(make, model, year);   
        this.numDoors = numDoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();        
        System.out.println("  Type  : Car");
        System.out.println("  Doors : " + numDoors);
    }
}


class Motorcycle extends Vehicle {

    private boolean hasSidecar;

    public Motorcycle(String make, String model, int year, boolean hasSidecar) {
        super(make, model, year);   
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();        
        System.out.println("  Type     : Motorcycle");
        System.out.println("  Sidecar  : " + (hasSidecar ? "Yes" : "No"));
    }
}


public class VehicleHierarchy {

    public static void main(String[] args) {

        Vehicle[] fleet = {
            new Car       ("Toyota",   "Camry",        2022, 4),
            new Car       ("Ford",     "Mustang",      2023, 2),
            new Motorcycle("Harley-Davidson", "Sportster", 2021, false),
            new Motorcycle("Ural",     "Gear-Up",      2020, true),
            new Car       ("Honda",    "Civic",        2024, 4)
        };

        System.out.println("========================================");
        System.out.println("       Vehicle Hierarchy Demo           ");
        System.out.println("========================================\n");

        for (int i = 0; i < fleet.length; i++) {
            System.out.println("--- Vehicle " + (i + 1) + " ---");
            fleet[i].displayInfo();
            System.out.println();
        }

        System.out.println("========================================");
        System.out.println("        End of Vehicle Report           ");
        System.out.println("========================================");
    }
}
