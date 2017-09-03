package pro;

import java.util.Arrays;
import java.util.Scanner;

public class CoinSum {
   public static void main(String[] args) {
	   
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int arr[]=new int[n];
	boolean b=false;
	for(int i=0;i<n;i++) {
		arr[i]=s.nextInt();
	}
	int sum=s.nextInt();
	Arrays.sort(arr);
	int k=n-1,c=0;
	while(k>=0&&sum>0) {
		int t=arr[k];
		while(sum>=t) {
			System.out.print(t+" ");
			sum-=t;
			c++;
		}
		k--;
	}
	if(sum==0) {
		System.out.println("total no of coins "+ c);
	}else {
		System.out.println("not possible to select coins");
	}
 }
}
