
public class SingletonServer
{
    public static void main(String[] args)
    {
	  Order R1 = new Order("Dinner for Two");
	  Order R2 = new Order("Party for ten");
	  Order R3 = new Order("One meal for carry out");
	  R1.placeOrder();
	  R2.placeOrder();
	  R3.placeOrder();
	  R2.cancelOrder();
    }
}