package Day4Assinment;

public class AverageRating {

	 public static double[] computeAverage(double[][] ratings) 
	 {
		    double[] average = new double[ratings[0].length];
		    
		    for (int j = 0; j < ratings[0].length; j++)
		    {
		      double sum = 0;
		      for (int i = 0; i < ratings.length; i++) {
		        sum += ratings[i][j];
		      }
		      average[j] = sum / ratings.length;
		    }
		    return average;
      }
	public static void main(String[] args) 
	{
		
		 double[][] ratings = {
			      {4, 6, 2, 5},
			      {7, 9, 4, 8},
			      {6, 9, 3, 7}
			    };
		 
			    double[] average = computeAverage(ratings);
			    
			    System.out.println("The average ratings of the movies are:");
			    for (int j = 0; j < average.length; j++) 
			    {
			      System.out.println("Movie " + (j + 1) + ": " + average[j]);
			    }

	}

}
