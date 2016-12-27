package list;

public class ReverseLinkedList2 {

	public static void main(String[] args) {
		
		Node head=new Node(1, new Node(2,new Node(3,new Node(4,null))));
	//	Node head=new Node(1, new Node(2,null));
		reverseNode(head);
		
		
	}

	static void reverseNode(Node head){
		Node currNode,nextNode , loopNode;
		
		currNode=head;
		nextNode = head.next; 
		head.next = null;
		
		while(nextNode != null) {
            loopNode = nextNode.next;
            nextNode.next = currNode;
            currNode = nextNode;
            nextNode = loopNode;
        }
        head = currNode;
        
        System.out.println();
	}
	
	
//	private static void reverseNode(Node head) {
//		Node currNode,nextNode , loopNode;
//		
//		currNode=head;
//		nextNode=head.next;
//		head.next=null;
//		
//		while(nextNode!=null){
//			loopNode=nextNode.next;
//			nextNode.next=currNode;
//		}
//		
//	}

	static class Node {
		public int data;
		public Node next;

		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}

	}
}
