package Game;

public class guessTheWord {
    private boolean play = false;
    private Words randomWord = new Words();
    public void start(){

        do {
            showWord();
            getInput();
            checkInput();
        }while (play);
    }
    void showWord(){
        System.out.println(randomWord);
    }
    void getInput(){
        System.out.println("getInput");
    }
    void checkInput(){
        System.out.println("checkInput");
    }
}
