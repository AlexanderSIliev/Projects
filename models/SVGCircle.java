package edu.npmg.models;

import java.awt.Color;

public class SVGCircle extends SVGObject {

	private int r;
	private int strokeWidth;
	private int fill;
	
	public void setRadius(int newR) {
		this.r=newR;
	}
	
	public void setFill(int newFill) {
		this.fill=newFill;
	}
	
	public void setStrokeWidth(int newStrokeWidth) {
		this.strokeWidth=newStrokeWidth;
	}
	
	public int getRadius() {
		return r;
	}
	
	public int getStrokeWidth() {
		return strokeWidth;
	}
	
	public int getFill() {
		return fill;
	}
	
	public SVGCircle(int cX, int cY, int r, Color strokeColor, int strokeWidth, int newFill)
	{
		super(cX, cY, strokeColor);
		setRadius(r);
		setStrokeWidth(strokeWidth);
		setFill(newFill);
	}
	
	@Override
	public String toSvgCode() {
		String result = "<circle ";
		result += "x1=\""+getX()+"\" y1=\""+getY()+"\" ";
		result += "r=\""+getRadius()+"\" ";
		result += "stroke=\""+toRGB(getColor())+"\" ";
		result += "stroke-width=\""+getStrokeWidth()+"\" ";
		result += "fill=\""+getFill()+"\">";
		return result;
	}
	
	
	
}