package ExamTest2;

import java.util.ArrayList;

class Book {
	int bookPrice, bookYear;
	String bookNo, bookTitle, bookAuthor, bookPublisher;
	
	public Book(String bookNo, String bookTitle, String bookAuthor, int bookYear, int bookPrice, String bookPublisher) {
		this.bookNo = bookNo;
		this.bookTitle = bookTitle;
		this.bookYear = bookYear;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
		this.bookPublisher = bookPublisher;
	}
	
	@Override
	public String toString() {
		return bookNo + " " + bookTitle + " " + bookYear + " " + bookAuthor + " " + bookPrice + " " + bookPublisher;
	}
	
}

class Magazine extends Book {
	int month;
	
	Magazine(String bookNo, String bookTitle, String bookAuthor, int bookYear, int bookPrice, String bookPublisher, int month) {
		super(bookNo, bookTitle, bookAuthor, bookYear, bookPrice, bookPublisher);
//		this.bookPrice = super.bookPrice / 10;
		this.month = month;
	}
	
	@Override
	public String toString() {
		return bookNo + " " + bookTitle + " " + bookYear + " " + bookAuthor + " " + bookPrice + " " + bookPublisher + " " + month;
	}
}

public class BookEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book("B001", "자바프로그래밍", "홍길동", 2021, 30000, "서울출판사");
		Book b2 = new Book("B002", "데이터베이스", "이몽룡", 2020, 25000, "대한출판사");
		Book b3 = new Book("B003", "HTML/CSS", "성춘향", 2022, 18000, "민국출판사");
		Magazine m1 = new Magazine("M001", "자바 월드", "홍길동", 2021, 3000, "서울출판사", 5);
		Magazine m2 = new Magazine("M002", "웹 월드", "이몽룡", 2021, 2500, "서울출판사", 7);
		Magazine m3 = new Magazine("M003", "게임 월드", "성춘향", 2022, 1800, "서울출판사", 9);
		
		System.out.println("도서번호 도서명 저자 출판년도 가격 출판사 발행월");
		System.out.println("------------------------------------");
		ArrayList<Book> ex = new ArrayList<>();
		ex.add(b1);
		ex.add(b2);
		ex.add(b3);
		ex.add(m1);
		ex.add(m2);
		ex.add(m3);
		
		for(Book e : ex) {
			System.out.println(e);
		}

	}

}