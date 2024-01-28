package Day4Assinment;

import java.util.Arrays;

public class OddEvenSeparator {

	public static int[] generateFibonacci(int size) 
	{
	    int[] series = new int[size];
	    series[0] = 0;
	    series[1] = 1;
	    for (int i = 2; i < size; i++)
	    {
	      series[i] = series[i - 1] + series[i - 2];
	    }
	    return series;
	  }

	  public static boolean isOdd(int n) 
	  {
	    if (n % 2 == 0) {
	      return false;
	    }
	    return true;
	  }

	  public static int[][] separateOddEven(int[] array)
	  {
	    int oddCount = 0;
	    int evenCount = 0;
	    for (int num : array)
	    {
	      if (isOdd(num))
	      {
	        oddCount++;
	      } 
	      else
	      {
	        evenCount++;
	      }
	    }
	    int[] oddArray = new int[oddCount];
	    int[] evenArray = new int[evenCount];
	    int oddIndex = 0;
	    int evenIndex = 0;
	    for (int num : array)
	    {
	      if (isOdd(num)) 
	      {
	        oddArray[oddIndex] = num;
	        oddIndex++;
	      } 
	      else 
	      {
	        evenArray[evenIndex] = num;
	        evenIndex++;
	      }
	    }
	    int[][] result = new int[2][];
	    result[0] = oddArray;
	    result[1] = evenArray;
	    // Return the result
	    return result;
	  }

	  public static void findMore(int[] array) 
	  {
	    int oddCount = 0;
	    int evenCount = 0;
	    for (int num : array) 
	    {
	      if (isOdd(num))
	      {
	        oddCount++;
	      } 
	      else {
	        evenCount++;
	      }
	    }
	    if (oddCount > evenCount) 
	    {
	      System.out.println("Odd numbers are more than even numbers.");
	    } 
	    else if (oddCount < evenCount)
	    {
	      System.out.println("Even numbers are more than odd numbers.");
	    }
	    else {
	      System.out.println("Odd and even numbers are equal.");
	    }
	  }
	    
	public static void main(String[] args) 
	{
		int[] fibonacci = generateFibonacci(20);
	    System.out.println("The Fibonacci series is: " + Arrays.toString(fibonacci));
	    
	    int[][] separated = separateOddEven(fibonacci);
	    
	    System.out.println("The odd array is: " + Arrays.toString(separated[0]));
	    System.out.println("The even array is: " + Arrays.toString(separated[1]));
	    
	    findMore(fibonacci);
	}

}
