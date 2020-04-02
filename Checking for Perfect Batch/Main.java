import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int idx = 0;idx <= n-1;idx++)
    {
      arr[idx] = sc.nextInt();
    }
    perfect_batch(arr,n);
  }
  public static void perfect_batch(int arr[],int n)
  {
    boolean is_perfect = true;
    int batch = arr[0]+arr[1]+arr[2];
      for(int idx = 3;idx <= n-1;idx=idx+3)
      {
        int curr_batch = arr[idx]+arr[idx+1]+arr[idx+2];
      
    if(batch != curr_batch)
    {
      is_perfect = false;
    }
      }
    if(is_perfect == true)
    {
      System.out.println("Perfect Batch");
    }
    else
    {
      System.out.println("Not a Perfect Batch");
    }
  }
      
      }
