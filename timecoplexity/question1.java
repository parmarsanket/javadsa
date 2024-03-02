

public class question1 
{

    void solution(int arr[])
    {
        int sum=0;
        int product =1;
        for (int i : arr) {
            sum=sum+i;
            product = product*i;
        }
        System.out.println("ans sum ="+sum+"product="+product);
            
        
    }

    public static void main(String[] args) {
        int arr[]={1,32,4,5,6};
        question1 b = new question1();
        b.solution(arr);

    }
    
}