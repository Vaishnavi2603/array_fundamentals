package Array_Fundamentals;

import java.util.Scanner;

public class Array_Search {

	public static void main(String[] args) {
		int key,i,flag=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		int n = input.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements : ");
		for( i=0;i<n;i++)
		{
			a[i]=input.nextInt();
		}
		System.out.println("Enter the key element : ");
		key = input.nextInt();
		input.close();
		for(i=0;i<n;i++)
		{
			if(a[i] == key)
			{
				flag = 1;
				break;
			}
			else
				flag = 0;
		}
		if(flag == 1)
			System.out.println("Key found at : "+ ++i);
		else
			System.out.println("-1");
	}

}
