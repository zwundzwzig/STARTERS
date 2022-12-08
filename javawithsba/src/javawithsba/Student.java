package javawithsba;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {
	private String name;
	private int[] marks;

	public Student(String name, int... marks) {
		// TODO Auto-generated method stub
		this.name = name;
		this.marks = marks;
	}

	public int getNumberOfMarks() {
		return marks.length;
	}

	public int getTotalSumOfMarks() {
		int sum = 0;
		for(int mark : marks) sum += mark;
		return sum;
	}

	public int getMaximumOfMarks() {
		int maximum = Integer.MIN_VALUE;
		for(int mark : marks) {
			if(mark > maximum) maximum = mark;
		}
		return maximum;
	}

	public int getMinimumOfMarks() {
		int minimum = Integer.MAX_VALUE;
		for(int mark : marks) {
			if(mark < minimum) minimum = mark;
		}
		return minimum;
	}

	public BigDecimal getAverageOfMarks() {
		int sum = getTotalSumOfMarks();
		int number = getNumberOfMarks();

		return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
	}
}
