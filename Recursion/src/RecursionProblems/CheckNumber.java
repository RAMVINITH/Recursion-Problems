package RecursionProblems;

import java.util.Scanner;

public class CheckNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
	    int x=sc.nextInt();
	    boolean b=numberInArray(arr,x);
	    if(b==true)
	    	System.out.println("Element present in Array");
	    else 
	    	System.out.println("Element is not in Array");

	}
	
	public static boolean numberInArray(int input[],int x)
	{
		if(input.length<=0)
            return false;
        if(input[0]==x)
            return true;
        int smallArray[]=new int[(input.length)-1];
        for(int i=1;i<input.length;i++)
        {
            smallArray[i-1]=input[i];
        }
        boolean T_F=numberInArray(smallArray,x);
        return T_F;
	}

}
