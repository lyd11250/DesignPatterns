public class Main {

    public static void main(String args[]) {

        AbstractDisplay charDisplay = new CharDisplay('6');
        AbstractDisplay stringDisplay = new StringDisplay("HelloWorld!");

        charDisplay.display();
        stringDisplay.display();
    }
}
