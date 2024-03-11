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
    public void addnode(int value,int location)
    {
        if (head == null) {
            create(value);
            return;
        }
        Node newnode = new Node();
        newnode.value=value;
        if(location == 0)
        {
            newnode.next = head;
            head = newnode;
        }
        else if(location>=size)
        {
            tail.next=newnode;
            newnode.next=null;
            tail=newnode;

        }
        else
        {
            Node temp = head;
            int count=0;

            while (count<location-1) {
                temp = temp.next;
                count++;
            }
            Node last = new Node();
             last = temp.next;
            newnode.next=last;
            temp.next=newnode;

        }
        size++;
    }
    public void display()
    {
        Node temp=head;
        if (head==null) {
            System.out.println("sll empty");
            return;
        }
        System.out.println("head "+head.value + " tail :"+tail.value + " size: "+size);
        
        while (temp.next!=null)
         {
            System.out.print(" "+temp.value+ " --> ");
            temp=temp.next;
         }
         System.out.print(" "+temp.value +" -->null ");
         System.out.println();
    }
    public int searching(int value)
    {
        if(head==null)
        {
            return -1;
        }
        int count=0;
        Node temp =head;
        while (count<=size)
        {
            
            if(temp.value==value)
            {
                return count;
            }
            temp=temp.next;
           count++;
        }

        return -1;
    }
    public void delete(int location)
    {
        if(head ==null)
        {
            return ;
        }
        if(size==1)
        {
            head=null;
            tail=null;
           
        }
        else if(location==0)
        {
            head=head.next;
        }
        else if(location>=size)
        {
            Node temp = head;
            while (temp.next.next!=null) {
                temp=temp.next;
            }
            tail=temp;
            tail.next=null;
        }
        else{
            Node temp = head;
            int count=0;
            while (count>size) {
                temp=temp.next;
                
            }
            Node last = temp.next.next;
            temp.next=last;
        }
        size--;
        
    }
}
