package javawithsba;

import java.util.Arrays;

public class CustomerRunner {

	public static void main(String[] args) {
		Address homeAddress = new Address("line1", "Seoul", 903);
		Address workAddress = new Address("line2", "YongIn", 204);
		
		Customer customer = new Customer("CHO", homeAddress);
		customer.setWorkAddress(workAddress);
		
		System.out.println(customer);
	}

}
