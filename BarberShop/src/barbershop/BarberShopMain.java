package barbershop;



public class BarberShopMain {

	public static void main(String[] args) {
		
		String[] certs = {"Straight razor", "fpr"};
		Barber b2 = new Barber("beards", 45, certs, 23.50, "straight razor");
		System.out.println(b2);
		
		
	}
	public static void menu() {
		System.out.println("******Welcome to barbershop******");
		System.out.println("Enter 1 to schedule appoinment");
		System.out.println("Enter 2 for list of barbers working");
		System.out.println("Enter 3 for barber specializations");
		System.out.println("Enter 4 for to pay for hair cut");
		System.out.println("Enter 5 to exit");
	}
}
