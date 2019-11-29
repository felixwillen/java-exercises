public class Plane extends Transport
{
    static double CO2perKM = 115;
    static String type = "Plane";
    public Plane(double km)
    {
        super(km, type, CO2perKM);
    }
}
