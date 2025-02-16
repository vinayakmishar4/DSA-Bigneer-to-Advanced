package  STACK.EASSY;

import java.util.Scanner;

class UsingArrays 
{
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter size of array");
      int size = scanner.nextInt();
      int arr[] = new int[size];
      System.out.println("Enter the elements of array");
      for (int i = 0; i < size; i++)
      {
         arr[i] = scanner.nextInt();
      }
      stimp obj=new stimp();
      System.out.println("Enter the elements of stack");
      for (int i = 0; i < size; i++)
      {
         obj.push(arr[i], arr);
      }
      System.out.println("Top element of stack is "+obj.top(arr));
      System.out.println("Popped element is "+obj.pop(arr));
      System.out.println("Top element of stack is "+obj.top(arr));
      System.out.println("Stack sie "+obj.size());
   }
}
class UsinaStack
{
    // using stack colllection

}
class stimp
{
    int top=-1;
    // push elements in the stack   
    // function to push an item to stack
    void push(int x,int arr[])
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
    int pop(int arr[])
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
    int top(int[] arr) 
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
