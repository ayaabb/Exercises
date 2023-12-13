//ex2:
//*******************************************************
//question 1:
public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null)
           return head;
       
        ListNode prev= reverseList(head.next);
        head.next.next=head;
        head.next=null;
       return prev;
         
    }
	
//*******************************************************
//question 2:
public ListNode mid_element(ListNode head){
   ListNode first=head;
   ListNode second=head;
   if(first==null||first.next==null)
      return first;
   while(second!=null&&second.next!=null)
   {
    first=first.next;
	second=second.next.next;
   }
   return first;
}

//*******************************************************
//question 3:
public boolean cycle_detect(ListNode head){
   ListNode first=head;
   ListNode second=head;
   if(first==null||first.next==null)
      return false;
   while(second!=null&&second.next!=null)
   {
    first=first.next;
	second=second.next.next;
	if(first==second)
	   return true;
   }
   return false;
}