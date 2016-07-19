public class Fibo {
	public static void main(String[] args) {
		    int a[]=new int[Integer.parseInt(args[0])];
		   int n=Integer.parseInt(args[0]);
		    int c=2;
			  a[0]=0;
			  a[1]=1;
			  System.out.println(a[0]);
			  System.out.println(a[1]);
			   for(int i=1;i<n-1;i++){
				   a[c]=a[i]+a[i-1];
				   System.out.println(a[c]);
				   c++;
						  }
			  }	
}

