package JAVA1;

import org.omg.Messaging.SyncScopeHelper;

//import javax.swing.plaf.synth.SynthSeparatorUI;

public class Tut2 {

	public static void main(String[] args) {
		
		Method kp = new Method();
		kp.hello();
		kp.floop();
		kp.reverse("BONG");
		kp.reverse("this will be a long line.");
		
		// if else loop

//		int a = 1;
//		if (a > 2) {
//			System.out.println("a is greater than");
//
//		} else {
//			System.out.println("a is less than");
//		}
//
//		String i = "HELLO";
//		String g = "Hello";
//		if (i.contentEquals(g)) {
//			System.out.println("they are same ");
//		} else {
//			System.out.println("its not same:::");
//		}

		////////////////// if else if ///////////////////////////

//		int m = 120;
//
//		if (m > 200) {
//			System.out.println("M is big.");
//		} else if (m > 150) {
//			System.out.println("M is bigger");
//		} else if (m >= 120) {
//			System.out.println("m wins it all'");
//		} else {
//			System.out.println("this is BS");
//
//		}
		/////////////// if else if ////////////////////

		int num = 1600;
		if (num > 200 && num < 500) {
			System.out.println("Ironman");
		} else if (num > 500 && num < 700) {
			System.out.println("Batman");
		} else if (num > 999 && num < 1100) {
			System.out.println("Superman");
		} else {
			System.out.println("Hulk");
		}

		/////////////// For loop ///////////////////////

		for (int ab = 1; ab <= 10; ab = ab + 2) {
			System.out.println("this will print :: " + ab);
		}

		///////////////// sum of 1-100 ////////////////////

		int total = 0;

	for (int k = 2; k <= 20; k=k+2) {
			total = total + k;

			System.out.println("total for the numbers are  "+k +"  each line will see ::" + total);

		}
		
		/////////////////string ////////////////////////////////

		String mmm ="I am looking for a job";
		for (int L=0;L<mmm.length();L++) {
			System.out.println( " Each of the chars on the line is :: " +mmm.charAt(L));
		}
	
		
		
		/////////////while/////////////////
		
		int p=0;
		while (p<5) {
			System.out.println(p);
			p++;
			
		}
		///////////////////////////////////

		int o=0;
		while (o <11) {
			System.out.println("we have snow here " +o);
			o++;
			
		}
		
		///////////////////////////////////////
	
		
		
		////////////do-while////////////////////
		
		do {
			System.out.println(p);
			p=p+2;
		}while(p<20);
		
		
		/////////////////////////////
		
		
		
		
		int bst =0;
		for (int w = 0; w<10 ;w++) {
			bst =bst+1;
			
			System.out.println("She doesnt care ::" + bst);	
		}
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
	}

//}

// }}
