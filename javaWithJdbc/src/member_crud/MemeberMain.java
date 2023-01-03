package member_crud;

import java.util.Scanner;

public class MemeberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("===member management program===");
			System.out.println("===1. create member inform===");
			System.out.println("===2. read all member inform===");
			System.out.println("===3. update member inform===");
			System.out.println("===4. delete member inform===");
			System.out.println("===5. get all member inform===");
			System.out.println("===6. exit program===");
			
			System.out.print("press number : ");

			Scanner key = new Scanner(System.in);
			int menu = key.nextInt();
			if (menu == 6) {
				System.out.println("quit program");
				break;
			}
			else if (menu == 1) {
				new MemberInsertView().input();
			}
			else if (menu == 2) {
				new MemberUpdateView().input();
			}
			else if (menu == 5) {
				new TotalSelectView().input();
			}
		}
	}
}
