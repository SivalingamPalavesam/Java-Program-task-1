package stackprogram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class DescStack {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int size  = input.nextInt();
		List<Integer> stackEmty = new ArrayList<Integer>(size);
		List<Integer> stackfirst = new ArrayList<Integer>(size);

		System.out.println("Enter the StackValue  :");
		for(int i =0 ; i<size;  i++)
		{
			stackfirst.add(input.nextInt());
		}    
		int count = 0;
		for (int i = 0; i < stackfirst.size()-1; i++) 
		{
			if (stackfirst.get(i) > stackfirst.get(i + 1)) 
			{	
				stackEmty.add(stackfirst.get(i));	
			} 
			else
			{ 	
				stackfirst.remove(stackfirst.get(i + 1)); 
				stackEmty.add(stackfirst.get(i));
			}
			count++;
		}
		System.out.println(count-1);

		for (int i = 0; i < stackEmty.size(); i++) 
		{
			System.out.println("The Stack value is " + stackEmty.get(i) + " ");
		}
	}

}
