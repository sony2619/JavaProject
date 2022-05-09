package Oops;

class Doctor{
	int salary=50000;
}
class surgeon extends Doctor
{
	int bonus= 20000;
		
	}

public class Inheritance {

	public static void main(String[] args) {
	
		surgeon s = new surgeon();
	
		System.out.println("salary of surgeon"+s.salary);
		System.out.println("bonus of surgeon"+s.bonus);
	}

}
