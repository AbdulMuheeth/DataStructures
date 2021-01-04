import java.util.Scanner;

public class MergeSortNew
{
	public static void main(String args[])
	{
		int a[]; // array reference

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int n = sc.nextInt();

		a = new int[n]; // dynamic memory allocation in java for array

		System.out.println("Enter the array elements");		
		for(int i=0;i<n;i++)
		   a[i] = sc.nextInt();

		System.out.println("\n Before sorting...");
		display(a,n);
		
		mergepass(a,0,n-1); // calling sorting function

		System.out.println("\n After sorting...");
		display(a,n);
	}

	public static void mergepass(int a[],int lb,int ub){
		int mid;
		
		if(ub!=lb){
			mid=(ub+lb)/2;
			mergepass(a,lb,mid);
			mergepass(a,mid+1,ub);
			mergesort(a,lb,mid,ub);
		}
		
	}
	public static void mergesort(int a[],int lb,int mid,int ub){
		int i,j,k,temp[];
		temp = new int[20];
		
		i=lb;
		j=mid+1;
		k=lb;
		
		while((i<=mid) && (j<=ub))
		{
			if(a[i] <=a[j]){
				temp[k]=a[i];
				i++;k++;
			}
			else{
				temp[k]=a[j];
				j++;k++;
			}

		}
		
		while(i<=mid){
			temp[k]=a[i];
			i++;k++;
		}
		while(j<=ub){
			temp[k]=a[j];
			j++;k++;
		}

		for(i=lb;i<=ub;i++){
			a[i]=temp[i];
		}
	}

	public static void display(int a[],int n)
	{
		for(int i=0;i<n;i++)
		 System.out.print(a[i]+"   ");
	}
}
