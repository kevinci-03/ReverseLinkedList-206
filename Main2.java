public class Main2 {

    public static void main(String[] args) {

        Solution2 s = new Solution2();
        ListNode head1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));
        ListNode head2 = new ListNode(1, new ListNode(2, null));
        ListNode head3 = new ListNode();
        head1 = s.reverseList(head1);
        head2 = s.reverseList(head2);
        head3 = s.reverseList(head3);
        while (head1 != null) {
            System.out.print(head1.val);
            head1 = head1.next;
        }
        System.out.println();
        while (head2 != null) {
            System.out.print(head2.val);
            head2 = head2.next;
        }
        System.out.println();
        while (head3 != null) {
            System.out.print(head3.val);
            head3 = head3.next;
        }
        System.out.println();

    }

}