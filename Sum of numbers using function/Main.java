import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      System.out.println( sum_of_digits(n));
	}
  
  public static int sum_of_digits(int m)
  {
    int sum = 0;
    for(int i = 1; i <= m; i++)
    {
      sum = sum + i;
    }
    return sum;
}
}