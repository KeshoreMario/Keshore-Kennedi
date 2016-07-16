public class First_repeat {
	public static void main(String[] args) {
		int n=args.length;
		int count=0;
		int a1[]=new int[n];
		for(int i=0;i<n;i++){
			a1[i]=Integer.parseInt(args[i]);
		}
		for(int i=0;i<n-1;i++){
			if(count>0){
				break;
			}
			for(int j=1;j<n;j++){
				if(a1[i]==a1[j]){
					System.out.println("The first repeating element is:"+a1[j]);
					count+=1;
					break;
				}
				
			}
		}
	}

}
