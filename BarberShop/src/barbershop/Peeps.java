package barbershop;

public class Peeps {
	private String arms;
	private String legs;
	private String profession;
	private int age;
	private double height;
	private double weight;
	public static boolean hairCutting;
	private String firstName;
	private String lastName;
	
	Peeps() {
		
	}
	
	public Peeps(String arms, String profession, int age, double height, double weight, String firstName,
			String lastName) {
		this.arms = arms;
		this.profession = profession;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	

	public String getArms() {
		return arms;
	}

	public void setArms(String arms) {
		this.arms = arms;
	}

	public String getLegs() {
		return legs;
	}

	public void setLegs(String legs) {
		this.legs = legs;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isHairCutting() {
		return hairCutting;
	}

	public void setHairCutting(boolean hairCutting) {
		this.hairCutting = hairCutting;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public static void assignProfession(String profession) {
		if (profession.equals("Barber")) {
			hairCutting = true;
		} else {
			hairCutting = false;
		}
	}

	@Override
	public String toString() {
		return "Peeps [arms=" + arms + ", legs=" + legs + ", profession=" + profession + ", age=" + age + ", height="
				+ height + ", weight=" + weight + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
}
