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
      int search_elem_1 = sc.nextInt();
      int search_elem_2 = sc.nextInt();
      int ele_1_idx = -1;
      int ele_2_idx = -1;
      for(int idx = 0;idx <= arr_size-1;idx++)
      {
        if( search_elem_1 == arr[idx])
        {
          ele_1_idx = idx;
        }
           if( search_elem_2 == arr[idx])
        {
          ele_2_idx = idx;
        }
      }
      System.out.println(ele_1_idx);
      System.out.println(ele_2_idx);
    }
}