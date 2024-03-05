
import java.util.Scanner;
public class project {
    public static int calculation(int arr[])
    {
        Scanner input = new Scanner(System.in);
        int sum=0;
        int n=arr.length;
        for (int i =0; i<n;i++)
         {   
            System.out.println("Day's "+i+" temperature");
            arr[i]=input.nextInt();
            sum+=arr[i];
        }
        input.close();
        return sum/n;
    }
    public static void main(String[] args) {
        System.out.println("how many day's temperature");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n];
        System.out.println("the avg of the days is "+calculation(arr));
        input.close();

        
    }
}
