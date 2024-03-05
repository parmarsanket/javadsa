public class classes {
    public void array1(int arr[],int location ,int value)
    {
    try{

        if(arr[location]==0)
        {
            arr[location]=value;
            System.out.println("done");
            return;
        }
        System.out.println("already updated");
       
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
        System.out.println("invalid index");
    }

    }
    
}
