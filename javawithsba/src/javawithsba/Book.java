package javawithsba;

public class Book {
	
	private String favoratePart;
	void read() {
		System.out.printf("I'm missing JavaScript...\nMy favorite part is %s",
				favoratePart).println();
	}
	public String getFavoratePart() {
		return favoratePart;
	}
	public void setFavoratePart(String favoratePart) {
		this.favoratePart = favoratePart;
		System.out.printf("I'm missing JavaScript...\nMy favorite part is %s",
				favoratePart).println(favoratePart);
	}

}
