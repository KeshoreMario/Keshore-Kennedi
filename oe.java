public class Oddevn {
   public static void main(String[] args) {
	int i=Integer.parseInt(args[0]);
	if(i==0){
		System.out.println("0 is neither odd nor even.");
	}
	else if(i%2==0){
	System.out.println(i+" is even.");
	}
	else{
		System.out.println(i+" is odd.");
	}
	}
}
