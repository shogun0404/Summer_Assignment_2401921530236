lass Solution {
    public ListNode middleNode(ListNode head) {
        ListNode currNode = head;
        ArrayList<Integer> arr = new ArrayList<>();
        int n = 0;
        while(currNode != null){
            arr.add(currNode.val);
            currNode = currNode.next;
            n++;
        }

        int mid = n / 2  ;
    
        while(mid > 0){
            head = head.next;
            mid--;

        }
        return head;
    }
}
