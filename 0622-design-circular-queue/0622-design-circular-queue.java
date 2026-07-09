public class Node {
    int data;
    Node next;
    Node(int val)
    {
        data = val;
        next = null;
    }
}
class MyCircularQueue {
    public Node head;
    public Node tail;
    int size;
    public MyCircularQueue(int k) {
        head = new Node(0);
        size = k;
        tail = head;
    }
    
    public boolean enQueue(int value) {
        if(isFull())
        {
            return false;
        }
        Node newNode = new Node(value);
        if(isEmpty())
        {
            head.next = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
        size--;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty())
        {
            return false;
        }
        head.next = head.next.next;
        if(head.next==null)
        {
            tail = head;
        }
        size++;
        return true;
    }
    
    public int Front() {
        return isEmpty() ? -1 : head.next.data;
    }
    
    public int Rear() {
        return isEmpty() ? -1 : tail.data;
    }
    
    public boolean isEmpty() {
        return head.next==null;
    }
    
    public boolean isFull() {
        return size==0;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */