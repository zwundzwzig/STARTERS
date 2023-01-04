package ExamTest2;

public class BookDTO {
	int bookPrice, bookYear;
	String bookNo, bookTitle, bookAuthor, bookPublisher;

	public BookDTO(String bookNo, String bookTitle, String bookAuthor, int bookYear, int bookPrice,
			String bookPublisher) {
		this.bookNo = bookNo;
		this.bookTitle = bookTitle;
		this.bookYear = bookYear;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
		this.bookPublisher = bookPublisher;
	}

	public BookDTO() {
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	public int getBookYear() {
		return bookYear;
	}

	public void setBookYear(int bookYear) {
		this.bookYear = bookYear;
	}

	public String getBookNo() {
		return bookNo;
	}

	public void setBookNo(String bookNo) {
		this.bookNo = bookNo;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getBookPublisher() {
		return bookPublisher;
	}

	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}

	@Override
	public String toString() {
		return bookNo + " " + bookTitle + " " + bookYear + " " + bookAuthor + " " + bookPrice + " " + bookPublisher;
	}

}
