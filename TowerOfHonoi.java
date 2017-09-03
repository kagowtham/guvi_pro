package pro;
import java.util.*;
public class TowerOfHonoi {
    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n number of disks");
		int n=s.nextInt();
		Stack<Integer> a=new Stack<>();
		Stack<Integer> b=new Stack<>();
		Stack<Integer> c=new Stack<>();
		for(int i=0;i<n;i++) {
			a.push(s.nextInt());
		}
		s.close();
		c=arrange(n, a, b, c);
		for(int i:c)
			System.out.println(i);
	}
    
    static Stack<Integer> arrange(int n,Stack<Integer> a,Stack<Integer> b,Stack<Integer> c) {
    	if(n>0) {
    	arrange(n-1,a,c,b);
    	c.push(a.pop());
    	arrange(n-1,b,a,c);
    	}
    	return c;
    }
}
