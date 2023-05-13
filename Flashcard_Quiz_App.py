```python
class Flashcard:
    def __init__(self, question, answer):
        self.question = question
        self.answer = answer

class Quiz:
    def __init__(self):
        self.flashcards = []

    def add_flashcard(self, question, answer):
        self.flashcards.append(Flashcard(question, answer))

    def start_quiz(self):
        for flashcard in self.flashcards:
            print(flashcard.question)
            user_answer = input("Your answer: ")
            if user_answer.lower() == flashcard.answer.lower():
                print("Correct!")
            else:
                print(f"Wrong! The correct answer is {flashcard.answer}")

quiz = Quiz()
quiz.add_flashcard("What is the capital of France?", "Paris")
quiz.add_flashcard("What is the capital of Spain?", "Madrid")
quiz.add_flashcard("What is the capital of Italy?", "Rome")

quiz.start_quiz()
```