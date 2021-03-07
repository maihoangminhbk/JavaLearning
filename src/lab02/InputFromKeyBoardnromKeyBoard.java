package lab02;
import java.util.Scanner;
public class InputFromKeyBoardnromKeyBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyBoard = new Scanner(System.in);
		System.out.println("What is your name?");
		String strName = keyBoard.nextLine();
		System.out.println("How old are you?");
		int iAge = keyBoard.nextInt();
		System.out.println("How tall are you?");
		double dHeight = keyBoard.nextDouble();
		System.out.println("Mr/Mrs " + strName + ", " + iAge + " years old. " + "Your height is: " + dHeight + " .");
		
	}

}
