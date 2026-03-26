public class Rover {
    private int x;
    private int y;
    private char richtung;

    public Rover(int startX, int startY, char startRichtung) {
        this.x = startX;
        this.y = startY;
        this.richtung = startRichtung;
    }

    public boolean processCommands(char[] commands, int[][] map) {
        // TODO: Implementiere hier die Logik
        return false;
    }

    public char getRichtung() {
        // TODO: Implementiere hier die Logik
        return '\0';
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
