package Program;

public class NumberOfDigitsRBCA22236 {
		 public int countDigits(int number) {
		        if (number == 0)
		            return 1;
		        
		        int count = 0;
		        while (number != 0) {
		            number /= 10;
		            count++;
		        }
		        return count;
		    }
		}



