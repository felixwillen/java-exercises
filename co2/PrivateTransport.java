public class PrivateTransport extends Transport
{
    // instance variables - replace the example below with your own
    int passenger;

    public PrivateTransport(double km,String type,int passenger, double CO2perKM)
    {
        // initialise instance variables
        super(km,type,CO2perKM);
        this.passenger = passenger;
    }
    
     public double calculateCO2inKG() {
        if(passenger == 0) return super.calculateCO2inKG();

        return super.calculateCO2inKG() / (passenger + 1);
    }
}
