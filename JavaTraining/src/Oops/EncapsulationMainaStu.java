package Oops;

public class EncapsulationMainaStu {

	public static void main(String[] args) {
		
		EncapsulationEmployee e = new EncapsulationEmployee ();
		
		e.setAccount_num(123456);
		e.setFavrt_color("Red");
		e.setID(123);
		e.setName("Sandhya");
		e.setSchool_name("visveswaraya university");
		
		System.out.println("Your Account No is "+ e.getAccount_num());
		System.out.println("Your favrot color is "+ e.getFavrt_color());
		System.out.println("Your Id is "+ e.getID());
		System.out.println("Your name is "+ e.getName());
		System.out.println("Your school name is "+ e.getSchool_name());

	}

}
