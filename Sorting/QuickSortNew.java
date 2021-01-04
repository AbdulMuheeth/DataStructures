import java.util.*;

public class QuickSortNew
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		int n; 			// n is number of elements
		int a[],i;		// array reference

		System.out.println("Enter the size");
		n = sc.nextInt();

		a = new int[n];	// dynamic memory allocation for array 'a'

		System.out.println("Enter elements..."); // input the array
		for(i=0;i<n;i++)
		  a[i] = sc.nextInt();
	
		System.out.println("Before Sorting....");
		for(i=0;i<n;i++)
		System.out.print(a[i]+"  ");

		quickSort(a,0,n-1);
	
		System.out.println("\nAfter Sorting....");
		for(i=0;i<n;i++)
		System.out.print(a[i]+"  ");
		
	}	
	
	public static void quickSort(int a[],int left,int right){
		int l,u,pivot,temp;
		l=left;u=right;pivot=left;
		
		while(left!=right){

			while((a[right]>=a[pivot]) && (left != right))
			right--;
			if(left!=right){
				temp=a[pivot];
				a[pivot]=a[right];
				a[right]=temp;
				
				pivot=right;
			}
			while((a[left]<=a[pivot]) && (left!=right))
				left++;
			if(left!=right){
				temp=a[pivot];
				a[pivot]=a[left];
				a[left]=temp;
				pivot=left;
			}
		
		}
	if(l<pivot)
		quickSort(a,l,pivot-1);
	if(pivot<u)
		quickSort(a,pivot+1,u);
	}	


}