class UsingLL
{
  public static void main(String[] args)
  {
    
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
    node top;
    int size
    stack()
    {
      this.top=null;
      this.size=0;
    }
    public static void push(int x)
    {
       node element=new node(x);
       element.next=top;
       top=element;
       System.out.println("Element Pushed");
       size++;
    }
    public static int pop()
    {
       if(top==null)
       {
         return -1;
       }
       int topdata=top.data;
       node temp=top;
       top=top.next;
       return topdata;
    }
    public static int Size()
    {
       return size;
    }
}
