package TriangleBuilder.npmg.edu;

import java.awt.*;
import java.awt.Point;
import javax.swing.*;
import java.awt.event.*;

public class Triangle extends JPanel{

     MouseHandler mouseHandler = new MouseHandler();
     Point p1 = new Point();
     Point p2 = new Point();
     Point p3 = new Point();
     Point center1= new Point();
     Point center2= new Point();
     private double lengthL1;
     private double lengthL2;
     private double lengthL3;
     private double halfPerimeter;
     private double perimeter;
     private double r1;
     private double r2;
     private int whichPoint=0;
     boolean drawing;
     boolean validTriangle=true;

    public Triangle(){
        this.setPreferredSize(new Dimension(500, 400));
        this.addMouseListener(mouseHandler);
    }
    
    private class MouseHandler extends MouseAdapter {

        public void mouseClicked(MouseEvent e) {
            drawing = true;
            if(whichPoint==0) {
            	p1 = e.getPoint();
            }
            else if(whichPoint==1) {
                p2 = e.getPoint();
            }
            if(whichPoint==2) {
                p3 = e.getPoint();
            }
            if(whichPoint==2) {
            	//Finding lengths of the sides using their coordinates
            	lengthL1=Math.sqrt((p2.x-p1.x)*(p2.x-p1.x)+(p2.y-p1.y)*(p2.y-p1.y));
            	lengthL2=Math.sqrt((p3.x-p2.x)*(p3.x-p2.x)+(p3.y-p2.y)*(p3.y-p2.y));
            	lengthL3=Math.sqrt((p3.x-p1.x)*(p3.x-p1.x)+(p3.y-p1.y)*(p3.y-p1.y));
            	//Check if the triangle is possible
            	if(lengthL1+lengthL2<lengthL3 || lengthL1+lengthL3<lengthL2 || lengthL3+lengthL2<lengthL1 || lengthL1<0 || lengthL2<0 || lengthL3<0) {
            		validTriangle=false;
            	}
            	//Find halfperimeter and perimeter
            	halfPerimeter=(lengthL1+lengthL2+lengthL3)/2;
            	perimeter=lengthL1+lengthL2+lengthL3;
            	//Find center coordinates of incircle
            	center1.x=(p1.x+p2.x+p3.x)/3;
            	center1.y=(p1.y+p2.y+p3.y)/3;
            	//Find radius of circles
            	r1=lengthL1/halfPerimeter;
            	r2=lengthL1*lengthL2*lengthL3/Math.sqrt(perimeter*(perimeter-lengthL1)*(perimeter-lengthL2)*(perimeter-lengthL3));
            }
            if(whichPoint==2 && validTriangle==true) {
            	repaint();
            }
            whichPoint++;
        }
    }
    
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(validTriangle==false) {
        	g.drawString("Impossible Triangle!", 0, 70);
        	return;
        }
        g.drawPolygon(new int[] {p1.x, p2.x, p3.x}, new int[] {p1.y, p2.y, p3.y}, 3);
        g.drawString("Length of side 1:"+ lengthL1, 0, 10);
        g.drawString("Length of side 2:"+ lengthL2, 0, 20);
        g.drawString("Length of side 3:"+ lengthL3, 0, 30);
        g.drawString("Perimeter:"+ perimeter, 0, 40);
        g.drawString("Area:"+ Math.sqrt(halfPerimeter*(halfPerimeter-lengthL1)*(halfPerimeter-lengthL2)*(halfPerimeter-lengthL3)), 0, 50);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Draw Triangle");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new Triangle());
        f.pack();
        
        f.setVisible(true);
    }
}