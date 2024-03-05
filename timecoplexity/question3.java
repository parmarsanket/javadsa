public class question3 {
    public static void sol(int a[])
    {

        for(int i=0;i<a.length/2;i++)
        {
            int temp=a[i];
            a[i]=a[a.length-i-1];
            a[a.length-i-1]=temp;

        }
        for (int k : a) {
            System.out.print(" "+k);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        sol(arr);

        
    }
}
