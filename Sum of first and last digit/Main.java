import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      int n =in.nextInt();
      int m,sum=0,first,second;
      second=n%10;
      while(n>=10)
      { 
       
       n = n/10;
      }
      first = n;
      sum = first + second;
      System.out.println(sum);
	}
}