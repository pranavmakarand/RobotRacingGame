package factories;

import pojo.BatteryPoweredRobots;

public class EagerSingletonBatteryPoweredRobotFactory extends AbstractFactory {
	
	private static long delayRobot;
	
	private static String pathRobot;
	
	private static double energy;
	
	private static EagerSingletonBatteryPoweredRobotFactory instance = new EagerSingletonBatteryPoweredRobotFactory();

	private EagerSingletonBatteryPoweredRobotFactory(){}

	public static EagerSingletonBatteryPoweredRobotFactory getInstance(long delay, String path) {
		delayRobot = delay;
		pathRobot = path;
		return instance;
	}
	
	private BatteryPoweredRobots getBatteryPoweredRobot(long delayRobot, String path, String name, double energy) {
		return new BatteryPoweredRobots(delayRobot, path, name, energy);
	}

	@Override
	public BatteryPoweredRobots getObject(String name) {
		return getBatteryPoweredRobot(delayRobot, pathRobot, name, energy);
	}
}