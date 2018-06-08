 class StatClass
{
  public static void BranchClass(int a, int b)
  {
      int c= a*b;
      System.out.print(c);
      
  }
  
  public static void main(String []args)
  {
    StatClass sc= new StatClass();
    StatClass.BranchClass(5,4);  //Can be called from the class name itself
    
   }
}
    