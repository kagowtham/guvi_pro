package pro;

import java.util.Scanner;

public class DecreasingOrderBinary {
  public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=s.nextInt();
	}
	for(int i=0;i<n-1;i++) {
		int b1=bcount(arr[i]);
		for(int j=i+1;j<n;j++) {
			int b2=bcount(arr[j]);
			if(b1<b2) {
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
	}
	
	for(int i:arr) {
		System.out.println(i);
	}
  }
  
  static int bcount(int a) {
	  int c=0;
	  String b=Integer.toBinaryString(a);
	  for(int i=0;i<b.length();i++) {
		  if(b.charAt(i)=='1') {
			  c++;
		  }
	  }
	  return c;
  }
}
