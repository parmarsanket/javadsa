public class mainfile {
    public static void main(String[] args) {
        sll s1 = new sll();
        s1.create(5);
        s1.addnode(6, 0);
        s1.addnode(7, 0);
        s1.addnode(10, 1);
        s1.addnode(15, 2);
        s1.addnode(20, 6);
        s1.addnode(0, 4);


        
        
        s1.display();
        s1.delete(0);
        s1.display();
        s1.delete(7);
        s1.display();
        s1.delete(1);
        s1.display();
        s1.delete(1);
        s1.delete(1);
        s1.delete(1);
        s1.delete(1);
        s1.display();



    }

    
}