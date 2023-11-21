package RecursionProblems;

public class RemoveXfromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(removeX("axbcxdef"));

	}
	public static String removeX(String word)
	{
		if(word.length()==0)
			return word;
		String shortWord=removeX(word.substring(1));
		if(word.charAt(0)=='x')
			return shortWord;
		else
			return word.charAt(0)+shortWord;
	}

}
