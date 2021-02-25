package lab01.assignment;

import javax.swing.JOptionPane;

public class SecondDegreeEquation {
	private double a;
	private double b;
	private double c;
	
	public SecondDegreeEquation() {
		
	};
	
	public SecondDegreeEquation(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public void solve() {
		double x1;
		double x2;
		
		if(a == 0) {
			new FirstDegreeEquation(b, c).solve();
			return;
		}
		
		double denta = b * b - 4 * a * c;
		
		if(denta == 0) {
			x1 = -b / 2 / a;
			x2 = x1;
			JOptionPane.showMessageDialog(null, "(x1, x2)" + " (" + x1 + ", " + x2 +")");
			return;
		}
		
		if(denta > 0) {
			x1 = (-b + Math.sqrt(denta)) / 2 / a;
			x2 = (-b - Math.sqrt(denta)) / 2 / a;
			JOptionPane.showMessageDialog(null, "(x1, x2)" + " (" + x1 + ", " + x2 +")");
			return;
		}
		
		JOptionPane.showMessageDialog(null, "Vo nghiem");
	}
}
