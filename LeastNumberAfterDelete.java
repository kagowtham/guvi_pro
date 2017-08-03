package pro;

import java.util.Arrays;
import java.util.Scanner;

public class LeastNumberAfterDelete {
	
  public static void main(String[] args) {
	  
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the number");
	int a=scanner.nextInt();
	System.out.println("Enter number of digits want to delete");
	int k=scanner.nextInt();
	System.out.println(findNumber(a, k));
   }
   static int findNumber(int a,int k) {
	   
	   String s=String.valueOf(a);
	   char arr[]=s.toCharArray();
	   Arrays.sort(arr);
	   String ans="";
	   for(int i=0;i<arr.length-k;i++) {
		   ans+=arr[i];
	   }
	   return Integer.parseInt(ans);
   }
}
