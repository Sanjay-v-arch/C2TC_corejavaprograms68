//Program to demonstrate Command Line Arguments 
package DayNine;

public class WrapperClassDemoOne {
	public static void main(String args[]) {
		System.out.println("Hello World");
		/*if (args.length < 2) {
            System.out.println("Please provide two integer arguments.");
            return;*/
        }

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = a + b;
		System.out.println(c);
	}

}
