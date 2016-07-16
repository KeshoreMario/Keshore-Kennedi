public class Index_contentmatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=args.length;
		int count=0;
		int a1[]=new int[n];
		for(int i=0;i<n;i++){
			a1[i]=Integer.parseInt(args[i]);
			if(a1[i]==i){
				System.out.println("The no "+i+" matches its index");
				count+=1;
			}
			}
		if(count==0){				
			System.out.println("No number matched its array");
	}
	}

}
