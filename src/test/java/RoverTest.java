
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RoverTest {

    @Test
    void erfolgreicheRouteOhneHindernisse() {
        int[][] map = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };

        Rover rover = new Rover(0, 0, 'O');
        char[] commands = {'V', 'V', 'R', 'V'};

        boolean result = rover.processCommands(commands, map);

        assertTrue(result, "Die Route sollte erfolgreich sein.");
        assertEquals('S', rover.getRichtung(), "Die Endrichtung sollte S sein.");
    }

    @Test
    void absturzInHindernisGibtFalseZurueck() {
        int[][] map = {
                {0, 1, 0},
                {0, 0, 0},
                {0, 0, 0}
        };

        Rover rover = new Rover(0, 0, 'O');
        char[] commands = {'V'};

        boolean result = rover.processCommands(commands, map);

        assertFalse(result, "Der Rover sollte in ein Hindernis fahren und abstuerzen.");
        assertEquals('O', rover.getRichtung(), "Die Richtung sollte weiterhin O sein.");
    }

    @Test
    void absturzAmKartenrandGibtFalseZurueck() {
        int[][] map = {
                {0, 0},
                {0, 0}
        };

        Rover rover = new Rover(0, 0, 'N');
        char[] commands = {'V'};

        boolean result = rover.processCommands(commands, map);

        assertFalse(result, "Der Rover sollte die Karte verlassen und abstuerzen.");
        assertEquals('N', rover.getRichtung(), "Die Richtung sollte N bleiben.");
    }

    @Test
    void nurDrehungenAendernDieRichtungKorrekt() {
        int[][] map = {
                {0}
        };

        Rover rover = new Rover(0, 0, 'N');
        char[] commands = {'R', 'R', 'L', 'L', 'L'};

        boolean result = rover.processCommands(commands, map);

        assertTrue(result, "Nur Drehungen ohne Bewegung sollten erfolgreich sein.");
        assertEquals('W', rover.getRichtung(), "Die Endrichtung sollte W sein.");
    }
}
