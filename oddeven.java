public class Oddeven {
	public static void main(String[] args) {
	int n;
  n=args.length;
if(n==0){
	System.out.println("Invalid input");
}
else{
	int num=Integer.parseInt(args[0]);
	if(num==0){
	System.out.println("0 is neither even nor odd.");
	}
	else if(num%2==0){
		System.out.println(num+" is even");
	}
	else {
		System.out.println(num+" is negative.");
	}
}
}
}
