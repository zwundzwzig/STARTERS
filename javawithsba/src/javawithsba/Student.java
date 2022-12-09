package javawithsba;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {
	private String name;
//	private int[] marks;
	private ArrayList<Integer> marks = new ArrayList<Integer>();

	public Student(String name, int... marks) {
		this.name = name;
		for(int mark:marks) {
			this.marks.add(mark);
		}
	}
	
	public int getNumberOfMarks() {
		return marks.size();
	}

	public int getTotalSumOfMarks() {
		int sum = 0;
		for(int mark : marks) sum += mark;
		return sum;
	}

	public int getMaximumOfMarks() {
//		int maximum = Integer.MIN_VALUE;
//		for(int mark : marks) {
//			if(mark > maximum) maximum = mark;
//		}
//		return maximum;
		return Collections.max(marks);
	}

	public int getMinimumOfMarks() {
//		int minimum = Integer.MAX_VALUE;
//		for(int mark : marks) {
//			if(mark < minimum) minimum = mark;
//		}
//		return minimum;
		return Collections.min(marks);
	}

	public BigDecimal getAverageOfMarks() {
		int sum = getTotalSumOfMarks();
		int number = getNumberOfMarks();

		return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
	}
	
	public String toString() {
		return name + " : " + marks;
	}

	public void addNewMarks(int mark) {
		marks.add(mark);
	}

	public void removeMark(int index) {
		marks.remove(index);
	}

}
