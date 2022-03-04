package TriangleBuilder.npmg.edu;

import java.awt.*;
import java.awt.Point;
import javax.swing.*;
import java.awt.event.*;

public class Triangle extends JPanel {

	MouseHandler mouseHandler = new MouseHandler();
	Point p1 = new Point();
	Point p2 = new Point();
	Point p3 = new Point();
	public JButton button1 = new JButton();
	public JButton button2 = new JButton();
	public JButton button3 = new JButton();
	public JButton button4 = new JButton();
	public JButton button5 = new JButton();
	public Color c = Color.RED;
	private int whichLine = 0;
	private int whichPoint = 0;
	boolean drawing;

	public Triangle() {
		button1.setBackground(Color.BLACK);
		button2.setBackground(Color.RED);
		button3.setBackground(Color.BLUE);
		button4.setBackground(Color.GREEN);
		button5.setBackground(Color.WHITE);
		button1.setBounds(0, 0, 20, 20);
		button2.setBounds(0, 20, 20, 20);
		button3.setBounds(0, 40, 20, 20);
		button4.setBounds(0, 60, 20, 20);
		button5.setBounds(0, 80, 20, 20);
		this.add(button1);
		this.add(button2);
		this.add(button3);
		this.add(button4);
		this.add(button5);
		this.setPreferredSize(new Dimension(500, 400));
		this.addMouseListener(mouseHandler);

		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				c = Color.BLACK;
			}
		});
		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				c = Color.RED;
			}
		});
		button3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				c = Color.BLUE;
			}
		});
		button4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				c = Color.GREEN;
			}
		});
		button5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				c = Color.WHITE;
			}
		});
	}

	private class MouseHandler extends MouseAdapter {

		public void mouseClicked(MouseEvent e) {
			drawing = true;
			if (e.getY() > 20) {
				if (whichPoint == 0) {
					p1 = e.getPoint();
				} else if (whichPoint == 1) {
					p2 = e.getPoint();
				}
				if (whichPoint == 2) {
					p3 = e.getPoint();
				}
				if (whichPoint == 2) {
					repaint();
				}
				whichPoint++;
			}
		}
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawPolygon(new int[] { p1.x, p2.x, p3.x }, new int[] { p1.y, p2.y, p3.y }, 3);
		g.setColor(c);
		g.fillOval(p1.x - 3, p1.y - 3, 20, 20);
		g.setColor(c);
		g.fillOval(p2.x - 3, p2.y - 3, 20, 20);
		g.setColor(c);
		g.fillOval(p3.x - 3, p3.y - 3, 20, 20);
		g.setColor(c);
		g.drawLine(p1.x, p1.y, (p3.x + p2.x) / 2, (p3.y + p2.y) / 2);
		g.drawLine(p2.x, p2.y, (p3.x + p1.x) / 2, (p3.y + p1.y) / 2);
		g.drawLine(p1.x, p1.y, (p3.x + p2.x) / 2, (p3.y + p2.y) / 2);
		g.drawLine(p3.x, p3.y, (p1.x + p2.x) / 2, (p1.y + p2.y) / 2);
		g.setColor(Color.GRAY);
		g.fillRect(0, 0, 700, 50);
	}

	public static void main(String[] args) {
		JFrame f = new JFrame("Colored Triangle");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(0, 0, 700, 700);
		f.add(new Triangle());
		f.setVisible(true);
	}
}