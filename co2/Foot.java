public class Foot extends Transport
{
    static double CO2perKM = 0;
    static String type = "Foot";
    public Foot(double km)
    {
        super(km, type, CO2perKM);
    }
}
