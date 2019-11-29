public class Car extends PrivateTransport
{
    static double CO2perKM = 125;
    static String type = "Car";
    public Car(double km, int passenger)
    {
        super(km, type, passenger, CO2perKM);
    }
}
