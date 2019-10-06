public class Main {
    public static void main(String[] args) {
        String myString = "This is a String. ";
        System.out.println("My string is, " + myString);
        char myUnicode = '\u00A9';
        System.out.println("My string is, " + myString + myUnicode + "2019");
        String lastString = "10";
        int myInt = 20;
        lastString += myInt;
        System.out.println(lastString);
    }
}
