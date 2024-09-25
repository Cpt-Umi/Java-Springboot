class Overlord {
  // Basically a method can have the same name if the arguments or the return
  // types are different.
  public int add(int num1, int num2) {
    return num1 + num2;
  }

  public int add(int num1, int num2, int num3) {
    return num1 + num2 + num3;
  }

  public double add(double num1, int num2) {
    return num1 + num2;
  }
}

public class MethodOverloading {
  public static void main(String args[]) {
    Overlord overload = new Overlord();

    double result = overload.add(10.2, 15);
    System.out.println("Result: " + result);
  }
}
