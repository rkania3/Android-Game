package com.kilobolt.slidergame;

import android.graphics.*;

public class Box {
	private int BoColor;
	private int height, width;
	public Box (int types) {
		BoColor=types;
	}
	public int getBoColor() {
		return BoColor;
	}
	public int getHeight() {
		return height;
	}
	public int getWidth() {
		return width;
	}
	public void setBoColor(int boColor) {
		BoColor = boColor;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void setWidth(int width) {
		this.width = width;
	}
}
