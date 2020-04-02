import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
        int max ;
    for(int idx = 0;idx < n;idx++)
    {
      arr[idx] = sc.nextInt();
    }
    if(arr[0] > arr[1])
    {
      max = 0;
    }
    else
    {
      max = 1;
    }
    for(int idx = 2; idx <= n-1;idx++)
    {
      if(arr[max] < arr[idx])
      {
        max = idx;
      }
 
    }
         System.out.println(max);
  }
}