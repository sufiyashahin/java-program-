package Java;
/*
 * @Author Sufiya Shahin
 */
import java.util.Scanner;
public class MatrixAddSub {

	public static void main(String[] args) {
		/*
		 * Taking the first matrix from user
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows = ");
		int rows = sc.nextInt();
		System.out.print("Enter number of collums = ");
		int col = sc.nextInt();
		
		int arr[][] = new int[rows][col];
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length ; j++) {
				System.out.print("enter value for "+(i + 1)+ "st row and "+ (j+1) + "st coloumn  = ");
				arr[i][j] = sc.nextInt();
			}
		}
		
		/*
		 * Taking the second matrix from user
		 */
		
	
		System.out.print("Enter number of rows for 2nd matrix = ");
		int rows2 = sc.nextInt();
		System.out.print("Enter number of collums for 2nd matrix = ");
		int col2 = sc.nextInt();
		int arr2[][] = new int[rows2][col2];
		for(int i = 0 ; i < arr2.length ; i++) {
			for(int j = 0 ; j < arr2[i].length ; j++) {
				System.out.print("enter value for "+(i + 1)+ "st row and "+ (j+1) + "st coloumn  = ");
				arr2[i][j] = sc.nextInt();
			}
		}
		
		/*
		 * Adding arr and arr2 
		 */
		
		int arr3[][] = new int[rows2][col2];
		for(int i = 0 ; i< arr.length ; i++) {
			for(int j = 0 ; j < col2 ; j++) {
				arr3[i][j] = arr[i][j] + arr2[i][j];
			}
		}
		
		/*
		 * Substracting arr from arr2
		 */
		int arr4[][] = new int[rows2][col2];
		for(int i = 0 ; i< arr.length ; i++) {
			for(int j = 0 ; j < col2 ; j++) {
				arr4[i][j] = arr[i][j] - arr2[i][j];
			}
		}
		
		/*
		 * printing arr3 and arr4
		 */
		
		System.out.println("addition of arr and arr2 is = ");
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length ; j++ ) {
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();

		System.out.println("substraction of arr and arr2 is = ");
		

		for(int i = 0 ; i < arr4.length ; i++) {
			for(int j = 0 ; j < arr4[i].length ; j++ ) {
				System.out.print(arr4[i][j] + " ");
			}
			System.out.println();
		}
	}

}
