/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}

class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int item1 =0 ;
        int item2 =0 ;
        int carry =0 ;
        ListNode returnNode = new ListNode(0);
        ListNode itemNode = returnNode;
        while(true){

            if(l1 ==null && l2 == null)
                break;
            if(l1 == null ) item1 = 0;
            else item1 = l1.val;
            if(l2 == null ) item2 = 0 ;
            else item2 = l2.val;

            int sum = item1+item2+carry;
            carry = sum/10;
            itemNode.next = new ListNode(sum%10);
            itemNode = itemNode.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        if(carry > 0){
            itemNode.next = new ListNode(carry);
        }
        return returnNode.next;
    }
}

class TestNode{
    public static void main(String[] args) {
        /*
        [2,4,3]
[5,6,4]
         */
        ListNode listNode = new ListNode(2);
        ListNode listNode2 = new ListNode(4);
        ListNode listNode3 = new ListNode(3);
        listNode.next = listNode2 ;
        listNode2.next=listNode3;

        ListNode listNode4 = new ListNode(5);
        ListNode listNode5 = new ListNode(6);
        ListNode listNode6 = new ListNode(4);
        listNode4.next = listNode5 ;
        listNode5.next=listNode6;


        Solution.addTwoNumbers(listNode,listNode4);
    }

}
