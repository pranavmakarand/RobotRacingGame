package factories;

import pojo.MisGuidedRobot;

public class EagerSingletonMisGuidedRobotFactory extends AbstractFactory {
	
	private static long delayRobot;
	
	private static String pathRobot;
	
	private static EagerSingletonMisGuidedRobotFactory instance = new EagerSingletonMisGuidedRobotFactory();

	private EagerSingletonMisGuidedRobotFactory(){}

	public static EagerSingletonMisGuidedRobotFactory getInstance(long delay, String path) {
		delayRobot = delay;
		pathRobot = path;
		return instance;
	}
	
	private MisGuidedRobot getRobot(long delayRobot, String path, String name) {
		return new MisGuidedRobot(delayRobot, path, name);
	}

	@Override
	public MisGuidedRobot getObject(String name) {
		return getRobot(delayRobot, pathRobot, name);
	}
}