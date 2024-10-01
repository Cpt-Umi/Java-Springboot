package quiz_project;

import java.util.Scanner;

public class QuestionService {
  Scanner sc = new Scanner(System.in);
  Question[] questions = new Question[3];
  int answers[] = new int[3];

  public QuestionService() {
    questions[0] = new Question(1, "How are you doing?", "Miserable", "Shitty", "Depressed", "F it we ball",
        4);
    questions[1] = new Question(2, "How's work?", "Miserable", "Shitty", "Depressed", "F it we ball", 4);
    questions[2] = new Question(3, "How's life?", "Miserable", "Shitty", "Depressed", "F it we ball", 4);
  }

  public void playQuiz() {
    int i = 0;
    for (Question q : questions) {
      System.out.println(q);
      System.out.print("Ans: ");
      answers[i++] = sc.nextInt();
      System.out.println("");
    }
  }

  public int calcScore() {
    int score = 0;
    for (int i = 0; i < questions.length; i++) {
      int correctAns = questions[i].getAnswer();
      if (correctAns == answers[i]) {
        // Why am I wasting my life...
        score++;
      }
    }
    return score;
  }
}
