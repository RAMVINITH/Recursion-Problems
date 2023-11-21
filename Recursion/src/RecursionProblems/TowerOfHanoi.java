package RecursionProblems;

import java.util.Scanner;

public class TowerOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char source='a',auxilary='b',destination='c';
		HanoiTower(n,source,auxilary,destination);
	}
	public static void HanoiTower(int n,char source,char auxilary,char destination)
	{
		if(n==0)
			return;
		HanoiTower(n-1,source,destination,auxilary);
		System.out.println(source+" -> "+destination);
		HanoiTower(n-1,auxilary,source,destination);
	}

}
