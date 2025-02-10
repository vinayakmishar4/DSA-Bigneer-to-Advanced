import java.util.LinkedList;
import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;

class SearchinLL
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
   public static boolean Second2(int arr[],int search)
   {
     LinkedList<Integer> sc = new LinkedList<Integer>();
     for(int i=0; i<arr.length; i++)
     {
       sc.add(arr[i]);
     }
     for(int nums:sc)
     {
        if(nums==search)
        {
           return true;
        }
     }
     return false;
   }    
  public static void main(String[] args)
  {
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int n=scanner.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter the elements of the array");
    for(int i=0; i<n; i++)
    {
      arr[i]=scanner.nextInt();
    }
    node element = Frsit1(arr);
    System.out.println("Sreach the element");
    int search=scanner.nextInt();
    System.out.println("Selected the Option");
    System.out.println("1.Using Collections");
    System.out.println("2. Using node");
    int ch=scanner.nextInt();
    switch(ch)
    {
        case 1: if(Second2(arr,search)==true)
                {
                   System.out.println(search + " Elements is persent in Linkedlist"); 
                }
                else
                {
                    System.out.println(search + " Elements is not persent in Linkedlist");
                }
                break;
        case 2:while(element!=null)
               {
                 if(element.data==search)
                 {
                    System.out.println(search + " Elements is persent in Linkedlist");
                    break;
                 }
                 element=element.next;
                 if(element==null)
                 {
                    System.out.println(search + " Elements is not persent in Linkedlist");
                 }
               }
               break;
        default:System.out.println("Invalid option");
                break;
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
}