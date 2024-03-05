public class sll {

    public Node head;
    public Node tail;
    public int size;

    public Node create(int value)
    {
        Node node = new Node();
        node.next=null;
        node.value=value;
        head=node;
        tail=node;
        size =1;
        return head;
    }
}