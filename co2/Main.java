import java.util.Scanner;

public class Main
{
   public static void main(String[] args) {
    System.out.println("Wie viele Kilometer bist du gefahren?");
    Scanner scan = new Scanner(System.in);  // Create a Scanner object
    double km = scan.nextDouble();
    
    System.out.println("1 Auto \n2 Motorbike \n3 Plane \n4 Train \n5 Bike \n6 Foot\n7 Scooter\n8 Bus"); 
    int choice = scan.nextInt();
    
    switch(choice) {
        case 1:
            System.out.println("Wie viele Personen hast du mitgenommen?");
            int passenger = scan.nextInt();
            Car car = new Car(km, passenger);
            System.out.println("Du hast "+ car.calculateCO2inKG() + "Kg Co2 verbraucht.");
            break;
        
        case 2:
            System.out.println("Wie viele Personen hast du mitgenommen?");
            passenger = scan.nextInt();
            Motorbike motorbike = new Motorbike(km, passenger);
            System.out.println("Du hast "+ motorbike.calculateCO2inKG() + "Kg Co2 verbraucht.");
            break;
        
        case 3:
            Plane plane = new Plane(km);
            System.out.println("Du hast "+ plane.calculateCO2inKG() + "Kg Co2 verbraucht.");
            break;
            
        case 4:
            Train train = new Train(km);
            System.out.println("Du hast "+ train.calculateCO2inKG() + "Kg Co2 verbraucht.");
            break;
            
        case 5:
            Bike bike = new Bike(km);
            System.out.println("Du hast "+ bike.calculateCO2inKG() + "Kg Co2 verbraucht.");
            break;
        
        case 6:
            Foot foot = new Foot(km);
            System.out.println("Du hast "+ foot.calculateCO2inKG() + "Kg Co2 verbraucht.");
            break;
            
        case 7:
            Scooter scooter = new Scooter(km);
            System.out.println("Du hast "+ scooter.calculateCO2inKG() + "Kg Co2 verbraucht.");
            break;
            
        case 8:
            Bus bus = new Bus(km);
            System.out.println("Du hast "+ bus.calculateCO2inKG() + "Kg Co2 verbraucht.");
            break;
       
        default:
            System.out.println("Diese Zahl geht net.");
    }
    

    

   }
}
