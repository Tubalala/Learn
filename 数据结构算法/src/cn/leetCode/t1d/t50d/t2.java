package cn.leetCode.t1d.t50d;
/*给出两个 非空 的链表用来表示两个非负的整数。
其中，它们各自的位数是按照 逆序 的方式存储的，
并且它们的每个节点只能存储 一位 数字。
如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
示例：
输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
输出：7 -> 0 -> 8
原因：342 + 465 = 807*/
public class t2 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        int a, b,carry = 0;;
        ListNode p = l1, q = l2, curr = l3;
        while (p != null || q != null) {
            if (p != null) {
                a = p.val;
            }else{
                a = 0;
            }

            if (q != null) {
                b = q.val;
            }else {
                b = 0;
            }
            int sum = carry + a + b;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null){
                p = p.next;
            }
            if (q != null){
                q = q.next;
            }
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return l3.next;

    }

    public static void main(String[] args) {
        System.out.println(10%10);
    }

}
