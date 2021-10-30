package Tests.JavaSE12;

public class LeetCode_206 {

}
//class ListNode {
//    int val;
//    ListNode next;
//    ListNode() {}
//    ListNode(int val) { this.val = val; }
//    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  }
//class Solution {
//    public ListNode reverseList(ListNode head) {
//        if (head == null)
//            return null;
//        ListNode cur = new ListNode();
//        ListNode pre = new ListNode();
//        ListNode curNext = new ListNode();
//        ListNode newhead = new ListNode();
//        cur = head;
//        pre = null;
//        while (cur != null){   //整个过程画图理解
//            curNext = cur.next;
//            if (curNext == null){   //表明cur已经是最后一个结点了
//                newhead = cur;
//            }
//            cur.next = pre;
//            pre = cur;
//            cur = curNext;
//        }
//        return newhead;
//    }
//}
