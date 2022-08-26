package Java;

public class Employee {
//instance variables

	long eId;
	String eName;
	String eAd;
	long ePh;
	double basicsalary;
	double specialAllowance;
	double hra;
	//Default Constructor 
	Employee(){
		specialAllowance=230.80;
		hra=1000.50;
	}
	//parameterize Constructor
	Employee(long eId ,String eName ,String eAd,long ePh,double basicsalary){
		this.eId=eId;
		this.eName=eName;
		this.eAd=eAd;
		this.ePh=ePh;
		this.basicsalary=basicsalary;
	}
	public static void main(String[] args) {
System.out.println("details for Manager");
		
		Manager mg= new Manager(126564,"peter","chennai india",4726473,65000);
		System.out.println();
		System.out.println("Details of Manager:");
		System.out.println("ID:"+" "+ mg.eId+" "+ "\nName:"+" "+ mg.eName +" "+ "\nAddress:"+" "+ mg.eAd+" "+"\nphoneNumber:"+" "+mg.ePh+" "+"\nbasicsalary"+" "+mg.basicsalary);
		System.out.println();
		System.out.println("total salary of Manager:");
		mg.cSalary(65000,230.80,1000.50);
		System.out.println();
		System.out.println("TravelingAllowance for Manager:");
		mg.TrAllowance(65000);
		System.out.println();
		System.out.println("Details for Trainee");

		Trainee tr =new Trainee(29846,"jack","mumbai india",442085,4500);
		System.out.println();
		System.out.println("Details of Trainee:");
		System.out.println("ID:"+""+tr.eId+" "+"\nName:"+" "+tr.eName+" "+"\nAddress:"+" "+ tr.eAd+" "+"\nphoneNumber:"+" "+tr.ePh+" "+"\nbasicsalary:"+" "+tr.basicsalary);
		System.out.println();
		System.out.println("total salary of trainee:- ");
		tr.calculateSalary(45000,230.80,1000.50);
		System.out.println();
		System.out.println("TravelingAllowance for Trainee:");
		tr.TrAllowance(45000);
	}
	
   }
	 class Manager extends Employee{
		    Manager(long eId ,String eName ,String eAd,long ePh,double basicsalary){
		    this.eId=eId;
		    this.eName=eName;	
		    this.eAd=eAd;	
		    this.ePh=ePh;	
		    this.basicsalary=basicsalary;	
			
		    }
		    public static void cSalary(double basicsalary,double specialAllowance,double hra) {
				
				double salary = basicsalary + (basicsalary * specialAllowance/100) + basicsalary * hra/100;
					System.out.println(salary);
				}
		    public static void TrAllowance(double basicsalary) {
				double trallowance=15*basicsalary/100;
				System.out.println(trallowance);
			}
	}
	 class Trainee extends Employee{
			Trainee(long eId ,String eName ,String eAd,long ePh,double basicsalary) {		
				this.eId=eId;
				this.eName=eName;
				this.eAd=eAd;
				this.ePh=ePh;
				this.basicsalary=basicsalary;
			
		}
			public static void calculateSalary(double basicsalary,double specialAllowance,double hra) {
		
				double salary = basicsalary + (basicsalary * specialAllowance/100) + basicsalary * hra/100;
					System.out.println(salary);
				}
			public static void TrAllowance(double basicsalary) {
				double trallowance=15*basicsalary/100;
				System.out.println(trallowance);
			}
	
	}


