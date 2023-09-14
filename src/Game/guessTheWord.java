package Game;

import java.util.Scanner;

public class guessTheWord {
    private boolean play = true;
    private int rounds = 10;
    private Word word = new Word();
    private Scanner scanner = new Scanner(System.in);
    private char input;

    public void start() {
        do {
            showWord();
            getInput();
            checkInput();
        } while (play);
    }

    void showWord() {
        System.out.println("You have " + rounds + " tries left");
        System.out.println(word);
    }

    void getInput() {
        System.out.println("Enter a letter:");
        String userGuess = scanner.nextLine();
        input = userGuess.charAt(0);
    }

    void checkInput() {
        // "match" is true if the given input letter is present in the word.
        // if the letter exists, and there are no nulls in "word", means that the "letters" char array is full, then "play" becomes false and loop breaks.

        boolean match = word.guess(input);

        if (match) {
            if (word.isRight()) {
                System.out.println("Congratulations, you won!");
                System.out.println("The word is: " + word);
                play = false;
            }
        } else {
            rounds--;
            if (rounds == 0) {
                System.out.println("Game Over!");
                play = false;
            }
        }
    }

    public void end() {
        scanner.close();
    }
}
