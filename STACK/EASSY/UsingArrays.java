package  STACK.EASSY;

import java.util.Scanner;

class UsingArrays 
{
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter the size of stack");
      int size = scanner.nextInt();
      stimp obj=new stimp();
      System.out.println("Enter the elements of stack");
      for (int i = 0; i < size; i++)
      {
         obj.push(scanner.nextInt());
      }
      System.out.println("Top element of stack is "+obj.top());
      System.out.println("Popped element is "+obj.pop());
      System.out.println("Top element of stack is "+obj.top());
      System.out.println("Stack sie "+obj.size());
   }
}
class stimp
{
    int top=-1;
    // push elements in the stack   
    int arr[]=new int[10];
    // function to push an item to stack
    void push(int x)
    {
        if(top>=10)
        {
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        arr[top]=x;
    }
    // Function to pop an item from stack
    int pop()
    {
        if(top==-1)
        {
            System.out.println("Stack Underflow");
            return -1;
        }
        int item=arr[top];
        top--;
        return item;
    }
    // top element
    int top()
    {
        if(top<0)
        {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }
    // size of stack
    int size()
    {
        return top+1;
    }
}
