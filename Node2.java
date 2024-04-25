package LinkedList;

public class Node2 {
	Node2 next;
	int data;
	
	static void Traverse(Node2 head)
	{
		if(head!=null)
		{
			System.out.println(head.data);
			Traverse(head.next);
		}
	}
	public static void main(String[] args) {
		//traverse LinkedList with recursion...
		Node2 n1=new Node2();
		n1.data=45;
		Node2 n2=new Node2();
		n2.data=46;
		Node2 n3=new Node2();
		n3.data=47;
		
		n1.next=n2;
		n2.next=n3;
		n3.next=null;
		
		Traverse(n1);
	}
}
