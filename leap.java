public class Leap {

	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		if(n%100==0 && n%400==0){
			System.out.println("Leap year");
		}
		else if(n%4==0){
			System.out.println("Leap year");
		}
		else{
			System.out.println("Not leap year");
		}
	}

}
