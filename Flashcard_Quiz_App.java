```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FlashcardQuizApp {
    private Map<String, String> flashcards = new HashMap<>();

    public static void main(String[] args) {
        FlashcardQuizApp app = new FlashcardQuizApp();
        app.run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add flashcard");
            System.out.println("2. Take a quiz");
            System.out.println("3. Exit");
            String option = scanner.nextLine();
            if (option.equals("1")) {
                addFlashcard(scanner);
            } else if (option.equals("2")) {
                takeQuiz(scanner);
            } else if (option.equals("3")) {
                break;
            }
        }
    }

    private void addFlashcard(Scanner scanner) {
        System.out.println("Enter question:");
        String question = scanner.nextLine();
        System.out.println("Enter answer:");
        String answer = scanner.nextLine();
        flashcards.put(question, answer);
    }

    private void takeQuiz(Scanner scanner) {
        for (Map.Entry<String, String> flashcard : flashcards.entrySet()) {
            System.out.println(flashcard.getKey());
            String userAnswer = scanner.nextLine();
            if (userAnswer.equals(flashcard.getValue())) {
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect, the correct answer is " + flashcard.getValue());
            }
        }
    }
}
```