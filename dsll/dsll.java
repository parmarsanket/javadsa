public class dsll {
    public Node head ;
    public Node tail;
    public int size;


    public Node create(int data)
    {

        Node node = new Node();
        node.data=data;
        node.next=null;
        node.prev=null;
        head=node;
        tail=node;
        size=1;
        return head;
    }
    public void add(int data ,int location)
    {
        if(head==null)
        {
            create(data);
        }
        Node newnode = new Node();
        newnode.data=data;
        if(location==0)
        {
            newnode.next=head;
            head.prev=newnode;
            newnode.prev=null;
            head=newnode;
        }
        else if(location>=size)
        {
            newnode.next=null;
            newnode.prev=tail;
            tail.next=newnode;
            tail=newnode;

        }
        else{
            int count=0;
            Node temp=head;
            while (count <location-1) {
                temp=temp.next;
                count++;
            }
            Node last = temp.next;
            temp.next=newnode;
            newnode.next=last;
            last.prev=newnode;
            newnode.prev=temp;
        }
        size++;
    }
    public void display()
    {
        if (head==null) {
            System.out.println("dsll is empty now");
        }
        Node temp=head;
        int count=size;
        System.out.print("null-->");
        while (count>0) {
            System.out.print(" "+temp.data+" --> ");
            temp=temp.next;
            count--;
            
        }System.out.print("null");
        System.out.println();


    }
    public void delete(int location)
    {
        if (size==1) {
            head=null;
            tail=null;
        }
         else if(size==0)
        {
            return;
        }
        else if(location==0)
        {
            head=head.next;
            head.prev=null;
        }
        else if(location>size)
        {
            tail=tail.prev;
            tail.next=null;
        }
        else{
            Node temp=head;
            int count=0;
            while (count<location-1) {
                temp=temp.next;
                count++;
            }
            Node last =temp.next.next;
            temp.next=last;
            last.prev=temp;
        }
        size--;


    }


}
