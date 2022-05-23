//package StackAndQueue;

public class MyArrayStack implements IStackQueue {

    @Override
    public boolean isEmpty() {
        return topIndex < 0;
    }

    @Override
    public boolean isFull() {
        return topIndex == SIZE - 1;
    }

    @Override
    public int pop() {
        if (!isEmpty()) {
            int val = array[topIndex];
            topIndex--;
            return val;
        }
        return -1;
    }

    @Override
    public boolean push(int val) {
        if (!isFull()) {
            topIndex++;
            array[topIndex] = val;
            return true;
        }
        return false;
    }

    @Override
    public void print() {
        if (isEmpty()) {
            System.out.println("Stack is Empty!!!");
        } else {
            for (int i = 0 ; i <= topIndex; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }

    private int[] array;
    private int SIZE;
    private int topIndex;

    MyArrayStack (int size) {
        SIZE = size;
        array = new int[SIZE];
        topIndex = -1;
    }
    
}