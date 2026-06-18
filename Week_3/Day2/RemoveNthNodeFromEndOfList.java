class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        int pos = 0;
        while(curr != null){
            curr = curr.next;
            pos++;
        }
        curr = head;
        ListNode prev = null;
        while(pos-n > 0){
            prev = curr;
            curr = curr.next;
        }
        if(prev == null){
            head = head.next; 
        }
        else 
            prev.next = curr.next;
    return head;
    }
}
