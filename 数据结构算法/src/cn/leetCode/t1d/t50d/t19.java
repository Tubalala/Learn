package cn.leetCode.t1d.t50d;

public class t19 {
/*给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。

示例：

给定一个链表: 1->2->3->4->5, 和 n = 2.

当删除了倒数第二个节点后，链表变为 1->2->3->5.
说明：

给定的 n 保证是有效的。*/
     public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
     }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) {
            return null;
        }
        ListNode a = head;
        ListNode b = head;
        for (int i = 0; i < n; i++) {
            a = a.next;
        }
        if (a == null) {//如果a为空证明移除头结点
            return head.next;
        }
        while (a.next != null) {
            a = a.next;
            b = b.next;
        }
        b.next = b.next.next;
        return head;
    }

    public static void main(String[] args) {
        ListNode l = new ListNode(1);
        l.next = new ListNode(2);
        removeNthFromEnd(l,2);
    }
}
