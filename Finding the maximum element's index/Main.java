import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int a[]=new int[n];
    for(int i=0;i<=n-1;i++)
    { a[i]=in.nextInt();
    }
    int l=0,s=0;
    for(int j=0;j<=n-1;j++)
    { if(l<a[j])
    {l=a[j];
     s=j;}
    }
    System.out.println(s);
  }
}
