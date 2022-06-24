package Java;
/*
 * @Author Sufiya Shahin
 */

public class LargestNum {

	public static void main(String[] args) {
		
        greaternum();
		   
	}

	private static void greaternum() {
		int a=101,b=93,c=6,d=89;     //declaring the Numbers
       
		
		//conditions for finding the greater number and Printing the greater number
		if(a>b && a>c && a>d) //first condition 
			
			//print if condition is true
			System.out.println("a="+a+" is greater");
		
		else if(b>c && b>d) //second condition
			
			//print if condition is true
			System.out.println("b="+b+" is greater");
		   
		
		else if(c>d)  //third condition
			
			 //print if condition is true
			System.out.println("c="+c+" is greater");
		
		else
			System.out.println("d="+d+" is greater");
	}

}
