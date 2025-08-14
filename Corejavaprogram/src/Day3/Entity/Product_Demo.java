package Day3.Entity;

import java.util.Scanner;

public class Product_Demo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ii=sc.nextInt();
		sc.nextLine();
		String pp = sc.nextLine();
		Float aa= sc.nextFloat();
		
		Product obj1=new Product();
		Product obj2=new Product(102,"Mouse",250.4f);
		
		
		
		Product obj3=new Product();
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);

	}

}
