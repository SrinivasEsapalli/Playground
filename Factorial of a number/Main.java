import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int fact=1;
      for(int num = 1;num <= n;num++)
      {
	  fact = fact*num;
       
      }
       System.out.println(fact);
    }
}