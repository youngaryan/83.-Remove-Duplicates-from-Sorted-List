import java.util.*;

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        Set<Integer> set = new TreeSet<>();
        ListNode result = new ListNode();
        ListNode curr = result;
        while (head != null){
            set.add(head.val);
            head =head.next;
        }
        List<Integer> list = new ArrayList<>(set);

        for (int l : list){
            curr.next = new ListNode(l);
            curr = curr.next;
        }
        return result;
    }
}