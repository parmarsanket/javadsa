public class secondmethod {
    public class node1 {
        public int data;
        public node1 next;
    }
    public  node1 head;
    public  node1 tail;

    public node1 cr(int value)
    {
        node1 n= new node1();
        n.data=value;
        n.next=null;
        head =n;
        tail = n;
        return head;

    }
    public static void main(String[] args) {
        secondmethod s1 = new secondmethod();
        s1.cr(6);
        secondmethod s2 = new secondmethod();
        s2.cr(7);
        System.out.println(s2.head.data);
        System.out.println(s1.head.data);
        
    }


    
}
