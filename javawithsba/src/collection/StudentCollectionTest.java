package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DescendingStudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		return Integer.compare(student1.getId(), student2.getId());
	}
	
}

public class StudentCollectionTest {

	public static void main(String[] args) {
		List<Student> student1 = List.of(
			new Student(1, "CHO"), 
			new Student(3, "LEE"),
			new Student(2, "KIM")
		);
		System.out.println(student1);
		
		ArrayList<Student> student2 = new ArrayList<>(student1);
		Collections.sort(student2);
		System.out.println(student2);
		
		Collections.sort(student2, new DescendingStudentComparator());
		System.out.println(student2);
		
		student2.sort(new DescendingStudentComparator());
		System.out.println(student2);
		
	}

}
