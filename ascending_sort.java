package Array_Fundamentals;

import java.util.Scanner;

public class ascending_sort {

	public static void main(String[] args) {
		
		int n=10,temp;
		Scanner input = new Scanner(System.in);
		int a[] = new int[10];
		System.out.println("Enter the elements : ");
		for(int i=0;i<10;i++)
		{
			a[i]=input.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Ascending Order : ");
		for(int i=0;i<n-1;i++)
		{
			System.out.print(a[i]+ ",");
		}
		System.out.print(a[n-1]);
		input.close();
	}

}
