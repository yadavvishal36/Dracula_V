package method2;

public class Mainclass {

	public static void main(String[] args) {
		B obj = new B();
        // obj.a and obj.b will not work because they belong to class A
		 System.out.println(obj.a + " " + obj.b + " " + obj.c + " " + obj.d);

	}

}
