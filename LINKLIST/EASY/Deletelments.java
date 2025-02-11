import java.util.LinkedList;
import java.util.Scanner;

class Deletelments
{
   
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
     LinkedList<Integer> Array=UsingList.Second1(arr);
     node head=node.Frsit1(arr);
     System.out.println("Select the option");
     System.out.println("1. USING THE COLLECTION IN JAVA");
     System.out.println("2. Using the node ");
     int n=scanner.nextInt();
     switch(n)
     {
         case 1:System.out.println("Using the collection in java");
                System.out.println("1.Frist element of List");
                System.out.println("2.Last element");
                System.out.println("3.Given Postion");
                System.out.println("4.Given value");
                int choice=scanner.nextInt();
                switch(choice)
                {
                    case 1:System.out.println("Frist element of list is removed");
                           UsingList.deleteFirst(Array);
                           break;
                    case 2:System.out.println("Last element of list is removed");
                           UsingList.deleteLast(Array);
                           break;
                    case 3:System.out.println("Enter the position");
                           int pos=scanner.nextInt();
                           if(pos<1 || pos>Array.size())
                           {
                               System.out.println("Invalid position");
                           }
                           else
                           {
                               UsingList.deleteAtPosition(Array,pos-1);
                           }
                           break;
                    case 4:System.out.println("Enter the value");
                           int value=scanner.nextInt();
                           UsingList.deleteByData(Array,value);
                           break;
                    default:System.out.println("Invalid option");
                }
                break;
        case 2:System.out.println("Using the node");
               System.out.println("1.Frist element of List");
               System.out.println("2.Last element");
               System.out.println("3.Given Postion");
               System.out.println("4.Given value");
               int choice1=scanner.nextInt();
               switch(choice1)
               {
                 case 1:System.out.println("1.Frist element of List");
                         node.deleteatBegining(head);
                         break;
                 case 2:System.out.println("2.Last element of List");
                         node.deleteatEnd(head);
                         break;
                 case 3:System.out.println("3.Given Postion");
                        int pos=scanner.nextInt();
                        node.delteatpostion(head, pos);
                        break;
                 case 4:System.out.println("4.Given value");
                        int value=scanner.nextInt();
                        node.deletebyValue(head, value);
                        break;
                 default:System.out.println("Invalid option");
               }
     }
   }   
}
class UsingList
{
    public static LinkedList<Integer> Second1(int arr[])
    {
      LinkedList<Integer> Array=new LinkedList<>();
      for(int i=0; i<arr.length; i++)
      {
      Array.add(arr[i]);
      }
      return Array;
    }
    // delte the first element of the linked list
    public static void deleteFirst(LinkedList<Integer> Array)
    {
        if(Array.isEmpty())
        {
            System.out.println("List is empty");
        }
        else
        {
            Array.removeFirst();
        }
    }
    // delte the last element of the linked list
    public static void deleteLast(LinkedList<Integer> Array)
    {
        if(Array.isEmpty())
        {
            System.out.println("List is empty");
        }
        else
        {
            Array.removeLast();
        }
    }
    // delte the node at the given position of the list
    public static void deleteAtPosition(LinkedList<Integer> Array, int position)
    {
        if(Array.isEmpty() || position < 0 || position >= Array.size())
        {
            System.out.println("Invalid position");
        }
        else
        {
            Array.remove(position);
        }
    }
    // delte the node with given data from the list
    public static void deleteByData(LinkedList<Integer> Array, int data)
    {
        if(Array.isEmpty())
        {
            System.out.println("List is empty");
        }
        else
        {
            Array.remove(Integer.valueOf(data));
        }
    }
}
class node
{
    int data;
    node next;

    node(int d, node next)
    {
        this.data = d;
        this.next = next;
    }
    node(int d)
    {
        this.data = d;
        this.next = null;
    }
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
    // delete the node at the head of the list
    static  node deleteatBegining(node head)
    {
       if (head == null)
       {
          return head;
       }
       node temp = head;
       head = head.next;
       return head;
    }
    // delte the node from the end oflis
    static node deleteatEnd(node head)
    {
        if(head == null||head.next == null)
        {
            return head;
        }
        node temp = head;
        while(temp.next.next!=null)
        {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
    // delete a node at a given position
    static node delteatpostion(node head, int position)
    {
        if(head==null)
        {
            return head;
        }
        if(position==1)
        {
            node temp = head;
            head = head.next;
            return head;
        }
        int count=0;
        node temp = head;
        node prev=null;
        while(temp!=null)
        {
            count++;
            if(count==position)
            {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;

        }
        return head;
    }
    // delete node the value at position
    static node deletebyValue(node head, int value)
    {
        if(head==null)
        {
            return head;
        }
        if(head.data==value)
        {
            node temp = head;
            head = head.next;
            return head;
        }
        node temp = head;
        node prev=null;
        while(temp!=null)
        {
            if(temp.data==value)
            {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }
}