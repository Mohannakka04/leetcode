class LRUCache {
    class Node{
        int key;
        int value;
        Node prev;
        Node next;
        Node(int key,int value)
        {
            this.key = key;
            this.value = value;
            prev = null;
            next = null;
        }
    }
    HashMap<Integer,Node> map;
    Node head, tail;
    int size;
    public LRUCache(int capacity) {
        size = capacity;
        map = new HashMap<>();

        head = new Node(0,0);
        tail = new Node(0,0);
        
        head.next = tail;
        tail.prev = head;
    }
    public void insertNode(Node node)
    {
        node.next = head.next;
        node.prev = head;

        head.next.prev = node;
        head.next = node;
    }
    public void deleteNode(Node node)
    {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    
    public int get(int key) {
        if(!map.containsKey(key))
        {
            return -1;
        }
        Node node = map.get(key);
        deleteNode(node);
        insertNode(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key))
        {
            Node node = map.get(key);
            node.value = value;
            deleteNode(node);
            insertNode(node);
        }
        else{
            Node node = new Node(key,value);
            map.put(key,node);
            insertNode(node);
            if(map.size()>size)
            {
                Node lru = tail.prev;
                deleteNode(lru);
                map.remove(lru.key);
            }
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */