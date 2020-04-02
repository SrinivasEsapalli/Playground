import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner in=new Scanner(System.in);
      int a=in.nextInt();
      int first=a/100;
      int second=a%10;
      int add=first+second;
      System.out.println(add);
	}
}