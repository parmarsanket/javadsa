public class question1 {
    public sll sumofll(sll lla,sll llb)
    {
        Node n1=lla.head;
        Node n2=llb.head;

        int carrry=0;
        sll newlla = new sll();
        while (n1!=null || n2!=null) {

            int result=carrry;
            if (n1!=null) {
                result+=n1.value;
                n1=n1.next;
            }
            if (n2!=null) {
                result+=n2.value;
                n2=n2.next;
            }
            newlla.addnode(result%10, 0);
            carrry=result/10;
            //System.out.println(carrry);
        }
        if(carrry!=0)
        {
            newlla.addnode(carrry,0);
        }
        return newlla;
        
    }
    public static void main(String[] args) {
        question1 qus = new question1();
        sll s1 = new sll();
        sll s2 = new sll();

        s1.addnode(9, 0);
        s1.addnode(1, 0);
        s1.addnode(6, 0);

        s2.addnode(5, 0);
        s2.addnode(6, 0);
        s2.addnode(7, 0);

        qus.sumofll(s1, s2).display();
    }
}
