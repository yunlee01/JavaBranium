
public class SinglyListNode {

    // Khởi tạo node 
    public static class Node {
        int value;
        Node next;
        Node (int value) {
            this.value = value;
        }
    }

    // Xuất linkedlist
    public static void printLinkedList(Node head) {
        if (head == null) {
            System.out.println(" List is empty !!!");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.value);
                temp = temp.next;
                if (temp != null) {
                    System.out.print(" -> ");
                } else {
                    System.out.println();
                }
            }
        }
    }  

    // Thêm phần tử vào đầu linkedlist
    public static Node addtoHead(Node headNode, int value) {
        Node newNode = new Node(value);
        if (headNode != null) {
            newNode.next = headNode;
        }
        return newNode;
    }

    // Thêm phần tử vào giữa
    public static Node addtoMid(Node headNode, int value, int index) {
        if (index == 0) {
            addtoHead(headNode, value);
        } else {
            // Tìm cur
            Node newNode = new Node(value);
            Node curNode = headNode;
            int count = 0;
            while (curNode != null) {
                count++;
                    if (count == index) {
                        newNode.next = curNode.next;
                        curNode.next = newNode;
                        break;
                    }
                curNode = curNode.next;
            }
        }
        return headNode;
    }

    // Thêm phần tử vào cuối linkedlist
    public static Node addToLast(Node headNode, int value) {
        Node newNode = new Node(value);
        if (headNode == null) {
            return newNode;
        } else {
            // Tìm lastNode của linkedlist
            Node lastNode = headNode;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            //Gán lastNode vào newNode
            lastNode.next = newNode;
        }
        return headNode;
    }

    // Xóa phần tử đầu linkedlist
    public static Node removeAtHead(Node headNode) {
        if (headNode != null) {
            headNode = headNode.next;
        }
        return headNode;
    }

    // Xóa phần tử ở cuối linkedlist
    public static Node removeAtTail(Node headNode) {
        // Tìm previous và last
        Node lastNode = headNode;
        Node preNode = null;
        while (lastNode.next != null) {
            preNode = lastNode;
            lastNode = lastNode.next;
        }

        if (preNode == null) {
            return null;
        } else {
            preNode.next = lastNode.next;
        }
        return headNode;
    }

    // Xóa phần tử ở giữa linkedlist
    public static Node removeAtMid(Node headNode, int index) {
        if (headNode == null || index < 0) {
            return null;
        }

        if (index == 0) {
            return removeAtHead(headNode);
        }

        Node currNode = headNode;
        Node preNode = null;
        int count = 0;
        boolean bIsFound = false;
        while (currNode != null) {   
            if (count == index) {
                bIsFound = true;
                break;
            }
            preNode = currNode;
            currNode = currNode.next;
            count++;
        }

        if (bIsFound) {
            if (preNode == null) {
                return null;
            } else {
                if (currNode != null) {
                    preNode.next = currNode.next;
                }             
            }
        }
        return headNode;
    }

    
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        n1.next = n2;
        n2.next = n3;

        printLinkedList(n1);

        n1 = addtoHead(n1, 0);
        printLinkedList(n1);

        n1 = addToLast(n1, 4);
        printLinkedList(n1);

        n1 = addtoMid(n1, 5, 1);
        printLinkedList(n1);

        n1 = removeAtHead(n1);
        printLinkedList(n1);

        n1 = removeAtTail(n1);
        printLinkedList(n1);

        n1 = removeAtMid(n1, 2);
        printLinkedList(n1);
    }
}
