package edu.npmg.models;

import java.awt.Color;

public class SVGPolygon extends SVGObject {

	private int pointX;
	private int pointY;
	private int strokeWidth;
	private Color strokeColor;
	private Color fill;
	int coords[]=new int[999999999];
	int index=1;
	
	
	
	public void setX(int newX) {
		this.pointX=newX;
	}
	
	public void setY(int newY) {
		this.pointY=newY;
	}
	
	public void setStrokeWidth(int strokeWidth) {
		this.strokeWidth = strokeWidth;
	}
	
	public void setFill(Color newColor) {
		this.fill=newColor;
	}
	
	public void setStrokeColor(Color newColor) {
		this.strokeColor=newColor;
	}
	
	public Color getStrokeColor() {
		return strokeColor;
	}
	
	public int getX() {
		return pointX;
	}
	
	public int getY() {
		return pointY;
	}
	
	public int getStrokeWidth() {
		return strokeWidth;
	}
	
	public Color getFill() {
		return fill;
	}
	
	
	
	public SVGPolygon(int newStrokeWidth, Color newStrokeColor, Color newFill, int...args) {
		int count=1;
		setStrokeWidth(newStrokeWidth);
		setFill(newFill);
		setStrokeColor(newStrokeColor);
	    for (int point : args) {
	    	if(count%2!=0) {
	    		setX(point);
	    		coords[count]=getX();
	    		index++;
	    	}
	    	else {
	    		setY(point);
	    		coords[count]=getY();
	    		index++;
	    	}
	    	
	    	count++;
	     }
	}
	
	
	@Override
	public String toSvgCode() {
		String result = "<polygon points=";
		result+="\"";
		int check=1;
		for(int i=1; i<=index-1; i++) {	
			result+=coords[i];
			if(i!=index-1) {
			if(check%2!=0) {
				result+=",";
			}
			else {
				result+=" ";
			}
			}
			check++;
		}
		result+="\" ";
		result+="style=\"";
		result += "fill:"+getFill()+";";
		result += "stroke:"+getStrokeColor()+";";
		result += "stroke-width:"+getStrokeWidth()+"\"/>";
		return result;
	}

}