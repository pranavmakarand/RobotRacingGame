package pojo;

import UtilityClass.FinalCoordinateFinderUtility;

public class MisGuidedRobot  {
	
	private String name;
	
    private long delayTime;
    
    private String path;
    
    private String finalCoordinates;
	
    private static int counter = 0;
    
    private int rank = 0;
    
	public MisGuidedRobot() {
		super();
	}

	public MisGuidedRobot(long delayTime, String path, String name) {
		super(delayTime, path, name);
	}
	
	@Override
	public String toString() {
		return "MisGuidedRobot [name=" + name + ", delayTime=" + delayTime + ", path=" + path + ", finalCoordinates="
				+ finalCoordinates + ", rank=" + rank + "]";
	}

	public synchronized void run() {
		
    	long startTime = System.currentTimeMillis();
		try {
			this.finalCoordinates = FinalCoordinateFinderUtility.misGuidedRobotFinalCoordinateFinder(this.path, this.delayTime, this.name, startTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		++counter;
		this.rank = counter;
	}
}
