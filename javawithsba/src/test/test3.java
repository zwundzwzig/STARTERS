package test;

public class test3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int books = 100;
		int cntOfStu = 12;
		int left = (books / cntOfStu) * cntOfStu ;
		int perfect = (books - left) == 0 ? 0 : left; 
		
		System.out.printf("학생에게 %d권을 공평하게 나눠주고 남은 책은 %d", books / cntOfStu, perfect);
		// 학생에게 ?권을 공평하게 나눠주고 남은 책은 ?, 만약 남은 책이 없으면 출력 x 
	}

}
