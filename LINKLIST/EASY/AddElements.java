// WAP to add elemnts in linked list
class AddElements
{
  
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
     this.data=data
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
}
