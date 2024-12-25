import java.util.Scanner;

public class Pattern17 
{
  public static void main(String[] args) 
  {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Enter Number");
     int a=scanner.nextInt();
     System.out.println("Alpha-Hill Pattern");
     for(int i=0;i<a;i++){
          
        // for printing the spaces.
        for(int j=0;j<a-i-1;j++){
            System.out.print(" ");
        }
        
        // for printing the characters.
        char ch = 'A';
        int breakpoint = (2*i+1)/2;
        for(int j=1;j<=2*i+1;j++){
            
            System.out.print(ch);
            if(j <= breakpoint)
             {
                ch++;
             }
             else 
             {
                ch++;
             }
        }
        
        // for printing the spaces again after characters.
        for(int j=0;j<a-i-1;j++){
            System.out.print(" ");
        }
        
        // As soon as the letters for each iteration are printed, we move to the
        // next row and give a line break otherwise all letters
        // would get printed in 1 line.
        System.out.println();
        
    }
  }    
}
