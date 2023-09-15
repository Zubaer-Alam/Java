package enums;

public enum Color {
    // All of these are objects, not strings
    RED("Danger"),GREEN("Peace"),BLUE("Sky");

    private String meaning;

    Color(String meaning){
        this.meaning = meaning;
    }

    public String getMeaning() {
        return meaning;
    }

    public String toString() {
        return ("this color's meaning is "+ meaning);
    }
}
