/**
 * In diesem package befinden sich alle Klassen, die zum Controller dazugehören.
 * Außerdem befindet sich in diesem package auch der GameState, also der Status des Spiels.
 */
package controller;
import model.Spieler;

/**
 * Dieses Interface implementiert die MenschAergereDichNIchtController Klasse und gibt dem View die Informationen
 * mit dem die MenschAergereDichNichtView Klasse das Spiel zeichnet. Falls eine wichtige Methode für das Spiel
 * in dem Interface nicht vorhanden ist, so kann die MenschAergereDichNichtView Klasse darauf nicht zugreifen und
 * kann es dementsprechend auch nicht zeichnen.
 *
 * @author Emre Özkoc
 */

public interface IMenschAergereDichNichtController {

    /**
     * Diese Methode sollte immer dann, wenn der Controller die View ändern möchte, aufgerufen werden.
     * Der Controller soll einen der draw-Methode aufrufen von dem View.
     */
    void nextFrame();

    /**
     * Soll immmer, wenn der Spieler klickt, aufgerufen werden.
     * @param x Maus-x-Koordinate
     * @param y Maus-y-Koordinate
     */
    void userInput(int x,int y);

    /**
     * Holt sich die Information über den Würfel von dem Modell und übergibt es mit dieser Methode dem View,
     * wenn es aufgerufen wird.
     * @return die Zahl von dem Würfel
     */
    int getWuerfel();

    /**
     * Gibt die Information weiter, welcher Spieler gerade dran ist.
     * @return die Zahl welche anzeigt, welcher Spieler dran ist.
     */
    int getDran();


    /**
     * Holt sich die Information über den blauen Spieler von dem Modell und übergibt es mit dieser Methode dem View,
     * wenn es aufgerufen wird.
     * @return Spieler Blau Informationen
     */
    Spieler getBlau();
    /**
     * Holt sich die Information über den gelben Spieler von dem Modell und übergibt es mit dieser Methode dem View,
     * wenn es aufgerufen wird.
     * @return Spieler Gelb Informationen
     */

    Spieler getGelb();
    /**
     * Holt sich die Information über den grünen Spieler von dem Modell und übergibt es mit dieser Methode dem View,
     * wenn es aufgerufen wird.
     * @return Spieler Grün Informationen
     */
    Spieler getGruen();
    /**
     * Holt sich die Information über den roten Spieler von dem Modell und übergibt es mit dieser Methode dem View,
     * wenn es aufgerufen wird.
     * @return Spieler Rot Informationen
     */
    Spieler getRot();
}
