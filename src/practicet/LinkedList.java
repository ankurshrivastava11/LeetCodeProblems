package practicet;

public class LinkedList {
	
	public LinkedList()
	{
		length = 0;
	}
	
	ListNode head;//holds head of the list
	private int length = 0;//length of the linked list
	
	public synchronized ListNode getHead() {
		return head;//return first node in list
	}
	
	public synchronized void insertAtBegin(ListNode node){
		node.setNext(head);//insert a node at beginning
		head = node;
		length++;
	}
	
	public synchronized void insertAtEnd(ListNode node){
		if(head == null)
		{
			head = node;
		}
		else{
			ListNode p,q;
			for(p=head;(q=p.getNext())!=null;p=q)
			{
				p.setNext(node);
			}
		}
			length++;
		}
	
	//Add a new value to the list at a given position
	//All values at that position to the end move over to make room
	public void insert(int data,int position){
		//fix the position
		if(position  < 0){
			position = 0;
		}
		if(position > length){
			position = length;
		}
		if(head == null){
			head = new ListNode(data);
		}
		else if(position == 0){
			ListNode temp = new ListNode(data);
			temp.next = head;
			head = temp;
		}
		else{
			ListNode temp = head;
			for(int i =1;i<position;i++){
				temp = temp.getNext();
			}
			ListNode newNode = new ListNode(data);
			newNode.next = temp.next;
			temp.setNext(newNode);
		}
		length +=1;
	}
		
		
		
}

