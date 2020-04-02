import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner sc = new Scanner(System.in);
      
      int arr_size = sc.nextInt();
       
      int arr[] = new int[arr_size];
     
      for(int idx = 0;idx <= arr_size-1;idx++)
      {
        arr[idx] = sc.nextInt();
      }
      int val = sc.nextInt();
      perfect_couple(arr_size,arr,val);
    }
  
  public static void perfect_couple(int arr_size,int arr[],int val)
  {
    for(int idx_1 = 0;idx_1 <= arr_size-1;idx_1++)
    {
       for(int idx_2 = idx_1+1;idx_2 <= arr_size-1;idx_2++)
    {
         int sum = arr[idx_1]+arr[idx_2];
         if(sum == val)
         {
           System.out.println(arr[idx_1] + "," + " " + arr[idx_2]);
         }
       }
    }
  }
}
    


