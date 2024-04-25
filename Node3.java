package LinkedList;

public class Node3 {
	Node3 next;
	int data;
	Node3(int data)
	{
		this.data=data;
	}
	
	static void CheckEven(Node3 head)
	{
		while(head!=null)
		{
			if(head.data%2==0)
			{
				System.out.println(head.data);
			}
			head=head.next;
		}
	}
	public static void main(String[] args) {
		//Even Elements of LinkedList 
		Node3 n1=new Node3(10);
		Node3 n2=new Node3(15);
		n1.next=n2;
		
		Node3 n3=new Node3(20);
		Node3 n4=new Node3(25);
		
		n2.next=n3;
		
		Node3 n5=new Node3(30);
		Node3 n6=new Node3(25);
		
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;
		n6.next=null;
		
		CheckEven(n1);
		
	}
}
