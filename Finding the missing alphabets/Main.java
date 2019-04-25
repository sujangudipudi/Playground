import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner in= new Scanner(System.in);
      String str = in.nextLine();
      int str_len = str.length();
      int stat[]= new int[26];
      for(int i =0;i<=25;i++)
        stat[i] = 0;
     
      for(int i = 0; i < str_len; i++)
    {
      char ch = str.charAt(i);
      if(ch >= 'a' && ch <= 'z')
      {
        int offset = ch - 'a';
        stat[offset]++;
      }
      else if(ch >= 'A' && ch <= 'Z')
      {
        int offset = ch - 'A';
        stat[offset]++;
      }
      }
      for(int i = 0; i <26; i++)
    {
      if(stat[i]==0)
      {char ch = (char)(i+'a');
        System.out.print(ch+" ");
      }
      }
     
    }
    }
