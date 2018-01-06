package JAVA1;

public class Tut3 {

	public static void main(String[] args) {
		/////////////// array///////////////

		int[] v = { 2, 4, 7, 3, 5, 1, 6 };
		String[] w = { "and", "bon", "son", "tom", "lot" };

		System.out.println(v[2]);
		System.out.println(w[4]);
		System.out.println("length of V::" +v.length);
		System.out.println("length of V::" +w.length);
		
		for (int d =0;d<v.length;d++) {
			System.out.println(v[d]);
			
		for (int f =0;f <w.length;f++) {
			System.out.println(w[f]);
		}
		
		}
		
		///////////////////////////////////
		for (int i=0;i<v.length;i++) {
			if (v[i]%2==0) {
				System.out.println("the even numbers are ::: "+v[i]);
			}else {
				System.out.println("the odd numbers are ::: "+v[i]);
			}
		}
		
		//////////find + or - ////////////
		
		int []m= {2,5,-1,6,0,7,9,-5};
		for (int n=0;n<m.length;n++) {
			if (m[n]>0) {
				System.out.println("This is a positive number ::: " +m[n] );
			}
			else if (m[n]<0)
			{ System.out.println("this is a negative number:::" +m[n]);
		}else {
			System.out.println("the number is  " +m[n]);
		}
		
	}

		
		
		
		
		
}
}

