
public class AndOr {

	public static void main(String[] args) {
		
		int num1 = 20;
		int num2 = 40;
		
		boolean a = num1>10; //true
		boolean b = num2>30; //true
		
		System.out.println(a && b); //true
		
		boolean c = num1>30; //false
		boolean d = num2>20; //true
		
		System.out.println(c && d); // false
		
		boolean e = num1<10; //false
		boolean f = num2<30; //false
		
		System.out.println(e||f); //false
		
		boolean g =num1>30; //false
		boolean h =num2>20; //true
		
		System.out.println(g||h); //true

	}

}
