import java.util.Scanner;
// WAP to Alpha-Triangle Pattern
public class Pattern18 
{
  public static void main(String[] args)
  {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Enter number");
     int a=scanner.nextInt();
     System.out.println("Alpha-Triangle Pattern");
     for(int i=0;i<a;i++){
          
        // Inner loop for printing the alphabets from
        // A + N -1 -i (i is row no.) to A + N -1 ( E in this case).
        for(char ch =(char)(int)('A'+a-1-i);ch<=(char)(int)('A'+a-1);ch++){
            
            System.out.print(ch + " ");
        }
        
        // As soon as the letters for each iteration are printed, we move to the
        // next row and give a line break otherwise all letters
        // would get printed in 1 line.
        System.out.println();
    }
  }    
}
