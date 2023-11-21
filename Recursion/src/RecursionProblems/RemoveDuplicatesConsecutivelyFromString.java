package RecursionProblems;

public class RemoveDuplicatesConsecutivelyFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(removeDuplicates("aaaaaaaabbbbbbaccccc"));
	}
	
	public static String removeDuplicates(String s)
	{
		if(s.length()==1)
			return s;
		String Substring=removeDuplicates(s.substring(1));
		if(s.charAt(0)==Substring.charAt(0))
			return Substring;
		else
			return s.charAt(0)+Substring;
			
	}

}
