package lec01;

public class MyinfoTest {

	public static void main(String[] args) {
		Myinfo info1 = new Myinfo();
		info1.fName = "Masud Rahman";
		info1.age = 27;
		info1.myApartmentRent = 2200;
		info1.salary = 8900;
		info1.myYearlyIncome = 110000;
		info1.myHeight = 1.73f;
		info1.myGrade = 4.5879545545;
		info1.sex = 'M';
		info1.isUscitizen = true;
		
		info1.info();
		
		Myinfo info2 = new Myinfo();
		info2.fName = "Hanif Rahman";
		info2.age = 37;
		info2.myApartmentRent = 2200;
		info2.salary = 8900;
		info2.myYearlyIncome = 110000;
		info2.myHeight = 1.73f;
		info2.myGrade = 4.5879545545;
		info2.sex = 'M';
		info2.isUscitizen = true;
		
		info2.info();
	}

}
