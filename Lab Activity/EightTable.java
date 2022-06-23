package Java;
/*
 * @Author Sufiya Shahin
 */
public class EightTable {

	public static void main(String[] args) {
		table();
		//calling method
	}

	private static void table() {
		int n=8; //initializing the number
		int table;   //variable declaration
		
		//for loop for print table
		
		 for(int i = 1; i <= 10; ++i)
		 {
			 table=i*n; //logic for printing table
	        System.out.println(table);
	        	
	            
	        }
	}

}
