package Day4Assinment;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RandomPrime {

	public static int[] generateRandomArray(int size, int lower, int upper) 
	{
	    Random rand = new Random();
	    int[] array = new int[size];
	    
	    for (int i = 0; i < size; i++) 
	    {
	      array[i] = rand.nextInt(upper - lower + 1) + lower;
	    }
	    return array;
	}

	  public static boolean isPrime(int n) 
	  {
	    if (n <= 1) 
	    {
	      return false;
	    }
	    for (int i = 2; i <= Math.sqrt(n); i++) 
	    {
	      if (n % i == 0) {
	        return false;
	      }
	    }
	    return true;
	  }

	  public static int[] filterPrimeNumbers(int[] array)
	  {
	    ArrayList<Integer> list = new ArrayList<>();
	    for (int num : array)
	    {
	      if (!isPrime(num)) {
	        list.add(num);
	      }
	    }
	    int[] result = new int[list.size()];
	    for (int i = 0; i < list.size(); i++)
	    {
	      result[i] = list.get(i);
	    }
	    return result;
	  }
	  
	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);

		    System.out.println("Enter the size of the array:");
		    int size = sc.nextInt();
		    System.out.println("Enter the lower limit of the array:");
		    int lower = sc.nextInt();
		    System.out.println("Enter the upper limit of the array:");
		    int upper = sc.nextInt();
		    
		    sc.close();

		    int[] randomArray = generateRandomArray(size, lower, upper);

		    System.out.println("The random array is:");
		    for (int num : randomArray) 
		    {
		      System.out.print(num + " ");
		    }
		    System.out.println();

		    int[] nonPrimeArray = filterPrimeNumbers(randomArray);

		    System.out.println("The number of prime numbers in the random array is: " + (size - nonPrimeArray.length));

		    System.out.println("The non-prime array is:");
		    for (int num : nonPrimeArray)
		    {
		      System.out.print(num + " ");
		    }
		    System.out.println();

	}

}
