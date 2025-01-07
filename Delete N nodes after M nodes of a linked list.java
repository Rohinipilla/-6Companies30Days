class Solution {
    static void linkdelete(Node head, int n, int m) {
        // your code here
        Node curr = head; 
        Node t;
        int count; 

        while (curr != null) {

            for (count = 1; count < m && curr != null; count++){
                curr = curr.next;
            }
            
            if (curr == null){
                return;
            }
                
            t = curr.next;
            for (count = 1; count <= n && t != null; count++) {
                Node temp = t;
                t = t.next;
                temp = null;
            }
            curr.next = t;
            curr = t;
        }

        
    }
}
