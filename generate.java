import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    if(s.equalsIgnoreCase("yes"))
      System.out.println(Math.random());
    else
      System.out.println("Thank you");
  }
}
