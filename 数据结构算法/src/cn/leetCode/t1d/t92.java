package cn.leetCode.t1d;
/*反转从位置 m 到 n 的链表。请使用一趟扫描完成反转。

说明:
1 ≤ m ≤ n ≤ 链表长度。

示例:

输入: 1->2->3->4->5->NULL, m = 2, n = 4
输出: 1->4->3->2->5->NULL

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/reverse-linked-list-ii
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
public class t92 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        int count = 1;
        ListNode p = head;
        ListNode res = new ListNode(0);
        ListNode b = res;
        ListNode d = res;
        while (p != null) {
            if (count == m) {
                //准备翻转
                b.next =new ListNode(p.val);
                d = b.next;//记录res的末尾
            }else if (count > m && count <= n) {
                //用插入的方式进行翻转
                ListNode temp = b.next;
                b.next = new ListNode(p.val);
                b.next.next = temp;
            } else {
                //在末尾添加
                d.next = new ListNode(p.val);
                b = b.next;
                d = d.next;
            }
            count++;
            p = p.next;
        }
        return res.next;
    }


    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
