package RecursionProblems;
import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(findFib(n));

	}

	public  static int findFib(int n) {
		// TODO Auto-generated method stub
		
		if(n==1  || n==2)
			return 1;
		int n_1=findFib(n-1);
		int n_2=findFib(n-2);
		
		return n_1+n_2;
		
	}

}
