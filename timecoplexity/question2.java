public class question2 {

    void sol (int arr[])
    {
        byte n = (byte)arr.length;
        for(int i=0;i<n;i++)
        {
            for (int j : arr) {
                System.out.print(arr[i]+""+arr[j-1]+"  ");
                
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        int arr []={1,2,3,4,5};
        question2 b = new question2();
        b.sol(arr);

    }
}
