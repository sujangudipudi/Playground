import java.util.Scanner;
class Main{ 	public static void main(String[] args)    	
{         Scanner scan = new Scanner(System.in);        
 StringBuilder tmp = new StringBuilder("");
 String str = scan.nextLine();      
                                                                                     int t_len = str.length();       
                                                                                     String str1 = scan.nextLine();    
                                                                                     String str2 = scan.nextLine();   
                                                                                     int str1_len = str1.length();     
                                                                                     int str2_len = str2.length();    
                                                                                     System.out.print(str.replace(str1,str2));       
                                                                                    } }