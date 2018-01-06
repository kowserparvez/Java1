package JAVA1;

public class Tut1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");

		int a = 9;
		String b = "This is a string";
		long c = 7895;
		double d = 7.1254;
		float e = 145.25f;
		char f = 'y';
		boolean g = false;
		byte h = 127;

		///////////////////////

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);

		////////////////////////////////////
		String x = "Hello there  ";
		String y = "Taheem and Keyaan";

		System.out.println(x + y);
		int size = x.length();
		int s = y.indexOf('n');
		System.out.println(s);
		System.out.println(size);
		/////////////////////////////

		int i = 100;
		int add = (i + 1) * i / 2;

		System.out.println(add);
		String l = " i am a bum";
		char home = l.charAt(3);
		System.out.println(l.charAt(8));

		String combo = x + y;
		System.out.println(add);

		System.out.println(x.concat(y));

		System.out.println(x + " hello there " + y);

		String h1 = "TEXAS AND TENT AND TODE";
		String h2 = "texas";
		System.out.println(h1.equals(h2));

		System.out.println(h1.equalsIgnoreCase(h2));

		System.out.println(l.substring(5, 8));
	
		System.out.println(l.substring(8));
		
		System.out.println(h2.toUpperCase());
	
		System.out.println(h2.compareTo(h1));
		
		System.out.println(l.startsWith(" i"));
		
		System.out.println("Contain function  " + x.contains("Hello"));
		
		System.out.println("Replace with :: "+h1.replace("T", "COWBOYS"));
		
		
		String xyz=("  Where is all the money go.   ");
	
		System.out.println(xyz.trim());
		System.out.println(xyz.isEmpty());
		
		
		
	}

}
