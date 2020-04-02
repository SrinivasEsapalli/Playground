import java.util.Scanner;
class Main{
    public static void main(String args[]){
      // Type your code here
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      int str_len = str.length();
      int arr_size = 26;
      int arr[] = new int[arr_size];
      for(int i =0;i < arr_size;i++)
      {
        arr[i] = 0;
      }
         for(int i =0;i < str_len;i++)
      {
           int offset;
           if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
           {
             offset = str.charAt(i) - 'a';
           arr[offset]++;
           }
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
           {
             offset = str.charAt(i) - 'A';
           arr[offset]++;
           }
         }
              for(int i =0;i < arr_size;i++)
      {
                if(arr[i] == 0)
                {
                  char not_repeated =(char) (i	+ 'a');
                  System.out.print(not_repeated + " ");
             
           }
}
         }
    }


           