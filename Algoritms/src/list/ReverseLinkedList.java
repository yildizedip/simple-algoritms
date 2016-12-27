package list;

import java.util.Stack;

public class ReverseLinkedList {

	public static void main(String[] args) {
		Stack stack = new Stack();

		MyNode node = new MyNode(1);
		node.next = new MyNode(2);
		node.next.next = new MyNode(3);

		while (node != null) {
			stack.push(node);
			MyNode n1 = node.next;
			node.next = null;
			node = n1;
		}

		MyNode node2 = (MyNode) stack.pop();
		addNode(stack, node2);
		System.out.println();
	}

	private static void addNode(Stack stack, MyNode node) {
		if (stack.isEmpty())
			return ;
		MyNode node2=(MyNode) stack.pop();
		node.next=node2;
		addNode(stack, node);
		
	}

	public static class MyNode {
		int value;
		MyNode next;

		public MyNode(int k) {
			value = k;
			next = null;
		}

		@Override
		public String toString() {

			MyNode current = this;

			String output = "";

			while (current != null) {
				output += current.value;
				current = current.next;
			}

			return output;

		}

	}

}
