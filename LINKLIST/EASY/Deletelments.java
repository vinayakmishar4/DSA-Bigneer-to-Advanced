import java.util.LinkedList;
import java.util.Scanner;

class DeleteElements 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        
        // Taking input for the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        LinkedList<Integer> array = UsingList.createList(arr);
        Node head = Node.createLinkedList(arr);
        
        System.out.println("Select the option:");
        System.out.println("1. Using the Collection in Java");
        System.out.println("2. Using the Node");
        int n = scanner.nextInt();
        
        switch (n) {
            case 1:
                System.out.println("Using the collection in Java");
                System.out.println("1. First element of List");
                System.out.println("2. Last element");
                System.out.println("3. Given Position");
                System.out.println("4. Given Value");
                int choice = scanner.nextInt();
                
                switch (choice) {
                    case 1:
                        System.out.println("First element of list is removed");
                        UsingList.deleteFirst(array);
                        break;
                    case 2:
                        System.out.println("Last element of list is removed");
                        UsingList.deleteLast(array);
                        break;
                    case 3:
                        System.out.println("Enter the position:");
                        int pos = scanner.nextInt();
                        UsingList.deleteAtPosition(array, pos - 1);
                        break;
                    case 4:
                        System.out.println("Enter the value:");
                        int value = scanner.nextInt();
                        UsingList.deleteByData(array, value);
                        break;
                    default:
                        System.out.println("Invalid option");
                }
                break;
            
            case 2:
                System.out.println("Using the Node");
                System.out.println("1. First element of List");
                System.out.println("2. Last element");
                System.out.println("3. Given Position");
                System.out.println("4. Given Value");
                int choice1 = scanner.nextInt();
                
                switch (choice1) {
                    case 1:
                        System.out.println("First element of List is removed");
                        head = Node.deleteAtBeginning(head);
                        break;
                    case 2:
                        System.out.println("Last element of List is removed");
                        head = Node.deleteAtEnd(head);
                        break;
                    case 3:
                        System.out.println("Enter the position:");
                        int pos1 = scanner.nextInt();
                        head = Node.deleteAtPosition(head, pos1);
                        break;
                    case 4:
                        System.out.println("Enter the value:");
                        int value1 = scanner.nextInt();
                        head = Node.deleteByValue(head, value1);
                        break;
                    default:
                        System.out.println("Invalid option");
                }
                break;
            
            default:
                System.out.println("Invalid choice");
        }
        scanner.close();
    }
}

class UsingList 
{
    // Creates a LinkedList from an array
    public static LinkedList<Integer> createList(int arr[]) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int num : arr) {
            list.add(num);
        }
        return list;
    }
    
    // Deletes the first element from the LinkedList
    public static void deleteFirst(LinkedList<Integer> list) {
        if (!list.isEmpty()) {
            list.removeFirst();
        } else {
            System.out.println("List is empty");
        }
    }
    
    // Deletes the last element from the LinkedList
    public static void deleteLast(LinkedList<Integer> list) {
        if (!list.isEmpty()) {
            list.removeLast();
        } else {
            System.out.println("List is empty");
        }
    }
    
    // Deletes an element at a given position
    public static void deleteAtPosition(LinkedList<Integer> list, int position) {
        if (position < 0 || position >= list.size()) {
            System.out.println("Invalid position");
        } else {
            list.remove(position);
        }
    }
    
    // Deletes an element by its value
    public static void deleteByData(LinkedList<Integer> list, int data) {
        list.remove(Integer.valueOf(data));
    }
}

class Node 
{
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
    
    // Creates a linked list from an array
    public static Node createLinkedList(int arr[]) {
        if (arr.length == 0) return null;
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            mover.next = new Node(arr[i]);
            mover = mover.next;
        }
        return head;
    }
    
    // Deletes the first node
    public static Node deleteAtBeginning(Node head) {
        return (head == null) ? null : head.next;
    }
    
    // Deletes the last node
    public static Node deleteAtEnd(Node head) {
        if (head == null || head.next == null) return null;
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
    
    // Deletes a node at a given position
    public static Node deleteAtPosition(Node head, int position) {
        if (head == null || position < 1) return head;
        if (position == 1) return head.next;
        
        Node temp = head;
        for (int i = 1; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) return head;
        temp.next = temp.next.next;
        return head;
    }
    
    // Deletes a node by value
    public static Node deleteByValue(Node head, int value) {
        if (head == null) return null;
        if (head.data == value) return head.next;
        
        Node temp = head;
        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
        return head;
    }
}
