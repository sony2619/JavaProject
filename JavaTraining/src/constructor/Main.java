package constructor;

public class Main {

	public static void main(String[] args) {
		
		//shirt s = new shirt();
	    //s.setColor("white");
	    //s.setSize('M');
		
        shirt s = new shirt("white",'M');
		s.putOn();
		
		System.out.println(s.color);
		System.out.println(s.Size);
		
		

	}

}
