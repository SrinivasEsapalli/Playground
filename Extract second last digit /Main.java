import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in=new Scanner(System.in);
      int a=in.nextInt();
      int second=(a%100)/10;
      System.out.println(second);
	}
}