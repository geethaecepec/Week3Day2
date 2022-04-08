package Week3Day1Assignment;

public class Palindrome {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name1 = "Madam";
		String name2 = "";
		
		for (int i=name1.length()-1;i>=0;i--) {
			name2= name2+(name1.charAt(i));
			
		}

			System.out.println(name2);
	if(name1.equals(name2))	{
	
	System.out.println("The Given string is Palindrome");
	}
	
		else{
		System.out.println("The Given String is not  Palindrome");
		
		}
		
		
	}
}
