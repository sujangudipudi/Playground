import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    int str_length = str.length();
    StringBuilder sb = new   StringBuilder(str);
    StringBuilder result = new   StringBuilder("");
    for(int i = 0;i<str_length;i++)
    { if(sb.charAt(i)=='a'||sb.charAt(i)=='A'||sb.charAt(i)=='e'||sb.charAt(i)=='E'||sb.charAt(i)=='i'||sb.charAt(i)=='I'||sb.charAt(i)=='o'||sb.charAt(i)=='O'||sb.charAt(i)=='u'||sb.charAt(i)=='U')
      i++;
     result.append(sb.charAt(i));
    }
    System.out.print(result);
  }
}
