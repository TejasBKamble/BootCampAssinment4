package Day4Assinment;

import java.util.Scanner;

public class SineComputation {
	
	     public static int factorial(int n) 
	     {
		    if (n == 0 || n == 1) {
		      return 1;
		    }
		    return n * factorial(n - 1);
		 }

		  public static double power(double x, int n)
		  {
		    if (n == 0) 
		    {
		      return 1;
		    }
		    return x * power(x, n - 1);
		  }

		  public static double sinSeries(double deg, int n)
		  {
		    double rad = deg * Math.PI / 180;
		    double sin = 0;
		    for (int i = 0; i < n; i++)
		    {
		      double term = power(-1, i) * power(rad, 2 * i + 1) / factorial(2 * i + 1);
		      sin += term;
		    }
		    return sin;
		  }

		  public static double cosSeries(double deg, int n) 
		  {
		    double rad = deg * Math.PI / 180;
		    double cos = 0;
		    for (int i = 0; i < n; i++) 
		    {
		      double term = power(-1, i) * power(rad, 2 * i) / factorial(2 * i);
		      cos += term;
		    }
		    return cos;
		  }

	public static void main(String[] args) 
	{

		 Scanner sc = new Scanner(System.in);

		    System.out.println("Enter the angle in degree:");
		    double deg = sc.nextDouble();

		    System.out.println("Enter the number of iterations:");
		    int n = sc.nextInt();

		    System.out.println("Choose between sine or cosine:");
		    String choice = sc.next();

		    double result = 0;

		    if (choice.equalsIgnoreCase("sine")) {
		      result = sinSeries(deg, n);
		      System.out.println("The sine value using series is: " + result);
		    }
		    else if (choice.equalsIgnoreCase("cosine")) {
		      result = cosSeries(deg, n);
		      System.out.println("The cosine value using series is: " + result);
		    }
		    else {
		      System.out.println("Invalid choice!");
		    }

		    if (choice.equalsIgnoreCase("sine")) 
		    {
		      double output = Math.sin(deg * Math.PI / 180);
		      System.out.println("The sine value using library function is: " + output);
		      System.out.println("The difference is: " + Math.abs(result - output));
		    } 
		    else if (choice.equalsIgnoreCase("cosine")) 
		    {
		      double output = Math.cos(deg * Math.PI / 180);
		      System.out.println("The cosine value using library function is: " + output);
		      System.out.println("The difference is: " + Math.abs(result - output));
		    }
	}

}
