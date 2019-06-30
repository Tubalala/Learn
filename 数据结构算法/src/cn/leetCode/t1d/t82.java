package cn.leetCode.t1d;
/*给定一个排序链表，删除所有含有重复数字的节点，只保留原始链表中 没有重复出现 的数字。

示例 1:

输入: 1->2->3->3->4->4->5
输出: 1->2->5
示例 2:

输入: 1->1->1->2->3
输出: 2->3

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list-ii
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
public class t82 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode a = new ListNode(0);
        a.next = head;
        ListNode p = a.next;
        ListNode b = a;
        while (p != null) {
            while (p.next != null || p.val == p.next.val) {
                p = p.next;
            }
            if (b.next == p) {
                b = b.next;
            }else {
                b.next = p.next;
            }
            p = p.next;
        }

        return a.next;
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
