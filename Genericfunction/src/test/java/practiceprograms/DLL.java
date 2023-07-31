package practiceprograms;



public class DLL {
	
	private Node head;
	private Node tail;
	
private int size;
	
	public DLL() {
		this.size=0;
	}
	public void insertFirst(int val) {
		Node node=new Node(val);
		node.next=head;
		node.prev=null;
		
		if(head!=null) {
			head.prev=node;
		}
		head=node;
		
		size++;
	}
	
	public void insertLast(int val) {
		Node node=new Node(val);
		node.prev=tail;
		node.next=null;
		
	}
	
	public Node get(int index) {
		Node node=head;
		for(int i=0;i<index;i++) {
			node=node.next;	
		}
		return node;
	}
	
	public void display() {
		Node node=head;
		while(node!=null) {
			System.out.print(node.value+"->");
			node=node.next;
		}
		System.out.println("end");
		
	}
	
	public void displayReverse() {
		Node last =get(size-1);
		while(last!=null) {
			System.out.print(last.value+"->");
			last=last.prev;
		}
		System.out.println("Start");
	}
	
private class Node{
		
		private int value;
		private Node next;
		private Node prev;
		public Node(int value) {
			this.value=value;
		}
		
		public Node(int value,Node next) {
			this.value=value;
			this.next=next;
		}
	}

}
