import java.util.Scanner;
class Main 
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int list[] = new int[n];
     int k = sc.nextInt();
    for(int i = 0; i < n; i++)
    {
      list[i] = sc.nextInt();
    }
    
    
    for(int i = 1; i <=k; i++)
    { int count = 0;
      for(int j = 0; j <=n-1; j++)
      { if(list[j]== i)
           count++;
       }
    System.out.println(i+" "+count);
    }
  }
}
