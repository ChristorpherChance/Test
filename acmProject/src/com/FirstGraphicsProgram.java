package com;

import java.awt.Color;
import java.awt.Font;

import acm.graphics.GLabel;
import acm.graphics.GOval;
import acm.graphics.GPolygon;
import acm.program.GraphicsProgram;

public class FirstGraphicsProgram extends GraphicsProgram
{
	private static final Font Fond = null;

	public void run()
	{
//		GLabel glabel = new GLabel("Hello World!", 100, 75);
//		glabel.setColor(Color.red);
//		glabel.setFont("SansSerif-bold-36");
//		add(glabel);
//		double d = 1.0;
//		GOval ball = new GOval(d, d);
//		ball.move(d, d);
		GPolygon diamond = new GPolygon();
		int width = 20;
		int height = 40;
		diamond.addVertex(-width/2, 0);
		diamond.addVertex(0, -height/2);
		diamond.addVertex(width/2, 0);
//		diamond.addEdge(width/2, height/2);
//		diamond.addEdge(width/2, -height/2);
		diamond.setLocation(30, 40);
		add(diamond);
	}
}
