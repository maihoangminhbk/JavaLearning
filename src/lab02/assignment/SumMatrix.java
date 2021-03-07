package lab02.assignment;

public class SumMatrix {
	private double [][]matrix1;
	private double [][]matrix2;
	
	
	public double[][] getMatrix1() {
		return matrix1;
	}


	public void setMatrix1(double[][] matrix1) {
		this.matrix1 = matrix1;
	}


	public double[][] getMatrix2() {
		return matrix2;
	}


	public void setMatrix2(double[][] matrix2) {
		this.matrix2 = matrix2;
	}

	public boolean checkSize() {
		if(matrix1.length != matrix2.length) {
			return false;
		}
		for(int i = 0; i < matrix1.length; i++) {
		if(matrix1[i].length != matrix2[i].length) {
			return false;
		}
		}
		return true;
	}

	public void sumMatrix() {
		boolean checkMatrixSize = checkSize();
		if(checkMatrixSize == false) {
			System.out.println("Size not equal");
			return;
		}
		int row = matrix1.length;
		int column = matrix1[0].length;
		
		double [][]sum = new double[row][column];
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				sum[i][j] = matrix1[i][j] + matrix2[i][j];
				System.out.print(" [" + sum[i][j] + "] ");
			}
			System.out.println();
		}
		
	}
	
	
}
