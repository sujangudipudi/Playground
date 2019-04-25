import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner (System.in);
      int m= in.nextInt();
      int sum=0;
    int  n= m;
      int r;
      ////int c=0;
     // for(i=1;i!=0;i++)
       // c++;
      while(m>0)
      { r=m%10;
       sum = sum +(r*r*r);
       m=m/10;
      }
      if (n==sum)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
      }
}