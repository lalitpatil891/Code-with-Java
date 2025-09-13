package LinkedList;

public class LinkedList1 {

	private static class Node {
		int item;
		Node next;
		
		public Node(int item) {
			this.item = item;
			this.next = null;
		}

		@Override
		public String toString() {
			return "Node [item=" + item + ", next=" + next + "]";
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		Node node1 = new Node(100);
		Node node2 = new Node(200);
		Node node3 = new Node(300);
		Node node4 = new Node(500);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		
		System.out.println(node1.item);
		System.out.println(node1.next.item);
		System.out.println(node1.next.next.item);
		System.out.println(node1.next.next.next.item);
		
		System.out.println(node1.toString());
		
	}
}

/* Output
 * 
 * 100
 * 200
 * 300
 */
