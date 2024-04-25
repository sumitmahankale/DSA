package LinkedList;

public class Node {
	Node next;
	int data;
	
	static void Traverse(Node head)
	{
		while(head!=null)
		{
			System.out.println(head.data);
			head=head.next;
		}
	}
	public static void main(String[] args) {
		//Traverse LinkedList with normal function....
		Node n1=new Node();
		n1.data=45;
		Node n2=new Node();
		n2.data=46;
		Node n3=new Node();
		n3.data=47;
		
		n1.next=n2;
		n2.next=n3;
		n3.next=null;
		
		Traverse(n1);
	}
}
