package cn.leetCode.t100d.t150d;

import cn.function.domain.ListNode;

import java.util.HashMap;

public class t142 {
    /*public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        HashMap<ListNode, Integer> map = new HashMap<>();
        ListNode p = head;
        int pos = 0;
        while (p.next != null) {
            if (map.containsKey(p)) {
                return p;
            }else {
                pos++;
                map.put(p,pos);
                p = p.next;
            }
        }
        return null;
    }*/
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode f = head;
        ListNode s = head;
        do {
            if (f == null || f.next == null) {
                return null;
            }
            f = f.next.next;
            s = s.next;
        }while (f != s);
        s = head;
        while (s != f) {
            f = f.next;
            s = s.next;
        }
        return s;
    }
}
