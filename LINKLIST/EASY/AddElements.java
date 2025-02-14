
import java.util.LinkedList;
import java.util.Scanner;

// WAP to add elemnts in linked list
class AddElements
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
     System.out.println("Enter the number to be added");
     int num= scanner.nextInt();
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
                    case 1:System.out.println("Add element at frist of list");
                           UsingaList.addatbegin(Array, num);
                           break;
                    case 2:System.out.println("Add element at end of list");
                           UsingaList.addatend(Array, num);
                           break;
                    case 3:System.out.println("Enter the position");
                           int pos=scanner.nextInt();
                           if(pos<1 || pos>Array.size())
                           {
                               System.out.println("Invalid position");
                           }
                           else
                           {
                               UsingaList.addAtPosition(Array, pos, pos);
                           }
                           break;
                    case 4:System.out.println("Enter the value");
                           int index = scanner.nextInt();
                           int value=scanner.nextInt();
                           UsingaList.addAtvalue(Array, num, value, index);
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
                 case 1:System.out.println("Add element at first position");
                         node.AddatBegining(head, num);
                         break;
                 case 2:System.out.println("Add elemnt at last of list");
                         node.Addatend(head, num);
                         break;
                 case 3:System.out.println("3.Given Postion");
                        int pos=scanner.nextInt();
                        node.Addatpostiom(head, pos, n);
                        break;
                 case 4:System.out.println("4.Given value");
                        int value=scanner.nextInt();
                        node.Insertvalue(head, value, num);
                        break;
                 default:System.out.println("Invalid option");
               }
     }
  }
}
class UsingaList
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
   // add elements to head of list
   static void addatbegin(LinkedList<Integer> Array,int data)
   {
      Array.addFirst(data);      
   }
   // add elements to end of list
   static void addatend(LinkedList<Integer> Array,int data)
   {
      Array.add(data);      
   }
   // add elements at given position
   static void addAtPosition(LinkedList<Integer> Array,int data, int position)
   {
      if(position<0 || position>Array.size())
      {
         System.out.println("Invalid position");
      }
      else
      {
         Array.add(position,data);
      }
   }
   // add elements at given value

   static void addAtvalue(LinkedList<Integer> Array, int data, int position, int index)
   {
      if(position<0 || position>Array.size())
      {
         System.out.println("Invalid position");
      }
      else
      {
         Array.add(index,data);
      }
   }
}
class  node
{
   int data;
   node next;

   node(int d,node next)
   {
      this.data=d;
      this.next=next;
   }
   node(int d)
   {
     this.data=d;
     this.next=null;
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
   // add data at begining of linkedlist
   static node AddatBegining(node head,int ndata)
   {
     node new_node=new node(ndata); 
     new_node.next=head;
     return new_node;
   }
   // add data at the end of linkedlist
   static node Addatend(node head,int ndata)
   {
      if(head==null)
      {
         return new node(ndata);
      }
      node temp=head;
      while(temp.next!=null)
      {
         temp=temp.next;
      }
      node new_node=new node(ndata);
      temp.next=new_node;
      return head;
   }
   // add data at the postion of LinkedList
   static node Addatpostiom(node head,int postion,int ndata)
   {
      if(head==null)
      {
        if(postion==1)
        {
           return new node(ndata);
        }
        else
        {
           return null;
        } 
      }
      if(postion==1)
      {
         node temp=new node(ndata,head);
         return temp;
      }
      node temp=head;
      int count=0;
      while(temp!=null)
      {
         count++;    
      }
      if(count==postion-1)
      {
         node x=new node(ndata,temp.next);
         temp.next=x;
      }
      temp=temp.next;
      return head;
   }
   // insert node at value in linked list
   static node Insertvalue(node head,int value,int ndata)
   {
      if(head==null)
      {
         return null;
      }
      if(head.data==value)
      {
         return new node(ndata, head);
      }
      node temp=head;
      while(temp.next!=null)
      {
         if(temp.next.data==value)
         {
            node x=new node(ndata,temp.next);
            temp.next=x;
            return head;
         }
         temp=temp.next;
      }
      return head;
   }
}
