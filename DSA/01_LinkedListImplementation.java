import java.util.*;

class ListNode {
    int val;
    ListNode next;

    // Initialiser Block
    {
        val = 0;
        next = null;
    }

    ListNode(){}
    ListNode(int val){this.val = val;}
    ListNode(int val, ListNode next){this.val = val; this.next = next;}
}

class Solution {
    static ListNode createLinkedList(){
        ListNode head = null, tail = null;
        int n;
        System.out.print("Enter the size of list: ");
        
        // How to avoid this object.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        while(n != 0){
            int x;
            System.out.print("Val: ");
            x = sc.nextInt();

            ListNode temp = new ListNode(x);

            if (head != null) {
                tail.next = temp;
                tail = temp;
            }   
            else {head = tail = temp;}
            --n;
        }
        sc.close();
        return head;
    }

    static void traverse(ListNode head){
        System.out.println("\nTraversal: " + head);
        ListNode p = head;
        while(p != null){
            System.out.print(p.val + " ");
            p = p.next;
        }
        System.out.println();
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        ListNode head = createLinkedList();
        traverse(head);

        sc.close();
    }
}
