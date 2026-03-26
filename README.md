# Quest: Curiosity 2 - Notfallnavigation auf dem Mars

Ein gewaltiger Sandsturm hat den ESA-Rover Curiosity 2 überrascht und das normale Navigationsmodul zerstört. Nur ein minimalistisches Notfallsystem kann den Rover jetzt noch durch ein gefährliches Asteroidenfeld führen. Jeder Funkbefehl muss korrekt verarbeitet werden, denn ein einziger Fehler bedeutet den Absturz in einen Krater. Deine Mission: Schreibe die Rover-Logik so, dass Curiosity 2 sicher überlebt.

## Anforderungen

- Es muss eine Klasse Rover geben.
- Der Rover speichert seinen Zustand mit den Instanzvariablen `x`, `y` und `richtung`.
- Der Konstruktor `Rover(int startX, int startY, char startRichtung)` muss den Startzustand setzen.
- Die Methode `processCommands(char[] commands, int[][] map)` muss alle Befehle der Reihe nach ausführen.
- Gültige Befehle sind:
  - V: ein Feld vorwärts in aktueller Richtung
  - L: 90 Grad nach links drehen (dreht auf der Stelle, ändert nur die Richtung)
  - R: 90 Grad nach rechts drehen
- Die Karte verwendet:
  - 0 für frei befahrbar
  - 1 für Hindernis/Krater
- Wenn der Rover auf ein Feld mit 1 fährt, muss `processCommands` sofort `false` zurückgeben.
- Wenn der Rover die Grenzen der Karte verlässt (Out of Bounds), muss `processCommands` sofort `false` zurückgeben.
- Wenn alle Befehle ohne Absturz verarbeitet wurden, muss `processCommands` `true` zurückgeben.
- Es muss einen Getter `getRichtung()` geben, der die aktuelle Richtung zurückliefert.
- Es muss Getter `getX()` und `getY()` geben, die die aktuelle Position zurückliefern.

Bearbeite `src/main/java/Rover.java` und implementiere die Klasse entsprechend den Anforderungen. Teste deine Lösung mit verschiedenen Karten und Befehlsfolgen durch die `src/main/java/Main.java` Datei, um sicherzustellen, dass Curiosity 2 sicher navigieren kann!

Extra: 
1. Implementiere deine eigene Main.java Datei, um den Rover zu steuern. 
2. Oder erweitere die `Main.java` und zeige die Karte mit dem Rover darauf an in der Console, nach jedem Befehl. (Nutze z.B. <, A, V, > für die Richtung des Rovers auf der Karte)

---


## Allgemeines Setup (Eclipse + Gradle)

Dieser Abschnitt zeigt den einfachsten Weg, wie das Projekt auf den meisten Geräten (ca. 90 Prozent) direkt läuft.

### 1) Voraussetzungen prüfen

1. Installiere ein aktuelles Eclipse IDE for Java Developers.
2. Stelle sicher, dass Java 21 installiert ist.
3. Prüfe im Terminal im **Quest-Projektordner**:

```bash
java -version
./gradlew -version
```

Erwartung: Java 21 wird angezeigt. Gradle wird über den Wrapper `./gradlew` verwendet.

### 2) Projekt in Eclipse richtig importieren

1. Eclipse starten.
2. File -> Import -> Gradle -> Existing Gradle Project.
3. Als Root Directory den Projektordner wählen.
4. Import abschliessen.
5. Danach Rechtsklick auf das Projekt -> Gradle -> Refresh Gradle Project.

Wichtig: Nicht als normales Java-Projekt importieren. Sonst erstellt Eclipse oft ein zusätzliches `src`-Verzeichnis.

### 3) Wo du programmierst

- Implementierung: `src/main/java/___.java`
- Tests: `src/test/java/___Test.java`

### 4) Tests ausführen

Im Terminal im Projektordner:

```bash
./gradlew test
```

Nur einen einzelnen Test ausführen:

```bash
./gradlew test --tests "*testFunktionsName"
```

In Eclipse kannst du alternativ `src/test/java/___Test.java` rechtsklicken und Run As -> JUnit Test wählen.

### 5) Häufige Probleme und schnelle Lösung

- Problem: Eclipse zeigt ein neues `src` statt `src/main/java` und `src/test/java`.
  Lösung: Projekt aus dem Workspace entfernen (nicht von der Festplatte löschen) und als Existing Gradle Project erneut importieren.
- Problem: `gradle test` scheitert, `./gradlew test` funktioniert.
  Lösung: Immer den Wrapper `./gradlew` verwenden, nicht das systemweite Gradle.
- Problem: Java-Version passt nicht.
  Lösung: In Eclipse unter Preferences -> Java -> Installed JREs Java 21 wählen und Projekt danach einmal Gradle-refreshen.
- Sonstiges: Einfach **AI** fragen.