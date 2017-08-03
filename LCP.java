package pro;

import java.util.Scanner;

public class LCP {
	
	static Scanner s=new Scanner(System.in);
	
    public static void main(String[] args) {
		
		System.out.println("Enter the length of the array");
		int n=s.nextInt();
		String ans=getLongestCommonPrefix(getElements(n));
		System.out.println(ans);
	}
    
    static String [] getElements(int n) {
    	String a[]=new String[n];
    	for(int i=0;i<n;i++) {
    		a[i]=s.next();
    	}
    	return a;
    }
    
   static String getLongestCommonPrefix(String a[]) {
	    int c=0;
    	for(int i=0;i<a.length;i++) {
    		boolean isEqual=true;
    		for(int j=1;j<a.length;j++) {
    			if(a[j].charAt(i)==a[0].charAt(i)) {
    				isEqual=true;
    			}else {
    				isEqual=false;
    				break;
    			}
    		}
    		if(isEqual) {
    			c++;
    		}else {
    			break;
    		}
    	}
    	return a[0].substring(0,c);
    }
}
