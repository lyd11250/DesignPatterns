public class CharDisplay extends AbstractDisplay {
    
    private char c;

    public CharDisplay(char c) {
        this.c = c;
    }

    public void open() {
        System.out.print("<< ");
    }

    public void close() {
        System.out.println(" >>");
    }

    public void print() {
        System.out.print(c);
    }
}
