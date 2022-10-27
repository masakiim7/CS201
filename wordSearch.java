package Class;


import java.util.ArrayList;
import java.util.Scanner;

public class wordSearch {

	public static void main(String ags []) {

		Scanner scan=new Scanner(System.in);
		int t = 0;
	    String word_e = new String();
		ArrayList <String> words=new ArrayList<String>();

		while(word_e!="finish") {
		System.out.println("Enter a word, enter finish if you want to finish");
		word_e=scan.next();
		words.add(word_e);
		}

		System.out.println("Enter your search word");
		String target_w=scan.next();
		target_w=scan.next();
		
		for ( int i = 0; i < words.size(); i++ )
		{
		  if (words.get(i)==target_w) 
		  {
		    t=t+1;
		  }
		     
		}
		if (t > 0) 
		{
		  System.out.println("Seattle found in the array " + t + " times.");
		} // end of if
		else
		{
	
		  System.out.println(target_w+" not found in the array.");
		}
	}
}
