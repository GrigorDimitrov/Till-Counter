import java.util.Date;
import java.util.Vector;


public class Transaction {

	private int id;
	public double cost;
	public Date date;
	public double change;
	public double moneyRequired;
	public Item myItem;
	public Payment myPayment;
	public Customer myCustomer;

	public Transaction(int id, int cost, Date date, double change) {
		this.id = id;
		this.cost = cost;
		this.date = date;
		this.change = change;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getCost() {
		return cost;
	}

	public void setQty(int cost) {
		this.cost = cost;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getChange() {
		return change;
	}

	public void setChange(double change) {
		this.change = change;
	}

	public double calculateChange(double amount) {
		if (amount < cost) {
			this.change = cost- amount;
			return this.moneyRequired;
		}

		else {

			this.change = amount - cost;
			return this.change;
		}
	}

}
