package javawithsba;

public class Book {

	private String favoratePart;

	void read() {
		System.out.printf("I'm missing JavaScript...\nMy favorite part is %s", favoratePart).println();
	}

	public String getFavoratePart() {
		return favoratePart;
	}

	public void setFavoratePart(String favoratePart) {
		switch (favoratePart) {
		case "":
			this.favoratePart = "Come on! Let me know your favorit part!";
			break;
		default:
			this.favoratePart = favoratePart;
		}

		this.favoratePart = favoratePart;
		System.out.printf("I'm missing JavaScript...\nMy favorite part is %s", this.favoratePart).println();
	}

}
