package Java;
/*
 * @Author Sufiya Shahin
 */
public class SumOfDigit {

	public static void main(String[] args) {
		sumofdigit(); //calling method
		}
	
	private static void sumofdigit() {
		
		int n=596; //initializing the number
		int sum=0; //declaring variable for sum
		int rem=0; //declaring variable for remainder
		
		
		//while loop for terminating the iteration
		while(n>0) {
			
			rem=n%10; 
			
			sum=sum+rem;
			
			n=n/10;
			//calculation for sum of digit
		}
			
			System.out.println("sum of digit:"+sum);
		//for printing the sum
	}

	}
