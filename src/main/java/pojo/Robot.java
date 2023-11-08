package pojo;

import UtilityClass.FinalCoordinateFinderUtility;

public class Robot extends Thread {
	
	private String name;
	
    private long delayTime;
    
    private String path;
    
    private String finalCoordinates;
	
    private static int counter = 0;
    
    private int rank = 0;
    
	public Robot() {
		super();
	}

	public Robot(long delayTime, String path, String name) {
		this.delayTime = delayTime;
		this.path = path;
		this.name = name;
	}
	
	public String getRobotName() {
		return name;
	}

	public long getDelayTime() {
		return delayTime;
	}

	public String getPath() {
		return path;
	}
	
	public String getFinalCoordinates() {
		return finalCoordinates;
	}
	
	public int getRank() {
		return rank;
	}
	
	@Override
	public String toString() {
		return "Robot [name=" + name + ", delayTime=" + delayTime + ", path=" + path + ", finalCoordinates="
			+ finalCoordinates + "]";
	}

	@Override
	public void run() {
		long startTime = System.currentTimeMillis();
		try {
			this.finalCoordinates = FinalCoordinateFinderUtility.finalCoordinateFinder(this.path, this.delayTime, this.name, startTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		++counter;
		this.rank = counter;	
	}
}
