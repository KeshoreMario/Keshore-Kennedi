public class Binarysort {

		public static void main(String[] args) {
	int n=args.length;
	int temp=0;
	int temp1=0;
	int dec[]=new int[n];
	int count[]=new int[n];
	String bin[]=new String[n];
	for(int i=0;i<n;i++){
		dec[i]=Integer.parseInt(args[i]);
		bin[i]=Integer.toBinaryString(dec[i]);
			}
for(int i=0;i<n;i++){count[i]=0;
	for(int j=0;j<bin[i].length();j++){
		char t=bin[i].charAt(j);
		if(t=='1'){
		count[i]=count[i]+1;
			}
	}
}
for(int i=0;i<n-1;i++){
		for(int j=0;j<n-i-1;j++){
		if(count[j]<count[j+1]){
			temp1=count[j];
			count[j]=count[j+1];
			count[j+1]=temp1;
			temp=dec[j];
			dec[j]=dec[j+1];
			dec[j+1]=temp;
		}else if(count[j]==count[j+1]){
			{
				if(dec[j]<dec[j+1]){
					temp=dec[j];
					dec[j]=dec[j+1];
					dec[j+1]=temp;
				}
			}
		}
	}
}
for(int i=0;i<dec.length;i++){
	System.out.println(dec[i]);
}
}

}
