package cn.function.domain;

public class ListStack {
    private ListNode head;
    private ListNode p;

    public ListStack() {
        this.head = new ListNode(0);
        this.p = head;
    }

    public boolean push(int item) {
        p.next = new ListNode(item);
        p = p.next;
        return true;
    }

    public int pop(){
        if (p == head) {
            return -1;
        }
        ListNode q = head;
        int res = p.val;
        while (q.next != p) {
            q = q.next;
        }
        q.next = null;
        p = q;
        return res;
    }
}
