package javawithsba;

import java.util.ArrayList;

public class Book {

	private String favoratePart;
	private ArrayList<Review> reviews = new ArrayList<>();

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

	public void addReview(Review review) {
		this.reviews.add(review);
	}
	
	public String toString() {
		return String.format("favorite part is %s \nMy review is %s", favoratePart, reviews);
	}

}
