public class Train extends Transport
{
    static double CO2perKM = 28;
    static String type = "Train";
    public Train(double km)
    {
        super(km, type, CO2perKM);
    }
}
