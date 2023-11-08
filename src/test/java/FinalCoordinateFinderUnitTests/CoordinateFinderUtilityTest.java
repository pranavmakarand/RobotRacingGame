package FinalCoordinateFinderUnitTests;

import static org.junit.Assert.assertEquals;

import java.net.ConnectException;

import org.junit.Test;

import UtilityClass.FinalCoordinateFinderUtility;

public class CoordinateFinderUtilityTest {

    @Test
    public void testFinalCoordinateFinder_CorrectInput_Sucess() throws InterruptedException {
    	
        String input1 = "LFFFRFFFRRFF";
        long delay1 = 1000;
        String name1 = "Robot1";
        long timer1 = System.currentTimeMillis();
        String expectedPath1 = "[-2, 8]";

        String path1 = FinalCoordinateFinderUtility.finalCoordinateFinder(input1, delay1, name1, timer1);

        assertEquals(expectedPath1, path1);

        String input2 = "FFLL";
        long delay2 = 500;
        String name2 = "Robot2";
        long timer2 = System.currentTimeMillis();
        String expectedPath2 = "[2, 2]";

        String path2 = FinalCoordinateFinderUtility.finalCoordinateFinder(input2, delay2, name2, timer2);

        assertEquals(expectedPath2, path2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFinalCoordinateFinder_NullInput_Failure() {
        String input = null;
        long delay = 1000;
        String name = "Robot";
        long timer = System.currentTimeMillis();

        try {
			FinalCoordinateFinderUtility.finalCoordinateFinder(input, delay, name, timer);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFinalCoordinateFinder_EmptyInput_Failure() {
        String input = "";
        long delay = 1000;
        String name = "Robot";
        long timer = System.currentTimeMillis();

        try {
			FinalCoordinateFinderUtility.finalCoordinateFinder(input, delay, name, timer);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFinalCoordinateFinder_InvalidInput_Failure() {
        String input = "LFLD";
        long delay = 1000;
        String name = "Robot";
        long timer = System.currentTimeMillis();

        try {
			FinalCoordinateFinderUtility.finalCoordinateFinder(input, delay, name, timer);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    }
    
    @Test
    public void testMisGuidedRobotFinalCoordinateFinder_CorrectInput_Sucess() throws InterruptedException {
        String input1 = "LFFFRFFFRRFF";
        long delay1 = 1000;
        String name1 = "Robot1";
        long timer1 = System.currentTimeMillis();
        String expectedPath1 = "[2, -8]";

        String path1 = FinalCoordinateFinderUtility.misGuidedRobotFinalCoordinateFinder(input1, delay1, name1, timer1);

        assertEquals(expectedPath1, path1);

        String input2 = "FFLL";
        long delay2 = 500;
        String name2 = "Robot2";
        long timer2 = System.currentTimeMillis();
        String expectedPath2 = "[-2, -2]";

        String path2 = FinalCoordinateFinderUtility.misGuidedRobotFinalCoordinateFinder(input2, delay2, name2, timer2);

        assertEquals(expectedPath2, path2);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testMisGuidedRobotFinalCoordinateFinder_NullInput_Failure() {
        String input = null;
        long delay = 1000;
        String name = "Robot";
        long timer = System.currentTimeMillis();

        try {
			FinalCoordinateFinderUtility.misGuidedRobotFinalCoordinateFinder(input, delay, name, timer);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMisGuidedRobotFinalCoordinateFinder_EmptyInput_Failure() {
        String input = "";
        long delay = 1000;
        String name = "Robot";
        long timer = System.currentTimeMillis();

        try {
			FinalCoordinateFinderUtility.misGuidedRobotFinalCoordinateFinder(input, delay, name, timer);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMisGuidedRobotFinalCoordinateFinder_InvalidInput_Failure() {
        String input = "LFLD";
        long delay = 1000;
        String name = "Robot";
        long timer = System.currentTimeMillis();

        try {
			FinalCoordinateFinderUtility.misGuidedRobotFinalCoordinateFinder(input, delay, name, timer);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    }
    
	@Test(expected = java.net.ConnectException.class)
    public void testBatteryPoweredFinalCoordinateFinder_CorrectInput_Failure() throws InterruptedException, ConnectException {
        String input1 = "LFFFRFFFRRFF";
        long delay1 = 1000;
        String name1 = "Robot1";
        long timer1 = System.currentTimeMillis();
        double energy1 = 40.0;
        String expectedPath1 = "[-1, -3]";

        String path1 = FinalCoordinateFinderUtility.batteryPoweredFinalCoordinateFinder(input1, delay1, name1, timer1, energy1);

        assertEquals(expectedPath1, path1);
    }
}
