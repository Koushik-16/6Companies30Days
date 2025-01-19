package Google;

public class MergeKSortedList {
   
 public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 

    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;
        return merge(lists,0,lists.length - 1);
    }

    public ListNode merge(ListNode [] lists , int low , int high) {
        if(low == high) return lists[low];
        else {
            int mid = (low + high) /2;
            ListNode left = merge(lists, low , mid);
            ListNode right = merge(lists , mid + 1, high);
            return mergeTwoSortedList(left , right);
        }
    }

    public ListNode mergeTwoSortedList(ListNode left , ListNode right) {
        if(left == null) return right;
        if(right == null) return left;
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        ListNode h1 = left;
        ListNode h2 = right;

        while(h1 != null && h2 != null) {
            if(h1.val <= h2.val) {
                temp.next = h1;
                h1 = h1.next;
            }else {
                temp.next = h2;
                h2 = h2.next;
            }
            temp = temp.next;
        }

        if(h1 != null) temp.next = h1;
        if(h2 != null) temp.next = h2;
        return dummy.next;

    }






}
