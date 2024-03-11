public class cll {
    public Node head;
    public Node tail;
    public int size;

    public Node createcll(int data)
    {
        Node node = new Node();
        node.next=node;
        node.value=data;
        head=node;
        tail=node;
        size=1;
        return head;
        
    }
    public void add(int data ,int location)
    {
        if(head==null)
        {
            createcll(data);

        }
        Node node = new Node();
        node.value=data;
        
        if(location==0)
        {
            node.next=head;
            head=node;
            tail.next=head;
        }
        else if(location>=size)
        {
            tail.next=node;
            node.next=head;
            tail=node;
        }
        else {

            int count=0;
            Node temp=head;
            while (count<location-1) {
                temp=temp.next;
                count++;
            }
            Node last =temp.next;
            temp.next=node;
            node.next=last;
        }
        size++;
    
    }
    public void display()
    {
        Node temp=head;
        int count=size;
        while (count>0)
         {
            System.out.print("  " + temp.value +" --> ");
            temp=temp.next;
            count--;
        }
        System.out.print(" ----------> " + temp.value +" ");
       
        System.out.println();
    }
    public void delete(int location)
    {
        if(head==null)
        {
            System.err.println("already empty cll");
        }
        else if (size==1) {
            head=null;
            tail=null;
        }
        else if(location==0)
        {
            head=head.next;
            tail.next=head;
        }
        else if (location>=size) {
            Node temp=head;
           while (temp.next!=tail) {
            temp=temp.next;
           }
           tail=temp;
           temp.next=head;    
        }
        else{
            int count=0;
            Node temp=head;
            while (count<location-1) {
                temp=temp.next;
                count++;
            }
            temp.next=temp.next.next;
        }
        size--;
    }

}
