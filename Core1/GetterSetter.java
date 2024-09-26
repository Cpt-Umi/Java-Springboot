class SomeClass {
  private int someValue;
  private String someString;

  public int getSomeValue() {
    return someValue;
  }

  public void setSomeValue(int someValue) {
    this.someValue = someValue;
  }

  public String getSomeString() {
    return someString;
  }

  public void setSomeString(String someString) {
    this.someString = someString;
  }
}

public class GetterSetter {
  public static void main(String args[]) {
    SomeClass someClass = new SomeClass();
    someClass.setSomeValue(21);
    someClass.setSomeString("Hello, Friend.");

    System.out.println(someClass.getSomeValue());
    System.out.println(someClass.getSomeString());
  }
}
