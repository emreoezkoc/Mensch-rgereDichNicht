/**
 * In diesem package befinden sich alle Klassen, die zum View dazugehören.
 *
 */
package view;
import controlP5.*;

/**
 *   Dieses Interface implementiert die MenschAergereDichNichtView Klasse und gibt dem Controller die benötigten
 *   Informationen über die Klasse view, mit dem der Controller weiterarbeiten kann.
 *
 *  @author Emre Özkoc
 */
public interface IMenschAergereDichNichtView {
    /**
     * Der Controller sollte diese Methode aufrufen um den Startbildschirm zeichnen zu können.
     */
    void drawStart();
    /**
     * Der Controller sollte diese Methode aufrufen um den Auswahlbildschirm zeichnen zu können.
     */
    void drawAuswahl();
    /**
     * Der Controller sollte diese Methode aufrufen, wenn man sich für das Steuern von Spieler blau
     * entschieden hat.
     */
    void drawGameBlau();
    /**
     * Der Controller sollte diese Methode aufrufen, wenn man sich für das Steuern von Spieler grün
     * entschieden hat.
     */
    void drawGameGruen();
    /**
     * Der Controller sollte diese Methode aufrufen, wenn man sich für das Steuern von Spieler gelb
     * entschieden hat.
     */
    void drawGameGelb();
    /**
     * Der Controller sollte diese Methode aufrufen, wenn man sich für das Steuern von Spieler rot
     * entschieden hat.
     */
    void drawGameRot();
    /**
     * Der Controller sollte diese Methode aufrufen, um den Start-Knopf aufzurufen.
     */
    Button getStart();
    /**
     * Der Controller sollte diese Methode aufrufen, um den Würfeln-Knopf aufzurufen.
     */
    Button getWuerfel();
    /**
     * Der Controller sollte diese Methode aufrufen, um den Blau-Knopf aufzurufen.
     */
    Button getBlau();
    /**
     * Der Controller sollte diese Methode aufrufen, um den Grün-Knopf aufzurufen.
     */
    Button getGruen();
    /**
     * Der Controller sollte diese Methode aufrufen, um den Gelb-Knopf aufzurufen.
     */
    Button getGelb();
    /**
     * Der Controller sollte diese Methode aufrufen, um den Rot-Knopf aufzurufen.
     */
    Button getRot();
    /**
     * Der Controller sollte diese Methode aufrufen, wenn das Spiel zu Ende ist.
     */
void drawEnde();

}
