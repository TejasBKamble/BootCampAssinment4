package Day4Assinment;

import java.util.Scanner;

public class FabonacciSerise {
	
	 public static int[] generateSeries(int size)
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

		  public static void printSeries(int[] series) 
		  {
		    for (int i = 0; i < series.length; i++) 
		    {
		      System.out.print(series[i] + ",");
		      if ((i + 1) % 5 == 0 || i == series.length - 1) {
		        System.out.println();
		      }
		    }
		  }

	public static void main(String[] args)
	{

		 Scanner sc = new Scanner(System.in);

		    System.out.println("Enter the size of the series:");
		    int size = sc.nextInt();
		    
		    sc.close();

		    int[] series = generateSeries(size);

		    printSeries(series);
	}

}
