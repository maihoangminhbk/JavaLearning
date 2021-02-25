package lab01.assignment;
import javax.swing.JOptionPane;
public class FirstDegreeEquation {
	private double a;
	private double b;
	
	public FirstDegreeEquation() {
		
	};
	
	
	public FirstDegreeEquation(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}


	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	
	public void solve() {
		if(a == 0 && b == 0) {
			JOptionPane.showMessageDialog(null, "Vo so nghiem");
			return;
		}
		
		if(a == 0 && b != 0) {
			JOptionPane.showMessageDialog(null, "Vo nghiem");
			return;
		}
		
		double result;
		result = -b/a;
		JOptionPane.showMessageDialog(null, "Dap an la: " + result);
		
	}
}
