package com.kilobolt.slidergame;

import android.graphics.*;
import java.net.URL;

import com.kilobolt.slidergame.*;

import com.kilobolt.framework.Image;
import com.kilobolt.framework.Music;
import com.kilobolt.framework.Sound;

public class Assets {
    
	public URL base;
	public Image background, image;
	
	public static Background bg;
	Slider slider = new Slider(2);
	Slider slider2 = new Slider();
	public int selectedNumber = slider.array.length / 2;
	public Color selectedColor;
	public boolean gameOver = false;
	public int score = 0;
	public int levelCount = 0;
	public int level = 1;
	public boolean scoreChange = false;
	public static Image menu, splash, character, character2, character3, heliboy, heliboy2, heliboy3, heliboy4, heliboy5;
    public static Image tiledirt, tilegrassTop, tilegrassBot, tilegrassLeft, tilegrassRight, characterJump, characterDown;
    public static Image button;
    public static Sound click;
    public static Music theme;
    
    public static void load(SampleGame sampleGame) {
        // TODO Auto-generated method stub
        theme = sampleGame.getAudio().createMusic("menutheme.mp3");
        theme.setLooping(true);
        theme.setVolume(0.85f);
        theme.play();
    }
    
}
