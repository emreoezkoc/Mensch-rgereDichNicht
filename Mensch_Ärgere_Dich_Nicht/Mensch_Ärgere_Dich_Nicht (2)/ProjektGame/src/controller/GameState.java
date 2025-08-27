package controller;


/**
 * Alle Spiele Status, die es im Spiel gibt.
 *
 * @author Emre Özkoc
 */
public enum GameState {
    /**
     * Der Zustand des Spiels, wo der Startbildschirm angezeigt wird.
     */
    Start,
    /**
     * Der Zustand des Spiels, wo man entscheidet, welche Farbe man haben soll.
     */
    Auswahl,
    /**
     * Der Zustand des Spiels, wo man sich für die Farbe Blau entschieden hat und die Rolle des blauen
     * Spielers einnimmt.
     */
    Blau,
    /**
     * Der Zustand des Spiels, wo man sich für die Farbe Grün entschieden hat und die Rolle des grünen
     * Spielers einnimmt.
     */
    Gruen,
    /**
     * Der Zustand des Spiels, wo man sich für die Farbe Gelb entschieden hat und die Rolle des gelben
     * Spielers einnimmt.
     */
    Gelb,
    /**
     * Der Zustand des Spiels, wo man sich für die Farbe Rot entschieden hat und die Rolle des roten
     * Spielers einnimmt.
     */
    Rot,
    /**
     * Der Zustand des Spiels, wo angezeigt wird, auf welchem Platz man sich befindet.
     */
    Ende
}
