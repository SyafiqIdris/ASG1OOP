
public class Membership {

	private boolean membership;
	private double price;
	private double memberDiscount;
	
	Membership(){
		membership = false;
		price = 0;
		memberDiscount = 0;
	}
	
	Membership(double newPrice){
		price = newPrice;
	}
	
	public void member() {
		membership = true;
	}
	
	public void nonmember() {
		membership = false;
	}
	
	public void setPrice(double newPrice) {
		price = newPrice;
	}
	
	public void setMemberDiscount(double newMemberDiscount) {
		memberDiscount = newMemberDiscount;
	}
	
	public double getPrice() {
		return price;
	}
	
	public double getMemberDiscount() {
		return memberDiscount;
	}
	
	public double getDiscountedPrice() {
		return (price - ((memberDiscount/100) * price));
	}
	
	public String toString() {
		if (membership == true) {
			return "Total amount after discount: $" + getDiscountedPrice();
		}else {
			return "Total amount: " + price;
		}
	}
}