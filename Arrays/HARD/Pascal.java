import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Pascal
{
  public List<List<Integer>> generate(int numRows)
  {
        List<List<Integer>> triangle = new ArrayList<>();
        for (int rowNum = 0; rowNum < numRows; rowNum++) {
            List<Integer> row = new ArrayList<>();
            row.add(1); // First element of each row is always 1
            
            // Each triangle element (except the borders) is the sum of the two elements above it
            for (int j = 1; j < rowNum; j++) {
                int val = triangle.get(rowNum - 1).get(j - 1) + triangle.get(rowNum - 1).get(j);
                row.add(val);
            }
            
            if (rowNum > 0) {
                row.add(1); // Last element of each row is always 1 (except the first row)
            }
            
            triangle.add(row);
        }
        
        return triangle;      
  }

  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number of rows");
    int numRows = scanner.nextInt();
    Pascal pascal = new Pascal();
    List<List<Integer>> triangle = pascal.generate(numRows);

    for (List<Integer> row : triangle) {
        for (int val : row) {
            System.out.print(val + " ");
        }
        System.out.println();
  
        // Add a space after each row to separate them
        System.out.println();
  
        // Add a line break after each set of rows
        System.out.println();
  
        // Add a blank line after each set of rows
        System.out.println();
  
        // Add a horizontal rule after each set of rows
        System.out.println("---------------------");
        System.out.println();
        
  }
 }
}