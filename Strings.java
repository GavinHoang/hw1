package HW1;

public class Strings 
{
	public static String uniqueLetters (String str) // method
	{
		  String repeated = "";      
	      int count = 0;
	      for(int i = 0; i < str.length(); i++) //harrasses
	      {
	    	  	for(int j = 0; j < str.length(); j++)
	    	  	{
	    	  		if(str.charAt(i) == str.charAt(j))
	    	  			count++;
	    	  	}
	    	  	
	    	  	if(count == 1) 
	    	  		repeated += str.charAt(i); 
	    	  
	    	  	count = 0;
	      }
	      return repeated;
	 }
	public static void main(String[] args) // main method
	{
	  System.out.println(uniqueLetters("harrasses"));
	  System.out.println(uniqueLetters("harrassesuuuiguguop"));
	}
}
