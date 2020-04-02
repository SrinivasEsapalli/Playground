import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int count = 0;
     
      int copy_number = n;
     
      if(n == 0)
        System.out.println(n);
      else
        while(n>0)
        {
          count++;
          n = n/10;
        }
      n = copy_number;
        int pow = 1;
      int sum = 0;
      while(n > 0)
      {
        int rem = n % 10;
       for(int num = 1; num <= count;num++)
       {
         pow = pow * rem;
       }
        sum = sum + pow;
        pow = 1 ;
        n = n / 10;
      }
      if(copy_number == sum)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	}
}