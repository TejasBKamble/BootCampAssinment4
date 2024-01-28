package Day4Assinment;

import java.util.Random;

public class RandomMarks {
	
	  public static double[] generateMarks(int numStudents) 
	  {
		    Random rand = new Random();
		    double[] marks = new double[numStudents];
		    // Loop through the array and fill it with random marks between 1.0 and 100.0
		    for (int i = 0; i < numStudents; i++) {
		      marks[i] = rand.nextDouble() * 99 + 1;
		    }
		    // Return the array
		    return marks;
		  }

		  public static void calculateStatistics(double[] marks) {
		    int passCount = 0;
		    int firstDivCount = 0;
		    int above90Count = 0;
		    double firstDivSum = 0;
		    double secondDivSum = 0;
		    int secondDivCount = 0;
		    for (double mark : marks)
		    {
		      if (mark >= 33) {
		        passCount++;
		      }
		      if (mark >= 60) {
		        firstDivCount++;
		        firstDivSum += mark;
		      }
		      if (mark >= 90) {
		        above90Count++;
		      }
		      if (mark >= 45 && mark < 60) {
		        secondDivCount++;
		        secondDivSum += mark;
		      }
		    }
		    double passPercentage = (double) passCount / marks.length * 100;
		    double firstDivPercentage = (double) firstDivCount / marks.length * 100;
		    double above90Percentage = (double) above90Count / marks.length * 100;
		    double firstDivAverage = firstDivSum / firstDivCount;
		    double secondDivAverage = secondDivSum / secondDivCount;
		    // Print the results
		    System.out.println("Percentage of pass: " + passPercentage + "%");
		    System.out.println("Percentage of first division: " + firstDivPercentage + "%");
		    System.out.println("Number of students scoring above 90%: " + above90Count);
		    System.out.println("Average marks of first division students: " + firstDivAverage);
		    System.out.println("Average marks of second division students: " + secondDivAverage);
		  }

		  public static void comparePerformance(double[] boysMarks, double[] girlsMarks) 
		  {
		    double boysTotal = 0;
		    double girlsTotal = 0;
		    for (double mark : boysMarks) {
		      boysTotal += mark;
		    }
		    for (double mark : girlsMarks) {
		      girlsTotal += mark;
		    }

		    double boysAverage = boysTotal / boysMarks.length;
		    double girlsAverage = girlsTotal / girlsMarks.length;

		    System.out.println("Average marks of boys: " + boysAverage);
		    System.out.println("Average marks of girls: " + girlsAverage);

		    if (boysAverage > girlsAverage) {
		      System.out.println("Boys performed better than girls by " + (boysAverage - girlsAverage) + " marks.");
		    } else if (boysAverage < girlsAverage) {
		      System.out.println("Girls performed better than boys by " + (girlsAverage - boysAverage) + " marks.");
		    } else {
		      System.out.println("Boys and girls performed equally.");
		    }
		  }

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		double[] marks = generateMarks(435);

		System.out.println("Statistics for the whole class:");
	    calculateStatistics(marks);

	    int boysNum = (int) (0.55 * 435);
	    int girlsNum = 435 - boysNum;
	    double[] boysMarks = generateMarks(boysNum);
	    double[] girlsMarks = generateMarks(girlsNum);

	    System.out.println("Statistics for boys:");
	    calculateStatistics(boysMarks);

	    System.out.println("Statistics for girls:");
	    calculateStatistics(girlsMarks);

	    System.out.println("Performance comparison:");
	    comparePerformance(boysMarks, girlsMarks);

	}

}
