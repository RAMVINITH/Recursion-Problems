package RecursionProblems;

public class FindPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isPalindrome("RAMAR"));

	}
	public static boolean isPalindrome(String input)
	{
		if(input.length()<=1)
			return true;
		String subString=input.substring(1,input.length()-1);
//		System.out.println(input.charAt(0)+" "+input.charAt(input.length()-1));
		if(input.charAt(0)!=input.charAt(input.length()-1))
		return false;
		else 
		{
			if(isPalindrome(subString))
				return true;
			else
				return false;
		}
		
		
		
		
		
//		
//		if(input.length()>2)
//		{
//		subString=input.substring(1,input.length()-1);
//		}
//		System.out.println(subString);
//        if(isPalindrome(subString))
//        {
//        if(subString.charAt(0)==subString.charAt(input.length()-1))
//            return true;
//        else
//            return false;
//        }
//        else 
//            return false;
        
	}

}
