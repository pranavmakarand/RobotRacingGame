package FactoryUnitTests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import factories.EagerSingletonBatteryPoweredRobotFactory;
import factories.EagerSingletonMisGuidedRobotFactory;
import factories.EagerSingletonRobotFactory;
import pojo.BatteryPoweredRobots;
import pojo.MisGuidedRobot;
import pojo.Robot;

public class FactoryUnitTests {
	
    @Test
    public void testGetInstanceEagerSingletonBatteryPoweredfactory() {
    	
        EagerSingletonBatteryPoweredRobotFactory factory1 = EagerSingletonBatteryPoweredRobotFactory.getInstance(1000, "path1");
        EagerSingletonBatteryPoweredRobotFactory factory2 = EagerSingletonBatteryPoweredRobotFactory.getInstance(2000, "path2");

        assertEquals(factory1, factory2);
        assertEquals(2000, factory2.getObject("Bob").getDelayTime());
        assertEquals("path2", factory2.getObject("Bob").getPath());
    }

    @Test
    public void testGetInstanceEagerSingletonMisGuidedRobotfactory() {
    	
        EagerSingletonBatteryPoweredRobotFactory factory = EagerSingletonBatteryPoweredRobotFactory.getInstance(1000, "path");

        BatteryPoweredRobots robot = factory.getObject("Robot1");
        assertEquals("path", robot.getPath());
        assertEquals("Robot1", robot.getRobotName());
    }
    
    @Test
    public void testGetObjectEagerSingletonMisGuidedRobotfactory() {
    	
        EagerSingletonMisGuidedRobotFactory factory1 = EagerSingletonMisGuidedRobotFactory.getInstance(1000, "path1");
        EagerSingletonMisGuidedRobotFactory factory2 = EagerSingletonMisGuidedRobotFactory .getInstance(2000, "path2");

        assertEquals(factory1, factory2);
        assertEquals(2000, factory2.getObject("Bob").getDelayTime());
        assertEquals("path2", factory2.getObject("Bob").getPath());
    }

    @Test
    public void testGetObjectEagerSingletonBatteryPoweredfactory() {
    	
    	EagerSingletonMisGuidedRobotFactory factory = EagerSingletonMisGuidedRobotFactory.getInstance(1000, "path");

        MisGuidedRobot robot = factory.getObject("Robot1");
        assertEquals("path", robot.getPath());
        assertEquals("Robot1", robot.getRobotName());
    }
    
    @Test
    public void testGetObjectEagerSingletonRobotfactory() {
    	
        EagerSingletonRobotFactory factory1 = EagerSingletonRobotFactory.getInstance(1000, "path1");
        EagerSingletonRobotFactory factory2 = EagerSingletonRobotFactory .getInstance(2000, "path2");

        assertEquals(factory1, factory2);
        assertEquals(2000, factory2.getObject("Bob").getDelayTime());
        assertEquals("path2", factory2.getObject("Bob").getPath());
    }

    @Test
    public void testGetInstanceEagerSingletonRobotfactory() {
    	
    	EagerSingletonMisGuidedRobotFactory factory = EagerSingletonMisGuidedRobotFactory.getInstance(1000, "path");

        Robot robot = factory.getObject("Robot1");
        assertEquals("path", robot.getPath());
        assertEquals("Robot1", robot.getRobotName());
    }
}