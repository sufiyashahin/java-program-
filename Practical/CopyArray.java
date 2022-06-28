package Java;

public class CopyArray {

	public static void main(String[] args) {
		
		copyarray();

	}

	private static void copyarray() {
		//initialize array
				int arr1[]= {10,20,30,40,50};
				int arr2[]= new int[arr1.length]; // Create an array of same size 
				
				arr2=arr1; //copy the arr1 to arr2
				
				//for print
				System.out.println("copy Array arr2 is");
				
				//for loop for iterating the index value
				for(int i=0;i<arr1.length;i++) {
					
					
					System.out.print(" "+arr2[i]);
				
				
					
					
				}
	}

}
