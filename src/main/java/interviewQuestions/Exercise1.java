package interviewQuestions;

import UtilityClass.FinalCoordinateFinderUtility;

public class Exercise1 {
	
	/*
	 * For the first question finalCoordinateFinder methods 
	 * parses the input string and calculates the final coordinates
	 */
	public static void main(String args[]) throws InterruptedException {
		
		String input = "LFFFRFFFRRFF";
		String input2 = "FFLL";
		
		String path = FinalCoordinateFinderUtility.finalCoordinateFinder(input);
		
		System.out.println(path);
		
		String path2 = FinalCoordinateFinderUtility.finalCoordinateFinder(input2);
		
		System.out.println(path2);
	}
}
