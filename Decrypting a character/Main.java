import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    char ch = in . next().charAt(0);
    int key = in.nextInt();
    if(ch >= 'a' && ch <= 'z'){
     // int offset = ();
      //offset = (offset + key) % 26;
      ch = 'z';
    }
    else if(ch >= 'A' && ch <= 'Z'){
      int offset = ch - key;
      //offset = (offset + key) % 26;
      ch = (char)(offset);
    }
    System.out.print(ch);
  }
}