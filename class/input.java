package MoneyExchange;

import java.util.Scanner;

public class input {
	Scanner scan = null;
	input(){
		scan = new Scanner(System.in);
	}
	
	public double inputWon() {
		double w;
		System.out.print("***원화 입력 : ");
		w = scan.nextInt();
		return w;
	}
	
	public int inputType() {
		int type;
		System.out.println("***Please enter the country of your choice*** \n1. USA \n2.Europe \n3.Japan \n4.UK \n5. exit");
		type = scan.nextInt();
		return type;
	}
}
