package practicet;

public class linkedlistmergesorted {
public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	
	
	ListNode merged = new ListNode(0);
	ListNode start = merged;
	while(l1!=null || l2!= null)
	{
    if(l1 == null)
    {
    	start.next = l2;
    	return merged.next;
    }
    if(l2 == null)
    {
    	start.next = l1;
    	return merged.next;
    }
     if(l1.getData() <l2.getData())
     {
    	 start.next = l1;
    	 l1 = l1.next;
    	 start = start.next;
     }
     if(l1.getData() >l2.getData())
     {
    	 start.next = l2;
    	 l2 = l2.next;
    	 start = start.next;
     }
       
	}
	return merged.next;
	
    }

}
