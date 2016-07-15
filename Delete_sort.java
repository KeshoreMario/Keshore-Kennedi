import java.util.Arrays;
public class Delete_sort {

	public static void main(String[] args) {
		int n=args[0].length();
		int least=0;
		int l=1;
		int num=Integer.parseInt(args[0]);
		int[] a=new int[n];
		int k=Integer.parseInt(args[1]);
		for(int i=n-1;i>=0;i--){
			 a[i]=num%10;
			 num=num/10;
				}
		n--;
		Arrays.sort(a);
for(int j=0;j<k;j++){
	a[n]=0;
	n--;
}
for(int i=n;i>=0;i--){
	least=least+(a[i]*l);
	l=l*10;
}
System.out.println(least);
	}

}
