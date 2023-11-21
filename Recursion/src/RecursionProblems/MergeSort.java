package RecursionProblems;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {2,3,1,10,9,8,6,4,8};
		mergeSort(a);
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");

	}
	public static void mergeSort(int a[])
	{
		if(a.length<=1)
			return;
		
		int midIndex=a.length/2;
		int suba1[]=new int[midIndex];
		int suba2[]=new int[a.length-suba1.length];
		
		for(int i=0;i<midIndex;i++)
		    suba1[i]=a[i];
		for(int i=midIndex;i<a.length;i++)
			suba2[i-midIndex]=a[i];
		
		mergeSort(suba1);
		mergeSort(suba2);
		Merge(suba1,suba2,a);
		
	}
	
	public static void Merge(int suba1[],int suba2[],int a[])
	{
		int i=0,j=0,k=0;
		
		while (i<suba1.length && j<suba2.length)
		{
			if(suba1[i]<suba2[j])
				a[k++]=suba1[i++];
			else
			   a[k++]=suba2[j++];
		}
		
		if(i<suba1.length)
		{
			while(i<suba1.length)
			{
				a[k++]=suba1[i++];
			}
		}
		if(j<suba2.length)
		{
			while(j<suba2.length)
			{
				a[k++]=suba2[j++];
			}
		}
	}
	

}
