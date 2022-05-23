package BaiTapLinkedList;

public class BaiTap1 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }

    public static void printListNode(ListNode head) {
        if (head == null) {
            System.out.println("List is empty !!!");
        } else {
            ListNode temp = head;
            while(temp != null) {
                System.out.print(temp.val);
                temp = temp.next;
                if (temp != null) {
                    System.out.print(" -> ");
                } else {
                    System.out.println();
                }
            }
        }
    }

    public static ListNode reverseList(ListNode head) {
        ListNode curNode = head;
        while (curNode.next != null) {
            ListNode nextNode = curNode.next;
            curNode.next = nextNode.next;
            nextNode.next = head;
            head = nextNode;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        printListNode(n1);
        n1 = reverseList(n1);
        printListNode(n1);
    }
}
