//package StackAndQueue;

public class MyQueueArray implements IStackQueue{

    @Override
    public boolean isEmpty() {
        return (headIndex == -1) && (tailIndex == -1);
    }

    @Override
    public boolean isFull() {
        return tailIndex == SIZE - 1;
    }

    @Override
    public int pop() {
        int val = -1;
        if (!isEmpty()) {
            val = array[headIndex];
            headIndex++;
            if (headIndex > tailIndex) {
                headIndex = -1;
                tailIndex = -1;
            }
            return val;
        }
        return val;
    }

    @Override
    public void print() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!!!");
        } else {
            for (int i = headIndex; i <= tailIndex; i++) {
                System.err.print(array[i] + " ");
            }
            System.out.println();
        }
    }

    @Override
    public boolean push(int val) {
        if (!isFull()) {
            if (isEmpty()) {
                headIndex++;
            }
            tailIndex++;
            array[tailIndex] = val;
            return true;
        }
        return false;
    }

    public int count() {
        if (isEmpty()) {
            return 0;
        }
        return tailIndex - headIndex + 1;
    }
    
    private int array[];
    private int SIZE;
    private int headIndex;
    private int tailIndex;

    MyQueueArray (int size) {
        SIZE = size;
        array = new int[SIZE];
        headIndex = -1;
        tailIndex = - 1;
    }
}
