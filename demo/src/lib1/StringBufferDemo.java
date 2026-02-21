package lib1;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("java ");
		System.out.println(sb.charAt(0));
		
		sb.setCharAt(0,  'J');
		sb.append("EE");
		System.out.println(sb); // Java EE
		sb.insert(0, "Oracle ");
		System.out.println(sb); // Oracle Java EE
		sb.delete(0, 6);
		System.out.println(sb); // Java EE
	}

}
