import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
Scanner  in = new Scanner(System.in);
    int i=0,j=0;
    int n=in.nextInt();;

 
    for(i=1;i<=n;i++)
    {for(j=1;j<=n;j++){
         if(i%2==0)
{            System.out.print(i+1);
            for(j=1;j<=n-1;j++)
            System.out.print(i);
            }
            else {
          for(j=1;j<=n-1;j++)
        System.out.print(i);
                System.out.print(i+1);
            }
        }
          System.out.println();
    }}
    
}