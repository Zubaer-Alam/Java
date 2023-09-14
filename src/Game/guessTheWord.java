package Game;

import java.util.Scanner;

public class guessTheWord {
    private boolean play = true;
    private Word word = new Word();
    private Scanner scanner = new Scanner(System.in);
    private int rounds = 10;
    private char lastRound;

    public void start() {

        do {
            showWord();
            getInput();
            checkInput();
        } while (play);
    }

    void showWord() {
        System.out.println("You have "+rounds+" tries left");
        System.out.println(word);
    }

    void getInput() {
        System.out.println("Enter a letter:");
        String userGuess = scanner.nextLine();
        lastRound = userGuess.charAt(0);
    }

    void checkInput() {

        boolean guessedRight = word.guess(lastRound);
        if (guessedRight) {
            if (word.isRight()) {
                System.out.println("Congratulations, you won");
                System.out.println("The word is: " + word);
                play = false;
            }
        }else{
            rounds--;
            if(rounds==0){
                System.out.println("Game Over!");
                play = false;
            }
        }
    }

    public void end() {
        scanner.close();
    }
}
