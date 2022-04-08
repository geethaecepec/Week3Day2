package Week3Day1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String text1="STOP";
		String text2 = "POTS";
		boolean status = false;
		int len1 = text1.length();
		int len2 =  text2.length();
		if(len1!=len2)
		{
			status = false;
		}
		else {
			
			char[] t1 = text1.toCharArray();
			char[] t2 = text2.toCharArray();
			Arrays.sort(t1);
			Arrays.sort(t2);
				
		status = Arrays.equals(t1, t2);
		
		}
		if(status)
		{
			System.out.println("Given String is Anagram");
			
		}
		else {
			System.out.println("Given String is not Anagram");
		}
		// TODO Auto-generated method stub

	}

}
