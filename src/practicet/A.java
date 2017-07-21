package practicet;

class AB{
	AB(){ System.out.println("A"); } //Class A with default constructor (empty argument lists) that announces itself.
}

class B{
	B(){ System.out.println("B"); } //Class B with default constructor (empty argument lists) that announces itself.
}

class C extends AB{                  //Inherited a new class called C from A, no constructor.
	B b = new B();                  //Created a member of class B inside C. 
}

public class A {
	public static void main(String[] args) {
		C c = new C();	            //Created an object of class C.
	}
} /* Output:*/                