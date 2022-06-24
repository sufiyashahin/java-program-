package Java;
/*
 * @Author Sufiya Shahin
 */

public class LargestNum {

	public static void main(String[] args) {
		
        greaternum();
		   
	}

	private static void greaternum() {
		int a=101,b=93,c=6,d=89; 
        //declaring the Numbers
		
		//conditions for finding the greater number and Printing the greater number
		if(a>b && a>c && a>d) //first condition 
			
			System.out.println("a="+a+" is greater");
	       //print if condition is true
		
		else if(b>c && b>d) //second condition
			
			System.out.println("b="+b+" is greater");
		   //print if condition is true
		
		else if(c>d)  //third condition
			
			System.out.println("c="+c+" is greater");
		 //print if condition is true
		
		else
			System.out.println("d="+d+" is greater");
	}

}
