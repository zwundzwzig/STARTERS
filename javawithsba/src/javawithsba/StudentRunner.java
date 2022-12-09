package javawithsba;

import java.math.BigDecimal;

public class StudentRunner {
	 
	public static void main(String[] args) {
		int[] marks = {
			(int)(Math.random() * 10) + 1, 
			(int)(Math.random() * 10) + 1, 
			(int)(Math.random() * 10) + 1
		};
		
		Student student = new Student("Ramda", marks);
		
		int number = student.getNumberOfMarks();
		int totalSum = student.getTotalSumOfMarks();
		int maximum = student.getMaximumOfMarks();
		int minimum = student.getMinimumOfMarks();
		BigDecimal average = student.getAverageOfMarks();
		
		System.out.printf("%d %d %d %d %.3f", number, totalSum, maximum, minimum, average).println();
		System.out.println(student);
		
		System.out.println(student);
		student.addNewMarks(99);
		student.removeMark(1);
	}
}
