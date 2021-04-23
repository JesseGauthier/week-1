package week3;

import acm.program.ConsoleProgram;

public class DeleteCharactersFromString extends ConsoleProgram {
	
	public void run() {
		
		while (true) {
			String str = readLine("Enter a phrase: ");
			String getChar = readLine("Enter a letter you want to remove: ");
			char ch = getChar.charAt(0);
			int indexOfString = str.indexOf(ch);
			println(removeAllOccurrences (str, ch));
			if (indexOfString == -1) {
				println("Error: Improper input. Try again!");
			}
		}
	}	
	 
	private String removeAllOccurrences(String str, char ch) { /* removes designated char from string */
		String result = "";
		for (int i=0; i < str.length(); i++) {
			if (str.charAt(i) != ch) {
				result = result + str.charAt(i);
			}
		}
		return result;

	}
	
}
