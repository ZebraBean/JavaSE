package Tests.JavaSE13;

public class 牛客链表回文判断 {
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
class PalindromeList {
    public boolean chkPalindrome(ListNode A) {
        // write code here
        boolean isOdd;
        boolean ans = true;
        ListNode slow = A;
        ListNode slowPre = null;
        ListNode slowNext = A;
        ListNode fast = A;
        while (true){
            if (fast == null){
                isOdd = false;
                break;
            }
            if (fast.next == null){
                isOdd = true;
                break;
            }
            fast = fast.next.next;
            slowNext = slow.next;
            slow.next = slowPre;
            slowPre = slow;
            slow = slowNext;
        }
        if (isOdd == true) {   //如果是奇数个，slow往后走一个
            slow = slow.next;
        }
        while(slow != null){
            if (slow.val != slowPre.val){
                ans = false;
            }
            slow = slow.next;
            slowPre = slowPre.next;
        }
        return ans;
    }
}