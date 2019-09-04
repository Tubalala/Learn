package cn.leetCode.t1d.t50d;
/*将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 

示例：

输入：1->2->4, 1->3->4
输出：1->1->2->3->4->4

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/merge-two-sorted-lists
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
public class t21 {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        ListNode p = l3;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                p.next = new ListNode(l1.val);
                p = p.next;
                l1 = l1.next;
            } else if (l1.val >= l2.val) {
                p.next = new ListNode(l2.val);
                p = p.next;
                l2 = l2.next;
            }
        }
        if (l1 != null) {
            p.next = l1;
        }
        if (l2 != null) {
            p.next = l2;
        }
        return l3.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
       /* l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);*/

        ListNode l2 = new ListNode(2);
        /*l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);*/

        ListNode list = mergeTwoLists(l1, l2);
        while (list != null) {
            System.out.println(list.val);
            list = list.next;
        }

    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
