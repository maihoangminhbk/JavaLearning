package lab02.assignment;

public class TriagleDraw {
	private int n;
	void setN(int n) {
		this.n = n;
	}
	
	public TriagleDraw() {
		
	};
	
	public TriagleDraw(int n) {
		this.n = n;
	}
	
	void show() {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n * 2 + 1; j++) {
				if(j >= n - i && j <= n + i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();

		}
	}
}
