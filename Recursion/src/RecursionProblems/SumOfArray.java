package RecursionProblems;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int s=sum(arr);
		System.out.println(s);

	}
	public static int sum(int input[]) {
		
	     if(input.length<=1)
            return input[0];
        
         int smallArray[]=new int[input.length-1];
        
        for(int i=0;i<input.length;i++)
        {
            if(i==0)
            {
//            	System.out.println(smallArray[0]);
                smallArray[0]=input[i];
            }
            if(i==1)
            {
//            	System.out.println(smallArray[0]+"---"+input[i]);
                smallArray[0]+=input[i];
//                System.out.println(smallArray[0]);	
            }
            if(i>1)
            {
//            System.out.println(smallArray[i]);
            smallArray[i-1]=input[i];
            }
        }
        int sumArray=sum(smallArray);
        return sumArray;
            
		
	}

}
