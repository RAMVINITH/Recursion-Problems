package RecursionProblems;
import java.util.Scanner;
public class Staircase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(staircase(n));
	}
	public static int staircase(int n)
	{
		if(n<0)
			return 0;
		if(n==0)
			return 1;
		return staircase(n-1)+staircase(n-2)+staircase(n-3);
	}

}
