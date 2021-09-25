
public class Item {
	private long id;
	private String name;
	private int quantity;
	private double price;

	public Item() {
		super();
	}

	
	public Item(int id, String name,int quantity, double price) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", quantity=" + quantity + ", price=" + price + "]";
	}

	public long getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	

	public void setId(long id) {
		this.id = id;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getQuantity() {
		return quantity;
	}
	

	public double getPrice() {
		return price;
	}

}