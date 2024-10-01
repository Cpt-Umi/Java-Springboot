class A {
  public A() {
    System.out.println("Basic A Constructor");
  }

  public A(String str) {
    System.out.println("Parameterized A Constructor: " + str);
  }
}

class B extends A {
  public B() {
    System.out.println("Basic B Constructor");
  }

  public B(String str) {
    this();
    System.out.println("Parameterized B Constructor: " + str);
  }

  public void method() {
    System.out.println("This is a Method");
  }
}

public class SuperMethod {
  public static void main(String args[]) {
    B objectB = new B();
    objectB.method();
  }
}
