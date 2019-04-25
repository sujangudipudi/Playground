import java.util.Scanner;
class Main
{
  public static int addition(int m, int n) //arguments received here
  { int x= 1,l=1;
  while( x<=n)
      { l=l*m;
         x++;}
     return l; //result retuned here
  }
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int a = in.nextInt();
    int b=in.nextInt();
     int c = addition(a,b); // arguments passed here  
     System.out.println(c); //result printed here
  }
}
/*class Main{
	public static void main (String[] args){
	   Scanner in= new Scanner(System.in);
      int b= in.nextInt();
      int e= in.nextInt();
      int pro=1;
      pro = result(b,e);
      System.out.print(pro);
    }
      {     public static int result (int m,int n)
      { while(n>0)
      { int l=l*m;
         n++;
      } return l;
      }
      }
        
	}*/
