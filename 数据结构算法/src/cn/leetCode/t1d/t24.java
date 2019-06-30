package cn.leetCode.t1d;
/*给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。

你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。

 

示例:

给定 1->2->3->4, 你应该返回 2->1->4->3.

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/swap-nodes-in-pairs
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
public class t24 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode res = new ListNode(0);
        res.next = head;
        ListNode q = res;
        ListNode b = head;
        ListNode p = head.next;
        while (p.next != null){
            q.next = p;
            b.next = p.next;
            p.next = b;
            q = b;
            b = b.next;
            if (b.next != null) {
                p = b.next;
            }
        }
        if (b.next != null ){
            q.next = p;
            b.next = p.next;
            p.next = b;
        }
        return res.next;
    }
}
