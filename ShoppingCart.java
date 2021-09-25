
import java.util.ArrayList;
import java.util.ListIterator;


public class ShoppingCart {

	ArrayList<Item> item;
	double totalAmount;
	double discount;
	
	ShoppingCart() {
		this.item = new ArrayList<Item>();
		this.totalAmount = 0;
		this.discount = 0;
	}
	public void addToCart(Item item) {
		this.item.add(item);
	}
	public void showCart() {
		ListIterator<Item> iterator = item.listIterator();
		while(iterator.hasNext()) {
			Item item1 = iterator.next();
			System.out.println(item1);
		}
	}
	public void removeFromCart(Item i) {
		ListIterator<Item> iterator1 = item.listIterator();
		while(iterator1.hasNext()) {
			Item item2 = iterator1.next();
			if (item2.getName().equals(i.getName())) {
				this.item.remove(i);
				System.out.println("1 item removed \n");
				System.out.println("---------------------------------------------------");
				System.out.println();
				break;
			}
		}
	}
	public double getTotalAmount() {
		ListIterator<Item> iterator2 = item.listIterator();
		this.totalAmount = 0;
		while(iterator2.hasNext()) {
			Item item3 = iterator2.next();
			this.totalAmount = this.totalAmount + (item3.getPrice() * item3.getQuantity());
		}
		return this.totalAmount;
	}

	public void printInvoice() {
		ListIterator<Item> iterator3 = item.listIterator();
		System.out.println("Name"+ "\t\t" + "Qty"+ "\t" + "Price/Unit" + "\t" + "Total price");
		while(iterator3.hasNext()) {
			Item item4 = iterator3.next();
			System.out.print(item4.getName() + "\t\t");
			System.out.print(item4.getQuantity() + "\t");
			System.out.print(item4.getPrice() + "\t\t");
			System.out.println(item4.getPrice() * item4.getQuantity());
		}
		System.out.println("Total amount: $" + this.getTotalAmount());

	}
	

}