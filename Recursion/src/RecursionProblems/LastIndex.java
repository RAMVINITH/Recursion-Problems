package RecursionProblems;

import java.util.Scanner;

public class LastIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
	    int x=sc.nextInt();
	    int index=FindLastIndex(arr,x);
	    System.out.println(index);
	    int indexOptimised=FindLastIndexOPTI(arr,x,arr.length-1);
	    System.out.println(indexOptimised);

	}
	public static int FindLastIndex(int input[],int x)
	{
		if(input.length==0)
			return -1;
		int smallArray[]=new int[(input.length)-1];
		for(int i=1;i<input.length;i++)
			smallArray[i-1]=input[i];
	    int index=FindLastIndex(smallArray,x);
		if(index==-1)
			if(input[0]==x)
				return 0;
			else
				return -1;
		else
		{
			return index+1;
		}
	}
	public static int FindLastIndexOPTI(int input[],int x,int pos)
	{
		if(input[pos]==x)
			return pos;
		if(pos==0)
			return -1;
		return FindLastIndexOPTI(input,x,pos-1);
	}


}
