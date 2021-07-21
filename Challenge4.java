package challenges;

public class Challenge4 {


	public static void main(String[] args) {

		System.out.println(catPlaying(true,35));
		System.out.println(catPlaying(false,50));
	}
		
		public static boolean catPlaying(boolean summer,int temperature) {
			
			if(summer) {
				return(temperature>=25 && temperature<=45);
			}
			else {
				return(temperature>=25 && temperature<=35);
			}
			
		
	
	}
}
