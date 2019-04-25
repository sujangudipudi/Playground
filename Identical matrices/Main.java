

import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int r1 = in.nextInt();
        int c1 = in.nextInt();
        int a[][] = new int[r1][c1];
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c1; j++){
                a[i][j] = in.nextInt();
            }
        }
        //int r2 = in.nextInt();
        //int c2 = in.nextInt();
        int b[][] = new int[r1][c1];
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c1; j++){
                b[i][j] = in.nextInt();
            }
        }
      int res = 0;
      
      { for(int i = 0; i < r1; i++){
            for(int j = 0; j < c1; j++){
          if(a[i][j]==b[i][j])
          { res = 1;}
              else
              { res=0;
               break;}
            }
      }
       if(res==1)
         System.out.print("Yes");
       else
         System.out.print("No");
                          
            }
      }
}

      