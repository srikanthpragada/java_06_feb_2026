package lib1;

public class BoxingDemo {

	public static void main(String[] args) {
		Object obj = 10;   // Autoboxing 
		System.out.println(obj.getClass());
		
		int i = (Integer) obj;  // Autounboxing 
        System.out.println(i);		
	}
}
