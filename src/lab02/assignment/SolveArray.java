package lab02.assignment;

import java.util.Arrays;

public class SolveArray {
	private int []array;
	public SolveArray(int []array) {
		super();
		this.array = array;
	}
	
	public void sortArray() {
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		
		}
	
	public void sumArray() {
		long sum = 0;
		for(int i : array) {
			sum += i;
		}
		System.out.println("Sum of array is:" + sum);
	}
	
	public void averageArray() {
		double average = 0;
		for(int i : array) {
			average += i;
		}
		average = average / array.length;
		System.out.println("Sum of array is:" + average);
	}
	
	
}
