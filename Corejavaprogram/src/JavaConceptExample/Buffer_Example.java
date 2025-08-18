package JavaConceptExample;
import java.io.*;
public class Buffer_Example {

	public static void main(String[] args)throws IOException {
		 BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	        System.out.println("Enter  the name: ");
	        String name=sc.readLine();
	        System.out.println("Enter  the age: ");
	        int age=Integer.parseInt(sc.readLine());
	        System.out.println("Enter  Salary: ");
	        double sal=Double.parseDouble(sc.readLine());
	        System.out.println("Name: "+name);
	        System.out.println("Age: "+age);
	        System.out.println("Salary: "+sal);

	}

}
