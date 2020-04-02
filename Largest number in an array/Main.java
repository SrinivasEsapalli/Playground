import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
       Scanner sc = new Scanner(System.in);
      int arr_size = sc.nextInt();
      int arr[] = new int[arr_size];
      for(int idx = 0;idx <= arr_size-1;idx++)
      {
        arr[idx] = sc.nextInt();
      }
      int max_no;
      
      if(arr[0] > arr[1])
      {
        max_no = arr[0];
      }
      else
      {
         max_no = arr[1];
      }
      for(int idx = 2;idx <= arr_size-1;idx++)
      {
        if(max_no < arr[idx])
        {
          max_no = arr[idx];
        }
      }
      System.out.println(max_no);
    }
}

      
 