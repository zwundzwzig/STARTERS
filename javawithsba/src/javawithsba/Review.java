package javawithsba;

public class Review {
	
	private int id;
	private int rating;
	private String description;
	
	public Review (int id, int rating, String description) {
		this.id = id;
		this.rating = rating;
		this.description = description;
	}
	
	public String toString() {
		return "id : " + id + " rating : " + rating + " description : " + description;
	}
}
