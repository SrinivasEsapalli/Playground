import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int base = sc.nextInt();
    int exponent = sc.nextInt();
    System.out.print(power_of_a_number(base,exponent));
  }
  public static int power_of_a_number(int base,int exponent){
    int power = 1;
    while(exponent >= 1)
    {
      power = power * base;
      exponent--;
    }
    return power;
  }
}
