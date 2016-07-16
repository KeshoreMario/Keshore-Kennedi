public class Sumpalindrome {
	
		public static void main(String[] args) {
			int num=Integer.parseInt(args[0]);
			int sum=0;
			int temp=0;
			int temp1=0;
			while(num>9){
				temp=num%10;
				sum=sum+temp;
				num=num/10;
			}
			sum=sum+num;
			int rev=0;
			int rem=0;
			temp1=sum;
				while(sum>0){
				rem=sum%10;
				rev=rev*10+rem;
				sum=sum/10;
			}
	if(rev==temp1){
		System.out.println("Sum of digits of "+args[0]+" is a palindrome.");
	}
	else{
		System.out.println("Sum of digits of "+args[0]+" is not a palindrome.");
	}

		}

	}
