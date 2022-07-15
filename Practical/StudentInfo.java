package Java;
import java.util.Scanner;

class student{
	private int id;
	private String name;
	private String gender;
	private String standard;
	
	//method for set id
		public void setid(int id) {
			this.id=id;
		}
		
		//method for set name
		public void setname(String name) {
			this.name=name;
		}
		
		public void setgender(String gender) {
			this.gender=gender;
			
		}
		public void setstandard(String standard) {
			this.standard=standard;
		}
		//
		
			public int getid() {
				return id;
			}
			public String getname() {
				return name;
			}
			public String getgender() {
				return gender;
			
		}
			public String getstandard() {
				return standard;
			
		}
}


public class StudentInfo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		student st= new student();
		
		System.out.println("Enter the user id:");
		st.setid(sc.nextInt());
		
	
		System.out.println("Enter the user name:");
		st.setname(sc.next());
		
		System.out.println("Enter the user gender:");
		st.setgender(sc.next());
		System.out.println("Enter the user standard:");
		st.setstandard(sc.next());

		System.out.println(st.getid());
		System.out.println(st.getname());
		System.out.println(st.getgender());
		System.out.println(st.getstandard());

	}

}
