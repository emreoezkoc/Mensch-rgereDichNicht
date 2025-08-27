/**
 * In diesem package befinden sich alle Klassen, die zum Modell dazugehören.
 * Dies sind Figuren, Spieler, FreieFelder und die Modell-Klasse.
 * In diesen Klassen befinden sich alle Methoden und Variablen, welche man für das Spiel braucht.
 */

package model;


import java.util.Random;
/**
 * Ein Modell zum Spielen von Mensch-Ärgere-Dich-Nicht.
 * Es ist nur darauf ausgelegt alleine gegen die KI zu spielen.
 * Außerdem kann es per JShell geöffnet und gespielt werden.
 *
 * Beispiel:
 * "jshell --class-path .\out\production\ProjektGame\" öffnen.
 *
 * Danach "import model.MenschAergereDichNichtModel" eingeben.
 *
 * jshell> var game = new MenschAergereDichNichtModel();
 * game ==> Neues Spiel erstellen
 *
 * jshell>game.newGame();
 * jshell>game.move(Spieler-name);
 *
 * @author Emre Özkoc
 */
public class MenschAergereDichNichtModel {
    /**
     * Das Spielbrett
     */
    public char[][] gameState;
    /**
     * Ist dafür da, dass eine zufällige Zahl gewürfelt wird.
     */
    Random wurf = new Random();
    /**
     * Die Würfelzahl
     */
    public int a;

    /**
     * Der blaue Spieler
     */
    public Spieler blau;
    /**
     * Die blauen Figuren
     */
    public Figuren blaue;
    /**
     * Der rote Spieler
     */
    public Spieler rot;
    /**
     * Die roten Figuren
     */

    public Figuren rote;
    /**
     * Der gelbe Spieler
     */
    public Spieler gelb;

    /**
     * Die gelben Figuren
     */
    private Figuren gelbe;
    /**
     * Der grüne Spieler
     */
    public Spieler gruen;
    /**
     * Die grünen Figuren
     */
    private Figuren gruene;

    /**
     * Die Felder, welche weiß angezeigt werden und zu keinen der Spieler gehören.
     */
    private FreieFelder frei;

    /**
     * Dadurch erstellen wir das Brett, die Felder, die Spieler, die Figuren und wir lassen das Feld zeichnen.
     */

    public void newGame() {
        brett();
        FreieFelder();
        print(gameState);
        System.out.println(" ");
    }

    /**
     * Das Brett wird erstellt mit den Spielern und Figuren. Danach werden die Figuren auf das Brett gesetzt.
     * Und die freien Felder und die Felder, welche nicht besetzt werden können erhalten die Zahl 0.
     */
    public void brett(){
    gameState = new char[11][11];
    Spieler();
    Figuren();
    for (int i = 0; i < gameState.length; i++) {
        for (int j = 0; j < gameState[i].length; j++) {
            gameState[i][j]='0';

        }
    }
    gameState[blau.a.eins_x][blau.a.eins_y]='F';
    gameState[blau.a.zwei_x][blau.a.zwei_y]='F';
    gameState[blau.a.drei_x][blau.a.drei_y]='F';
    gameState[blau.a.vier_x][blau.a.vier_y]='F';

    gameState[gruen.a.eins_x][gruen.a.eins_y]='F';
    gameState[gruen.a.zwei_x][gruen.a.zwei_y]='F';
    gameState[gruen.a.drei_x][gruen.a.drei_y]='F';
    gameState[gruen.a.vier_x][gruen.a.vier_y]='F';

    gameState[gelb.a.eins_x][gelb.a.eins_y]='F';
    gameState[gelb.a.zwei_x][gelb.a.zwei_y]='F';
    gameState[gelb.a.drei_x][gelb.a.drei_y]='F';
    gameState[gelb.a.vier_x][gelb.a.vier_y]='F';

    gameState[rot.a.eins_x][rot.a.eins_y]='F';
    gameState[rot.a.zwei_x][rot.a.zwei_y]='F';
    gameState[rot.a.drei_x][rot.a.drei_y]='F';
    gameState[rot.a.vier_x][rot.a.vier_y]='F';
}

    /**
     * Hier werden alle Spieler erstellt.
     */

    public void Spieler() {
        blau = new Spieler(0, 6, 0, 9, 0, 10, 1, 9, 1, 10, 4, 5, 3, 5, 2, 5, 1, 5, blaue, 0);
        rot = new Spieler(4, 0, 0, 0, 0, 1, 1, 0, 1, 1, 5, 4, 5, 3, 5, 2, 5, 1, rote, 0);
        gelb = new Spieler(10, 4, 9, 0, 9, 1, 10, 0, 10, 1, 6, 5, 7, 5, 8, 5, 9, 5, gelbe, 0);
        gruen = new Spieler(6, 10, 9, 9, 9, 10, 10, 9, 10, 10, 5, 6, 5, 7, 5, 8, 5, 9, gruene, 0);
    }

    /**
     * Hier werden alle Figuren erstellt.
     */
    public void Figuren() {

        blaue = new Figuren(blau.Haus_1_x, blau.Haus_1_y, blau.Haus_2_x, blau.Haus_2_y, blau.Haus_3_x, blau.Haus_3_y, blau.Haus_4_x, blau.Haus_4_y, 0);
        rote = new Figuren(rot.Haus_1_x, rot.Haus_1_y, rot.Haus_2_x, rot.Haus_2_y, rot.Haus_3_x, rot.Haus_3_y, rot.Haus_4_x, rot.Haus_4_y, 0);
        gelbe = new Figuren(gelb.Haus_1_x, gelb.Haus_1_y, gelb.Haus_2_x, gelb.Haus_2_y, gelb.Haus_3_x, gelb.Haus_3_y, gelb.Haus_4_x, gelb.Haus_4_y, 0);
        gruene = new Figuren(gruen.Haus_1_x, gruen.Haus_1_y, gruen.Haus_2_x, gruen.Haus_2_y, gruen.Haus_3_x, gruen.Haus_3_y, gruen.Haus_4_x, gruen.Haus_4_y, 0);
        Spieler();
    }

    /**
     * Hier werden alle freien Felder erstellt.
     */
    public void FreieFelder() {
        frei = new FreieFelder(1, 6, 2, 6, 3, 6, 4, 6, 4, 7, 4, 8, 4, 9, 4, 10, 5, 10, 6, 9, 6, 8, 6, 7, 6, 6, 7, 6, 8, 6, 9, 6, 10, 6, 10, 5, 9, 4, 8, 4, 7, 4, 6, 4, 6, 3, 6, 2, 6, 1, 6, 0, 5, 0, 4, 1, 4, 2, 4, 3, 4, 4, 3, 4, 2, 4, 1, 4, 0, 4, 0, 5);
    }

    /**
     * Die Methode zum Würfeln. Es wird eine Zahl zwischen 1 und 6 gewürfelt.
     */

    public void wuerfeln() {
        a = wurf.nextInt(6);
        a = a + 1;

        System.out.println("DU HAST EINE " + a + " GEWÜRFELT.");
    }

    /**
     * Diese Methode zeichnet das gegebene Brett.
     * @param gameState Brett
     */

    public void print(char[][] gameState) {
        for (int i = 0; i < gameState.length; i++) {
            for (int j = 0; j < gameState[i].length; j++) {
                System.out.printf(gameState[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Hier wird überprüft, ob eine 6 gewürfelt wurde. Wenn ja, kommt die Figur raus, ansonsten bleibt sie im Haus.
     * @param x der Spieler, bei dem es überprüft wird.
     */
    public void raus(Spieler x) {

        if (a == 6) {
            if (x.Start_x == blau.Start_x && x.Start_y == blau.Start_y) {
                x.a.t = 1;
            }
            if (x.Start_x == gruen.Start_x && x.Start_y == gruen.Start_y) {
                x.a.t = 11;
            }
            if (x.Start_x == gelb.Start_x && x.Start_y == gelb.Start_y) {
                x.a.t = 21;
            }
            if (x.Start_x == rot.Start_x && x.Start_y == rot.Start_y) {
                x.a.t = 31;
            }
            if (x.a.eins_x != x.Ende_1_x | x.a.eins_y != x.Ende_1_y) {
                gameState[x.a.eins_x][x.a.eins_y] = '0';
                x.a.eins_x = x.Start_x;
                x.a.eins_y = x.Start_y;
                gameState[x.a.eins_x][x.a.eins_y] = 'F';
                System.out.println("Koordinate für Figur 1");
            } else if (x.a.zwei_x != x.Ende_2_x | x.a.zwei_y != x.Ende_2_y) {
                gameState[x.a.zwei_x][x.a.zwei_y] = '0';
                x.a.zwei_y = x.Start_y;
                x.a.zwei_x = x.Start_x;
                gameState[x.a.zwei_x][x.a.zwei_y] = 'F';
                System.out.println("Koordinate für Figur 2");
            } else if (x.a.drei_x != x.Ende_3_x | x.a.drei_y != x.Ende_3_y) {
                gameState[x.a.drei_x][x.a.drei_y] = '0';
                x.a.drei_x = x.Start_x;
                x.a.drei_y = x.Start_y;
                gameState[x.a.drei_x][x.a.drei_y] = 'F';
                System.out.println("Koordinate für Figur 3");
            } else if (x.a.vier_x != x.Ende_4_x | x.a.vier_y != x.Ende_4_y) {
                gameState[x.a.vier_x][x.a.vier_y] = '0';
                x.a.vier_x = x.Start_x;
                x.a.vier_y = x.Start_y;
                gameState[x.a.vier_x][x.a.vier_y] = 'F';
                System.out.println("Koordinate für Figur 4");
            }

        }


    }

    /**
     * Hier wird die Figur der Spieler bewegt. Wenn eine Figur draußen ist dann wird es bewegt, wenn es aber im Haus ist,
     * wird die Methode raus() verwendet.
     * @param d der Spieler bei dem es ausgeführt wird.
     */
    public void move(Spieler d) {


        if ((d.a.eins_x != d.Haus_1_x | d.a.eins_y != d.Haus_1_y) && (d.a.eins_x != d.Ende_1_x | d.a.eins_y != d.Ende_1_y)) {
            System.out.println("Figur 1");
            gameState[d.a.eins_x][d.a.eins_y] = '0';
            wuerfeln();
            bewegen(d);
            gameState[d.a.eins_x][d.a.eins_y] = 'F';

        } else if ((d.a.zwei_x != d.Haus_2_x | d.a.zwei_y != d.Haus_2_y) && (d.a.zwei_x != d.Ende_2_x | d.a.zwei_y != d.Ende_2_y)) {
            System.out.println("Figur 2");
            gameState[d.a.zwei_x][d.a.zwei_y] = '0';
            wuerfeln();
            bewegen(d);
            gameState[d.a.zwei_x][d.a.zwei_y] = 'F';

        } else if ((d.a.drei_x != d.Haus_3_x | d.a.drei_y != d.Haus_3_y) && (d.a.drei_x != d.Ende_3_x | d.a.drei_y != d.Ende_3_y)) {
            System.out.println("Figur 3");
            gameState[d.a.drei_x][d.a.drei_y] = '0';
            wuerfeln();
            bewegen(d);
            gameState[d.a.drei_x][d.a.drei_y] = 'F';

        } else if ((d.a.vier_x != d.Haus_4_x | d.a.vier_y != d.Haus_4_y) && (d.a.vier_x != d.Ende_4_x | d.a.vier_y != d.Ende_4_y)) {
            System.out.println("Figur 4");
            gameState[d.a.vier_x][d.a.vier_y] = '0';
            wuerfeln();
            bewegen(d);
            gameState[d.a.vier_x][d.a.vier_y] = 'F';
        } else if(d.a.t==0) {
            wuerfeln();
            raus(d);
        }

        print(gameState);
    }

    /**
     * Hier ändert sich die Position der Figuren, indem die Würfelzahl zu der Position addiert wird und
     * je nachdem welche Zahl man hat ändert sich die Position
     * @param r der Spieler bei dem die Methode angewendet wird.
     */
    public void bewegen(Spieler r) {
        if (r.a.t <= -1) {
            r.a.t = r.a.t - a;
        } else {
            r.a.t = r.a.t + a;
        }



            if (r.a.t == 1) {
                if (r.a.eins_x != r.Ende_1_x | r.a.eins_y != r.Ende_1_y) {
                    r.a.eins_x=blau.Start_x;
                    r.a.eins_y=blau.Start_y;
                } else if (r.a.zwei_x != r.Ende_2_x | r.a.zwei_y != r.Ende_2_y) {
                    r.a.zwei_x=blau.Start_x;
                    r.a.zwei_y=blau.Start_y;
                } else if (r.a.drei_x != r.Ende_3_x | r.a.drei_y != r.Ende_3_y) {
                    r.a.drei_x=blau.Start_x;
                    r.a.drei_y=blau.Start_y;
                } else if (r.a.vier_x != r.Ende_4_x | r.a.vier_y != r.Ende_4_y) {
                    r.a.vier_x=blau.Start_x;
                    r.a.vier_y=blau.Start_y;
                }
            }

            if (r.a.t == 2) {
                if (r.a.eins_x != r.Ende_1_x | r.a.eins_y != r.Ende_1_y) {
                    r.a.eins_x=frei.blauEins_x;
                    r.a.eins_y=frei.blauEins_y;
                } else if (r.a.zwei_x != r.Ende_2_x | r.a.zwei_y != r.Ende_2_y) {
                    r.a.zwei_x=frei.blauEins_x;
                    r.a.zwei_y=frei.blauEins_y;
                } else if (r.a.drei_x != r.Ende_3_x | r.a.drei_y != r.Ende_3_y) {
                    r.a.drei_x=frei.blauEins_x;
                    r.a.drei_y=frei.blauEins_y;
                } else if (r.a.vier_x != r.Ende_4_x | r.a.vier_y != r.Ende_4_y) {
                    r.a.vier_x=frei.blauEins_x;
                    r.a.vier_y=frei.blauEins_y;
                }

            }
            if (r.a.t == 3) {
                if (r.a.eins_x != r.Ende_1_x | r.a.eins_y != r.Ende_1_y) {
                    r.a.eins_x=frei.blauZwei_x;
                    r.a.eins_y=frei.blauZwei_y;
                } else if (r.a.zwei_x != r.Ende_2_x | r.a.zwei_y != r.Ende_2_y) {
                    r.a.zwei_x=frei.blauZwei_x;
                    r.a.zwei_y=frei.blauZwei_y;
                } else if (r.a.drei_x != r.Ende_3_x | r.a.drei_y != r.Ende_3_y) {
                    r.a.drei_x=frei.blauZwei_x;
                    r.a.drei_y=frei.blauZwei_y;
                } else if (r.a.vier_x != r.Ende_4_x | r.a.vier_y != r.Ende_4_y) {
                    r.a.vier_x=frei.blauZwei_x;
                    r.a.vier_y=frei.blauZwei_y;
                }
            }
            if (r.a.t == 4) {
                if (r.a.eins_x != r.Ende_1_x | r.a.eins_y != r.Ende_1_y) {
                    r.a.eins_x=frei.blauDrei_x;
                    r.a.eins_y=frei.blauDrei_y;
                } else if (r.a.zwei_x != r.Ende_2_x | r.a.zwei_y != r.Ende_2_y) {
                    r.a.zwei_x=frei.blauDrei_x;
                    r.a.zwei_y=frei.blauDrei_y;
                } else if (r.a.drei_x != r.Ende_3_x | r.a.drei_y != r.Ende_3_y) {
                    r.a.drei_x=frei.blauDrei_x;
                    r.a.drei_y=frei.blauDrei_y;
                } else if (r.a.vier_x != r.Ende_4_x | r.a.vier_y != r.Ende_4_y) {
                    r.a.vier_x=frei.blauDrei_x;
                    r.a.vier_y=frei.blauDrei_y;
                }
            }
            if (r.a.t == 5) {
                if (r.a.eins_x != r.Ende_1_x | r.a.eins_y != r.Ende_1_y) {
                    r.a.eins_x=frei.blauVier_x;
                    r.a.eins_y=frei.blauVier_y;
                } else if (r.a.zwei_x != r.Ende_2_x | r.a.zwei_y != r.Ende_2_y) {
                    r.a.zwei_x=frei.blauVier_x;
                    r.a.zwei_y=frei.blauVier_y;
                } else if (r.a.drei_x != r.Ende_3_x | r.a.drei_y != r.Ende_3_y) {
                    r.a.drei_x=frei.blauVier_x;
                    r.a.drei_y=frei.blauVier_y;
                } else if (r.a.vier_x != r.Ende_4_x | r.a.vier_y != r.Ende_4_y) {
                    r.a.vier_x=frei.blauVier_x;
                    r.a.vier_y=frei.blauVier_y;
                }
            }
            if (r.a.t == 6) {
                if (r.a.eins_x != r.Ende_1_x | r.a.eins_y != r.Ende_1_y) {
                    r.a.eins_x=frei.blauFuenf_x;
                    r.a.eins_y=frei.blauFuenf_y;
                } else if (r.a.zwei_x != r.Ende_2_x | r.a.zwei_y != r.Ende_2_y) {
                    r.a.zwei_x=frei.blauFuenf_x;
                    r.a.zwei_y=frei.blauFuenf_y;
                } else if (r.a.drei_x != r.Ende_3_x | r.a.drei_y != r.Ende_3_y) {
                    r.a.drei_x=frei.blauFuenf_x;
                    r.a.drei_y=frei.blauFuenf_y;
                } else if (r.a.vier_x != r.Ende_4_x | r.a.vier_y != r.Ende_4_y) {
                    r.a.vier_x=frei.blauFuenf_x;
                    r.a.vier_y=frei.blauFuenf_y;
                }
            }
            if (r.a.t == 7) {
                if (r.a.eins_x != r.Ende_1_x | r.a.eins_y != r.Ende_1_y) {
                    r.a.eins_x=frei.blauSechs_x;
                    r.a.eins_y=frei.blauSechs_y;
                } else if (r.a.zwei_x != r.Ende_2_x | r.a.zwei_y != r.Ende_2_y) {
                    r.a.zwei_x=frei.blauSechs_x;
                    r.a.zwei_y=frei.blauSechs_y;
                } else if (r.a.drei_x != r.Ende_3_x | r.a.drei_y != r.Ende_3_y) {
                    r.a.drei_x=frei.blauSechs_x;
                    r.a.drei_y=frei.blauSechs_y;
                } else if (r.a.vier_x != r.Ende_4_x | r.a.vier_y != r.Ende_4_y) {
                    r.a.vier_x=frei.blauSechs_x;
                    r.a.vier_y=frei.blauSechs_y;
                }
            }
            if (r.a.t == 8) {
                if (r.a.eins_x != r.Ende_1_x | r.a.eins_y != r.Ende_1_y) {
                    r.a.eins_x=frei.blauSieben_x;
                    r.a.eins_y=frei.blauSieben_y;
                } else if (r.a.zwei_x != r.Ende_2_x | r.a.zwei_y != r.Ende_2_y) {
                    r.a.zwei_x=frei.blauSieben_x;
                    r.a.zwei_y=frei.blauSieben_y;
                } else if (r.a.drei_x != r.Ende_3_x | r.a.drei_y != r.Ende_3_y) {
                    r.a.drei_x=frei.blauSieben_x;
                    r.a.drei_y=frei.blauSieben_y;
                } else if (r.a.vier_x != r.Ende_4_x | r.a.vier_y != r.Ende_4_y) {
                    r.a.vier_x=frei.blauSieben_x;
                    r.a.vier_y=frei.blauSieben_y;
                }
            }
            if (r.a.t == 9) {
                if (r.a.eins_x != r.Ende_1_x | r.a.eins_y != r.Ende_1_y) {
                    r.a.eins_x=frei.blauAcht_x;
                    r.a.eins_y=frei.blauAcht_y;
                } else if (r.a.zwei_x != r.Ende_2_x | r.a.zwei_y != r.Ende_2_y) {
                    r.a.zwei_x=frei.blauAcht_x;
                    r.a.zwei_y=frei.blauAcht_y;
                } else if (r.a.drei_x != r.Ende_3_x | r.a.drei_y != r.Ende_3_y) {
                    r.a.drei_x=frei.blauAcht_x;
                    r.a.drei_y=frei.blauAcht_y;
                } else if (r.a.vier_x != r.Ende_4_x | r.a.vier_y != r.Ende_4_y) {
                    r.a.vier_x=frei.blauAcht_x;
                    r.a.vier_y=frei.blauAcht_y;
                }
            }
            if (r.a.t == 10) {
                if (r.a.eins_x != r.Ende_1_x | r.a.eins_y != r.Ende_1_y) {
                    r.a.eins_x=frei.blauNeun_x;
                    r.a.eins_y=frei.blauNeun_y;
                } else if (r.a.zwei_x != r.Ende_2_x | r.a.zwei_y != r.Ende_2_y) {
                    r.a.zwei_x=frei.blauNeun_x;
                    r.a.zwei_y=frei.blauNeun_y;
                } else if (r.a.drei_x != r.Ende_3_x | r.a.drei_y != r.Ende_3_y) {
                    r.a.drei_x=frei.blauNeun_x;
                    r.a.drei_y=frei.blauNeun_y;
                } else if (r.a.vier_x != r.Ende_4_x | r.a.vier_y != r.Ende_4_y) {
                    r.a.vier_x=frei.blauNeun_x;
                    r.a.vier_y=frei.blauNeun_y;
                }
            }
            if (r.a.t == 11) {
                if (r.a.eins_x != r.Ende_1_x | r.a.eins_y != r.Ende_1_y) {
                    r.a.eins_x=gruen.Start_x;
                    r.a.eins_y=gruen.Start_y;
                } else if (r.a.zwei_x != r.Ende_2_x | r.a.zwei_y != r.Ende_2_y) {
                    r.a.zwei_x=gruen.Start_x;
                    r.a.zwei_y=gruen.Start_y;
                } else if (r.a.drei_x != r.Ende_3_x | r.a.drei_y != r.Ende_3_y) {
                    r.a.drei_x=gruen.Start_x;
                    r.a.drei_y=gruen.Start_y;
                } else if (r.a.vier_x != r.Ende_4_x | r.a.vier_y != r.Ende_4_y) {
                    r.a.vier_x=gruen.Start_x;
                    r.a.vier_y=gruen.Start_y;
                }
            }
            if (r.a.t == 12) {
                if (r.a.eins_x != r.Ende_1_x | r.a.eins_y != r.Ende_1_y) {
                    r.a.eins_x=frei.gruenEins_x;
                    r.a.eins_y=frei.gruenEins_y;
                } else if (r.a.zwei_x != r.Ende_2_x | r.a.zwei_y != r.Ende_2_y) {
                    r.a.zwei_x=frei.gruenEins_x;
                    r.a.zwei_y=frei.gruenEins_y;
                } else if (r.a.drei_x != r.Ende_3_x | r.a.drei_y != r.Ende_3_y) {
                    r.a.drei_x=frei.gruenEins_x;
                    r.a.drei_y=frei.gruenEins_y;
                } else if (r.a.vier_x != r.Ende_4_x | r.a.vier_y != r.Ende_4_y) {
                    r.a.vier_x=frei.gruenEins_x;
                    r.a.vier_y=frei.gruenEins_y;
                }

            }
            if (r.a.t == 13) {
                if (r.a.eins_x != r.Ende_1_x | r.a.eins_y != r.Ende_1_y) {
                    r.a.eins_x=frei.gruenZwei_x;
                    r.a.eins_y=frei.gruenZwei_y;
                } else if (r.a.zwei_x != r.Ende_2_x | r.a.zwei_y != r.Ende_2_y) {
                    r.a.zwei_x=frei.gruenZwei_x;
                    r.a.zwei_y=frei.gruenZwei_y;
                } else if (r.a.drei_x != r.Ende_3_x | r.a.drei_y != r.Ende_3_y) {
                    r.a.drei_x=frei.gruenZwei_x;
                    r.a.drei_y=frei.gruenZwei_y;
                } else if (r.a.vier_x != r.Ende_4_x | r.a.vier_y != r.Ende_4_y) {
                    r.a.vier_x=frei.gruenZwei_x;
                    r.a.vier_y=frei.gruenZwei_y;
                }
            }
            if (r.a.t == 14) {
                if (r.a.eins_x != r.Ende_1_x | r.a.eins_y != r.Ende_1_y) {
                    r.a.eins_x=frei.gruenDrei_x;
                    r.a.eins_y=frei.gruenDrei_y;
                } else if (r.a.zwei_x != r.Ende_2_x | r.a.zwei_y != r.Ende_2_y) {
                    r.a.zwei_x=frei.gruenDrei_x;
                    r.a.zwei_y=frei.gruenDrei_y;
                } else if (r.a.drei_x != r.Ende_3_x | r.a.drei_y != r.Ende_3_y) {
                    r.a.drei_x=frei.gruenDrei_x;
                    r.a.drei_y=frei.gruenDrei_y;
                } else if (r.a.vier_x != r.Ende_4_x | r.a.vier_y != r.Ende_4_y) {
                    r.a.vier_x=frei.gruenDrei_x;
                    r.a.vier_y=frei.gruenDrei_y;
                }
            }
            if (r.a.t == 15) {
                if (r.a.eins_x != r.Ende_1_x | r.a.eins_y != r.Ende_1_y) {
                    r.a.eins_x=frei.gruenVier_x;
                    r.a.eins_y=frei.gruenVier_y;
                } else if (r.a.zwei_x != r.Ende_2_x | r.a.zwei_y != r.Ende_2_y) {
                    r.a.zwei_x=frei.gruenVier_x;
                    r.a.zwei_y=frei.gruenVier_y;
                } else if (r.a.drei_x != r.Ende_3_x | r.a.drei_y != r.Ende_3_y) {
                    r.a.drei_x=frei.gruenVier_x;
                    r.a.drei_y=frei.gruenVier_y;
                } else if (r.a.vier_x != r.Ende_4_x | r.a.vier_y != r.Ende_4_y) {
                    r.a.vier_x=frei.gruenVier_x;
                    r.a.vier_y=frei.gruenVier_y;
                }
            }
            if (r.a.t == 16) {
                if (r.a.eins_x != r.Ende_1_x | r.a.eins_y != r.Ende_1_y) {
                    r.a.eins_x=frei.gruenFuenf_x;
                    r.a.eins_y=frei.gruenFuenf_y;
                } else if (r.a.zwei_x != r.Ende_2_x | r.a.zwei_y != r.Ende_2_y) {
                    r.a.zwei_x=frei.gruenFuenf_x;
                    r.a.zwei_y=frei.gruenFuenf_y;
                } else if (r.a.drei_x != r.Ende_3_x | r.a.drei_y != r.Ende_3_y) {
                    r.a.drei_x=frei.gruenFuenf_x;
                    r.a.drei_y=frei.gruenFuenf_y;
                } else if (r.a.vier_x != r.Ende_4_x | r.a.vier_y != r.Ende_4_y) {
                    r.a.vier_x=frei.gruenFuenf_x;
                    r.a.vier_y=frei.gruenFuenf_y;
                }
            }
            if (r.a.t == 17) {
                if (r.a.eins_x != r.Ende_1_x | r.a.eins_y != r.Ende_1_y) {
                    r.a.eins_x=frei.gruenSechs_x;
                    r.a.eins_y=frei.gruenSechs_y;
                } else if (r.a.zwei_x != r.Ende_2_x | r.a.zwei_y != r.Ende_2_y) {
                    r.a.zwei_x=frei.gruenSechs_x;
                    r.a.zwei_y=frei.gruenSechs_y;
                } else if (r.a.drei_x != r.Ende_3_x | r.a.drei_y != r.Ende_3_y) {
                    r.a.drei_x=frei.gruenSechs_x;
                    r.a.drei_y=frei.gruenSechs_y;
                } else if (r.a.vier_x != r.Ende_4_x | r.a.vier_y != r.Ende_4_y) {
                    r.a.vier_x=frei.gruenSechs_x;
                    r.a.vier_y=frei.gruenSechs_y;
                }
            }
            if (r.a.t == 18) {
                if (r.a.eins_x != r.Ende_1_x | r.a.eins_y != r.Ende_1_y) {
                    r.a.eins_x=frei.gruenSieben_x;
                    r.a.eins_y=frei.gruenSieben_y;
                } else if (r.a.zwei_x != r.Ende_2_x | r.a.zwei_y != r.Ende_2_y) {
                    r.a.zwei_x=frei.gruenSieben_x;
                    r.a.zwei_y=frei.gruenSieben_y;
                } else if (r.a.drei_x != r.Ende_3_x | r.a.drei_y != r.Ende_3_y) {
                    r.a.drei_x=frei.gruenSieben_x;
                    r.a.drei_y=frei.gruenSieben_y;
                } else if (r.a.vier_x != r.Ende_4_x | r.a.vier_y != r.Ende_4_y) {
                    r.a.vier_x=frei.gruenSieben_x;
                    r.a.vier_y=frei.gruenSieben_y;
                }
            }
            if (r.a.t == 19) {
                if (r.a.eins_x != r.Ende_1_x | r.a.eins_y != r.Ende_1_y) {
                    r.a.eins_x=frei.gruenAcht_x;
                    r.a.eins_y=frei.gruenAcht_y;
                } else if (r.a.zwei_x != r.Ende_2_x | r.a.zwei_y != r.Ende_2_y) {
                    r.a.zwei_x=frei.gruenAcht_x;
                    r.a.zwei_y=frei.gruenAcht_y;
                } else if (r.a.drei_x != r.Ende_3_x | r.a.drei_y != r.Ende_3_y) {
                    r.a.drei_x=frei.gruenAcht_x;
                    r.a.drei_y=frei.gruenAcht_y;
                } else if (r.a.vier_x != r.Ende_4_x | r.a.vier_y != r.Ende_4_y) {
                    r.a.vier_x=frei.gruenAcht_x;
                    r.a.vier_y=frei.gruenAcht_y;
                }
            }
            if (r.a.t == 20) {
                if (r.a.eins_x != r.Ende_1_x | r.a.eins_y != r.Ende_1_y) {
                    r.a.eins_x=frei.gruenNeun_x;
                    r.a.eins_y=frei.gruenNeun_y;
                } else if (r.a.zwei_x != r.Ende_2_x | r.a.zwei_y != r.Ende_2_y) {
                    r.a.zwei_x=frei.gruenNeun_x;
                    r.a.zwei_y=frei.gruenNeun_y;
                } else if (r.a.drei_x != r.Ende_3_x | r.a.drei_y != r.Ende_3_y) {
                    r.a.drei_x=frei.gruenNeun_x;
                    r.a.drei_y=frei.gruenNeun_y;
                } else if (r.a.vier_x != r.Ende_4_x | r.a.vier_y != r.Ende_4_y) {
                    r.a.vier_x=frei.gruenNeun_x;
                    r.a.vier_y=frei.gruenNeun_y;
                }
            }
            if (r.a.t == 21) {
                if (r.a.eins_x != r.Ende_1_x | r.a.eins_y != r.Ende_1_y) {
                    r.a.eins_x=gelb.Start_x;
                    r.a.eins_y=gelb.Start_y;
                } else if (r.a.zwei_x != r.Ende_2_x | r.a.zwei_y != r.Ende_2_y) {
                    r.a.zwei_x=gelb.Start_x;
                    r.a.zwei_y=gelb.Start_y;
                } else if (r.a.drei_x != r.Ende_3_x | r.a.drei_y != r.Ende_3_y) {
                    r.a.drei_x=gelb.Start_x;
                    r.a.drei_y=gelb.Start_y;
                } else if (r.a.vier_x != r.Ende_4_x | r.a.vier_y != r.Ende_4_y) {
                    r.a.vier_x=gelb.Start_x;
                    r.a.vier_y=gelb.Start_y;
                }
            }
            if (r.a.t == 22) {
                if (r.a.eins_x != r.Ende_1_x | r.a.eins_y != r.Ende_1_y) {
                    r.a.eins_x=frei.gelbEins_x;
                    r.a.eins_y=frei.gelbEins_y;
                } else if (r.a.zwei_x != r.Ende_2_x | r.a.zwei_y != r.Ende_2_y) {
                    r.a.zwei_x=frei.gelbEins_x;
                    r.a.zwei_y=frei.gelbEins_y;
                } else if (r.a.drei_x != r.Ende_3_x | r.a.drei_y != r.Ende_3_y) {
                    r.a.drei_x=frei.gelbEins_x;
                    r.a.drei_y=frei.gelbEins_y;
                } else if (r.a.vier_x != r.Ende_4_x | r.a.vier_y != r.Ende_4_y) {
                    r.a.vier_x=frei.gelbEins_x;
                    r.a.vier_y=frei.gelbEins_y;
                }

            }
            if (r.a.t == 23) {
                if (r.a.eins_x != r.Ende_1_x | r.a.eins_y != r.Ende_1_y) {
                    r.a.eins_x=frei.gelbZwei_x;
                    r.a.eins_y=frei.gelbZwei_y;
                } else if (r.a.zwei_x != r.Ende_2_x | r.a.zwei_y != r.Ende_2_y) {
                    r.a.zwei_x=frei.gelbZwei_x;
                    r.a.zwei_y=frei.gelbZwei_y;
                } else if (r.a.drei_x != r.Ende_3_x | r.a.drei_y != r.Ende_3_y) {
                    r.a.drei_x=frei.gelbZwei_x;
                    r.a.drei_y=frei.gelbZwei_y;
                } else if (r.a.vier_x != r.Ende_4_x | r.a.vier_y != r.Ende_4_y) {
                    r.a.vier_x=frei.gelbZwei_x;
                    r.a.vier_y=frei.gelbZwei_y;
                }
            }
            if (r.a.t == 24) {
                if (r.a.eins_x != r.Ende_1_x | r.a.eins_y != r.Ende_1_y) {
                    r.a.eins_x=frei.gelbDrei_x;
                    r.a.eins_y=frei.gelbDrei_y;
                } else if (r.a.zwei_x != r.Ende_2_x | r.a.zwei_y != r.Ende_2_y) {
                    r.a.zwei_x=frei.gelbDrei_x;
                    r.a.zwei_y=frei.gelbDrei_y;
                } else if (r.a.drei_x != r.Ende_3_x | r.a.drei_y != r.Ende_3_y) {
                    r.a.drei_x=frei.gelbDrei_x;
                    r.a.drei_y=frei.gelbDrei_y;
                } else if (r.a.vier_x != r.Ende_4_x | r.a.vier_y != r.Ende_4_y) {
                    r.a.vier_x=frei.gelbDrei_x;
                    r.a.vier_y=frei.gelbDrei_y;
                }
            }
            if (r.a.t == 25) {
                if (r.a.eins_x != r.Ende_1_x | r.a.eins_y != r.Ende_1_y) {
                    r.a.eins_x=frei.gelbVier_x;
                    r.a.eins_y=frei.gelbVier_y;
                } else if (r.a.zwei_x != r.Ende_2_x | r.a.zwei_y != r.Ende_2_y) {
                    r.a.zwei_x=frei.gelbVier_x;
                    r.a.zwei_y=frei.gelbVier_y;
                } else if (r.a.drei_x != r.Ende_3_x | r.a.drei_y != r.Ende_3_y) {
                    r.a.drei_x=frei.gelbVier_x;
                    r.a.drei_y=frei.gelbVier_y;
                } else if (r.a.vier_x != r.Ende_4_x | r.a.vier_y != r.Ende_4_y) {
                    r.a.vier_x=frei.gelbVier_x;
                    r.a.vier_y=frei.gelbVier_y;
                }
            }
            if (r.a.t == 26) {
                if (r.a.eins_x != r.Ende_1_x | r.a.eins_y != r.Ende_1_y) {
                    r.a.eins_x=frei.gelbFuenf_x;
                    r.a.eins_y=frei.gelbFuenf_y;
                } else if (r.a.zwei_x != r.Ende_2_x | r.a.zwei_y != r.Ende_2_y) {
                    r.a.zwei_x=frei.gelbFuenf_x;
                    r.a.zwei_y=frei.gelbFuenf_y;
                } else if (r.a.drei_x != r.Ende_3_x | r.a.drei_y != r.Ende_3_y) {
                    r.a.drei_x=frei.gelbFuenf_x;
                    r.a.drei_y=frei.gelbFuenf_y;
                } else if (r.a.vier_x != r.Ende_4_x | r.a.vier_y != r.Ende_4_y) {
                    r.a.vier_x=frei.gelbFuenf_x;
                    r.a.vier_y=frei.gelbFuenf_y;
                }
            }
            if (r.a.t == 27) {
                if (r.a.eins_x != r.Ende_1_x | r.a.eins_y != r.Ende_1_y) {
                    r.a.eins_x=frei.gelbSechs_x;
                    r.a.eins_y=frei.gelbSechs_y;
                } else if (r.a.zwei_x != r.Ende_2_x | r.a.zwei_y != r.Ende_2_y) {
                    r.a.zwei_x=frei.gelbSechs_x;
                    r.a.zwei_y=frei.gelbSechs_y;
                } else if (r.a.drei_x != r.Ende_3_x | r.a.drei_y != r.Ende_3_y) {
                    r.a.drei_x=frei.gelbSechs_x;
                    r.a.drei_y=frei.gelbSechs_y;
                } else if (r.a.vier_x != r.Ende_4_x | r.a.vier_y != r.Ende_4_y) {
                    r.a.vier_x=frei.gelbSechs_x;
                    r.a.vier_y=frei.gelbSechs_y;
                }
            }
            if (r.a.t == 28) {
                if (r.a.eins_x != r.Ende_1_x | r.a.eins_y != r.Ende_1_y) {
                    r.a.eins_x=frei.rotSieben_x;
                    r.a.eins_y=frei.rotSieben_y;
                } else if (r.a.zwei_x != r.Ende_2_x | r.a.zwei_y != r.Ende_2_y) {
                    r.a.zwei_x=frei.rotSieben_x;
                    r.a.zwei_y=frei.rotSieben_y;
                } else if (r.a.drei_x != r.Ende_3_x | r.a.drei_y != r.Ende_3_y) {
                    r.a.drei_x=frei.rotSieben_x;
                    r.a.drei_y=frei.rotSieben_y;
                } else if (r.a.vier_x != r.Ende_4_x | r.a.vier_y != r.Ende_4_y) {
                    r.a.vier_x=frei.rotSieben_x;
                    r.a.vier_y=frei.rotSieben_y;
                }
            }
            if (r.a.t == 29) {
                if (r.a.eins_x != r.Ende_1_x | r.a.eins_y != r.Ende_1_y) {
                    r.a.eins_x=frei.gelbAcht_x;
                    r.a.eins_y=frei.gelbAcht_y;
                } else if (r.a.zwei_x != r.Ende_2_x | r.a.zwei_y != r.Ende_2_y) {
                    r.a.zwei_x=frei.gelbAcht_x;
                    r.a.zwei_y=frei.gelbAcht_y;
                } else if (r.a.drei_x != r.Ende_3_x | r.a.drei_y != r.Ende_3_y) {
                    r.a.drei_x=frei.gelbAcht_x;
                    r.a.drei_y=frei.gelbAcht_y;
                } else if (r.a.vier_x != r.Ende_4_x | r.a.vier_y != r.Ende_4_y) {
                    r.a.vier_x=frei.gelbAcht_x;
                    r.a.vier_y=frei.gelbAcht_y;
                }
            }
            if (r.a.t == 30) {
                if (r.a.eins_x != r.Ende_1_x | r.a.eins_y != r.Ende_1_y) {
                    r.a.eins_x=frei.gelbNeun_x;
                    r.a.eins_y=frei.gelbNeun_y;
                } else if (r.a.zwei_x != r.Ende_2_x | r.a.zwei_y != r.Ende_2_y) {
                    r.a.zwei_x=frei.gelbNeun_x;
                    r.a.zwei_y=frei.gelbNeun_y;
                } else if (r.a.drei_x != r.Ende_3_x | r.a.drei_y != r.Ende_3_y) {
                    r.a.drei_x=frei.gelbNeun_x;
                    r.a.drei_y=frei.gelbNeun_y;
                } else if (r.a.vier_x != r.Ende_4_x | r.a.vier_y != r.Ende_4_y) {
                    r.a.vier_x=frei.gelbNeun_x;
                    r.a.vier_y=frei.gelbNeun_y;
                }
            }
            if (r.a.t == 31) {
                if (r.a.eins_x != r.Ende_1_x | r.a.eins_y != r.Ende_1_y) {
                    r.a.eins_x=rot.Start_x;
                    r.a.eins_y=rot.Start_y;
                } else if (r.a.zwei_x != r.Ende_2_x | r.a.zwei_y != r.Ende_2_y) {
                    r.a.zwei_x=rot.Start_x;
                    r.a.zwei_y=rot.Start_y;
                } else if (r.a.drei_x != r.Ende_3_x | r.a.drei_y != r.Ende_3_y) {
                    r.a.drei_x=rot.Start_x;
                    r.a.drei_y=rot.Start_y;
                } else if (r.a.vier_x != r.Ende_4_x | r.a.vier_y != r.Ende_4_y) {
                    r.a.vier_x=rot.Start_x;
                    r.a.vier_y=rot.Start_y;
                }

            }
            if (r.a.t == 32) {
                if (r.a.eins_x != r.Ende_1_x | r.a.eins_y != r.Ende_1_y) {
                    r.a.eins_x=frei.rotEins_x;
                    r.a.eins_y=frei.rotEins_y;
                } else if (r.a.zwei_x != r.Ende_2_x | r.a.zwei_y != r.Ende_2_y) {
                    r.a.zwei_x=frei.rotEins_x;
                    r.a.zwei_y=frei.rotEins_y;
                } else if (r.a.drei_x != r.Ende_3_x | r.a.drei_y != r.Ende_3_y) {
                    r.a.drei_x=frei.rotEins_x;
                    r.a.drei_y=frei.rotEins_y;
                } else if (r.a.vier_x != r.Ende_4_x | r.a.vier_y != r.Ende_4_y) {
                    r.a.vier_x=frei.rotEins_x;
                    r.a.vier_y=frei.rotEins_y;
                }

            }
            if (r.a.t == 33) {
                if (r.a.eins_x != r.Ende_1_x | r.a.eins_y != r.Ende_1_y) {
                    r.a.eins_x=frei.rotZwei_x;
                    r.a.eins_y=frei.rotZwei_y;
                } else if (r.a.zwei_x != r.Ende_2_x | r.a.zwei_y != r.Ende_2_y) {
                    r.a.zwei_x=frei.rotZwei_x;
                    r.a.zwei_y=frei.rotZwei_y;
                } else if (r.a.drei_x != r.Ende_3_x | r.a.drei_y != r.Ende_3_y) {
                    r.a.drei_x=frei.rotZwei_x;
                    r.a.drei_y=frei.rotZwei_y;
                } else if (r.a.vier_x != r.Ende_4_x | r.a.vier_y != r.Ende_4_y) {
                    r.a.vier_x=frei.rotZwei_x;
                    r.a.vier_y=frei.rotZwei_y;
                }
            }
            if (r.a.t == 34) {
                if (r.a.eins_x != r.Ende_1_x | r.a.eins_y != r.Ende_1_y) {
                    r.a.eins_x=frei.rotDrei_x;
                    r.a.eins_y=frei.rotDrei_y;
                } else if (r.a.zwei_x != r.Ende_2_x | r.a.zwei_y != r.Ende_2_y) {
                    r.a.zwei_x=frei.rotDrei_x;
                    r.a.zwei_y=frei.rotDrei_y;
                } else if (r.a.drei_x != r.Ende_3_x | r.a.drei_y != r.Ende_3_y) {
                    r.a.drei_x=frei.rotDrei_x;
                    r.a.drei_y=frei.rotDrei_y;
                } else if (r.a.vier_x != r.Ende_4_x | r.a.vier_y != r.Ende_4_y) {
                    r.a.vier_x=frei.rotDrei_x;
                    r.a.vier_y=frei.rotDrei_y;
                }
            }
            if (r.a.t == 35) {
                if (r.a.eins_x != r.Ende_1_x | r.a.eins_y != r.Ende_1_y) {
                    r.a.eins_x=frei.rotVier_x;
                    r.a.eins_y=frei.rotVier_y;
                } else if (r.a.zwei_x != r.Ende_2_x | r.a.zwei_y != r.Ende_2_y) {
                    r.a.zwei_x=frei.rotVier_x;
                    r.a.zwei_y=frei.rotVier_y;
                } else if (r.a.drei_x != r.Ende_3_x | r.a.drei_y != r.Ende_3_y) {
                    r.a.drei_x=frei.rotVier_x;
                    r.a.drei_y=frei.rotVier_y;
                } else if (r.a.vier_x != r.Ende_4_x | r.a.vier_y != r.Ende_4_y) {
                    r.a.vier_x=frei.rotVier_x;
                    r.a.vier_y=frei.rotVier_y;
                }
            }
            if (r.a.t == 36) {
                if (r.a.eins_x != r.Ende_1_x | r.a.eins_y != r.Ende_1_y) {
                    r.a.eins_x=frei.rotFuenf_x;
                    r.a.eins_y=frei.rotFuenf_y;
                } else if (r.a.zwei_x != r.Ende_2_x | r.a.zwei_y != r.Ende_2_y) {
                    r.a.zwei_x=frei.rotFuenf_x;
                    r.a.zwei_y=frei.rotFuenf_y;
                } else if (r.a.drei_x != r.Ende_3_x | r.a.drei_y != r.Ende_3_y) {
                    r.a.drei_x=frei.rotFuenf_x;
                    r.a.drei_y=frei.rotFuenf_y;
                } else if (r.a.vier_x != r.Ende_4_x | r.a.vier_y != r.Ende_4_y) {
                    r.a.vier_x=frei.rotFuenf_x;
                    r.a.vier_y=frei.rotFuenf_y;
                }
            }
            if (r.a.t == 37) {
                if (r.a.eins_x != r.Ende_1_x | r.a.eins_y != r.Ende_1_y) {
                    r.a.eins_x=frei.rotSechs_x;
                    r.a.eins_y=frei.rotSechs_y;
                } else if (r.a.zwei_x != r.Ende_2_x | r.a.zwei_y != r.Ende_2_y) {
                    r.a.zwei_x=frei.rotSechs_x;
                    r.a.zwei_y=frei.rotSechs_y;
                } else if (r.a.drei_x != r.Ende_3_x | r.a.drei_y != r.Ende_3_y) {
                    r.a.drei_x=frei.rotSechs_x;
                    r.a.drei_y=frei.rotSechs_y;
                } else if (r.a.vier_x != r.Ende_4_x | r.a.vier_y != r.Ende_4_y) {
                    r.a.vier_x=frei.rotSechs_x;
                    r.a.vier_y=frei.rotSechs_y;
                }
            }
            if (r.a.t == 38) {
                if (r.a.eins_x != r.Ende_1_x | r.a.eins_y != r.Ende_1_y) {
                    r.a.eins_x=frei.rotSieben_x;
                    r.a.eins_y=frei.rotSieben_y;
                } else if (r.a.zwei_x != r.Ende_2_x | r.a.zwei_y != r.Ende_2_y) {
                    r.a.zwei_x=frei.rotSieben_x;
                    r.a.zwei_y=frei.rotSieben_y;
                } else if (r.a.drei_x != r.Ende_3_x | r.a.drei_y != r.Ende_3_y) {
                    r.a.drei_x=frei.rotSieben_x;
                    r.a.drei_y=frei.rotSieben_y;
                } else if (r.a.vier_x != r.Ende_4_x | r.a.vier_y != r.Ende_4_y) {
                    r.a.vier_x=frei.rotSieben_x;
                    r.a.vier_y=frei.rotSieben_y;
                }
            }
            if (r.a.t == 39) {
                if (r.a.eins_x != r.Ende_1_x | r.a.eins_y != r.Ende_1_y) {
                    r.a.eins_x=frei.rotAcht_x;
                    r.a.eins_y=frei.rotAcht_y;
                } else if (r.a.zwei_x != r.Ende_2_x | r.a.zwei_y != r.Ende_2_y) {
                    r.a.zwei_x=frei.rotAcht_x;
                    r.a.zwei_y=frei.rotAcht_y;
                } else if (r.a.drei_x != r.Ende_3_x | r.a.drei_y != r.Ende_3_y) {
                    r.a.drei_x=frei.rotAcht_x;
                    r.a.drei_y=frei.rotAcht_y;
                } else if (r.a.vier_x != r.Ende_4_x | r.a.vier_y != r.Ende_4_y) {
                    r.a.vier_x=frei.rotAcht_x;
                    r.a.vier_y=frei.rotAcht_y;
                }
            }
            if (r.a.t == 40) {
                if (r.a.eins_x != r.Ende_1_x | r.a.eins_y != r.Ende_1_y) {
                    r.a.eins_x=frei.rotNeun_x;
                    r.a.eins_y=frei.rotNeun_y;
                } else if (r.a.zwei_x != r.Ende_2_x | r.a.zwei_y != r.Ende_2_y) {
                    r.a.zwei_x=frei.rotNeun_x;
                    r.a.zwei_y=frei.rotNeun_y;
                } else if (r.a.drei_x != r.Ende_3_x | r.a.drei_y != r.Ende_3_y) {
                    r.a.drei_x=frei.rotNeun_x;
                    r.a.drei_y=frei.rotNeun_y;
                } else if (r.a.vier_x != r.Ende_4_x | r.a.vier_y != r.Ende_4_y) {
                    r.a.vier_x=frei.rotNeun_x;
                    r.a.vier_y=frei.rotNeun_y;
                }
            }
            if(r.Ende_1_x==blau.Ende_1_x&&r.Ende_1_y==blau.Ende_1_y) {
                if (r.a.t == 41) {
                    if (r.a.eins_x != r.Ende_1_x | r.a.eins_y != r.Ende_1_y) {
                        r.a.eins_x = r.Ende_4_x;
                        r.a.eins_y = r.Ende_4_y;
                    } else if (r.a.zwei_x != r.Ende_2_x | r.a.zwei_y != r.Ende_2_y) {
                        r.a.zwei_x = r.Ende_4_x;
                        r.a.zwei_y = r.Ende_4_y;
                    } else if (r.a.drei_x != r.Ende_3_x | r.a.drei_y != r.Ende_3_y) {
                        r.a.drei_x = r.Ende_4_x;
                        r.a.drei_y = r.Ende_4_y;
                    } else if (r.a.vier_x != r.Ende_4_x | r.a.vier_y != r.Ende_4_y) {
                        r.a.vier_x = r.Ende_4_x;
                        r.a.vier_y = r.Ende_4_y;
                        r.a.t = 0;
                    }
                }
                if (r.a.t == 42) {
                    if (r.a.eins_x != r.Ende_1_x | r.a.eins_y != r.Ende_1_y) {
                        r.a.eins_x = blau.Ende_3_x;
                        r.a.eins_y = blau.Ende_3_y;
                    } else if (r.a.zwei_x != r.Ende_2_x | r.a.zwei_y != r.Ende_2_y) {
                        r.a.zwei_x = blau.Ende_3_x;
                        r.a.zwei_y = blau.Ende_3_y;
                    } else if (r.a.drei_x != r.Ende_3_x | r.a.drei_y != r.Ende_3_y) {
                        r.a.drei_x = blau.Ende_3_x;
                        r.a.drei_y = blau.Ende_3_y;
                        r.a.t = 0;
                    } else {
                        r.a.vier_x = r.Ende_4_x;
                        r.a.vier_y = r.Ende_4_y;
                        r.a.t = 0;
                    }
                }
                if (r.a.t == 43) {
                    if (r.a.eins_x != r.Ende_1_x | r.a.eins_y != r.Ende_1_y) {
                        r.a.eins_x = blau.Ende_2_x;
                        r.a.eins_y = blau.Ende_2_y;
                    } else if (r.a.zwei_x != r.Ende_2_x | r.a.zwei_y != r.Ende_2_y) {
                        r.a.zwei_x = blau.Ende_2_x;
                        r.a.zwei_y = blau.Ende_2_y;
                        r.a.t = 0;
                    } else if (r.a.drei_x != r.Ende_3_x | r.a.drei_y != r.Ende_3_y) {
                        r.a.drei_x = blau.Ende_3_x;
                        r.a.drei_y = blau.Ende_3_y;
                        r.a.t = 0;
                    } else if (r.a.vier_x != r.Ende_4_x | r.a.vier_y != r.Ende_4_y) {
                        r.a.vier_x = r.Ende_4_x;
                        r.a.vier_y = r.Ende_4_y;
                        r.a.t = 0;
                    }
                }
                if (r.a.t > 43) {
                    if (r.a.eins_x != r.Ende_1_x | r.a.eins_y != r.Ende_1_y) {
                        r.a.eins_x = blau.Ende_1_x;
                        r.a.eins_y = blau.Ende_1_y;
                        r.a.t = 0;
                    } else if (r.a.zwei_x != r.Ende_2_x | r.a.zwei_y != r.Ende_2_y) {
                        r.a.zwei_x = blau.Ende_2_x;
                        r.a.zwei_y = blau.Ende_2_y;
                        r.a.t = 0;
                    } else if (r.a.drei_x != r.Ende_3_x | r.a.drei_y != r.Ende_3_y) {
                        r.a.drei_x = blau.Ende_3_x;
                        r.a.drei_y = blau.Ende_3_y;
                        r.a.t = 0;
                    } else if (r.a.vier_x != r.Ende_4_x | r.a.vier_y != r.Ende_4_y) {
                        r.a.vier_x = r.Ende_4_x;
                        r.a.vier_y = r.Ende_4_y;
                        r.a.t = 0;
                    }
                }
            }
        if (r.Ende_1_x == gruen.Ende_1_x && r.Ende_1_y == gruen.Ende_1_y) {

            if (r.a.t > 40) {
                r.a.t = r.a.t - 40;
            }

            if ((r.a.t - a) < 11) {
                if (r.a.t >= 11 | r.a.t <= -1) {


                    if (r.a.t == 11 | r.a.t == -1) {

                        if (r.a.eins_x != r.Ende_1_x | r.a.eins_y != r.Ende_1_y) {
                            r.a.eins_x=r.Ende_4_x;
                            r.a.eins_y=r.Ende_4_y;
                            r.a.t = -1;
                        } else if (r.a.zwei_x != r.Ende_2_x | r.a.zwei_y != r.Ende_2_y) {
                            r.a.zwei_x=r.Ende_4_x;
                            r.a.zwei_y=r.Ende_4_y;
                            r.a.t = -1;
                        } else if (r.a.drei_x != r.Ende_3_x | r.a.drei_y != r.Ende_3_y) {
                            r.a.drei_x=r.Ende_4_x;
                            r.a.drei_y=r.Ende_4_y;
                            r.a.t = -1;
                        } else if (r.a.vier_x != r.Ende_4_x | r.a.vier_y != r.Ende_4_y) {
                            r.a.vier_x=r.Ende_4_x;
                            r.a.vier_y=r.Ende_4_y;
                            r.a.t = 0;
                        }
                    }
                    if (r.a.t == 12 | r.a.t == -2) {
                        if (r.a.eins_x != r.Ende_1_x | r.a.eins_y != r.Ende_1_y) {
                            r.a.eins_x=r.Ende_3_x;
                            r.a.eins_y=r.Ende_3_y;
                            r.a.t = -2;
                        } else if (r.a.zwei_x != r.Ende_2_x | r.a.zwei_y != r.Ende_2_y) {
                            r.a.zwei_x=r.Ende_3_x;
                            r.a.zwei_y=r.Ende_3_y;
                            r.a.t = -2;
                        } else if (r.a.drei_x != r.Ende_3_x | r.a.drei_y != r.Ende_3_y) {
                            r.a.drei_x=r.Ende_3_x;
                            r.a.drei_y=r.Ende_3_y;
                            r.a.t = 0;
                        } else if (r.a.vier_x != r.Ende_4_x | r.a.vier_y != r.Ende_4_y) {
                            r.a.vier_x=r.Ende_4_x;
                            r.a.vier_y=r.Ende_4_y;
                            r.a.t=0;
                        }
                    }
                    if (r.a.t == 13 | r.a.t == -3) {
                        if (r.a.eins_x != r.Ende_1_x | r.a.eins_y != r.Ende_1_y) {
                            r.a.eins_x=r.Ende_2_x;
                            r.a.eins_y=r.Ende_2_y;
                            r.a.t = -3;
                        } else if (r.a.zwei_x != r.Ende_2_x | r.a.zwei_y != r.Ende_2_y) {
                            r.a.zwei_x=r.Ende_2_x;
                            r.a.zwei_y=r.Ende_2_y;
                            r.a.t = 0;
                        } else if (r.a.drei_x != r.Ende_3_x | r.a.drei_y != r.Ende_3_y) {
                            r.a.drei_x=r.Ende_3_x;
                            r.a.drei_y=r.Ende_3_y;
                            r.a.t=0;
                        } else if (r.a.vier_x != r.Ende_4_x | r.a.vier_y != r.Ende_4_y) {
                            r.a.vier_x=r.Ende_4_x;
                            r.a.vier_y=r.Ende_4_y;
                            r.a.t=0;
                        }
                    }
                    if (r.a.t >= 14 | r.a.t < -3) {
                        if (r.a.eins_x != r.Ende_1_x | r.a.eins_y != r.Ende_1_y) {
                            r.a.eins_x=r.Ende_1_x;
                            r.a.eins_y=r.Ende_1_y;
                            r.a.t = 0;
                        } else if (r.a.zwei_x != r.Ende_2_x | r.a.zwei_y != r.Ende_2_y) {
                            r.a.zwei_x=r.Ende_2_x;
                            r.a.zwei_y=r.Ende_2_y;
                            r.a.t=0;
                        } else if (r.a.drei_x != r.Ende_3_x | r.a.drei_y != r.Ende_3_y) {
                            r.a.drei_x=r.Ende_3_x;
                            r.a.drei_y=r.Ende_3_y;
                            r.a.t=0;
                        } else if (r.a.vier_x != r.Ende_4_x | r.a.vier_y != r.Ende_4_y) {
                            r.a.vier_x=r.Ende_4_x;
                            r.a.vier_y=r.Ende_4_y;
                            r.a.t=0;
                        }
                    }

                }
            }


        }
        if (r.Ende_1_x == gelb.Ende_1_x && r.Ende_1_y == gelb.Ende_1_y) {
            if (r.a.t > 40) {
                r.a.t = r.a.t - 40;
            }

            if ((r.a.t - a) < 21) {
                if (r.a.t >= 21 | r.a.t <= -1) {


                    if (r.a.t == 21 | r.a.t == -1) {
                        if (r.a.eins_x != r.Ende_1_x | r.a.eins_y != r.Ende_1_y) {
                            r.a.eins_x=r.Ende_4_x;
                            r.a.eins_y=r.Ende_4_y   ;
                            r.a.t=-1;
                        } else if (r.a.zwei_x != r.Ende_2_x | r.a.zwei_y != r.Ende_2_y) {
                            r.a.zwei_x=r.Ende_4_x;
                            r.a.zwei_y=r.Ende_4_y;
                            r.a.t=-1;
                        } else if (r.a.drei_x != r.Ende_3_x | r.a.drei_y != r.Ende_3_y) {
                            r.a.drei_x=r.Ende_4_x;
                            r.a.drei_y=r.Ende_4_y;
                            r.a.t=-1;
                        } else if (r.a.vier_x != r.Ende_4_x | r.a.vier_y != r.Ende_4_y) {
                            r.a.vier_x=r.Ende_4_x;
                            r.a.vier_y=r.Ende_4_y;
                            r.a.t = 0;
                        }

                    }
                    if (r.a.t == 22 | r.a.t == -2) {
                        if (r.a.eins_x != r.Ende_1_x | r.a.eins_y != r.Ende_1_y) {
                            r.a.eins_x=r.Ende_3_x;
                            r.a.eins_y=r.Ende_3_y;
                            r.a.t=-2;
                        } else if (r.a.zwei_x != r.Ende_2_x | r.a.zwei_y != r.Ende_2_y) {
                            r.a.zwei_x=r.Ende_3_x;
                            r.a.zwei_y=r.Ende_3_y;
                            r.a.t=-2;
                        } else if (r.a.drei_x != r.Ende_3_x | r.a.drei_y != r.Ende_3_y) {
                            r.a.drei_x=r.Ende_3_x;
                            r.a.drei_y=r.Ende_3_y;
                            r.a.t = 0;
                        } else if (r.a.vier_x != r.Ende_4_x | r.a.vier_y != r.Ende_4_y) {
                            r.a.vier_x=r.Ende_4_x;
                            r.a.vier_y=r.Ende_4_y;
                            r.a.t=0;
                        }
                    }
                    if (r.a.t == 23 | r.a.t == -3) {
                        if (r.a.eins_x != r.Ende_1_x | r.a.eins_y != r.Ende_1_y) {
                            r.a.eins_x=r.Ende_2_x;
                            r.a.eins_y=r.Ende_2_y;
                            r.a.t=-3;
                        } else if (r.a.zwei_x != r.Ende_2_x | r.a.zwei_y != r.Ende_2_y) {
                            r.a.zwei_x=r.Ende_2_x;
                            r.a.zwei_y=r.Ende_2_y;
                            r.a.t = 0;
                        } else if (r.a.drei_x != r.Ende_3_x | r.a.drei_y != r.Ende_3_y) {
                            r.a.drei_x=r.Ende_3_x;
                            r.a.drei_y=r.Ende_3_y;
                            r.a.t=0;
                        } else if (r.a.vier_x != r.Ende_4_x | r.a.vier_y != r.Ende_4_y) {
                            r.a.vier_x=r.Ende_4_x;
                            r.a.vier_y=r.Ende_4_y;
                            r.a.t=0;
                        }
                    }
                    if (r.a.t > 23 | r.a.t < -3) {
                        if (r.a.eins_x != r.Ende_1_x | r.a.eins_y != r.Ende_1_y) {
                            r.a.eins_x=r.Ende_1_x;
                            r.a.eins_y=r.Ende_1_y;
                            r.a.t = 0;
                        } else if (r.a.zwei_x != r.Ende_2_x | r.a.zwei_y != r.Ende_2_y) {
                            r.a.zwei_x=r.Ende_2_x;
                            r.a.zwei_y=r.Ende_2_y;
                            r.a.t=0;
                        } else if (r.a.drei_x != r.Ende_3_x | r.a.drei_y != r.Ende_3_y) {
                            r.a.drei_x=r.Ende_3_x;
                            r.a.drei_y=r.Ende_3_y;
                            r.a.t=0;
                        } else if (r.a.vier_x != r.Ende_4_x | r.a.vier_y != r.Ende_4_y) {
                            r.a.vier_x=r.Ende_4_x;
                            r.a.vier_y=r.Ende_4_y;
                            r.a.t=0;
                        }
                    }
                }
            }

        }
        if (r.Ende_1_x == rot.Ende_1_x && r.Ende_1_y == rot.Ende_1_y) {
            if (r.a.t > 40) {
                r.a.t = r.a.t - 40;
            }


            if ((r.a.t - a) < 31) {
                if (r.a.t >= 31 | r.a.t <= -1) {

                    if (r.a.t == 31 | r.a.t == -1) {
                        if (r.a.eins_x != r.Ende_1_x | r.a.eins_y != r.Ende_1_y) {
                            r.a.eins_x=r.Ende_4_x;
                            r.a.eins_y=r.Ende_4_y;
                            r.a.t=-1;
                        } else if (r.a.zwei_x != r.Ende_2_x | r.a.zwei_y != r.Ende_2_y) {
                            r.a.zwei_x=r.Ende_4_x;
                            r.a.zwei_y=r.Ende_4_y;
                            r.a.t=-1;
                        } else if (r.a.drei_x != r.Ende_3_x | r.a.drei_y != r.Ende_3_y) {
                            r.a.drei_x=r.Ende_4_x;
                            r.a.drei_y=r.Ende_4_y;
                            r.a.t=-1;
                        } else if (r.a.vier_x != r.Ende_4_x | r.a.vier_y != r.Ende_4_y) {
                            r.a.vier_x=r.Ende_4_x;
                            r.a.vier_y=r.Ende_4_y;
                            r.a.t = 0;
                        }
                    }
                    if (r.a.t == 32 | r.a.t == -2) {
                        if (r.a.eins_x != r.Ende_1_x | r.a.eins_y != r.Ende_1_y) {
                            r.a.eins_x=r.Ende_3_x;
                            r.a.eins_y=r.Ende_3_y;
                            r.a.t=-2;
                        } else if (r.a.zwei_x != r.Ende_2_x | r.a.zwei_y != r.Ende_2_y) {
                            r.a.zwei_x=r.Ende_3_x;
                            r.a.zwei_y=r.Ende_3_y;
                            r.a.t=-2;
                        } else if (r.a.drei_x != r.Ende_3_x | r.a.drei_y != r.Ende_3_y) {
                            r.a.drei_x=r.Ende_3_x;
                            r.a.drei_y=r.Ende_3_y;
                            r.a.t = 0;
                        } else if (r.a.vier_x != r.Ende_4_x | r.a.vier_y != r.Ende_4_y) {
                            r.a.vier_x=r.Ende_4_x;
                            r.a.vier_y=r.Ende_4_y;
                            r.a.t=0;
                        }

                    }
                    if (r.a.t == 33 | r.a.t == -3) {
                        if (r.a.eins_x != r.Ende_1_x | r.a.eins_y != r.Ende_1_y) {
                            r.a.eins_x=r.Ende_2_x;
                            r.a.eins_y=r.Ende_2_y;
                            r.a.t=-3;
                        } else if (r.a.zwei_x != r.Ende_2_x | r.a.zwei_y != r.Ende_2_y) {
                            r.a.zwei_x=r.Ende_2_x;
                            r.a.zwei_y=r.Ende_2_y;
                            r.a.t = 0;
                        } else if (r.a.drei_x != r.Ende_3_x | r.a.drei_y != r.Ende_3_y) {
                            r.a.drei_x=r.Ende_3_x;
                            r.a.drei_y=r.Ende_3_y;
                            r.a.t=0;
                        } else if (r.a.vier_x != r.Ende_4_x | r.a.vier_y != r.Ende_4_y) {
                            r.a.vier_x=r.Ende_4_x;
                            r.a.vier_y=r.Ende_4_y;
                            r.a.t=0;
                        }
                    }
                    if (r.a.t > 33 | r.a.t < -3) {
                        if (r.a.eins_x != r.Ende_1_x | r.a.eins_y != r.Ende_1_y) {
                            r.a.eins_x=r.Ende_1_x;
                            r.a.eins_y=r.Ende_1_y;
                            r.a.t = 0;
                        } else if (r.a.zwei_x != r.Ende_2_x | r.a.zwei_y != r.Ende_2_y) {
                            r.a.zwei_x=r.Ende_2_x;
                            r.a.zwei_y=r.Ende_2_y;
                            r.a.t=0;
                        } else if (r.a.drei_x != r.Ende_3_x | r.a.drei_y != r.Ende_3_y) {
                            r.a.drei_x=r.Ende_3_x;
                            r.a.drei_y=r.Ende_3_y;
                            r.a.t=0;
                        } else if (r.a.vier_x != r.Ende_4_x | r.a.vier_y != r.Ende_4_y) {
                            r.a.vier_x=r.Ende_4_x;
                            r.a.vier_y=r.Ende_4_y;
                            r.a.t=0;
                        }
                    }
                }
            }

        }
    }

    /**
     * Falls die Figur eines Spielers auf den anderen draufkommt, dann wird die Figur des Spielers, der zuerst auf dem
     * Feld war, nach Hause geschickt
     * @param d Der Spieler der auf dem Feld ist
     * @param f Der Spieler der auf das Feld kommt
     */
    public void rauswerfen(Spieler d, Spieler f) {
        if ((f.a.eins_x == d.a.eins_x) && (f.a.eins_y == d.a.eins_y)) {
            gameState[d.a.eins_x][d.a.eins_y]='0';
            d.a.eins_x=d.Haus_1_x;
            d.a.eins_y=d.Haus_1_y;
            gameState[d.a.eins_x][d.a.eins_y]='F';
            d.a.t=0;
        }
        if ((f.a.eins_x == d.a.zwei_x) && (f.a.eins_y == d.a.zwei_y)) {
            gameState[d.a.zwei_x][d.a.zwei_y]='0';
            d.a.zwei_x=d.Haus_2_x;
            d.a.zwei_y=d.Haus_2_y;
            gameState[d.a.zwei_x][d.a.zwei_y]='F';
            d.a.t=0;
        }
        if ((f.a.eins_x == d.a.drei_x) && (f.a.eins_y == d.a.drei_y)) {
            gameState[d.a.drei_x][d.a.drei_y]='0';
            d.a.drei_x=d.Haus_3_x;
            d.a.drei_y=d.Haus_3_y;
            gameState[d.a.drei_x][d.a.drei_y]='F';
            d.a.t=0;
        }
        if ((f.a.eins_x == d.a.vier_x) && (f.a.eins_y == d.a.vier_y)) {
            gameState[d.a.vier_x][d.a.vier_y]='0';
            d.a.vier_x=d.Haus_4_x;
            d.a.vier_y=d.Haus_4_y;
            gameState[d.a.vier_x][d.a.vier_y]='F';
            d.a.t=0;
        }
        if ((f.a.zwei_x == d.a.eins_x) && (f.a.zwei_y == d.a.eins_y)) {
            gameState[d.a.eins_x][d.a.eins_y]='0';
            d.a.eins_x=d.Haus_1_x;
            d.a.eins_y=d.Haus_1_y;
            gameState[d.a.eins_x][d.a.eins_y]='F';
            d.a.t=0;
        }
        if ((f.a.zwei_x == d.a.zwei_x) && (f.a.zwei_y == d.a.zwei_y)) {
            gameState[d.a.zwei_x][d.a.zwei_y]='0';
            d.a.zwei_x=d.Haus_2_x;
            d.a.zwei_y=d.Haus_2_y;
            gameState[d.a.zwei_x][d.a.zwei_y]='F';
            d.a.t=0;
        }
        if ((f.a.zwei_x == d.a.drei_x) && (f.a.zwei_y == d.a.drei_y)) {
            gameState[d.a.drei_x][d.a.drei_y]='0';
            d.a.drei_x=d.Haus_3_x;
            d.a.drei_y=d.Haus_3_y;
            gameState[d.a.drei_x][d.a.drei_y]='F';
            d.a.t=0;
        }
        if ((f.a.zwei_x == d.a.vier_x) && (f.a.zwei_y == d.a.vier_y)) {
            gameState[d.a.vier_x][d.a.vier_y]='0';
            d.a.vier_x=d.Haus_4_x;
            d.a.vier_y=d.Haus_4_y;
            gameState[d.a.vier_x][d.a.vier_y]='F';
            d.a.t=0;
        }
        if ((f.a.drei_x == d.a.eins_x) && (f.a.drei_y == d.a.eins_y)) {
            gameState[d.a.eins_x][d.a.eins_y]='0';
            d.a.eins_x=d.Haus_1_x;
            d.a.eins_y=d.Haus_1_y;
            gameState[d.a.eins_x][d.a.eins_y]='F';
            d.a.t=0;
        }
        if ((f.a.drei_x == d.a.zwei_x) && (f.a.drei_y == d.a.zwei_y)) {
            gameState[d.a.zwei_x][d.a.zwei_y]='0';
            d.a.zwei_x=d.Haus_2_x;
            d.a.zwei_y=d.Haus_2_y;
            gameState[d.a.zwei_x][d.a.zwei_y]='F';
            d.a.t=0;
        }
        if ((f.a.drei_x == d.a.drei_x) && (f.a.drei_y == d.a.drei_y)) {
            gameState[d.a.drei_x][d.a.drei_y]='0';
            d.a.drei_x=d.Haus_3_x;
            d.a.drei_y=d.Haus_3_y;
            gameState[d.a.drei_x][d.a.drei_y]='F';
            d.a.t=0;
        }
        if ((f.a.drei_x == d.a.vier_x) && (f.a.drei_y == d.a.vier_y)) {
            gameState[d.a.vier_x][d.a.vier_y]='0';
            d.a.vier_x=d.Haus_4_x;
            d.a.vier_y=d.Haus_4_y;
            gameState[d.a.vier_x][d.a.vier_y]='F';
            d.a.t=0;
        }
        if ((f.a.vier_x == d.a.eins_x) && (f.a.vier_y == d.a.eins_y)) {
            gameState[d.a.eins_x][d.a.eins_y]='0';
            d.a.eins_x=d.Haus_1_x;
            d.a.eins_y=d.Haus_1_y;
            gameState[d.a.eins_x][d.a.eins_y]='F';
            d.a.t=0;
        }
        if ((f.a.vier_x == d.a.zwei_x) && (f.a.vier_y == d.a.zwei_y)) {
            gameState[d.a.zwei_x][d.a.zwei_y]='0';
            d.a.zwei_x=d.Haus_2_x;
            d.a.zwei_y=d.Haus_2_y;
            gameState[d.a.zwei_x][d.a.zwei_y]='F';
            d.a.t=0;
        }
        if ((f.a.vier_x == d.a.drei_x) && (f.a.vier_y == d.a.drei_y)) {
            gameState[d.a.drei_x][d.a.drei_y]='0';
            d.a.drei_x=d.Haus_3_x;
            d.a.drei_y=d.Haus_3_y;
            gameState[d.a.drei_x][d.a.drei_y]='F';
            d.a.t=0;
        }
        if ((f.a.vier_x == d.a.vier_x) && (f.a.vier_y == d.a.vier_y)) {
            gameState[d.a.vier_x][d.a.vier_y]='0';
            d.a.vier_x=d.Haus_4_x;
            d.a.vier_y=d.Haus_4_y;
            gameState[d.a.vier_x][d.a.vier_y]='F';
            d.a.t=0;
        }

    }

    /**
     * Setzt fest auf welchem Platz der Spieler sich befindet
     * @param r Der Spieler auf dem man die Methode anwendet.
     */

    public void platzieren(Spieler r){
        if(r.Ende_1_y==blau.Ende_1_y&&r.Ende_1_x== blau.Ende_1_x){
            if((gruen.a.vier_x!=gruen.Ende_4_x|gruen.a.vier_y!=gruen.Ende_4_y)&&(gelb.a.vier_x!=gelb.Ende_4_x|gelb.a.vier_y!=gelb.Ende_4_y)&&(rot.a.vier_x!=rot.Ende_4_x|rot.a.vier_y!=rot.Ende_4_y)&&(blau.a.vier_x==blau.Ende_4_x&&blau.a.vier_y==blau.Ende_4_y)){
                r.platz=1;
            }else if((gruen.platz==1&&(gelb.a.vier_x!=gelb.Ende_4_x|gelb.a.vier_y!=gelb.Ende_4_y)&&(rot.a.vier_x!=rot.Ende_4_x|rot.a.vier_y!=rot.Ende_4_y))|(gelb.platz==1&&(gruen.a.vier_x!=gruen.Ende_4_x|gruen.a.vier_y!=gruen.Ende_4_y)&&(rot.a.vier_x!=rot.Ende_4_x|rot.a.vier_y!=rot.Ende_4_y))|(rot.platz==1&&(gruen.a.vier_x!=gruen.Ende_4_x|gruen.a.vier_y!=gruen.Ende_4_y)&&(gelb.a.vier_x!=gelb.Ende_4_x|gelb.a.vier_y!=gelb.Ende_4_y))&&(blau.a.vier_x==blau.Ende_4_x&&blau.a.vier_y==blau.Ende_4_y)){
                r.platz=2;
            }else if((gruen.platz==1|gelb.platz==1|rot.platz==1)&&(gruen.platz==2|gelb.platz==2|rot.platz==2)&&((gruen.a.vier_x!=gruen.Ende_4_x|gruen.a.vier_y!=gruen.Ende_4_y)|(gelb.a.vier_x!=gelb.Ende_4_x|gelb.a.vier_y!=gelb.Ende_4_y)|(rot.a.vier_x!=rot.Ende_4_x|rot.a.vier_y!=rot.Ende_4_y))&&(blau.a.vier_x==blau.Ende_4_x&&blau.a.vier_y==blau.Ende_4_y)){
                r.platz=3;
            }else if((gruen.platz==1|gelb.platz==1|rot.platz==1)&&(gruen.platz==2|gelb.platz==2|rot.platz==2)&&(gruen.platz==3|gelb.platz==3|rot.platz==3)){
                r.platz=4;
            }
        }
        if(r.Ende_1_y==gruen.Ende_1_y&&r.Ende_1_x== gruen.Ende_1_x){
            if(((blau.a.vier_x!=blau.Ende_4_x|blau.a.vier_y!=blau.Ende_4_y)&&(gelb.a.vier_x!=gelb.Ende_4_x|gelb.a.vier_y!=gelb.Ende_4_y)&&(rot.a.vier_x!=rot.Ende_4_x|rot.a.vier_y!=rot.Ende_4_y))&&(gruen.a.vier_x==gruen.Ende_4_x&&gruen.a.vier_y==gruen.Ende_4_y)){
                r.platz=1;
            }else if((blau.platz==1&&(gelb.a.vier_x!=gelb.Ende_4_x|gelb.a.vier_y!=gelb.Ende_4_y)&&(rot.a.vier_x!=rot.Ende_4_x|rot.a.vier_y!=rot.Ende_4_y))|(gelb.platz==1&&(blau.a.vier_x!=blau.Ende_4_x&&blau.a.vier_y!=blau.Ende_4_y)&&(rot.a.vier_x!=rot.Ende_4_x|rot.a.vier_y!=rot.Ende_4_y))|(rot.platz==1&&(blau.a.vier_x!=blau.Ende_4_x|blau.a.vier_y!=blau.Ende_4_y)&&(gelb.a.vier_x!=gelb.Ende_4_x|gelb.a.vier_y!=gelb.Ende_4_y))&&(gruen.a.vier_x==gruen.Ende_4_x&&gruen.a.vier_y==gruen.Ende_4_y)){
                r.platz=2;
            }else if((blau.platz==1|gelb.platz==1|rot.platz==1)&&(blau.platz==2|gelb.platz==2|rot.platz==2)&&((blau.a.vier_x!=blau.Ende_4_x|blau.a.vier_y!=blau.Ende_4_y)|(gelb.a.vier_x!=gelb.Ende_4_x|gelb.a.vier_y!=gelb.Ende_4_y)|(rot.a.vier_x!=rot.Ende_4_x|rot.a.vier_y!=rot.Ende_4_y))&&(gruen.a.vier_x==gruen.Ende_4_x&&gruen.a.vier_y==gruen.Ende_4_y)){
                r.platz=3;
            }else if((rot.platz==1|gelb.platz==1|blau.platz==1)&&(rot.platz==2|gelb.platz==2|blau.platz==2)&&(rot.platz==3|gelb.platz==3|blau.platz==3)){
                r.platz=4;
            }
        }
        if(r.Ende_1_y==gelb.Ende_1_y&&r.Ende_1_x== gelb.Ende_1_x){
            if((gruen.a.vier_x!=gruen.Ende_4_x|gruen.a.vier_y!=gruen.Ende_4_y)&&(blau.a.vier_x!=blau.Ende_4_x|blau.a.vier_y!=blau.Ende_4_y)&&(rot.a.vier_x!=rot.Ende_4_x|rot.a.vier_y!=rot.Ende_4_y)&&(gelb.a.vier_x==gelb.Ende_4_x&&gelb.a.vier_y==gelb.Ende_4_y)){
                r.platz=1;
            }else if((gruen.platz==1&&(blau.a.vier_x!=blau.Ende_4_x|blau.a.vier_y!=blau.Ende_4_y)&&(rot.a.vier_x!=rot.Ende_4_x&&rot.a.vier_y!=rot.Ende_4_y))|(blau.platz==1&&(gruen.a.vier_x!=gruen.Ende_4_x|gruen.a.vier_y!=gruen.Ende_4_y)&&(rot.a.vier_x!=rot.Ende_4_x|rot.a.vier_y!=rot.Ende_4_y))|(rot.platz==1&&(gruen.a.vier_x!=gruen.Ende_4_x|gruen.a.vier_y!=gruen.Ende_4_y)&&(blau.a.vier_x!=blau.Ende_4_x|blau.a.vier_y!=blau.Ende_4_y))&&(gelb.a.vier_x==gelb.Ende_4_x&&gelb.a.vier_y==gelb.Ende_4_y)){
                r.platz=2;
            }else if((gruen.platz==1|blau.platz==1|rot.platz==1)&&(gruen.platz==2|blau.platz==2|rot.platz==2)&&((gruen.a.vier_x!=gruen.Ende_4_x|gruen.a.vier_y!=gruen.Ende_4_y)|(blau.a.vier_x!=blau.Ende_4_x|blau.a.vier_y!=blau.Ende_4_y)|(rot.a.vier_x!=rot.Ende_4_x|rot.a.vier_y!=rot.Ende_4_y))&&(gelb.a.vier_x==gelb.Ende_4_x&&gelb.a.vier_y==gelb.Ende_4_y)){
                r.platz=3;
            }  else if((gruen.platz==1|rot.platz==1|blau.platz==1)&&(gruen.platz==2|rot.platz==2|blau.platz==2)&&(gruen.platz==3|rot.platz==3|blau.platz==3)){
                r.platz=4;
            }
        }
        if(r.Ende_1_y==rot.Ende_1_y&&r.Ende_1_x== rot.Ende_1_x){
            if((gruen.a.vier_x!=gruen.Ende_4_x|gruen.a.vier_y!=gruen.Ende_4_y)&&(gelb.a.vier_x!=gelb.Ende_4_x|gelb.a.vier_y!=gelb.Ende_4_y)&&(blau.a.vier_x!=blau.Ende_4_x|blau.a.vier_y!=blau.Ende_4_y)&&(rot.a.vier_x==rot.Ende_4_x&&rot.a.vier_y==rot.Ende_4_y)){
                r.platz=1;
            } else if((gruen.platz==1&&(gelb.a.vier_x!=gelb.Ende_4_x|gelb.a.vier_y!=gelb.Ende_4_y)&&(blau.a.vier_x!=blau.Ende_4_x|blau.a.vier_y!=blau.Ende_4_y))|(gelb.platz==1&&(gruen.a.vier_x!=gruen.Ende_4_x|gruen.a.vier_y!=gruen.Ende_4_y)&&(blau.a.vier_x!=blau.Ende_4_x|blau.a.vier_y!=blau.Ende_4_y))|(blau.platz==1&&(gruen.a.vier_x!=gruen.Ende_4_x|gruen.a.vier_y!=gruen.Ende_4_y)&&(gelb.a.vier_x!=gelb.Ende_4_x|gelb.a.vier_y!=gelb.Ende_4_y))&&(rot.a.vier_x==rot.Ende_4_x&&rot.a.vier_y==rot.Ende_4_y)){
                r.platz=2;
            }else if((gruen.platz==1|gelb.platz==1| blau.platz==1)&&(gruen.platz==2|gelb.platz==2|blau.platz==2)&&((gruen.a.vier_x!=gruen.Ende_4_x|gruen.a.vier_y!=gruen.Ende_4_y)|(gelb.a.vier_x!=gelb.Ende_4_x|gelb.a.vier_y!=gelb.Ende_4_y)|(blau.a.vier_x!=blau.Ende_4_x|blau.a.vier_y!=blau.Ende_4_y))&&(rot.a.vier_x==rot.Ende_4_x&&rot.a.vier_y==rot.Ende_4_y)){
                r.platz=3;
            }else if((gruen.platz==1|gelb.platz==1|blau.platz==1)&&(gruen.platz==2|gelb.platz==2|blau.platz==2)&&(gruen.platz==3|gelb.platz==3|blau.platz==3)){
                r.platz=4;
            }
        }
    }
}

