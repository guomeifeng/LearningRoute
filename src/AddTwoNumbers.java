
/**
 * Definition for singly-linked list.
 * */
public class AddTwoNumbers{

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int value = l1.val+l2.val;
        ListNode proNode = null;
        ListNode result = null;
        if (value>=10){
            result = new ListNode(value-10);
            proNode = new ListNode(1);
        }else{
            result = new ListNode(value);
        }
        
        if (null == l1.next && null!=l2.next) {
            if (proNode!=null) {                
                result.next = addTwoNumbers(l2.next, proNode);
            }else{
                result.next = l2.next;
            }
            
        } else if (null == l2.next && null!= l1.next) {
            if (proNode!=null) { 
                result.next = addTwoNumbers(l1.next, proNode);
            }else{
                result.next = l1.next;
            }
            
        } else if (null != l1.next && null != l2.next) {
            if (proNode!=null) { 
                l2.next.val += 1;
            }
            result.next = addTwoNumbers(l1.next, l2.next);
        } else {
            if (proNode!=null) { 
                result.next = proNode;
            }
        }
        return result;
    }

    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


}
