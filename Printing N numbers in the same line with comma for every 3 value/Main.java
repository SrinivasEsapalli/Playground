import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int num = 1;num <= n;num++)
        {
      System.out.print(num);
          if((num %3 == 0)&&(num != n))
            System.out.print(",");
          }
  }
}