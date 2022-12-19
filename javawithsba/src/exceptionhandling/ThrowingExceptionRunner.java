package exceptionhandling;

class Amount {
	private String currency; 
	private int amount;
	
	public Amount(String currency, int amount) {
		this.currency = currency;
		this.amount = amount;
	}
	
	public void add(Amount other) throws CurrenciesDoNotMatchException {
		if(!this.currency.equals(other.currency)) {
			throw new CurrenciesDoNotMatchException("Currencies Don't Match " + this.currency + " and " + other.currency);
		}
		this.amount = this.amount + other.amount;
	}
	
	public String toString() {
		return amount + " " + currency;
	}
}

class CurrenciesDoNotMatchException extends Exception {
	public CurrenciesDoNotMatchException(String message) {
		super(message);
	}
}

public class ThrowingExceptionRunner {

	public static void main(String[] args) throws CurrenciesDoNotMatchException {
		Amount amount1 = new Amount("JavaScript", 5);
		Amount amount2 = new Amount("Java", 10);
		
		amount1.add(amount2);
		System.out.println(amount1);
	}

}
