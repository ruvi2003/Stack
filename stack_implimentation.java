package StackIM;


		public class stack_implimentation {
		    private int maxSize;
		    private int[] stackArray;
		    private int top;

		    public stack_implimentation(int size) {
		        this.maxSize = size;
		        this.stackArray = new int[maxSize];
		        this.top = -1;
		    }

		    public void push(int value) {
		        if (isFull()) {
		            System.out.println("Stack is full");
		            return;
		        }
		        stackArray[++top] = value;
		    }

		    public int pop() {
		        if (isEmpty()) {
		            System.out.println("Stack empty!");
		            return -1;
		        }
		        return stackArray[top--];
		    }

		    public int peek() {
		        if (isEmpty()) {
		            System.out.println("Stack is empty!");
		            return -1;
		        }
		        return stackArray[top];
		    }

		    public boolean isEmpty() {
		        return (top == -1);
		    }

		    public boolean isFull() {
		        return (top == maxSize - 1);
		    }

		    public static void main(String[] args) {
		    	stack_implimentation stack = new stack_implimentation(5);
		        stack.push(50);
		        stack.push(90);
		        System.out.println(stack.pop());
		        System.out.println(stack.peek());
		    }
		

	}

