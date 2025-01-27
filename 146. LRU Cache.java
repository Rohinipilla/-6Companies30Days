class Node{
        int key;
        int value;
        Node prev;
        Node next;
        
        Node(int key,int value){
            this.key = key;
            this.value = value;
            this.prev = null;
            this.next = null;
        }
}
class LRUCache {
    private int capacity;
    private Map<Integer,Node> cache;
    private Node head;
    private Node tail;

    void add(Node node){
        
        Node nextnode = head.next;
        head.next = node;
        node.next =nextnode;
        node.prev = head;
        nextnode.prev = node;
    }
    
    void remove(Node node){
        Node prevNode = node.prev;
        Node nextNode = node.next;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
        this.head = new Node(-1,-1);
        this.tail = new Node(-1,-1);
        this.head.next = tail;
        this.tail.prev = head;
    }
    
    public int get(int key) {
        if(!cache.containsKey(key)){
            return -1;
        }
        Node node = cache.get(key);
        remove(node);
        add(node);
        
        return node.value;
    }
    
    public void put(int key, int value) {
        if(cache.containsKey(key)){
            Node old = cache.get(key);
            remove(old);
        }
        
        Node node = new Node(key,value);
        cache.put(key,node);
        add(node);
        
        if(cache.size() > capacity){
            Node del = tail.prev;
            remove(del);
            cache.remove(del.key);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
