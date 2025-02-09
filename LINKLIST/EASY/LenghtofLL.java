import java.util.LinkedList;
import java.util.Scanner;

class LenghtofLL 
{
    public static node Frsit1(int arr[])
   {
      node head = new node(arr[0]);
      node mover = head;
      for(int i=1; i<arr.length; i++)
      {
         node temp= new node(arr[i]);
         mover.next =temp;
         mover = temp;
      }
      return head;
   }
    public static void Length(int arr[])
    {
        LinkedList<Integer> l = new LinkedList();
        for(int i=0; i<arr.length; i++)
        {
            l.add(arr[i]);
        }
        System.out.println("Length of the linked list: " + l.size());
    }
    public static int getCount(node head)
    {
      int count = 1;
      if(head == null){
          return 0;
      }
      while(head.next != null){
          count++;
          head = head.next;
      }
      return count;
    }  
    public static void main(String[] args)
    {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter the size of the array");
      int size = scanner.nextInt();
      int arr[] = new int[size];
      System.out.println("Enter the elements of the array");
      for (int i = 0; i < size; i++)
      {
        arr[i] = scanner.nextInt();
      }
      node head = Frsit1(arr);
      System.out.println("Enter the option");
      System.out.println("1.Using Collections");
      System.out.println("2. Using node");
      int n=scanner.nextInt();
      switch(n)
      {
        case 1:Length(arr);
               break;
        case 2:int a=getCount(head);
               System.out.println("Length of linked list: " + a);
               break;
        default:System.out.println("Invalid option");
                break;
      }
  }   
}
class node
{
    int data;// data of the node
    node next;// next node in the list
    
    // Constructor to initialize the node
    node(int data1,node next1) 
    {
        this.data = data1;
        this.next=next1;
    }
    // constructor for next node

    node(int data1)
    {
        this.data = data1;
        this.next = null;
    }
}
