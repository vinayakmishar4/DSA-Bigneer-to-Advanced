import java.util.Scanner;

public class input_output 
{
    public static void main(String[] args)
    {
        System.out.println("Enter the Your Name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Your Name is " + name); 
    }
}
