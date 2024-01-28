package Day4Assinment;

import java.util.Scanner;

public class QuadraticFunction {

	public static void  printRoot(double a, double b,double c)
	{
	       double delta = b * b - 4 * a * c;

	        if (delta < 0)
	        {
	            System.out.println("The equation has no real roots.");
	        }
	        else if (delta == 0)
	        {
	            double root = -b / (2 * a);
	            System.out.println("The equation has one real root: " + root);
	        }
	        else
	        {
	            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
	            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
	            System.out.println("The equation has two real roots: " + root1 + " and " + root2);
	        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a:");
        double a = sc.nextDouble();
        System.out.println("Enter the value of b:");
        double b = sc.nextDouble();
        System.out.println("Enter the value of c:");
        double c = sc.nextDouble();

        printRoot(a,b,c);
  
        sc.close();
	}

}
