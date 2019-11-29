
/**
 * Write a description of class Vehicle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Transport
{
    double km;
    String type;
    double CO2perKM;
    
    /**
     * Constructor for objects of class Vehicle
     */
    public Transport(double km,String type, double CO2perKM)
    {
        // initialise instance variables
        this.km = km;
        this.type = type;
        this.CO2perKM = CO2perKM;
    }
    
    public double calculateCO2inKG() {
        return (CO2perKM * km)/1000;
    }
    
    public void serialize() {
        
    }
}
