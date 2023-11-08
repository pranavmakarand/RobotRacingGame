package UtilityClass;

import java.net.ConnectException;
import java.util.Arrays;

public class FinalCoordinateFinderUtility {
	
	public static String finalCoordinateFinder(String input) throws InterruptedException {
		//My starting coordinates will be 0,0
		//If the robot goes left then the coordinates will be 1,0
		//If the robot goes right then the coordinates will be -1,0
		//If the robot goes forward then the coordinates will be 0,1
		
		if (input == null || input.isEmpty()) {
			throw new IllegalArgumentException();
		}
		
		int x = 0;
		int y = 0;
	
		for (int i = 0; i < input.length(); i++) {
	    	
			if (input.charAt(i) == 'L') {
				x += 1;
			} else if (input.charAt(i) == 'R') {
				x -= 1;
			} else if (input.charAt(i) == 'F') {
				y += 1;
			} else {
				throw new IllegalArgumentException();
			}
		}
		
		int[] path  = new int[2];
		
		path[0] = x;
		path[1] = y;

		return Arrays.toString(path);
	}
	
	public static String finalCoordinateFinder(String input, long delay, String name, long timer) throws InterruptedException {
		//My starting coordinates will be 0,0
		//If the robot goes left then the coordinates will be 1,0
		//If the robot goes right then the coordinates will be -1,0
		//If the robot goes forward then the coordinates will be 0,1
		
		if (input == null || input.isEmpty()) {
			throw new IllegalArgumentException();
		}
		
		int x = 0;
		int y = 0;
	
		for (int i = 0; i < input.length(); i++) {
	    	
			if (input.charAt(i) == 'L') {
				x += 1;
			} else if (input.charAt(i) == 'R') {
				x -= 1;
			} else if (input.charAt(i) == 'F') {
				y += 1;
			} else {
				throw new IllegalArgumentException();
			}
			
			long end = System.currentTimeMillis();
			
			float sec = ((end - timer) / 1000F);
			
			System.out.println(sec + "s " + name + ":" + " Moves" + " " + input.charAt(i));
			
			Thread.sleep(delay);
		}
		
		int[] path  = new int[2];
		
		path[0] = x;
		path[1] = y;

		return Arrays.toString(path);
	}
	
	
	/*
	 * This is the method for the misguided robot that does the opposite of the normal robot
	 */
	public static String misGuidedRobotFinalCoordinateFinder(String input, long delay, String name, long timer) throws InterruptedException {
		//My starting coordinates will be 0,0
		//If the robot goes right then the coordinates will be 1,0
		//If the robot goes left then the coordinates will be -1,0
		//If the robot goes backward then the coordinates will be 0,-1
		
		if (input == null || input.isEmpty()) {
			throw new IllegalArgumentException();
		}
		
		int x = 0;
		int y = 0;
	
		for (int i = 0; i < input.length(); i++) {
	    	
			if (input.charAt(i) == 'L') {
				x -= 1;
			} else if (input.charAt(i) == 'R') {
				x += 1;
			} else if (input.charAt(i) == 'F') {
				y -= 1;
			} else {
				throw new IllegalArgumentException();
			}
			
			long end = System.currentTimeMillis();
			
			float sec = ((end - timer) / 1000F);
			
			System.out.println("Time : " + sec + "s" + name + ":" + " Moves" + " " + input.charAt(i));
			
			Thread.sleep(delay);
		}
		
		int[] path  = new int[2];
		
		path[0] = x;
		path[1] = y;

		return Arrays.toString(path);
	}
	
	/*
	 * This is the method for the Battery powered robot that does stops working if it out of battery energy.
	 */
	public static String batteryPoweredFinalCoordinateFinder(String input, long delay, String name, long timer, double energy) throws InterruptedException, ConnectException {
		//My starting coordinates will be 0,0
		//If the robot goes left then the coordinates will be 1,0
		//If the robot goes right then the coordinates will be -1,0
		//If the robot goes forward then the coordinates will be 0,1
		
		//Here if the energy value goes negative then it exhausts and the robot stops working
		
		if (input == null || input.isEmpty()) {
			throw new IllegalArgumentException();
		}
		
		int x = 0;
		int y = 0;
		
		boolean exhaust = false;
	
		for (int i = 0; i < input.length(); i++) {
	    	
			if (input.charAt(i) == 'L') {
				x -= 1;
			} else if (input.charAt(i) == 'R') {
				x += 1;
			} else if (input.charAt(i) == 'F') {
				y -= 1;
			} else {
				throw new IllegalArgumentException();
			}
			
			energy -= 5;
			
			exhaust = false;
			
			if (energy < 0) {
				exhaust = true;
				break;
			}
			
			long end = System.currentTimeMillis();
			
			float sec = ((end - timer) / 1000F);
			
			System.out.println("Time : " + sec + "s" + name + ":" + " Moves" + " " + input.charAt(i));
			
			Thread.sleep(delay);
		}
		
		int[] path  = new int[2];
		
		if (exhaust) {
			throw new java.net.ConnectException();
		}
		
		path[0] = x;
		path[1] = y;

		return Arrays.toString(path);
	}
}
