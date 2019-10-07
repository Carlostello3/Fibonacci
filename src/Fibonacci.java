/**
 * Carlos Tello
 * Word Analyzer
 * CEN-3024C
 * Soft Development 1
 */

public class Fibonacci {

	public static void main(String[] args) {
		
		int index = 0;
		int counter = 20;
		
		/**
		 * @param startTime
		 * 
		 * RECURSIVE MODE
		 * While loop keeps populating numbers
		 * Obtains time every time the loop prints
		 * Printing first 20 numbers
		 */
		
		fibNumIt(counter);
		
		System.out.println("Recursion: ");
		while (counter > 0) {
			System.out.println(fibNum(index));
			index++;
			counter--;
			long startTime = System.nanoTime();
			System.out.println("Time: " + startTime);
			System.out.println("----------------------");
		}

		
		
	} //end of main

	
	
	public static long fibNum(int i) {
		
		/**
		 * Fibonacci's numbers start with 0 and the go to 1 for position 1 and 2
		 */
		if (i == 0) return 0;
		if (i <= 2) return 1;
		
		/**
		 * @param fibTemp
		 * Temporary parameter to hold the recursion
		 */
		long fibTemp = fibNum(i - 1) + fibNum (i - 2);
		return fibTemp;
	}//end of fibNum
	
	
	public static void fibNumIt (int counter) {
		
		/**
		 * @param startTime
		 * @param f1, f2, f3
		 * @param temp
		 * 
		 * Iteration to produce fibonacci sequence
		 */
		long startTime = System.nanoTime();
		System.out.println("Start time:" + startTime);
		int f1, f2, f3;
		
		f1 = 0;
		f2 = 1;
		
		int temp = 1;
		
		System.out.println("Iteration: ");
		while (temp <= counter) {
			startTime = System.nanoTime();
			System.out.println(f1 + " - " + startTime);
			f3 = f1 + f2;
			f1 = f2;
			f2 = f3;
			temp++;
		}
		startTime = System.nanoTime();
		System.out.println("End time:" + startTime);
		System.out.println("----------------------");
	}
	
}

	 