import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner sc = new Scanner(System.in);
      int arr_size = sc.nextInt();
      int arr[] = new int[arr_size];
     
      for(int idx = 0 ;idx <= arr_size-1;idx++)
      {
        arr[idx] = sc.nextInt();
      }
      printing_subsets_of_size_3(arr_size,arr);
    }
  
  public static void printing_subsets_of_size_3(int arr_size,int arr[])
  {
    for(int idx_1 = 0 ;idx_1 <= arr_size-2;idx_1++)
    {
       for(int idx_2 = idx_1+1;idx_2 <= arr_size-1;idx_2++)
    {
         for(int idx_3 = idx_2+1;idx_3 <= arr_size-1;idx_3++)
    {
           System.out.print("(" + arr[idx_1] + "," +" " + arr[idx_2] + "," + " " + arr[idx_3] + ")" + " ");
         }
       }
      System.out.println();
    }
  }
}



