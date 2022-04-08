package Week3Day1Assignment;

public class CharOccurance {

	public static void main(String[] args) {
		
		String str = "Welcome to chennai";
		Character c = 'c' ;
		
		int count = 0;
//Convert the string into Char array
		char[] arr = str.toCharArray();
		//to get the length of the array
		int len = str.length();
		
	
		for (int i=0;i<=len;i++) {
			if(str.charAt(i)==c) {
				count++;
				
			}
		}
		System.out.println("The letter 'c' is repeated "+count+"times");
		
		
		
		
		// TODO Auto-generated method stub

	}

}
