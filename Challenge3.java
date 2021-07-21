package challenges;

public class Challenge3 {

	public static void main(String[] args) {
		
		printEqual(-1,-10,-9);
		printEqual(5,5,5);
		printEqual(5,10,9);
		printEqual(10,10,9);
		
	}
	
	public static void printEqual(int firstparameter,int secondparameter,int thirdparameter) {
		
	
	if(firstparameter<0 && secondparameter<0 && thirdparameter<0) {
		System.out.println("Invalid number");
	}
	else if((firstparameter==secondparameter) && (secondparameter==thirdparameter)) {
		System.out.println("All numbers are equal");
	}
	else if((!(firstparameter == secondparameter) && !(secondparameter == thirdparameter) && !(thirdparameter == firstparameter))) {
		System.out.println("All numbers are Different");
	}
	else {
		System.out.println("Neither all are equal or different");
	}
	
	
	}
}