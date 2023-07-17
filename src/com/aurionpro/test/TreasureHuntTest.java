package com.aurionpro.test;

import java.util.Scanner;
import com.aurionpro.model.TreasureHunt;

public class TreasureHuntTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		TreasureHunt obj = new TreasureHunt();
		
		System.out.println("welcome to treasure hunt game !!!!");
		System.out.println("choose which direction to go : ");
		
		String rightOrLeft = sc.nextLine();
		
		boolean correctDirection = obj.chooseDirection(rightOrLeft);
		
		if (correctDirection) {
			System.out.println("Choose between swim or wait : ");
			String swimOrWait = sc.nextLine();
			boolean correctDecision = obj.chooseDecision(swimOrWait);
			
			if (correctDecision) 
			{
				System.out.println("choose a door colour between red, blue and yellow : ");
				String chooseDoorColour = sc.nextLine();
				System.out.println(obj.chooseDoorColour(chooseDoorColour));
			} else {
				System.out.println("attack bt trout GAME OVER!!!");
			}
			
		} else 
		{
			System.out.println("fall into hole GAME OVER!!!");
		}
	}
}