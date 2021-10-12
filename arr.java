package Arrays;
import java.util.Scanner;

public class arr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int [] marks =new int[n];
		
		for(int i=0;i<n;i++)
		{
			marks[i]= sc.nextInt();
		}
	 int avg =0;
	 for(int i=0;i<n;i++)
	 {
		 avg = avg+marks[i];
		
	 }
	 
		avg =avg/n;
		System.out.print("average is" + avg);
		
	}

}
