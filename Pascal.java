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
}
