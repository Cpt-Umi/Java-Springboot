class Pyramid {
  public void printPyramid(int rows) {
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < rows - i; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < (2 * i - 1); k++) {
        System.out.print("*");
      }
      System.out.println(' ');
    }
  }
}

public class Classes {
  public static void main(String args[]) {
    Pyramid pyramid = new Pyramid();

    pyramid.printPyramid(10);
  }

}
