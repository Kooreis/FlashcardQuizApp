```CSharp
using System;
using System.Collections.Generic;

class Program
{
    static void Main(string[] args)
    {
        List<Flashcard> flashcards = new List<Flashcard>
        {
            new Flashcard("What is the capital of France?", "Paris"),
            new Flashcard("What is the capital of Spain?", "Madrid"),
            new Flashcard("What is the capital of Italy?", "Rome")
        };

        foreach (var flashcard in flashcards)
        {
            Console.WriteLine(flashcard.Question);
            string answer = Console.ReadLine();

            if (answer.ToLower() == flashcard.Answer.ToLower())
            {
                Console.WriteLine("Correct!");
            }
            else
            {
                Console.WriteLine($"Incorrect! The correct answer is {flashcard.Answer}.");
            }
        }
    }
}

public class Flashcard
{
    public string Question { get; set; }
    public string Answer { get; set; }

    public Flashcard(string question, string answer)
    {
        Question = question;
        Answer = answer;
    }
}
```