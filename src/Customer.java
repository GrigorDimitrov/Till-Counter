
public class Customer {

	public static double paid;
	public Transaction myTransaction;
	
	public Customer(double paid)
	{
		this.paid = paid;
	}

	public static double getPaid() {
		return paid;
	}

	public void setPaid(double paid) {
		this.paid = paid;
	}
	
	
}
