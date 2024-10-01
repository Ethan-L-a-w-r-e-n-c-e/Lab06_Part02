import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double priceForGallon = 0;
        double fuelEfficiency = 0;
        double gallonsOfFuel = 0;
        double costPer100;
        double distanceLeft;
        boolean valid = false;

        do {
            System.out.println("Enter Current Number of Gallons of Gasoline in Vehicle");
            if(scan.hasNextDouble()){
                gallonsOfFuel = scan.nextDouble();
                if(gallonsOfFuel >= 0 && gallonsOfFuel <= 63000){
                    System.out.println("Enter Fuel Efficiency in MPG");
                    if(scan.hasNextDouble()){
                        fuelEfficiency = scan.nextDouble();
                        if (fuelEfficiency > 0 && fuelEfficiency <= 14573){
                            System.out.println("Enter current Price for Gallon of Gas");
                            if(scan.hasNextDouble()){
                                priceForGallon = scan.nextDouble();
                                if(priceForGallon > 0){
                                    valid = true;
                                } else {
                                    System.out.println("You have entered the wrong data type");
                                }
                            } else {
                                scan.nextLine();
                                scan.nextLine();
                                System.out.println("You have entered in the wrong data type");
                            }
                        } else {
                            System.out.println("You have entered the wrong range");
                        }
                    } else {
                        scan.nextLine();
                        scan.nextLine();
                        System.out.println("You have entered in a wrong data type");
                    }
                } else {
                    System.out.println("You have entered in a wrong range");

                }

            } else {
                scan.nextLine();
                System.out.println("You have entered the wrong data type");
            }
        } while (!valid);

        distanceLeft = gallonsOfFuel * fuelEfficiency;
        costPer100 = 100/fuelEfficiency*priceForGallon;
        System.out.printf("Cost per 100 miles in $: %8.2f", costPer100);
        System.out.printf("\n Distance Left in Miles: %8.2f", distanceLeft);
    }
}