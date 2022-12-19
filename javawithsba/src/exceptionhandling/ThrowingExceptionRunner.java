package exceptionhandling;

class Amount {
	private String currency; 
	private int amount;
	
	public Amount(String currency, int amount) {
		this.currency = currency;
		this.amount = amount;
	}
	
	public void add(Amount other) throws Exception {
		if(!this.currency.equals(other.currency)) {
			throw new Exception("Currencies Don't Match");
		}
		this.amount = this.amount + other.amount;
	}
	
	public String toString() {
		return amount + " " + currency;
	}
}

class CurrenciesDoNotMatchException extends Exception {
	
}

public class ThrowingExceptionRunner {

	public static void main(String[] args) throws Exception {
		Amount amount1 = new Amount("JavaScript", 5);
		Amount amount2 = new Amount("Java", 10);
		
		amount1.add(amount2);
		System.out.println(amount1);
	}

}
