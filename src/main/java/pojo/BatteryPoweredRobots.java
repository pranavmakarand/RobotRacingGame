package pojo;

import java.net.ConnectException;

import UtilityClass.FinalCoordinateFinderUtility;

public class BatteryPoweredRobots extends Robot {
	
	private String name;
	
    private long delayTime;
    
    private String path;
    
    private String finalCoordinates;
    
    private double energy;
	
    private static int counter = 0;
    
    private int rank = 0;
    
	public BatteryPoweredRobots() {
		super();
	}

	public BatteryPoweredRobots(long delayTime, String path, String name, double energy) {
		super(delayTime, path, name);
		this.energy = energy;
	}
	
	public double getEnergy() {
		return energy;
	}
	
	@Override
	public String toString() {
		return "BatteryPoweredRobots [name=" + name + ", delayTime=" + delayTime + ", path=" + path
				+ ", finalCoordinates=" + finalCoordinates + ", energy=" + energy + ", rank=" + rank + "]";
	}

	@Override
	public synchronized void run() {
		
    	long startTime = System.currentTimeMillis();
		try {
			try {
				this.finalCoordinates = FinalCoordinateFinderUtility.batteryPoweredFinalCoordinateFinder(this.path, this.delayTime, this.name, startTime, energy);
			} catch (ConnectException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		++counter;
		this.rank = counter;
	}
}
