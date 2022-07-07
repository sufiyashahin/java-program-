package Java;
/*
 *@Author Sufiya Shahin
 */

//creating class
class Student{
	
	//declaring instance variable as private
	private int id;
    private String name;
	private String course;
	
	//method for set id
	public void setid() {
		id=20;
	}
	//method for set name
	public void setname() {
		name="Sufiya Shahin";
	}
//method for course name
	public void setcourse() {
		course="Bsc. IT";
	}
		public int getId() {
			return id;
		}
		public String getname() {
			return name;
		}
		public String getcourse() {
			return course;
		
	}
	}
	//main class
public class InformationOfStudents {

	public static void main(String[] args) {
	Student st= new Student();
	
	
	st.setid();
	st.setname();
	st.setcourse();
	
	//print student details
	System.out.println("Student Id is:" +st.getId());
	System.out.println("Student Name is:" +st.getname());
	System.out.println("Student course is:" +st.getcourse());

	}

}
