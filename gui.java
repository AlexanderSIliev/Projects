package edu.npmg.GUI;

import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

class Container
{
	String value;
	String func;
	boolean firstOrSecond=true;
	
	public void setValue(String newValue) {
		if(newValue.isEmpty()==false && newValue!=null) {
			this.value=newValue;
		}
	}
	
	public String getValue() {
		return value;
	}
	
	public void setFunc(String newFunc) {
		if(newFunc=="+" || newFunc=="-" || newFunc=="*" || newFunc=="/") {
			this.func=newFunc;
		}
	}
	
	public String getFunc() {
		return func;
	}
	
	public void setFOS(boolean newFOS) {
		this.firstOrSecond=newFOS;
	}
	
	public boolean getFOS() {
		return firstOrSecond;
	}
	
}

public class gui {
	
	public static void main(String args[]){
		
		Container firstNum = new Container();
		firstNum.value="";
		Container secondNum = new Container();
		secondNum.value="";
		Container func = new Container();
		func.value="";
		Container firstOrSecond = new Container();
	
	JFrame frame = new JFrame("Calculator");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(410,740);
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton button0 = new JButton("0");
    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");
    JButton buttonMultiply = new JButton("*");
    JButton buttonDivide = new JButton("/");
    JButton buttonEquals = new JButton("=");
    JButton buttonClear = new JButton("CE");
    JButton buttonSeparate = new JButton(".");
    button1.setBounds(0, 200, 100, 100);
    button2.setBounds(100, 200, 100, 100);
    button3.setBounds(200, 200, 100, 100);
    button4.setBounds(0, 300, 100, 100);
    button5.setBounds(100, 300, 100, 100);
    button6.setBounds(200, 300, 100, 100);
    button7.setBounds(0, 400, 100, 100);
    button8.setBounds(100, 400, 100, 100);
    button9.setBounds(200, 400, 100, 100);
    button0.setBounds(100, 500, 100, 100);
    buttonPlus.setBounds(300, 200, 100, 100);
    buttonMinus.setBounds(300, 300, 100, 100);
    buttonMultiply.setBounds(300, 400, 100, 100);
    buttonDivide.setBounds(300, 500, 100, 100);
    buttonEquals.setBounds(0, 500, 100, 100);
    buttonClear.setBounds(200, 500, 100, 100);
    buttonSeparate.setBounds(0, 600, 100, 100);
    JTextField window = new JTextField();
    window.setBounds(0, 0, 410, 200);
    frame.getContentPane().add(button1); 
    frame.getContentPane().add(button2); 
    frame.getContentPane().add(button3); 
    frame.getContentPane().add(button4); 
    frame.getContentPane().add(button5); 
    frame.getContentPane().add(button6); 
    frame.getContentPane().add(button7); 
    frame.getContentPane().add(button8); 
    frame.getContentPane().add(button9); 
    frame.getContentPane().add(button0);  
    frame.getContentPane().add(buttonPlus); 
    frame.getContentPane().add(buttonMinus); 
    frame.getContentPane().add(buttonMultiply); 
    frame.getContentPane().add(buttonDivide); 
    frame.getContentPane().add(buttonEquals); 
    frame.getContentPane().add(buttonClear); 
    frame.getContentPane().add(buttonSeparate); 
    frame.getContentPane().add(window);
    frame.setLayout(null);   
    frame.setVisible(true);
    
    button1.addActionListener(new ActionListener() {
    	String button1val=button1.getText();
		@Override
		public void actionPerformed(ActionEvent e) {
			window.setText(window.getText()+button1val);
			if(firstOrSecond.getFOS()==true) {
				firstNum.value=firstNum.value+button1val;
			}
			else if(firstOrSecond.getFOS()==false) {
				secondNum.value=secondNum.value+button1val;
			}	
		}
    });
    
    button2.addActionListener(new ActionListener() {
    	String button2val=button2.getText();
		@Override
		public void actionPerformed(ActionEvent e) {
			window.setText(window.getText()+button2val);
			if(firstOrSecond.getFOS()==true) {
				firstNum.value=firstNum.value+button2val;
			}
			else if(firstOrSecond.getFOS()==false) {
				secondNum.value=secondNum.value+button2val;
			}	
		}
    });
    
    button3.addActionListener(new ActionListener() {
    	String button3val=button3.getText();
		@Override
		public void actionPerformed(ActionEvent e) {
			window.setText(window.getText()+button3val);
			if(firstOrSecond.getFOS()==true) {
				firstNum.value=firstNum.value+button3val;
			}
			else if(firstOrSecond.getFOS()==false) {
				secondNum.value=secondNum.value+button3val;
			}	
		}
    });
    
    button4.addActionListener(new ActionListener() {
    	String button4val=button4.getText();
		@Override
		public void actionPerformed(ActionEvent e) {
			window.setText(window.getText()+button4val);
			if(firstOrSecond.getFOS()==true) {
				firstNum.value=firstNum.value+button4val;
			}
			else if(firstOrSecond.getFOS()==false) {
				secondNum.value=secondNum.value+button4val;
			}	
		}
    });
    
    button5.addActionListener(new ActionListener() {
    	String button5val=button5.getText();
		@Override
		public void actionPerformed(ActionEvent e) {
			window.setText(window.getText()+button5val);
			if(firstOrSecond.getFOS()==true) {
				firstNum.value=firstNum.value+button5val;
			}
			else if(firstOrSecond.getFOS()==false) {
				secondNum.value=secondNum.value+button5val;
			}	
		}
    });
    
    button6.addActionListener(new ActionListener() {
    	String button6val=button6.getText();
		@Override
		public void actionPerformed(ActionEvent e) {
			window.setText(window.getText()+button6val);
			if(firstOrSecond.getFOS()==true) {
				firstNum.value=firstNum.value+button6val;
			}
			else if(firstOrSecond.getFOS()==false) {
				secondNum.value=secondNum.value+button6val;
			}	
		}
    });
    
    button7.addActionListener(new ActionListener() {
    	String button7val=button7.getText();
		@Override
		public void actionPerformed(ActionEvent e) {
			window.setText(window.getText()+button7val);
			if(firstOrSecond.getFOS()==true) {
				firstNum.value=firstNum.value+button7val;
			}
			else if(firstOrSecond.getFOS()==false) {
				secondNum.value=secondNum.value+button7val;
			}	
		}
    });
    
    button8.addActionListener(new ActionListener() {
    	String button8val=button8.getText();
		@Override
		public void actionPerformed(ActionEvent e) {
			window.setText(window.getText()+button8val);
			if(firstOrSecond.getFOS()==true) {
				firstNum.value=firstNum.value+button8val;
			}
			else if(firstOrSecond.getFOS()==false) {
				secondNum.value=secondNum.value+button8val;
			}	
		}
    });
    
    button9.addActionListener(new ActionListener() {
    	String button9val=button9.getText();
		@Override
		public void actionPerformed(ActionEvent e) {
			window.setText(window.getText()+button9val);
			if(firstOrSecond.getFOS()==true) {
				firstNum.value=firstNum.value+button9val;
			}
			else if(firstOrSecond.getFOS()==false) {
				secondNum.value=secondNum.value+button9val;
			}	
		}
    });
    
    button0.addActionListener(new ActionListener() {
    	String button0val=button0.getText();
		@Override
		public void actionPerformed(ActionEvent e) {
			window.setText(window.getText()+button0val);
			if(firstOrSecond.getFOS()==true) {
				firstNum.value=firstNum.value+button0val;
			}
			else if(firstOrSecond.getFOS()==false) {
				secondNum.value=secondNum.value+button0val;
			}	
		}
    });
    
    buttonSeparate.addActionListener(new ActionListener() {
    	String buttonSeparateval=buttonSeparate.getText();
		@Override
		public void actionPerformed(ActionEvent e) {
			window.setText(window.getText()+buttonSeparateval);
			if(firstOrSecond.getFOS()==true) {
				firstNum.value=firstNum.value+buttonSeparateval;
			}
			else if(firstOrSecond.getFOS()==false) {
				secondNum.value=secondNum.value+buttonSeparateval;
			}	
		}
    });
    
    buttonPlus.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			window.setText(window.getText()+" + ");
			func.value="+";
			firstOrSecond.setFOS(false);
		}
    });
    
    buttonMinus.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			window.setText(window.getText()+" - ");
			func.value="-";
			firstOrSecond.setFOS(false);
		}
    });
    
    buttonMultiply.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			window.setText(window.getText()+" * ");
			func.value="*";
			firstOrSecond.setFOS(false);
		}
    });
    
    buttonDivide.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			window.setText(window.getText()+" / ");
			func.value="/";
			firstOrSecond.setFOS(false);
		}
    });
    
    buttonClear.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			firstNum.value="";
			secondNum.value="";
			firstOrSecond.setFOS(true);
			window.setText("");
		}
    });
    
    buttonEquals.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			window.setText(window.getText()+" = ");
			double num1=Double.parseDouble(firstNum.value);
			double num2=Double.parseDouble(secondNum.value);
			String fun=func.value;
			System.out.println(fun);
			System.out.println(num1);
			System.out.println(num2);
			if(fun=="+") {
				String result=Double.toString(num1+num2);
				window.setText(result);
				firstNum.value=result;
				firstOrSecond.setFOS(true);
				secondNum.value="";
			}
			else if(func.value=="-") {
				String result=Double.toString(num1-num2);
				window.setText(result);
				firstNum.value=result;
				firstOrSecond.setFOS(true);
				secondNum.value="";
			}
			else if(func.value=="*") {
				String result=Double.toString(num1*num2);
				window.setText(result);
				firstNum.value=result;
				firstOrSecond.setFOS(true);
				secondNum.value="";
			}
			else if(func.value=="/") {
				if(num2==0) {
					window.setText("");
					firstNum.value="";
					secondNum.value="";
					firstOrSecond.setFOS(true);
					return;
				}
				String result=Double.toString(num1/num2);
				window.setText(result);
				firstNum.value=result;
				firstOrSecond.setFOS(true);
				secondNum.value="";
			}
		}
    });
    

}
}
