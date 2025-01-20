class RemoveParthses
{
    public String removeOuterParentheses(String s)
    {
      int count=0;
      StringBuilder sc=new StringBuilder();
      for(char c:s.toCharArray())
      {
        if(c=='(')
        {
          if(count>0)
          {
            sc.append(c);
          }
          count++;
        }
        else if(c==')')
        {
          count--;
          if(count>0)
          {
            sc.append(c);
          }
        }
      }
      return sc.toString();
    }
}
