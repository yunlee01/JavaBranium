import java.util.ArrayList;

//package StackAndQueue;

public class MyLinkedListStack implements IStackQueue{

    @Override
    public boolean isEmpty() {
        return topNode == null;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            return -1;
        }

        int val = topNode.val;
        topNode = topNode.next;
        return val;
    }

    @Override
    public void print() {
        if (isEmpty()) {
            System.out.println("List is Empty!!!");
        } else {
            Node temp = topNode;
            //ArrayList<Integer> tempList = new ArrayList<>();
            while (temp != null) {
                // tempList.add(temp.val);
                System.out.print(temp.val);
                temp = temp.next;
                if (temp != null) {
                    System.out.print(" -> ");
                } else {
                    System.out.println();
                }
            }

            // for (int i = tempList.size() - 1; i >= 0; i--) {
            //     System.out.print(tempList.get(i) + " ");
            // }
        }
    }

    @Override
    public boolean push(int val) {
        if (!isFull()) {
            Node newNode = new Node(val);
            newNode.next = topNode;
            topNode = newNode;
            return true;
        }
        return false;
    }

    private class Node {
        int val;
        Node next;
        Node (int val) {
            this.val = val;
        }
    }

    Node topNode;
    MyLinkedListStack (){
        topNode = null;
    }
    
}
