package StringBuilder;

public class Main {
    public static void main(String[] args) {
        String text = "Hello!";
        text += "My name is ";
        text += "Zubaer";
        System.out.println(text);
        /*
        The String class is immutable. In the above example, everytime I add
        something to the text string, a new string is created. So we will use
        String Builder everytime we concatenate strings.
         */

        StringBuilder newText = new StringBuilder();
        newText.append("Hello!");
        newText.append("My name is ");
        newText.append("David");

        text = newText.toString();

        System.out.println(text);
        String name = "Zubaer";
        StringBuilder example = new StringBuilder("Hello!");
        example.append("My ").append("Name is ").append(name);
        //This is called Method Chaining.
        System.out.println(example);

    }
}
