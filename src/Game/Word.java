package Game;

import java.util.Random;

public class Word {
    private String[] randomWords = {"animals", "happiness", "indefinite", "steady", "birthday", "extreme", "rights", "properties", "ceremony", "independence", "beneath", "information", "students", "employee"};

    private String selectedWord;
    private Random random = new Random();
    private char[] letters;

    public Word() {
        //selectedWord = randomWords[random.nextInt(randomWords.length)];
        selectedWord = randomWords[0];
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

    public void guess(char letter) {
        for (int i = 0; i < selectedWord.length(); i++) {
            if (letter == selectedWord.charAt(i)) {
                letters[i] = letter;
            }
        }
    }
}
