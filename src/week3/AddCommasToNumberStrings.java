package week3;

import acm.program.ConsoleProgram;


public class AddCommasToNumberStrings extends ConsoleProgram {
	
	public void run() {
		while (true) {
			String digits = readLine("Enter any amount of digits: ");
			if (digits.length() == 0) break;
			println(addCommasToNumericString(digits));
			
			
		}
	}
	private String addCommasToNumericString(String digits) { /* adds a comma every 3 digits starting at the right*/
		String result = "";
		int length = digits.length();
		int nDigits = 0;
		for (int i = length -1; i>=0; i--) {
			result = digits.charAt(i) + result;
			nDigits++;
			if (((nDigits % 3) == 0) && (i>0)) {
				result = "," + result;
			}
		}
		return result;
	}
}
