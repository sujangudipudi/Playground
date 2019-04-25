import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
      int n = in.nextInt();
            int n1 = in.nextInt();
            int n2 = in.nextInt();
      if(n>n1&&n>n2)
        System.out.println(n);
      else if(n1>n&&n1>n2)
       System.out.println(n1);
      else
         System.out.println(n2);
        
      
    }
}