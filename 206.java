class Solution 
{
    public ListNode reverseList(ListNode head) 
    {
        ListNode p=null;
        ListNode c=head;
        ListNode ne=null;
        if(head==null)
            return null;
        if(head.next==null)
            return head;
        while(c!=null)
        {
                ne=c.next;
                c.next=p;
                p=c;
                c=ne;
        }
        return p;
    }
}