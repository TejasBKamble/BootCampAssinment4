package Day4Assinment;

public class FibonacciPrint_5 {

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

		public static void printFibonacci(int[] series) 
		{
		  int count = 0;
		  for (int n : series) 
		  {
		    System.out.print(n + ", ");
		    count++;
		    if (count == 5) {
		      System.out.println();
		      count = 0;
		    }
		  }
		  if (count > 0) {
		    System.out.println();
		  }
		}
		
	public static void main(String[] args)
	{
		 int[] inputs = {10, 3, 12};
		  for (int n : inputs) 
		  {
		    System.out.println("Fibonacci series of size " + n + ":");
		    int[] series = generateFibonacci(n);
		    printFibonacci(series);

	      }
   }
}
