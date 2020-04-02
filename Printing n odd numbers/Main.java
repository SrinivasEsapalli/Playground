import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
    for(int num = 1;num <=2*n; num++)
      {
      if(num %2 == 1)
        System.out.println(num);
      }
      
    }
}