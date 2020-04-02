import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      System.out.println(square_of_a_number(n));
	} 
  
  public static int square_of_a_number(int a)
  {
    int result;
    result = a*a;
     return result;
  }
 
}
