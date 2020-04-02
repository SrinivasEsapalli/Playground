import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      StringBuilder sb = new StringBuilder(str);
      int str_len = sb.length();
      
      int arr_size = 26;
      int arr[] = new int[arr_size];
      for(int i = 0;i < arr_size;i++)
      {
        arr[i] = 0;
      }
      int offset; 
            for(int i = 0;i < str_len;i++)
      {
              if(sb.charAt(i) >= 'A' && sb.charAt(i) <= 'Z')
         {
           offset = sb.charAt(i) - 'A';
                char ch = (char)('a' + offset);
           sb.setCharAt(i,ch);
              }
         
         if(sb.charAt(i) >= 'a' && sb.charAt(i) <= 'z')
         {
           arr[sb.charAt(i) - 'a']++;
         }
            }
               for(int i = 0;i < str_len;i++)
               {
                 if(arr[sb.charAt(i) - 'a'] != 0)
                 {
                   System.out.print(sb.charAt(i) +""+arr[sb.charAt(i) - 'a'] + " ");
                arr[sb.charAt(i) - 'a'] = 0;
                 }
    }
}
}
