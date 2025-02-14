// WAP to add elemnts in linked list
class AddElements
{
  public static void main(String[] args)
  {
   
  }
}
class UsingaList
{
  
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
   static node InsertNode(node head,int value,int ndata)
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
