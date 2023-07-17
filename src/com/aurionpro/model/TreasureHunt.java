package com.aurionpro.model;

public class TreasureHunt {
	private String rightOrLeft;
	private String swimOrWait;
	private String door;
	
	public void setRightOrLeft(String rightOrLeft) {
		this.rightOrLeft = rightOrLeft;
	}
	public void setSwimOrWait(String swimOrWait) {
		this.swimOrWait = swimOrWait;
	}
	public void setDoor(String door) {
		this.door = door;
	}
	
	public static boolean chooseDirection(String rightOrLeft) {
		if(rightOrLeft.equalsIgnoreCase("left")) {
			return true;
		}
		return false;
	}
	public static boolean chooseDecision(String swimOrWait) {
		if(swimOrWait.equalsIgnoreCase("wait")) {
			return true;
		}
		return false;
	}
	public static String chooseDoorColour(String door) {
		if(door.equalsIgnoreCase("yellow")) {
			return "YOU WIN !";
		}
		else if(door.equalsIgnoreCase("red")){
			return "Burned by fire. Game Over";
		}
		else if(door.equalsIgnoreCase("blue")){
			return "eaten by beasts.Game Over";
		}
		else {
			return "GAME OVER";
		}
	}
}