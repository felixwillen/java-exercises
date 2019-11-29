public class Bus extends Transport
{
    static double CO2perKM = 40;
    static String type = "Bus";
    public Bus(double km)
    {
        super(km, type, CO2perKM);
    }
}
