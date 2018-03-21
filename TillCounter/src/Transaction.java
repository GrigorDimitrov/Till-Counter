import java.util.Date;
import java.util.Vector;


public class Transaction {

	private int id;
	private Shoe myShoe;
	private Date date;
	private Employee myEmployee;
	//public double cost;
	//public double change;
	//public double moneyRequired;
	//public Payment myPayment;
	//public Customer myCustomer;
	
	

	public Transaction(int id, String shoeName, Date date, Employee myEmployee) {
		this.id = id;
		this.myShoe.setName(shoeName);
		this.date = date;
		this.myEmployee = myEmployee;
	}
	
	public Shoe getMyShoe() {
		return myShoe;
	}

	public void setMyShoe(Shoe myShoe) {
		this.myShoe = myShoe;
	}

	public Employee getMyEmployee() {
		return myEmployee;
	}

	public void setMyEmployee(Employee myEmployee) {
		this.myEmployee = myEmployee;
	}
	
	//set Employee id
	public void setMyEmployeeID(int id) {
		this.myEmployee.setId(id);
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	public void display() {
		System.out.println("Transaction ID: "+ this.id + " Shoe: " + this.myShoe.getName() + " Date: " + 
	this.date + " Employee ID: " + this.myEmployee.getId());
	}
	
/*
	public double getChange() {
		return change;
	}

	public void setChange(double change) {
		this.change = change;
	}

	public double getCost() {
		return cost;
	}
	public void setQty(int cost) {
		this.cost = cost;
	}
	
	*/
	
	
	
/*
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
	
	*/

}
