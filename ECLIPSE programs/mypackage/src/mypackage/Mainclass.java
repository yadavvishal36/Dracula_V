package mypackage;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B();
        // obj.a and obj.b will not work because they belong to class A
        System.out.println(obj.c + " " + obj.d);

	}

}
