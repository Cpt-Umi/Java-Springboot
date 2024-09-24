public class Quiz {
  public static void main(String[] args) {

    int i, j;

    i = 100;

    j = 300;

    while (++i < --j)
      ;
    System.out.println(i); // Ans is 200 as the loop runs 200 times before exiting and printing this
                           // statement.

  }
}
