package cn.leetCode.t200d;

import cn.function.domain.ListNode;

/*反转一个单链表。

示例:

输入: 1->2->3->4->5->NULL
输出: 5->4->3->2->1->NULL*/
public class t206 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode res = new ListNode(0);
        ListNode p = head;
        while (p != null) {
            if (res.next == null) {
                res.next = new ListNode(p.val);
            }else {
                ListNode temp = res.next;
                res.next = new ListNode(p.val);
                res.next.next = temp;
            }
            p = p.next;
        }
        return res.next;
    }
}
