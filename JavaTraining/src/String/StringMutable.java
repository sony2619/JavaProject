package String;

public class StringMutable {

	public static void main(String[] args) {
		
		StringBuffer sbf = new StringBuffer("Navin");
		sbf.append("Reddy");
		sbf.replace(0, 7, "sandhya");
		sbf.delete(7, 10);
		
		System.out.println(sbf);

	}

}
