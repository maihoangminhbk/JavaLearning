package lab01.assignment;

import javax.swing.JOptionPane;

public class FirstDegreeTwoEquations {
	private double a11;
	private double a12;
	private double b1;
	private double a21;
	private double a22;
	private double b2;
	
	
	public FirstDegreeTwoEquations() {
	};
	
	public FirstDegreeTwoEquations(double a11, double a12, double b1, double a21, double a22, double b2) {
		super();
		this.a11 = a11;
		this.a12 = a12;
		this.b1 = b1;
		this.a21 = a21;
		this.a22 = a22;
		this.b2 = b2;
	}
	
	public double getA11() {
		return a11;
	}
	public void setA11(double a11) {
		this.a11 = a11;
	}
	public double getA12() {
		return a12;
	}
	public void setA12(double a12) {
		this.a12 = a12;
	}
	public double getB1() {
		return b1;
	}
	public void setB1(double b1) {
		this.b1 = b1;
	}
	public double getA21() {
		return a21;
	}
	public void setA21(double a21) {
		this.a21 = a21;
	}
	public double getA22() {
		return a22;
	}
	public void setA22(double a22) {
		this.a22 = a22;
	}
	public double getB2() {
		return b2;
	}
	public void setB2(double b2) {
		this.b2 = b2;
	}
	// Solve the equation
	
	public void solve() {
		double d = a11 * a22 - a21 * a12;
		double d1 = b1 * a22 - b2 * a12;
		double d2 = a11 * b2 - a21 * b1;
		double x1;
		double x2;
		if(d != 0) {
			x1 = d1 / d;
			x2 = d2 / d;
			JOptionPane.showMessageDialog(null, "(x1, x2)" + " (" + x1 + "," + x2 +")");
			return;
		}
		
		if(d == 0) {
			x1 = 0;
			x2 = 0;
			JOptionPane.showMessageDialog(null, "(x1, x2)" + " (" + x1 + "," + x2 +")");
			return;
		}
		
		JOptionPane.showMessageDialog(null, "Vo nghiem");
	}
	
}
