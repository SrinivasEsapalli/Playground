import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int sum = 0;
      int copy_number = n;
      while(n>0)
      {
        int rem = n % 10;
        int fact = 1;
        for(int num = 1; num <= rem;num++)
        {
         fact = fact * num;
        }
        sum  = fact + sum;
        n = n / 10;
        }
        if(copy_number == sum )
          System.out.println("Yes");
      else
        System.out.println("No");
    
    }
}