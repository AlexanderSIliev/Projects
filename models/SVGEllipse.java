package edu.npmg.models;

import java.awt.Color;

public class SVGEllipse extends SVGObject {

	private int rx;
	private int ry;
	private int strokeWidth;
	private int fill;
	
	public void setFill(int newFill) {
		this.fill=newFill;
	}
	
	public void setStrokeWidth(int newStrokeWidth) {
		this.strokeWidth=newStrokeWidth;
	}
	
	public void setRX(int newRX) {
		this.rx=newRX;
	}
	
	public void setRY(int newRY) {
		this.ry=newRY;
	}
	
	public int getRX() {
		return rx;
	}
	
	public int getRY() {
		return ry;
	}
	
	public int getStrokeWidth() {
		return strokeWidth;
	}
	
	public int getFill() {
		return fill;
	}
	
	public SVGEllipse(int nRX, int nRY, int nCX, int nCY, Color strokeColor, int strokeWidth, int newFill) {
		super(nCX, nCY, strokeColor);
		setRX(nRX);
		setRY(nRY);
		setStrokeWidth(strokeWidth);
		setFill(newFill);
	}
	
	@Override
	public String toSvgCode() {
		String result = "<Ellipse ";
		result += "cx=\""+getX()+"\" cy=\""+getY()+"\" ";
		result += "rx=\""+getRX()+"\" ry=\""+getRY()+"\" ";
		result += "stroke=\""+toRGB(getColor())+"\" ";
		result += "stroke-width=\""+getStrokeWidth()+"\" ";
		result += "fill=\""+getFill()+"\">";
		
		return result;
	}
}