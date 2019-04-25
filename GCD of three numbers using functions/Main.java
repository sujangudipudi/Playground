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
  {  int min = 0,r=0;
    if(m>n)
     min=n;
    else
    min=m;
  while(min>=1)
  {  {if(m%min==0&&n%min==0)
  { 
      break;
  }
  } min--;}
   r=min;
   return r;
 }
}