package StackIM2;

		public class Stack_implimentation2 {
		    private Node top;

		    private class Node {
		        int data;
		        Node next;

		        Node(int data) {
		            this.data = data;
		        }
		    }

		    public void push(int value) {
		        Node newNode = new Node(value);
		        newNode.next = top;
		        top = newNode;
		    }

		    public int pop() {
		        if (isEmpty()) {
		            System.out.println("Stack is empty!");
		            return -1;
		        }
		        int value = top.data;
		        top = top.next;
		        return value;
		    }

		    public int peek() {
		        if (isEmpty()) {
		            System.out.println("Stack is empty!");
		            return -1;
		        }
		        return top.data;
		    }

		    public boolean isEmpty() {
		        return top == null;
		    }

		    public static void main(String[] args) {
		    	Stack_implimentation2 stack = new Stack_implimentation2();
		        stack.push(70);
		        stack.push(80);
		        System.out.println(stack.pop());
		        System.out.println(stack.peek());
		    }
		


	}
