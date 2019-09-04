package cn.leetCode.t100d.t150d;

import cn.function.domain.ListNode;

import java.util.HashMap;

/*给定一个链表，判断链表中是否有环。

为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。

 

示例 1：

输入：head = [3,2,0,-4], pos = 1
输出：true
解释：链表中有一个环，其尾部连接到第二个节点。


示例 2：

输入：head = [1,2], pos = 0
输出：true
解释：链表中有一个环，其尾部连接到第一个节点。


示例 3：

输入：head = [1], pos = -1
输出：false
解释：链表中没有环。


来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/linked-list-cycle
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
public class t141 {
    /*public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        HashMap<ListNode, Integer> map = new HashMap<>();
        ListNode p = head;
        int pos = 0;
        while (p.next != null) {
            if (map.containsKey(p)) {
                return true;
            }else {
                pos++;
                map.put(p,pos);
                p = p.next;
            }
        }
        return false;
    }*/
    /*public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode f = head.next;
        ListNode s = head;
        while (f != s) {
            if (f == null || f.next == null) {
                return false;
            }
            f = f.next.next;
            s = s.next;
        }
        return true;
    }*/
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode f = head;
        ListNode s = head;
        while (f != null && f.next != null) {
            f = f.next.next;
            s = s.next;
            if (f == s) {
                return true;
            }
        }
        return false;
    }
}
