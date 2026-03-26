import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] map = {
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0}
        };

        System.out.println("=== Rover Konsole ===");
        System.out.println("Karte: 5x5 (0 = sicher, 1 = Hindernis)");
        System.out.println("Beispiel-Befehle: VVRLV");

        try {
            System.out.print("Start-X (0-4): ");
            int startX = Integer.parseInt(scanner.nextLine().trim());

            System.out.print("Start-Y (0-4): ");
            int startY = Integer.parseInt(scanner.nextLine().trim());

            System.out.print("Start-Richtung (N/O/S/W): ");
            String richtungInput = scanner.nextLine().trim().toUpperCase();
            char startRichtung = richtungInput.isEmpty() ? 'N' : richtungInput.charAt(0);

            Rover rover = new Rover(startX, startY, startRichtung);
            System.out.println("Steuerung: V/L/R eingeben, Q zum Beenden.");

            while (true) {
                System.out.print("Befehl(e): ");
                String commandsInput = scanner.nextLine().trim().toUpperCase();

                if (commandsInput.equals("Q")) {
                    System.out.println("Beendet.");
                    break;
                }

                if (commandsInput.isEmpty()) {
                    System.out.println("Bitte mindestens einen Befehl eingeben.");
                    continue;
                }

                char[] commands = commandsInput.toCharArray();
                boolean success = rover.processCommands(commands, map);

                System.out.println("pos=(" + rover.getX() + "," + rover.getY() + ") dir=" + rover.getRichtung());

                if (!success) {
                    System.out.println("Absturz! Rover gestoppt.");
                    break;
                }
            }
        } catch (Exception ex) {
            System.out.println("Ungueltige Eingabe. Bitte nur Zahlen und gueltige Richtungs-/Befehlszeichen verwenden.");
        }
    }
}
