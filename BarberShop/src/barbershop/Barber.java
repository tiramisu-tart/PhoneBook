package barbershop;

import java.util.Arrays;

public class Barber extends Peeps {

	private String specialty;
	private int chairNumber;
	private String[] licenses;
	private double ServicePrice;
	private String tools;

	Barber() {
		
	}

	public Barber(String specialty, int chairNumber, String[] licenses, double servicePrice, String tools) {
		super();
		this.specialty = specialty;
		this.chairNumber = chairNumber;
		this.licenses = licenses;
		ServicePrice = servicePrice;
		this.tools = tools;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public int getChairNumber() {
		return chairNumber;
	}

	public void setChairNumber(int chairNumber) {
		this.chairNumber = chairNumber;
	}

	public String[] getLicenses() {
		return licenses;
	}

	public void setLicenses(String[] licenses) {
		this.licenses = licenses;
	}

	public double getServicePrice() {
		return ServicePrice;
	}

	public void setServicePrice(double servicePrice) {
		ServicePrice = servicePrice;
	}

	public String getTools() {
		return tools;
	}

	public void setTools(String tools) {
		this.tools = tools;
	}

	public static void greet(int age, String firstName) {
		if (age <= 25) {
			System.out.println("Wassup");
		} else if (age < 35 && age >= 26) {
			System.out.println("Howdy");
		} else if (age <= 65 && age >= 36) {
			System.out.println("Hey " + firstName);
		} else {
			System.out.println("I'm retiring soon");
		}
	}

	@Override
	public String toString() {
		return "Barber [specialty=" + specialty + ", chairNumber=" + chairNumber + ", licenses="
				+ Arrays.toString(licenses) + ", ServicePrice=" + ServicePrice + ", tools=" + tools + "]";
	}
	
	
}
