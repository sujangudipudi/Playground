import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
Scanner  in = new Scanner(System.in);
    int i=0,j=0;
    int n=in.nextInt();;

 
    for(i=1;i<=n;i++)
    {
        for(j=1;j<=n;j++)
        {
            if(i==j || j==(n-(i-1)))
            {
                System.out.print("*");
            }
            else
            {
                  System.out.print(" ");
            }
        }
          System.out.println();
    }
    
}
	}
