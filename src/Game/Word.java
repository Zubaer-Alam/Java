package Game;

import java.util.Random;

public class Word {
    private String[] randomWords = {"animals", "happiness", "indefinite", "steady", "birthday", "extreme", "rights", "properties", "ceremony", "independence", "beneath", "information", "students", "employee"};

    private String selectedWord;
    private Random random = new Random();
    private char[] letters;

    public Word() {
        //selectedWord = randomWords[random.nextInt(randomWords.length)];
        selectedWord = randomWords[random.nextInt(randomWords.length)];
        letters = new char[selectedWord.length()];
    }

    public String toString() {
        StringBuilder word = new StringBuilder();
        for (char letter : letters) {
            word.append(letter == '\u0000' ? '-' : letter);
            word.append(' ');
        }
        return word.toString();
    }
    // The function below iterates through "letters" array and checks if there is any null. If not any null, it means player has guessed all the letters of "selectedWord"
    public boolean isRight() {
        for (char letter : letters) {
            if (letter=='\u0000'){
                return false;
            }
        }
        return true;
    }

    /*  The function below analyses a single char "input".
        The for loop iterates through the letters of the word.

        If "input" matches a letter at any index of  "selectedWord", then that letter gets pushed to that specific index of "letters" which was null before.

        If the input doesn't match any letter of  "selectedWord", then false is returned by default, which in turn reduces the round counter by 1.
    */
    public boolean guess(char input) {
        boolean isRight = false;
        for (int i = 0; i < selectedWord.length(); i++) {
            if (input == selectedWord.charAt(i)) {
                letters[i] = input;
                isRight = true;
            }
        }
        return isRight;
    }
}
