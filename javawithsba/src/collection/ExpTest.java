package collection;

import java.util.EmptyStackException;
import java.util.Stack;

public class ExpTest {

	public static void main(String[] args) {
		Stack<Character> stack = new Stack<>();
		String[] expressions = { 
			"(5-(2+3)*2)/4", 
			"(2+3)*1)+3", 
			"((2+3)*1)+3", 
			"(5-(2+3)*2)/4)" 
		};

		for (String expression : expressions) {
			try {
				for (Character express : expression.toCharArray()) {
					if (express == '(')
						stack.push(express);
					else if (express == ')')
						stack.pop();
				}
				if (stack.isEmpty()) {
					System.out.println("괄호가 일치합니다." + expression);
				}
			} catch (EmptyStackException e) {
				System.out.println("괄호가 일치하지 않습니다." + expression);
			}
		}

	}

}
