public class Motorbike extends PrivateTransport
{
    static double CO2perKM = 28;
    static String type = "Motorbike";
    public Motorbike(double km, int passenger)
    {
        super(km, type, passenger, CO2perKM);
    }
}
