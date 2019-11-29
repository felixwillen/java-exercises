public class Scooter extends Transport
{
    static double CO2perKM = 12;
    static String type = "Scooter";
    public Scooter(double km)
    {
        super(km, type, CO2perKM);
    }
}
