import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
        Scanner sc = new Scanner(System.in);
      int n1 = sc.nextInt();
      int n2 = sc.nextInt();
      int n3 = sc.nextInt();
      int result = Gcd_of_two_numbers(n1,n2);
      System.out.println(Gcd_of_two_numbers(result,n3));
	}
  
  public static int Gcd_of_two_numbers(int n1,int n2)
  {
    int Gcd = 1,min_no;
   if(n1 < n2)
   {
     min_no = n1;
   }
    else
    {
      min_no = n2;
    }
     while(min_no >= 1)
     {
       if((n1 % min_no == 0) && (n2 %min_no == 0))
       {
         Gcd = min_no;
          break;
       }
       min_no--;
     }
    return Gcd;
  }
}
  
  
  
  
  
  
  