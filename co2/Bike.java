public class Bike extends Transport
{
    static double CO2perKM = 0;
    static String type = "Bike";
    public Bike(double km)
    {
        super(km, type, CO2perKM);
    }
}
