<h1>Mensch-Ärgere-Dich-Nicht-Spiel</h1>

<hr>

Dies ist die ReadMe-Datei für das Spiel Mensch-Ärgere-Dich-Nicht.

<hr>
<h3> Die Kurzbeschreibung des Spiels:</h3>

Durch das Drücken auf die Würfel-Taste wird gewürfelt. Nachdem gewürfelt wurde, bewegt sich die Figur von selbst und
das Spiel bleibt für ein paar Sekunden stehen, damit man wahrnehmen kann, welche Zahl gewürfelt wurde. Danach sind die 
Anderen dran und bei Ihnen wird es automatisch gewürfelt und die Figuren bewegen sich auch von selbst. Man kann erst die
anderen Figuren aus ihren Häusern rausholen, nachdem man die vorherige Figur in die richtige Endposition gebracht hat, 
heißt, man kann nicht mehrere Figuren draußen besitzen. Wenn man für die letzte Position eine eins braucht, aber eine 
höhere Zahl gewürfelt hat, wird man trotzdem in die Endposition bewegt.

<hr />
<h3>Screenshot</h3>

![Brett.png](C:\Users\smogl\IdeaProjects\ProjektGame\src\Brett.png)

<hr />

<h3> Bibliothek </h3>
Die verwendeten Bibliotheken sind:

Processing:
"https://processing.org/"

ControlP5:
"https://www.sojamo.de/libraries/controlP5/"

JUnit:
"https://junit.org/junit5/"




<hr />
<h3>Starten </h3>
Um das Programm zu starten müssen Sie die Main Klasse starten.


<hr />
<h3>Testen</h3>
In Jshell mit:

"jshell --class-path .\out\production\ProjektGame\" öffnen.

Danach "import model.MenschAergereDichNichtModel" eingeben.


Um das Spiel auf der JShell zu testen, müssen Sie erst ein neues Spiel starten, als Beispiel können sie "var model=new MenschAergereDichNichtModel();" eingeben.Mit der methode model.newGame() können wir ein neues Spiel erstellen (es muss zweimal eingegeben werden).

Mit model.move(Spieler) bewegen wir die Spieler.

Spieler eingeben mit:

blau= model.blau
gruen=model.gruen
gelb=model.gelb
rot=model.rot