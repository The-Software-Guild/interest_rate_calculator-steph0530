import java.util.*;

/*output: 
 * 1. the number
 * 2. each factor (exclude self)
 * 3. number of factors
 * 4. isPerfect
 * 5. isPrime
 */
public class Factorizer {
	public static void findFactors(ArrayList<Integer> factors, int number) {
		for(int i=2;i*i<number;i++) {
			if(number%i==0) {
				factors.add(i);
				factors.add(number/i);
			}
		}
	}
	
	public static Boolean isPerfect(int number, ArrayList<Integer> factors) {
		int sum=0;
		for(int factor:factors) {
			if(factor!=number) sum+=factor;
		}
		return sum==number;
	}
	
	public static void main(String[] args) {
		System.out.println("What number would you like to factor? ");
		
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int number = Integer.parseInt(str);
		
		ArrayList<Integer> factors = new ArrayList<Integer>();
		factors.add(1);
		findFactors(factors, number);
		factors.add(number);
		
		System.out.print("The factors of "+number+" are:");
		for(int num:factors) System.out.print(num+" ");
		System.out.println("The number of factors are: "+factors.size());
		
		if(isPerfect(number, factors)) System.out.println(number + " is a perfect number");
		else System.out.println(number + " is not a perfect number");
		
		if(factors.size()==2) System.out.print(number + " is a prime");
		else System.out.print(number + " is not a prime");
	}

}
