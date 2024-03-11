public class mailfile {
    public static void main(String[] args) {
        cll s1 = new cll();
        s1.createcll(1);
        s1.add(2, 0);
        s1.add(3, 3);
        s1.add(4, 4);
        s1.add(5, 2);
        s1.add(10, 0);
        
        
        s1.display();
        System.out.println(s1.tail.value);
        System.out.println(s1.head.value);

        s1.delete(10);
        s1.display();
        s1.delete(10);
        s1.display();
        System.out.println(s1.tail.value);
        System.out.println(s1.head.value);
       // System.out.println(s1.tail.value);
        
       

    }
}
