import java.util.*;
public class Wordreverse {
		public static void main(String[] args) {
			System.out.println("ENTER THE STRING:");
			Scanner in=new Scanner(System.in);
			String ip=in.nextLine();
			String out[]=ip.split(" ");
			for(int i=out.length-1;i>=0;i--){
				System.out.print(out[i]+" ");
			}
		}
}
