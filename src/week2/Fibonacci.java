package week2;

import acm.program.ConsoleProgram;

public class Fibonacci extends ConsoleProgram {

	private static final int MAX_TERM_VALUE = 10000; /* sets a limit for the program to end */
	
	public void run() {
		println("This program lists the Fibonacci sequence.");
		int i1 = 0;
		int i2 = 1;
		while (i1 <= MAX_TERM_VALUE) {
			println(i1);
			int i3 = i1 + i2;
			i1 = i2;
			i2 = i3;
		}
	}
}

