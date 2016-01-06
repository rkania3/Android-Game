package com.kilobolt.slidergame;

import java.util.Random;

import android.graphics.Color;

public class Barrier {
	public int baColor;
	public int baSpeed;
	
	public int baY;
	public int numTypes=5;
	public static int[] types= {Color.RED,Color.GREEN,Color.BLUE,Color.YELLOW,Color.MAGENTA };
	public static int[] tempTypes = {Color.RED,Color.GREEN,Color.BLUE,Color.YELLOW,Color.MAGENTA };
	
	public void generate() {
		Random randGen=new Random();
		int baColor =tempTypes[randGen.nextInt(numTypes)];
	}
	
	public void move() {
		
	}
	public void destroy() {
		
	}
}
