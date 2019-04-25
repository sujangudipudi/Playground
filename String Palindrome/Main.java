import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    StringBuilder sb = new StringBuilder(str);
    int str_len = sb.length();
    int end = str_len - 1;
    int front = 0;
    int t =1;
    while(front < end)
    {
      char tmp_ch = sb.charAt(front);
       char tmp_c = sb.charAt(end);
      if(tmp_ch!=tmp_c)
      { t=0;
      break;}
      front++;
      end--;
    }
    if(t==1)
    System.out.println("Yes");
    else
      System.out.println("No");
  }
}
