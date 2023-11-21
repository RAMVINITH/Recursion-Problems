package RecursionProblems;

public class ReplacePifromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(replacePI("apib"));
//		System.out.println(("abcd").substring(0,2).equals("ab"));
	}
	
	public static String replacePI(String word)
	{
		if(word.length()==1)
			return word;
		if(word.length()==2)
		{
		  if(word.equals("pi"))
			  return "3.14";
		  else
			  return word;
		}
		String shortWord=replacePI(word.substring(1));
		if(word.substring(0,2).equals("pi"))
			return "3.14"+shortWord.substring(1);
		else
			return word.charAt(0)+shortWord;
		
	}

}
