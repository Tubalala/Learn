package cn.leetCode.t1d.t100d;
/*给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。

示例 1:

输入: 1->1->2
输出: 1->2
示例 2:

输入: 1->1->2->3->3
输出: 1->2->3

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
public class t83 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode p = head;
        ListNode b = new ListNode(0);
        ListNode q = b;
        while (p.next != null) {
            if (p.val == p.next.val) {
                p = p.next;
            }else {
                q.next = new ListNode(p.val);
                q = q.next;
                p = p.next;
            }
        }
        if (p != null) {
            q.next = new ListNode(p.val);
        }
        return b.next;
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
