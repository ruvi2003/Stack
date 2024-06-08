package StackIM3;
		
		import java.util.Stack;

		public class Stack_implimentation3 {
		    public static void main(String[] args) {
		        Stack<Integer> stack = new Stack<>();

		        stack.push(40);
		        stack.push(20);
		        stack.push(10);
		        
		        System.out.println("Top element is " + stack.peek());
		        
		        stack.pop();
		        stack.pop();
		        stack.pop();
		        
		        if (stack.isEmpty()) {
		            System.out.println("Stack is empty");
		        }
		    }
		


	}


