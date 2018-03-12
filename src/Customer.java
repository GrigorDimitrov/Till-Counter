
public class Customer {

	public double paid;
	public Transaction myTransaction;
	
	public Customer(double paid)
	{
		this.paid = paid;
	}

	public double getPaid() {
		return paid;
	}

	public void setPaid(double paid) {
		this.paid = paid;
	}
	
	
}
