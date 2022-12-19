package MultiThreading;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueTest {

	public static void main(String[] args) {
		Stack st = new Stack();
		st.push("HELLO");
		st.push(1);
		st.push('C');
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}
		System.out.println();
		
		Queue qu = new LinkedList();
		qu.offer(1);
		qu.offer(2);
		qu.offer("3");
		qu.offer('A');
		while(!qu.isEmpty()) {
			System.out.println(qu.poll());
		}
	}

}
