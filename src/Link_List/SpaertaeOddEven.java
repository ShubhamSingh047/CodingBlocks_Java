package Link_List;

public class SpaertaeOddEven {
	//https://leetcode.com/problems/odd-even-linked-list/submissions/
    public ListNode oddEvenList(ListNode head) {
        ListNode temp=head;
        ListNode odd=new ListNode();
        ListNode oddH=odd;
        ListNode Even=new ListNode();
        ListNode headE=Even;
        boolean curr=true;
        while(temp!=null){
            if(curr){
                odd.next=temp;
                odd=odd.next;
            }else{
                Even.next=temp;
                Even=Even.next;
            }
            curr=!curr;
            temp=temp.next;
        }
        odd.next=headE.next;
        Even.next=null;
        return oddH.next;
    }
}
