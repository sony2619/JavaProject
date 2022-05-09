
public class IncrementDecrement {

	public static void main(String[] args) {
		
		int age = 15;
		
		System.out.println(age++); //age=15
		//age=16
		
		System.out.println(++age); //age=17
		
		System.out.println(age++ + ++age); //age=17+ 19=36
		
		int age1=36;
		
		System.out.println(age1--); //age1=36
		//age1= 35
		
		System.out.println(--age1); //age1=34
	
		System.out.println(age1-- + --age1); //age1=34+32=66
	}

}
