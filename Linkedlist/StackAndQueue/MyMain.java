//package StackAndQueue;

public class MyMain {
    public static void main(String[] args) {
        // MyArrayStack myStack = new MyArrayStack(3);

        // myStack.push(1);
        // myStack.push(2);
        // myStack.push(3);

        // myStack.print();

        // myStack.pop();
        // myStack.print();

        // MyQueueArray myQueue = new MyQueueArray(3);

        // myQueue.push(3);
        // myQueue.push(2);
        // myQueue.push(1);
        // myQueue.print();

        // System.out.println(myQueue.pop());
        // myQueue.print();


        MyLinkedListStack _myStack = new MyLinkedListStack(); 

        _myStack.push(1);
        _myStack.push(2);
        _myStack.push(3);
        
        System.out.println(_myStack.pop()); 
        _myStack.print();
    }
}
