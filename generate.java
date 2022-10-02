import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    	int x = sc.nextInt();
	int y = sc.nextInt();
	int n = sc.nextInt();
        System.out.println("Random numbers in range ["+x+","+y+"] are: ");
	for(int i=1;i<=n;i++)
	{
	System.out.println((Math.random()*(y-x))+x);
	}
  }
}
