/**
 * In diesem package befinden sich alle Klassen, die zum Modell dazugehören.
 * Dies sind Figuren, Spieler, FreieFelder und die Modell-Klasse.
 * In diesen Klassen befinden sich alle Methoden und Variablen, welche man für das Spiel braucht.
 */

package model;

/**
 * Zum Erstellen der vier Figuren für die Spieler.
 * Man übergibt hier den Figuren ihre x- und y-Koordinaten.
 * Nachdem man die Figuren erstellt hat, gibt man sie den Spielern über.
 *
 * Bsp:
 * Figuren a=new Figuren(1,2,3,4,5,6,7,8,0);
 *
 * t muss 0 sein, weil es die Position anzeigt, die die Figur hat
 *
 * @author Emre Özkoc
 */
public class Figuren {
    /**
     * x-Koordinate von Figur 1
     */
   public int eins_x;
    /**
     * y-Koordinate von Figur 1
     */
   public int eins_y;
    /**
     * x-Koordinate von Figur 2
     */
   public int zwei_x;
    /**
     * y-Koordinate von Figur 2
     */
   public int zwei_y;
    /**
     * x-Koordinate von Figur 3
     */
   public int drei_x;
    /**
     * y-Koordinate von Figur 3
     */
   public int drei_y;
    /**
     * x-Koordinate von Figur 4
     */
    public int vier_x;
    /**
     * y-Koordinate von Figur 4
     */
   public int vier_y;
    /**
     * Zeigt die Position von der Figur (je nachdem welche Figur dran ist)
     */
    public int t;

    /**
     * Zum Erstellen von Figuren
     * @param eins_x x-Koordinate von Figur 1
     * @param eins_y x-Koordinate von Figur 1
     * @param zwei_x x-Koordinate von Figur 2
     * @param zwei_y x-Koordinate von Figur 2
     * @param drei_x x-Koordinate von Figur 3
     * @param drei_y x-Koordinate von Figur 3
     * @param vier_x x-Koordinate von Figur 4
     * @param vier_y x-Koordinate von Figur 4
     * @param t ist am Anfang immer 0
     */
    public Figuren(int eins_x,int eins_y,int zwei_x,int zwei_y,int drei_x,int drei_y,int vier_x,int vier_y,int t){
        this.eins_x=eins_x;
        this.eins_y=eins_y;
        this.zwei_x=zwei_x;
        this.zwei_y=zwei_y;
        this.drei_x=drei_x;
        this.drei_y=drei_y;
        this.vier_x=vier_x;
        this.vier_y=vier_y;
        this.t=t;
    }
}
