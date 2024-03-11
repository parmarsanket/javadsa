public class mainfile 
{
    public static void main(String[] args) {
        dsll s1 = new dsll();
        s1.create(5);
        s1.add(2, 0);
        s1.add(3,0);
        s1.add(6,1);
        s1.add(10,10);
        s1.display();
        System.out.println(s1.tail.data);
        System.out.println(s1.tail.prev.data);
        System.out.println(s1.tail.prev.prev.data);
        System.out.println(s1.tail.prev.prev.prev.data);
        System.out.println(s1.tail.prev.prev.prev.prev.data);

        System.out.println();
        s1.display();

        System.out.println(s1.head.data);
        System.out.println(s1.head.next.data);
        System.out.println(s1.head.next.next.data);
        System.out.println(s1.head.next.next.next.data);
        System.out.println(s1.head.next.next.next.next.data);

        s1.display();
        s1.delete(0);
        s1.display();
        s1.delete(10);
        s1.display();
        s1.delete(1);
        s1.display();
    }
    
}
