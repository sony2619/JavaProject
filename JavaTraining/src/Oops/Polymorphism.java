package Oops;

class Bird
{
	public void sing() {
		System.out.println("tweet tweet");
	}
}
class peacock extends Bird
{
	public void sing() {
		
	System.out.println("kwahh kwahh");
}
}

public class Polymorphism {

	public static void main(String[] args) {
		peacock p = new peacock();
		p.sing();

	}

}
