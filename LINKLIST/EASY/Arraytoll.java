
import java.util.LinkedList;
import java.util.Scanner;

// WAP to create the program for array to linked list
class Arraytoll
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
   public static void Second1(int arr[])
   {
     LinkedList<Integer> Array=new LinkedList<>();
     for(int i=0; i<arr.length; i++)
     {
     Array.add(arr[i]);
     }
     System.out.println("Elements of the linked list: ");
     System.out.println(Array.get(0)); 
   }  
   public static void main(String[] args)
   {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Enter the size of an array");
     int size = scanner.nextInt();
     int arr[] = new int[size];
     System.out.println("Enter the elements of the array");
     for (int i = 0; i < size; i++)
     {
       arr[i] = scanner.nextInt();
     }
     System.out.println("Elements of the array: ");
     for (int i = 0; i < arr.length; i++)
     {
       System.out.println(arr[i] + " ");
     }
     node element =Frsit1(arr);
     System.out.println("Select your option");
     System.out.println("1.USING THE COLLECTION IN JAVA");
     System.out.println("2. Using the node ");
     int n=scanner.nextInt();
     switch(n)
     {
       case 1: System.out.println("Using collection in java");
               Second1(arr);
               break;
       case 2: System.out.println("First element of the linked list: " + element.data);
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
