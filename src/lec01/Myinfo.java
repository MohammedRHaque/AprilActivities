package lec01;

public class Myinfo {

	public String fName;
	public byte age;
	public short myApartmentRent;
	public int salary;
	public long myYearlyIncome;
	public float myHeight;
	public double myGrade;
	public char sex ;
	public boolean isUscitizen;
	
	public Myinfo () {
		System.out.println("This is a Deafult Constructor");
	}
	public void info () {
		System.out.println("\nMy name is :" + fName + "\nAge " + age + "Monthly Rent " +
				myApartmentRent + "My Salary: " + salary + " \nMy yearly Salary " + myYearlyIncome + ",  My Height :" + myHeight + "  My Grade :" + myGrade + "  My Sex :" + sex +" Is US Citizen :" +isUscitizen);
				}
	}
	
	

