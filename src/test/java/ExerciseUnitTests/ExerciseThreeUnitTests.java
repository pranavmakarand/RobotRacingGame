package ExerciseUnitTests;

import java.util.PriorityQueue;

import org.junit.Test;
import factories.EagerSingletonRobotFactory;
import pojo.Robot;

public class ExerciseThreeUnitTests {
    
    @Test
    public void testExerciseThree_RandomInput_Success() throws InterruptedException {
    	
		Robot robot1 = (Robot) EagerSingletonRobotFactory.getInstance(3000, "FRFLLFRF").getObject("Joe");
		
		Robot robot2 = (Robot) EagerSingletonRobotFactory.getInstance(1000, "FFFFFLF").getObject("Bill");
		
		Robot robot3 = (Robot) EagerSingletonRobotFactory.getInstance(2000, "LFRF").getObject("Jim");
		
		System.out.println("The race has STARTED!");
		
		robot1.start();
		robot2.start();
		robot3.start();
		
		robot1.join();
		robot2.join();
		robot3.join();
		
		System.out.println("The race has ENDED!");
		
		PriorityQueue<Robot> queueRank = new PriorityQueue<Robot>((a,b) -> a.getRank() - b.getRank());
		
		queueRank.add(robot1);
		queueRank.add(robot2);
		queueRank.add(robot3);
		
		System.out.println();
		
		while (!queueRank.isEmpty()) {
			Robot robot = queueRank.poll();
			System.out.println(robot.getRobotName() + " is #" + robot.getRank() + ", " + "at" + robot.getFinalCoordinates());
		}
    }
}
