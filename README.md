# Python Documentation

# Flashcard Quiz Python Script

This Python script is a simple implementation of a flashcard quiz. It allows you to create a quiz with multiple questions and answers, and then run the quiz to test your knowledge.

## Classes

The script contains two classes: `Flashcard` and `Quiz`.

### Flashcard

The `Flashcard` class represents a single flashcard with a question and an answer. It has two attributes:

- `question`: A string that represents the question on the flashcard.
- `answer`: A string that represents the answer to the question.

### Quiz

The `Quiz` class represents a quiz composed of multiple flashcards. It has one attribute and two methods:

- `flashcards`: A list that stores the flashcards in the quiz.

- `add_flashcard(question, answer)`: This method allows you to add a new flashcard to the quiz. It takes two parameters: `question` and `answer`, which represent the question and answer of the flashcard, respectively.

- `start_quiz()`: This method starts the quiz. It iterates over the flashcards in the quiz, prints the question, and asks for the user's answer. If the user's answer matches the correct answer, it prints "Correct!". Otherwise, it prints "Wrong! The correct answer is {flashcard.answer}".

## Usage

To use this script, you first need to create a `Quiz` object. Then, you can add flashcards to the quiz using the `add_flashcard(question, answer)` method. Finally, you can start the quiz using the `start_quiz()` method.

Here is an example:

```python
quiz = Quiz()
quiz.add_flashcard("What is the capital of France?", "Paris")
quiz.add_flashcard("What is the capital of Spain?", "Madrid")
quiz.add_flashcard("What is the capital of Italy?", "Rome")

quiz.start_quiz()
```

## Libraries

This script does not import any libraries. It only uses built-in Python features.

---

# C# Documentation

# Flashcard Quiz Program

This is a simple console application written in C# that simulates a flashcard quiz. The program asks the user a series of questions and checks if the user's answer matches the correct answer.

## Code Explanation

The script begins by importing two namespaces:

- `System`: This namespace contains fundamental classes and base classes that define commonly-used value and reference data types, events and event handlers, interfaces, attributes, and processing exceptions.
- `System.Collections.Generic`: This namespace contains interfaces and classes that define generic collections, which allow users to create strongly typed collections that provide better type safety and performance than non-generic strongly typed collections.

The `Program` class is the main class of the script. It contains the `Main` method, which is the entry point of the program.

The `Main` method initializes a list of `Flashcard` objects, each representing a question and its corresponding answer. It then iterates over each flashcard, prints the question to the console, and reads the user's answer from the console. If the user's answer matches the flashcard's answer (case-insensitive), it prints "Correct!". Otherwise, it prints "Incorrect!" along with the correct answer.

The `Flashcard` class represents a flashcard with a question and an answer. It has two properties, `Question` and `Answer`, and a constructor that initializes these properties.

## Usage

To run the program, compile it with a C# compiler and run the resulting executable. The program will ask you a series of questions. Type your answer and press Enter to submit it. The program will tell you whether your answer is correct or not, and if not, it will show you the correct answer.

---

# Java Documentation

# Flashcard Quiz App

This is a simple Java application that allows users to create and take quizzes using flashcards. The application runs in a continuous loop until the user decides to exit. The user can add flashcards with a question and an answer, and then take a quiz based on the added flashcards.

## Imported Libraries

The application uses the following Java libraries:

- `java.util.HashMap`: This library provides the `HashMap` class which is used to store the flashcards. Each flashcard is stored as a key-value pair, with the question as the key and the answer as the value.

- `java.util.Map`: This library provides the `Map` interface which is used to work with the flashcards stored in the `HashMap`. It provides methods to retrieve the flashcards and iterate over them.

- `java.util.Scanner`: This library provides the `Scanner` class which is used to read the user's input from the console. It is used to get the user's choices in the main menu, and to read the questions and answers when adding flashcards and taking a quiz.

## Code Explanation

The `FlashcardQuizApp` class contains a `HashMap` to store the flashcards and a `main` method to start the application. The `main` method creates an instance of the `FlashcardQuizApp` class and calls its `run` method.

The `run` method displays a menu with three options: add a flashcard, take a quiz, or exit. It reads the user's choice and calls the appropriate method.

The `addFlashcard` method asks the user to enter a question and an answer, and adds them as a new flashcard to the `HashMap`.

The `takeQuiz` method iterates over the flashcards in the `HashMap`, displays each question to the user, and checks if the user's answer matches the correct answer. It displays a message to indicate whether the user's answer is correct or not.

---
