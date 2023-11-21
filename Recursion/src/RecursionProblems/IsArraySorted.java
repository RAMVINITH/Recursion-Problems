package RecursionProblems;
import java.util.*;
public class IsArraySorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		if(isSorted(arr))
			System.out.println("Array is sorted");
		else 
			System.out.println("Array is not sorted");

	}
	
	public static boolean isSorted(int arr[])
	{
		if(arr.length==1)
			return true;
		if(arr[0]<arr[1])
			return false;
		int smallArray[]=new int[(arr.length)-1];
		for(int i=1;i<arr.length;i++)
			smallArray[i-1]=arr[i];
		boolean T_F=isSorted(smallArray);
		return T_F;
	}
	

}
