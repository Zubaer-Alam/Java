package Game;

import java.util.Scanner;

public class guessTheWord {
    private boolean play = true;
    private Word word = new Word();
    private Scanner scanner = new Scanner(System.in);
    public void start(){

        do {
            showWord();
            getInput();
            checkInput();
        }while (play);
    }

    void showWord(){
        System.out.println(word);
    }

    void getInput(){
        System.out.println("Enter a letter:");
        String userGuess = scanner.nextLine();
        word.guess(userGuess.charAt(0));
    }

    void checkInput(){
        System.out.println("checkInput");
    }


    public void end() {
        scanner.close();
    }
}
