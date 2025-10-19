//  1_Palindrome Check if a given string is a palindrome (ignore spaces and case).
//  Example: "Race car" → True


/*
        	\\s → matches spaces, tabs, new lines, any whitespace
			\s  →  this allow for only space
			"" → replaces those whitespaces with nothing (deletes them)
			               Why double backslash \\?
			In Java strings, a single backslash \ is considered an escape character.
			So to write a real backslash, you must type \\
			Therefore, "\\s" becomes \s in regex(regular expression), which means space/whitespace
			
			Escape Characters are special characters in programming used 
			to represent non-printable or special-purpose symbols inside a string (\n  \t  \r   \s).
			*/

public class palindrom_1 {
	public static void main(String[] args) {
		String str = "Ra\tce  \ncar";

		// Remove whitespace and convert to lowercase
		str = str.replaceAll("\\s","").toLowerCase();  // str.replaceAll(" ","");  // this remove only space (\s is also do same)

		System.out.println("Entered String (after cleaning) : " + str);

		int left = 0;
		int right = str.length()-1;
		boolean isPalindrome = true;

		while (left < right) {
			if(str.charAt(left) != str.charAt(right)){
				isPalindrome = false;
				break; //  Stops loop immediately (saves time)
			}
			left++;
			right--;
		}

		if(isPalindrome){
			System.out.println("It's palindrom.");
		}
		else{
			System.out.println("It's not palindrom.");
		}
	}
}