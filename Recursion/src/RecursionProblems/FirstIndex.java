package RecursionProblems;

import java.util.Scanner;

public class FirstIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
	    int x=sc.nextInt();
	    int index=FindFirstIndex(arr,x);
	    System.out.println(index);
	    int indexOptimised=FindFirstIndexOPTI(arr,x,0);
	    System.out.println(indexOptimised);

	}
	public static int FindFirstIndex(int input[],int x)
	{
		if(input.length==0)
			return -1;
		if(x==input[0])
			return 0;
		int smallArray[]=new int[(input.length)-1];
		for(int i=1;i<input.length;i++)
			smallArray[i-1]=input[i];
	    int index=FindFirstIndex(smallArray,x);
		if(index==-1)
			return -1;
		else
			return index+1;
	}
	public static int FindFirstIndexOPTI(int input[],int x,int pos)
	{
		if(pos==input.length)
			return -1;
		if(input[pos]==x)
			return pos;
		return FindFirstIndexOPTI(input,x,pos+1);
	}

}
