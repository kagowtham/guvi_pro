package pro;

import java.util.Scanner;

public class Seeds {
 public static void main(String[] args) {
	boolean k=false;
	Scanner s=new Scanner(System.in);
	int no=s.nextInt();
	System.out.println("seeds are");
	for(int i=2;i<=no/2;i++) {
		if(i*find(i)==no) {
			k=true;
			System.out.println(i);
		}
	}
	if(!k) {
		System.out.println("no");
	}
 }
 static int find(int a) {
	 String str=String.valueOf(a);
	 int m=1;
	 for(int i=0;i<str.length();i++) {
		 m*=Integer.parseInt(String.valueOf(str.charAt(i)));
	 }
	 return m;
 }
}
