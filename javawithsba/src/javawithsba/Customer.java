package javawithsba;

public class Customer {
	private String name;
	private Address homeAddress;
	private Address workAddress;
	
	public Customer(String name, Address... addresses) {
		this.name = name;
		this.homeAddress = homeAddress;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getWorkAddress() {
		return workAddress;
	}

	public void setWorkAddress(Address workAddress) {
		this.workAddress = workAddress;
	}
	
	public String toString() {
		return String.format("name is - [%s] \nhome address is - [%s] \nwork at [%s]", name, homeAddress, workAddress);
	}
}
