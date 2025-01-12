package Amazon;

public class DeleteNodes {

    class Node
  {
      int data;
      Node next;
      Node(int data)
      {
          this.data = data;
          this.next = null;
      }
  }
    static void linkdelete(Node head, int n, int m) {
        Node curr = head;
        while(curr != null) {
            for(int i = 1; i < m ; i++) if(curr != null) curr = curr.next;
            Node nxt = curr;
            for(int i = 0; i <= n ; i++) if(nxt != null) nxt = nxt.next;
            if(curr != null) {
                curr.next = nxt;
                curr = curr.next;
            }
        }
    }
}
