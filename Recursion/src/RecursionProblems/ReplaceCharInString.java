package RecursionProblems;

public class ReplaceCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(replaceChar("abcdea",'a','z'));

	}
	public static String replaceChar(String word,char a,char b)
	{
		if(word.length()==0)
			return word;
		String shortWord=replaceChar(word.substring(1),a,b);
		if(word.charAt(0)==a)
			return b+shortWord;
		else
			return word.charAt(0)+shortWord;
	}

}
