import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in=new Scanner(System.in);
      int a=in.nextInt();
      int first=a/10;
      int second=a%10;
      int sum=first+second;
      System.out.println(sum);
	}
}