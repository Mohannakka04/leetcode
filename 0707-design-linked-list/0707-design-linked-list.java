public class Node{
    int data;
    Node next;
    Node(int val)
    {
        data = val;
        next = null;
    }
}
class MyLinkedList {
    public Node head;
    public int size;
    public MyLinkedList() {
        head = new Node(0);
        size = 0;
    }
    
    public int get(int index) {
        if(index>=size)
        {
            return -1;
        }
        Node temp = head.next;
        for(int i=0;i<index;i++)
        {
            temp = temp.next;
        }
        return temp.data;
    }
    
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head.next;
        head.next = newNode;
        size++;
    }
    
    public void addAtTail(int val) {
        Node temp = head;
        while(temp.next!=null)
        {
            temp = temp.next;
        }
        Node newNode = new Node(val);
        temp.next = newNode;
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index>size)
        {
            return ;
        }
        Node temp = head;
        for(int i=0;i<index;i++)
        {
            temp = temp.next;
        }
        Node newNode = new Node(val);
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index>=size)
        {
            return ;
        }
        Node temp = head;
        for(int i=0;i<index;i++)
        {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */