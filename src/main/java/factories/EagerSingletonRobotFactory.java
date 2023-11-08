package factories;

import pojo.Robot;

public class EagerSingletonRobotFactory extends AbstractFactory {
	
	private static long delayRobot;
	
	private static String pathRobot;
	
	private static EagerSingletonRobotFactory instance = new EagerSingletonRobotFactory();

	private EagerSingletonRobotFactory(){}

	public static EagerSingletonRobotFactory getInstance(long delay, String path) {
		delayRobot = delay;
		pathRobot = path;
		return instance;
	}
	
	private Robot getRobot(long delayRobot, String path, String name) {
		return new Robot(delayRobot, path, name);
	}

	@Override
	public Robot getObject(String name) {
		return getRobot(delayRobot, pathRobot, name);
	}
}