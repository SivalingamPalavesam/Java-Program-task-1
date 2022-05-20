package stackprogram;

import java.util.Stack;

public class DescStack {
	
	public static int[] addMultiple(int[] a, Stack stack) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != ' ') {
                stack.push(a[i]);
            }
        }
        return a;
    }

	public static void main(String[] args)
	{
		int[] a = new int[]{6, 5, 8, 4, 7, 10, 9};
        Stack<Integer> stackEmty = new Stack<>();
        Stack<Integer> stackfirst = new Stack<>();
        addMultiple(a, stackfirst);
       
        
        int count = 0;
        for (int i = 0; i < stackfirst.size() - 1; i++) 
        {
            if (stackfirst.get(i) > stackfirst.get(i + 1)) 
            {
            	stackEmty.add(stackfirst.get(i));
            	stackfirst.pop();
            } else
            {
            	stackEmty.add(stackfirst.get(i));
            	stackfirst.remove(stackfirst.get(i + 1));
            }
            count++;
        }
        System.out.println(count-1);
        
        for (int i = 0; i < stackEmty.size(); i++) 
        {
            System.out.println("The elements in the stack are " + stackEmty.get(i) + " ");
        }
           
	}

}
