import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		//int num = 0;
		for(int cur_row =1; cur_row <= n; cur_row++) {
			//num = num + 1;
          for(int cur_col=1; cur_col <= n ; cur_col++) {
				//num = num + 1;
                  // if(num%2!=0)
				System.out.print(cur_row);
           //   else if(num%2==0)
               // System.out.print("#"+" ");
			}
		System.out.print("\n");
		}
	}
}

