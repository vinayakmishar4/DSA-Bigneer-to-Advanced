
import java.util.LinkedList;
import java.util.Scanner;

// WAP to travseal of the element in LL
class TravselLL
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
     LinkedList<Integer> sc = new LinkedList<Integer>();
     for(int i=0; i<arr.length; i++)
     {
       sc.add(arr[i]);
     }
     for(int i=0; i<sc.size(); i++)
     {
       System.out.print(sc.get(i) + " ");
     }
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
     node element =Frsit1(arr);
     System.out.println("First element of the linked list: " + element.data);
     
     System.out.println("Enter the Option");
     System.out.println("1.Using Collections");
     System.out.println("2.Using node");
     int n=scanner.nextInt();
     switch(n)
     {
       case 1:Second1(arr);
              break;
       case 2:System.out.println("Elements of the list: ");
                node temp=element;
                while(temp != null)
                {
                  System.out.print(temp.data + " ");
                  temp=temp.next;
                }
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
