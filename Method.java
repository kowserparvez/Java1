package JAVA1;

public class Method {

	public static void main(String[] args) {

		Method ob = new Method();
		ob.sum(10, 35);
		Tut2 obj =new Tut2();
		

		ob.sum(13, 33);
		String b = "Will it print that line";
		ob.print(b);

		ob.hello();
		ob.floop();
		ob.whiled();
		ob.dwhile();
		ob.combo("Taheem and ", "Keyaan");
	
		
		
		

	}

	public void print(String a) {
		System.out.println(a);
	}

	public void sum(int i, int j) {
		int sum = i + j;
		System.out.println("the sum is ::  " + sum);
	}

	public static void hello() {
		int n = 8;
		if (n > 21) {
			System.out.println("Lets see this " + n);
		} else {
			System.out.println("print b");
		}
	}

	public static void floop() {
		int[] i = { 23, 34, 31, -24, 0, 98, 21 };

		for (int a = 0; a < i.length; a++) {
			if (i[a] > 0) {
				System.out.println("it is a positive number:::" + i[a]);

			} else if (i[a] < 0) {
				System.out.println("it is a negative number:::" + i[a]);

			} else {
				System.out.println("it is a zero number:::" + i[a]);
			}
		}
	}

	public static void whiled() {
		int l = 0;
		while (l < 5) {
			System.out.println("not sure about it ::  ");
			l++;

		}

	}

	public static void dwhile() {
		int k = 9;
		do {
			System.out.println("the mistake:::  " + k);
			k--;
		} while (k > 1);
	}

	
	public static void combo(String a,String b) {
		String sum1=a+b;
		System.out.println(" the combo is :::"+sum1);
		
		
	}
	
	//////////////////reverse string////////////////////
	
	
	public static void reverse(String a) {
		for (int i=a.length()-1;i>=0;i--) {
			System.out.print(a.charAt(i));
			
		}
		System.out.println();
	}
	
	
	
	
	
	
	
}
