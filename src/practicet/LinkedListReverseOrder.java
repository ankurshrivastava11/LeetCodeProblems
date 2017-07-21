package practicet;

public class LinkedListReverseOrder {
	public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr = head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int len = 0;
        while(curr != null)
        {
            len++;
            curr = curr.next;
        }
        curr = head;
        int rounds = len/k;
        int i = 0;
        while(i<rounds)
        {
            ListNode tail = curr;
            int j = 0;
            while(j<k-1)
            {
                tail = tail.next;
                j++;
            }
            ListNode nxt = null;
            ListNode prev = null;
            while(curr!=tail.next){
                nxt = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nxt;
            }
            curr = tail.next;
            i++;
        }
        
        return dummy.next;
    }
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		  }
	
	

}
