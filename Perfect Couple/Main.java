import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       int arr[] = new int[n];
       for(int i= 0; i <= n- 1; i++){
           arr[i] = in.nextInt();
       }
       int value = in.nextInt();
      int sum=0;
      for(int j=0;j<n;j++)
      { for( int k=j+1;k<n;k++)
      { sum = arr[j] + arr[k];
       if(sum == value)
         System.out.println(arr[j]+","+" "+arr[k]);
      }
      }
      }
}