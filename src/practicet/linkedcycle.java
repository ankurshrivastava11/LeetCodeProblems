package practicet;

public class linkedcycle {
public boolean hasCycle(ListNode head) {
	
	if(head == null)
	{
		return false;
	}
	
	while(head.next!=null && head.next!=head)
	{
		ListNode tmp = head.next;
		head.next = head.next.next;
		head = tmp;
	}
	return head.next!=null;
        
    }

}
