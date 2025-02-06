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
   public static void Travel()
   {
     
   }
   public static void main(String[] args)
   {
     int arr[] = {1, 2, 3, 4, 5};
     node element =Frsit1(arr);
     System.out.println("First element of the linked list: " + element.data);
     System.out.println("Elements of the list: ");
       node temp=element;
     while(temp != null)
     {
       System.out.println(temp.data + " ");
       temp=temp.next;
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
