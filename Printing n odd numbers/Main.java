import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int temp = n;
      for(int num=1;num<=2*n;num=num+2 )
          System.out.println(num);
	}
}