package ExerciseUnitTests;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import UtilityClass.FinalCoordinateFinderUtility;

public class ExerciseOneUnitTests {

    @Test
    public void testExerciseOne_Success() throws InterruptedException {
        String input = "LRF";
        String expectedOutput = "[0, 1]";
        String actualOutput = FinalCoordinateFinderUtility.finalCoordinateFinder(input);
        assertEquals(expectedOutput, actualOutput);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testExerciseOne_EmptyInput_Fail() throws InterruptedException {
        String input = "";
        String expectedOutput = "";
        String actualOutput = FinalCoordinateFinderUtility.finalCoordinateFinder(input);
        assertEquals(expectedOutput, actualOutput);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testExerciseOne_NullInput_Fail() throws InterruptedException {
        String input = null;
        String expectedOutput = "";
        String actualOutput = FinalCoordinateFinderUtility.finalCoordinateFinder(input);
        assertEquals(expectedOutput, actualOutput);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testExerciseOne_WrongInput_Fail() throws InterruptedException {
        String input = "DD";
        String expectedOutput = "";
        String actualOutput = FinalCoordinateFinderUtility.finalCoordinateFinder(input);
        assertEquals(expectedOutput, actualOutput);
    }
}
