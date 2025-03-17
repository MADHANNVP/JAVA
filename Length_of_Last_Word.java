class Length_of_Last_Word{
  public static void main(String[] args) {
      String a="luffy is still joyboy";
      int b=a.length();
      int c=0;
      System.out.println(b);
      for(int i=b;i>0;i--)
      {
        if(a.charAt(i-1)==' ')
        {
            if(c==0)
            {
                continue;
            }
            else
            {
            break;
            }
        }
        else
        {
            c++;
        }
      }
      System.out.println(c);
  }
}