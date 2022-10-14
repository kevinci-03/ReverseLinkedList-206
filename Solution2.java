public class Solution2 {

    public ListNode reverseList(ListNode head) {  // Time: O(n)  Space: O(1)

        ListNode cur = head;
        ListNode prev = null;
        while (cur != null) {
            ListNode nextNode = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nextNode;
        }
        return prev;

    }

}