package RecursionProblems;
import java.util.Scanner;
public class GeomentricSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println(findGeometricSum(sc.nextInt()));

	}
	public static double findGeometricSum(int k){
		// Write your code here
        if(k==0)
            return 1;
        double sum=findGeometricSum(k-1);
        double twoPowerK=1/Math.pow(2,k);
        sum=sum+twoPowerK;
        // System.out.println(twoPowerK+" "+sum);
        return sum;

	}
}
