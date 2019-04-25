import java.util.Scanner;
class Main 
{
   public static void main(String args[])
   {
       Scanner sc = new Scanner(System.in);
       int arr_size = sc.nextInt();
       int arr[] = new int[arr_size];
       for(int index = 0; index < arr_size; index++)
       {
           arr[index] = sc.nextInt();
       }
      
       int left = 0;
       int right = arr_size-1;
       int sum_val = 0;
       while(left < right)
       {
          if(arr[left] == arr[right])
          { sum_val = 1;
           right--;
           left++;}
         else {sum_val=-1;
           break;}
          }
     if(sum_val==1)     
     System.out.println("Yes");
     else
       System.out.println("No");
             
          }
       }
   