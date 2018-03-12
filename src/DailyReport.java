
public class DailyReport {

	double balance; 
	double cashInDraw;
	double creditCard;
	
	public DailyReport(double balance, double cashInDraw, double creditCard) {
		this.balance = balance;
		this.cashInDraw = cashInDraw;
		this.creditCard = creditCard; 
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getCashInDraw() {
		return cashInDraw;
	}

	public void setCashInDraw(double cashInDraw) {
		this.cashInDraw = cashInDraw;
	}

	public double getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(double creditCard) {
		this.creditCard = creditCard;
	}
	
	public void countTill()
	{
		
	}
	}
	
}
