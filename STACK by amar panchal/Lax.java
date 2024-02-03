

import java.util.Scanner;

public class Lax{
	private int stack1[],stack2[],tos2,MaxSize,tos1;
	public void creatStack1(int size)
	{
		MaxSize=size;
		tos1=-1;
		stack1=new int[MaxSize];
		
	}
	public void creatStack2(int size)
	{
		MaxSize=size;
		tos2=MaxSize;
		stack2
		=new int[MaxSize];
	}
	public void push1(int e1)
	{
		tos1++;
		stack1[tos1]=e1;
		System.out.println(e1+ " Pushed in stack1");
	}
	
	public void push2(int e2)
	{
	     --tos2;
		stack2[tos2]=e2;
		System.out.println(e2+" pushed in stack2");
	}
	public boolean isFull()
	{
		if(tos1==tos2-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public int pop1()
	{
		int temp1=stack1[tos1];
		tos1--;
		return temp1;
	}
	public int pop2()
	{
		int temp2=stack2[tos2];
		tos2++;
		return temp2;
	}
	public boolean isEmpty()
	{
		if(tos1==-1 && tos2==MaxSize)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	public void printStack1()
	{
		
		for(int i=tos1;i>=0;i--)
		{
			System.out.println(stack1[i]);
		}
	}
	public void printStack2()
	{
		System.out.println("stack2 elements:");
		for(int i=MaxSize-1;i>0;i--)
		{
			System.out.println(stack2[i]);
		}
	}
	

	public static void main(String[] args) {
		Lax obj=new Lax();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of stacks:");
        int size=sc.nextInt();
        obj.creatStack1(size);
        obj.creatStack2(size);
        int choice;
        do {
        	System.out.println("\n1.push \n2.pop \n3.print");
        	   choice=sc.nextInt();
        	switch (choice)
        	{
        	      case 1:
        	      {
        	    	 System.out.println("enter which Stack we want to push");
        	    	 int n=sc.nextInt();
        	    	 if(n==1)
        	    	 {
        	    		 if(obj.isFull()!=true)
        	    		 {
        	    			 System.out.println("enter data in stack1:");
        	    			 int e1=sc.nextInt();
        	    			 obj.push1(e1);
        	    			 
        	    		 }
        	    		 else
        	    		 {
        	    			 System.out.println("both stack  is full");
        	    		 }
        	    	 }
        	    	 else if(n==2)
        	    	 {
        	    		 if(obj.isFull()!=true)
        	    		 {
        	    			 System.out.println("enter data in stack2");
        	    			 int e2=sc.nextInt();
        	    			 obj.push2(e2);
        	    			 
        	    		 }
        	    		 else
        	    	 {
        	    			 System.out.println("both stack is full");
        	    		 }
        	    	 }
        	    	 else
        	    	 {
        	    		 System.out.println("enter 1 or 2 number");
        	    	 }
        	      }
        	      break;
        	      case 2:
        	      {
        	    	  System.out.println("enter stack which we want to pop");
        	    	  int n=sc.nextInt();
        	    	  if(n==1)
        	    	  {
	        	    	  if(obj.isEmpty()!=true)
	        	    	  {
	        	    		  //System.out.println("enter element to pop from stack1");
	        	    		 //int e1=sc.nextInt();
	        	    		
                             System.out.println( obj.pop1());
	        	    		//System.out.println(e1+" popped data in stack1:"); 
	        	    	  }
	        	    	  else
	        	    	  {
	        	    		  System.out.println("stack is empty:");
	        	    	  }
        	    	  }  
        	    	  else if(n==2)
        	    	  {
        	    		  if(obj.isEmpty()!=true)
        	    		  {
        	    			//  System.out.println("enter element to pop from stack2");
        	    			  //int e2=sc.nextInt();
        	    			 System.out.println( obj.pop2());
        	    			//  System.out.println(e2+" popped data in stack2");
        	    		  }
        	    		  else
        	    		  {
        	    			  System.out.println("stack is empty");
        	    		  }
        	    	  }
        	    	  
        	      }
        	      break;
        	      case 3:
        	      {
        	    	  System.out.println("enter which stack you want to print");
        	    	  int n=sc.nextInt();
        	    	  if(n==1)
        	    	  {
        	    		  if(obj.isEmpty()!=true)
        	    		  {
        	    			  obj.printStack1();
        	    		  }
        	    		  else
        	    		  {
        	    			  System.out.println("stack is empty");
        	    		  }
        	    	  }
        	    	  else if(n==2)
        	    	  {
        	    		  if(obj.isEmpty()!=true)
        	    		  {
        	    			  obj.printStack2();
        	    		  }
        	    		  else
        	    		  {
        	    			  System.out.println("stack is empty");
        	    		  }
        	    	  }
        	    	  else
        	    		  System.out.println("please enter 1 or 2 number");
        	      }
        	      break;
        	    	  
        	}

	}while(choice!=0);
	}
}