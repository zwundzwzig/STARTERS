package test;

abstract class Information {
	protected String id, name;

	Information(String id, String name) {
		this.id = id;
		this.name = name;
	}

	abstract void add(Information info);

	abstract String print();
}

class Product extends Information {
	private int price;

	Product(String id, String name, int price) {
		super(id, name);
		this.price = price;
	}

	@Override
	void add(Information info) {

	}

	@Override
	String print() {
		return id;
	}

}

class Board extends Information {
	private String contents;
	private int viewcount;

	Board(String id, String name, String contents, int viewcount) {
		super(id, name);
		this.contents = contents;
		this.viewcount = viewcount;
	}

	@Override
	void add(Information info) {
		System.out.println(
				"id : " + this.id + " name : " + this.name + " contents : " + contents + " viewcount : " + viewcount);
	}

	@Override
	String print() {
//		return "id : " + this.id + " name : " + this.name + " contents : " + contents + " viewcount : " + viewcount);
		return super.id;
	}
}

class Member extends Information {
	private String email, phone;

	Member(String id, String name, String email, String phone) {
		super(id, name);
		this.email = email;
		this.phone = phone;
	}

	@Override
	String print() {
		return email;
	}

	@Override
	void add(Information info) {

	}
}

class InformationList {

	Information[] array;
	private int length, count;

	InformationList(String length) {
		this.length = Integer.parseInt(length);
		array = new Information[this.length];
	}

	void add(Information info) {
//		while (count >= length) {array[count++] = info;}
		if(count >= length) {return;} array[count++] = info;
	}

	void read() {
		for(Information arr : array) {
			if(arr != null) { System.out.println(arr);}
		}
	}

}

public class December_13th_second {

	public static void main(String[] args) {
		InformationList list = new InformationList(args[0]);

		list.add(new Board("1", "게시물1", "현재 조회수 10입니다", 10));
		list.add(new Product("100", "웅진비데", 300000));
		list.add(new Member("hong","홍길동","hong@a.com","010-222-2222"));
		list.add(new Board("2","게시물2","새로운 게시물 추가합니다", 0));
		list.add(new Product("200", "웅진정수기", 1000000));
		list.add(new Member("lee","이철수","chul@b.com","010-333-3333"));
		list.read();
	}

}

//InformationList 클래스
//- 멤버변수
//Information 객체들을 저장하는 배열 변수
//- 생성자
//main메소드로부터 명령행매개변수를 전달받아 입력받은 수만큼 배열 length로 하여 배열 객체를 생성한다
//- add 메소드
//main으로부터 전달받은 각 객체들을 멤버변수 배열에 저장한다.
//단, 생성된 배열의 길이만큼만 저장한다.(필요시 변수 추가할 수 있다) 전달받은 객체들은 Information 타입이어야 한다.
//- read 메소드
//배열 내의 각 객체 정보를 출력한다. 

//1:게시물1:현재 조회수 10입니다:10
//100:웅진비데:300000
//hong:홍길동:hong@a.com:010-222-2222
//2:게시물2:새로운 게시물 추가합니다:0
//200:웅진정수기:1000000