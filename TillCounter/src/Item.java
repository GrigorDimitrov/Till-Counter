
public abstract class Item {
	
	protected double price;
	protected int id;
	protected String name;
	
	public Item(int id, String name, double price) {
		
		this.id = id;
		this.name = name;
		this.price = price;
		
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
