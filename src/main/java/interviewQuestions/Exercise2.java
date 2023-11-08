package interviewQuestions;

public class Exercise2 {
	
	public static void main(String args[]) {
		System.out.println("\nExercise 2 Part 1\n");
		countUp(0, 5);
		System.out.println("\nExercise 2 Part 2\n");
		countUpAndDown(0, 5);
	}
	
	public static void countUp(int start, int end) {
		
		if (start <= end) {
			System.out.println(start);
			countUp(start + 1, end);
			return;
		}
	}
	
	public static void countUpAndDown(int start, int end) {
		
		if (start <= end) {
			System.out.println(start);
			countUpAndDown(start + 1, end);
			if (start > 0)
				System.out.println(--start);
			return;
		}
	}
}
