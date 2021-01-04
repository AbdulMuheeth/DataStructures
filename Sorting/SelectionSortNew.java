import java.util.Scanner;
public class SelectionSortNew{

	public static void main(String args[]){

		int a[],n;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the size of the array");
		n=sc.nextInt();
		a =new int[n];
		System.out.println("Enter the array elements one by one");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}

		System.out.println("Before sorting");
		display(a,n);
		Insertion(a,n);
		System.out.println("After sorting");
		display(a,n);
	}
	public static void Insertion(int ar[],int n){
		int temp,min;
		for(int i=0;i<n;i++)	
		{
			min=i;
			for(int j=i+1;j<n;j++)
			{
				if(ar[min]>ar[j])
					min=j;
			}
			if(min!=i)
			{
				temp=ar[min];
				ar[min]=ar[i];
				ar[i]=temp;
			}
		}
	}
	public static void  display(int a[],int n){
		for(int i=0;i<n;i++){
			System.out.print(a[i]+"   ");
		}
	}
}