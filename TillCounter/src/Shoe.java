
public class Shoe extends Item {
	
	private double size;
	private String colour;
	
	public Shoe() {
		super(0, "name", 0.0);
		this.size = 0;
		this.colour = "colour";
		
	}

	public Shoe(int id, String name, double price, double size, String colour) {
		super(id, name, price);
		this.size = size;
		this.colour = colour;
		
	}

	
	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public void display() {
		System.out.println("Shoe ID: "+ this.id + " Name: " + this.name + " price: " + 
	this.price + " colour: " + this.colour);
	}

}
