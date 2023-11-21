package RecursionProblems;

public class PairStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Hello aabb";
	    a=pairstar(a);
	    System.out.println(a);

	}
	public static String pairstar(String a)
	{
		if(a.length()<=1)
			return a;
		String SubA=pairstar(a.substring(1));
		if(a.charAt(0)==SubA.charAt(0))
			return a.charAt(0)+"*"+SubA;
		else
			return a.charAt(0)+SubA;
		
		
	}

}
