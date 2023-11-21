package RecursionProblems;
import java.util.*;
public class Factorial {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(FindFactorial(sc.nextInt()));
	}

	private static int FindFactorial(int n) {
		 if(n==0)return 1;
		 return n*FindFactorial(n-1);
	}

}

