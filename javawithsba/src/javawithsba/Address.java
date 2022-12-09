package javawithsba;

public class Address {
	private String line;
	private String city;
	private int zip;

	public Address(String line, String city, int zip) {
		super();
		this.line = line;
		this.city = city;
		this.zip = zip;
	}
	
	public String toString() {
		return "line is " + line + ", city is " + city + ", zip is " + zip;
	}

}
