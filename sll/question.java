//prectice questions
import java.util.HashSet;


public class question {
    //delete duplicate values in ll
    public void removeduplicate(sll ll)
    {
        HashSet<Integer>hs = new HashSet<>();
        Node curr=ll.head;
        Node prv= ll.head;
        while (curr!=null) {
            int cval=curr.value;
            if(hs.contains(cval))
            {
                prv.next=curr.next;
                ll.size--;
            }
            else{
                hs.add(cval);
                prv=curr;
            }
            curr=curr.next;


        }

    }
    //Nth node from last in ll
    public Node lastNthnode(sll ll,int n)
    {
        Node p1=ll.head;
        Node p2=ll.head;

        for(int i=0;i<n;i++)
        {
            if(p1==null)
            {
                return null;
            }
            p1=p1.next;

        }
        while (p1!=null) {
            p1=p1.next;
            p2=p2.next;
        }

        return p2;
    }
    //partition link list with x
    public sll partition(sll ll, int x) {
    Node currentNode = ll.head;
    ll.tail = ll.head;
    while (currentNode != null) {
      Node next = currentNode.next;
      if (currentNode.value < x) {
        currentNode.next = ll.head;
        ll.head = currentNode;
      } else {
        ll.tail.next = currentNode;
        ll.tail = currentNode;
      }
      currentNode = next;
    }
    ll.tail.next = null;
    return ll;
  }
    public static void main(String[] args) {
        sll s1 = new sll();
        //s1.addnode(1, 0);
        s1.addnode(1, 0);
        s1.addnode(2, 0);
        s1.addnode(3, 0);
        s1.addnode(4, 0);
        s1.addnode(2, 0);
        s1.addnode(5, 0);
        s1.display();
        question s3 = new question();
        s3.removeduplicate(s1);
        s1.display();
        System.out.println(s3.lastNthnode(s1, 5).value);
        s1.addnode(1, 0);
        s1.display();
        
        s3.partition(s1, 5).display();
        
    }
    
}
