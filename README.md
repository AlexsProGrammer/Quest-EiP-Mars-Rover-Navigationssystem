# Quest: Curiosity 2 - Notfallnavigation auf dem Mars

Ein gewaltiger Sandsturm hat den ESA-Rover Curiosity 2 überrascht und das normale Navigationsmodul zerstört. Nur ein minimalistisches Notfallsystem kann den Rover jetzt noch durch ein gefährliches Asteroidenfeld führen. Jeder Funkbefehl muss korrekt verarbeitet werden, denn ein einziger Fehler bedeutet den Absturz in einen Krater. Deine Mission: Schreibe die Rover-Logik so, dass Curiosity 2 sicher überlebt.

## Anforderungen

- Es muss eine Klasse Rover geben.
- Der Rover speichert seinen Zustand mit den Instanzvariablen x, y und richtung.
- Der Konstruktor Rover(int startX, int startY, char startRichtung) muss den Startzustand setzen.
- Die Methode processCommands(char[] commands, int[][] map) muss alle Befehle der Reihe nach ausführen.
- Gültige Befehle sind:
  - V: ein Feld vorwärts in aktueller Richtung
  - L: 90 Grad nach links drehen
  - R: 90 Grad nach rechts drehen
- Die Karte verwendet:
  - 0 für frei befahrbar
  - 1 für Hindernis/Krater
- Wenn der Rover auf ein Feld mit 1 fährt, muss processCommands sofort false zurückgeben.
- Wenn der Rover die Grenzen der Karte verlässt (Out of Bounds), muss processCommands sofort false zurückgeben.
- Wenn alle Befehle ohne Absturz verarbeitet wurden, muss processCommands true zurückgeben.
- Es muss einen Getter getRichtung() geben, der die aktuelle Richtung zurückliefert.

Bearbeite `main/java/Rover.java` und implementiere die Klasse entsprechend den Anforderungen. Teste deine Lösung mit verschiedenen Karten und Befehlsfolgen, um sicherzustellen, dass Curiosity 2 sicher navigieren kann!