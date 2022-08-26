package Java;

import java.util.*;

interface LibraryU{
	public void registeraccount(int age);
	public void requestbook(String booktype);
}
	class Kidsuser implements LibraryU{
		
		int age;
		String booktype;
		public void registeraccount(int age) {
			if(age<12) {
				System.out.println("You have successfully registered under a Kids Account");
			}
			else {
				System.out.println("Sorry, Age must be less than 12 to register as a kid");
			}
		}
		public void requestbook(String booktype) {
			if(booktype.equals("kids")) {
				System.out.println("Book Issued successfully, please return the book within 10 days");
			}
			else {
				System.out.println("Oops, you are alowed to take only kids books");
			}
		}
	}
	 class AdultUser implements LibraryU{
		int age;
		String booktype;
		public void registeraccount(int age) {
			if(age>12) {
				System.out.println("You have successfully registered under an Adult Account");
			}
			else {
				System.out.println("Sorry, Age must be greater than 12 to register as an adult");
			}
		}
		public void requestbook(String booktype) {
			if(booktype.equals("fiction")) {
				System.out.println("Book Issued successfully, please return the book within 7 days");
			}
			else {
				System.out.println("Oops, you are allowed to take only adult Fiction books");
			}
		}
		
	}

public class UserLibrary {

	public static void main(String[] args) {
		
				Scanner sc=new Scanner(System.in);
				System.out.println("Kids");
				Kidsuser k=new Kidsuser();
				System.out.println("Age:");
				k.registeraccount(sc.nextInt());
				
				System.out.println("Please choose book type:\n kids\n fiction\n");
				k.requestbook(sc.next());
				
				System.out.println();
//		<---------------Adult section---------->	
				System.out.println("Adult");
				System.out.println("Age:");
				AdultUser a=new AdultUser();
				a.registeraccount(sc.nextInt());
				
				System.out.println("Please choose book type:\n kids\n fiction\n");
				a.requestbook(sc.next());
				sc.close();
				
				
			}

		
	}


