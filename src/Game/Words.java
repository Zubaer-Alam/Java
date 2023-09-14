package Game;

import java.util.Random;

public class Words {
    private String[] randomWords = {"animals", "happiness", "indefinite", "steady", "birthday", "extreme", "rights", "properties", "ceremony", "independence", "beneath", "information", "students", "employee"};

    private String selectedWord;
    private Random random = new Random();
    private char[] letters;

    public Words() {
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
}
