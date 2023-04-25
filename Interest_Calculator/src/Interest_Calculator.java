import java.util.*;

public class Interest_Calculator {
	public static double get_amount(double amount, double quater) {
		return amount*Math.pow(1+quater/100, 4);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How much do you want to invest? ");
		String str = in.nextLine();
		double amount = Integer.parseInt(str);
				
		System.out.println("How many years are you investing? ");
		String str1 = in.nextLine();
		int year = Integer.parseInt(str1);
		
		System.out.println("What is the annual interest rate % growth? ");
		String str2 = in.nextLine();
		int rate = Integer.parseInt(str2);
		
		double quater = (double)rate/4;
		for(int i=1;i<=year;i++) {
			double new_amount=get_amount(amount, quater);
			double earned = new_amount - amount;
			System.out.println("Year "+i+" : Begin with $"+amount+", Earned "+earned+", Ended with" + new_amount);
			amount = new_amount;
		}
		
	}
	
}
