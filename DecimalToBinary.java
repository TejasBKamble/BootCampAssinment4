package Day4Assinment;

public class DecimalToBinary {

	public static String decimalToBinary(int n) 
	{
		  String binary = "";
		  while (n > 0)
		  {
		    binary = (n % 2) + binary;
		    n = n / 2;
		  }
		  return binary;
		}

		public static void testDecimalToBinary() 
		{
		  int[] decimals = {10, 15, 33, 100, 255};
		  
		  for (int n : decimals) {
		    System.out.println("Decimal: " + n + ", Binary: " + decimalToBinary(n));
		  }
		}
	public static void main(String[] args) 
	{
		
		 testDecimalToBinary();

	}

}
