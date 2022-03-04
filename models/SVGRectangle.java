package edu.npmg.models;

import java.awt.Color;

public class SVGRectangle extends SVGObject {
	
	private int height;1
	private int width;
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
	
	public void setHeight(int newHeight) {
		this.height=newHeight;
	}
	
	public void setWidth(int newWidth) {
		this.width=newWidth;
	}
	
	
	public void setRX(int newRX) {
		this.rx=newRX;
	}
	
	public void setRY(int newRY) {
		this.ry=newRY;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getWidth() {
		return width;
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
	
	public SVGRectangle(int nX, int nY,int nHeight, int nWidth, int nRX, int nRY, Color strokeColor, int strokeWidth, int newFill) {
		super(nX, nY, strokeColor);
		setHeight(nHeight);
		setWidth(nWidth);
		setRX(nRX);
		setRY(nRY);
		setStrokeWidth(strokeWidth);
		setFill(newFill);
	}

	@Override
	public String toSvgCode() {
		String result = "<rect ";
		result += "x=\""+getX()+"\" y=\""+getY()+"\" ";
		result += "width=\""+getWidth()+"\" height=\""+getHeight()+"\" ";
		result += "rx=\""+getRX()+"\" ry=\""+getRY()+"\" ";
		result += "stroke=\""+toRGB(getColor())+"\" ";
		result += "stroke-width=\""+getStrokeWidth()+"\" ";
		result += "fill=\""+getFill()+"\">"; 
		return result;
	}

}
