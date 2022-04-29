package barbershop;

public class Customer extends Peeps {

	private double cash;
	private double hairLength;
	

	Customer() {
	
	}


	public Customer(double cash, double hairLength) {
		super();
		this.cash = cash;
		this.hairLength = hairLength;
	}



	public double getCash() {
		return cash;
	}



	public void setCash(double cash) {
		this.cash = cash;
	}



	public double getHairLength() {
		return hairLength;
	}



	public void setHairLength(double hairLength) {
		this.hairLength = hairLength;
	}



	public static double setPriceHairLength(double hairLegnth, double price) {
		if (hairLegnth > 5) {
			price *= 1.1;
			return price;
		}
		return price;
	}


	@Override
	public String toString() {
		return "Customer [cash=" + cash + ", hairLength=" + hairLength + "]";
	}

}
