package RecursionProblems;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		int x=1;
		int index=BinarySearchInArray(arr,0,arr.length-1,x);
		if(index==-1)
		System.out.println("Element is not present in the Array");
		else
			System.out.println("Index of the Element is "+index);
	}
	
	public static int BinarySearchInArray(int arr[],int startIndex,int endIndex,int x)
	{
		if(startIndex>endIndex)
			return -1;
		int midIndex=(startIndex+endIndex)/2;
		if(arr[midIndex]==x)
			return midIndex;
		else if(x<arr[midIndex])
			return BinarySearchInArray(arr,startIndex,midIndex-1,x);
		else
			return BinarySearchInArray(arr,midIndex+1,endIndex,x);
		
	}

}
