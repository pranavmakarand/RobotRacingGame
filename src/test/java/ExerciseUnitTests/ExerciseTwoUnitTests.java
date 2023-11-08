package ExerciseUnitTests;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import interviewQuestions.Exercise2;

public class ExerciseTwoUnitTests {

    @Test
    public void testExerciseTwo_CountUp_Success() throws InterruptedException {
        int start = 0;
        int end = 5;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Exercise2.countUp(start, end);

        String expectedOutput = "0\n1\n2\n3\n4\n5\n";
        
        assertEquals(expectedOutput, outputStream.toString());
    }
    
    @Test
    public void testExerciseTwo_CountUpAndDown_Success() throws InterruptedException {
    	
        int start = 0;
        int end = 5;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Exercise2.countUpAndDown(start, end);

        String expectedOutput = "0\n1\n2\n3\n4\n5\n4\n3\n2\n1\n0\n";
        
        assertEquals(expectedOutput, outputStream.toString());
    }
}