import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      int a= in.nextInt();
            int b= in.nextInt();
            int c= in.nextInt();
      int x=great(a,b);
      int y = great(x,c);
      System.out.println(y);
	}
  public static int great(int m, int n)
  {  if(m>n)
    return m;
    else
      return n;
}
}