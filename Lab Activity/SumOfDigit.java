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
		int sum=0; //initializing variable for sum
		int rem=0; //initializing for remainder
		
		
		//while loop for terminating the iteration
		while(n>0) {
			
			//calculation for sum of digit
			rem=n%10; 
			
			sum=sum+rem;
			
			n=n/10;
			
		}
			
			System.out.println("sum of digit:"+sum);  //for printing the sum
		
	}

	}
