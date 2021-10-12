package Arrays;

public class selectionsort {

	public static void main(String[] args) {
		int a[]= {3,2,-1,7,4,0};
		int n=a.length;
		for(int i=0;i<n-1;i++) {
			int min = i;
			for(int j=i;j<n;j++)
			{
				if(a[j]<a[min])
					min =j;
			}
	//swap
			int temp= a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		for(int e :a)
			System.out.print(e);
			
			
			
			
		}
	}

