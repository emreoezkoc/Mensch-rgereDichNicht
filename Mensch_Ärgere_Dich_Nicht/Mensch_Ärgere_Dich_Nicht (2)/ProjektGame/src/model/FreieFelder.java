/**
 * In diesem package befinden sich alle Klassen, die zum Modell dazugehören.
 * Dies sind Figuren, Spieler, FreieFelder und die Modell-Klasse.
 * In diesen Klassen befinden sich alle Methoden und Variablen, welche man für das Spiel braucht.
 */

package model;

/**
 * Zum Erstellen von den FreienFeldern.
 * Dies sind die Felder, welche nicht zu einem der Spieler zugeordnet wird.
 *
 * Zum Erstellen: FreieFelder(1,2,3,4,5,.....,10);
 * in die Klammer kommen alle x- und y-Koordinaten eingeben von den Feldern, die benutzt werden sollen
 *
 * @author Emre Özkoc
 */
public class FreieFelder {
    /**
     * x-Koordinate von Feld_1
     */
    int blauEins_x;
    /**
     * y-Koordinate von Feld_1
     */
    int blauEins_y;
    /**
     * x-Koordinate von Feld_2
     */
    int blauZwei_x;
    /**
     * y-Koordinate von Feld_2
     */
    int blauZwei_y;
    /**
     * x-Koordinate von Feld_3
     */
    int blauDrei_x;
    /**
     * y-Koordinate von Feld_3
     */
    int blauDrei_y;
    /**
     * x-Koordinate von Feld_4
     */
    int blauVier_x;
    /**
     * y-Koordinate von Feld_4
     */
    int blauVier_y;
    /**
     * x-Koordinate von Feld_5
     */
    int blauFuenf_x;
    /**
     * y-Koordinate von Feld_5
     */
    int blauFuenf_y;
    /**
     * x-Koordinate von Feld_6
     */
    int blauSechs_x;
    /**
     * y-Koordinate von Feld_6
     */
    int blauSechs_y;
    /**
     * x-Koordinate von Feld_7
     */
    int blauSieben_x;
    /**
     * y-Koordinate von Feld_7
     */
    int blauSieben_y;
    /**
     * x-Koordinate von Feld_8
     */
    int blauAcht_x;
    /**
     * y-Koordinate von Feld_8
     */
    int blauAcht_y;
    /**
     * x-Koordinate von Feld_9
     */
    int blauNeun_x;
    /**
     * y-Koordinate von Feld_9
     */
    int blauNeun_y;
    /**
     * x-Koordinate von Feld_10
     */
    int rotEins_x;
    /**
     * y-Koordinate von Feld_10
     */
    int rotEins_y;
    /**
     * x-Koordinate von Feld_11
     */
    int rotZwei_x;
    /**
     * y-Koordinate von Feld_11
     */
    int rotZwei_y;
    /**
     * x-Koordinate von Feld_12
     */
    int rotDrei_x;
    /**
     * y-Koordinate von Feld_12
     */
    int rotDrei_y;
    /**
     * x-Koordinate von Feld_13
     */
    int rotVier_x;
    /**
     * y-Koordinate von Feld_13
     */
    int rotVier_y;
    /**
     * x-Koordinate von Feld_14
     */
    int rotFuenf_x;
    /**
     * y-Koordinate von Feld_14
     */
    int rotFuenf_y;
    /**
     * x-Koordinate von Feld_15
     */
    int rotSechs_x;
    /**
     * y-Koordinate von Feld_15
     */
    int rotSechs_y;
    /**
     * x-Koordinate von Feld_16
     */
    int rotSieben_x;
    /**
     * y-Koordinate von Feld_16
     */
    int rotSieben_y;
    /**
     * x-Koordinate von Feld_17
     */
    int rotAcht_x;
    /**
     * y-Koordinate von Feld_17
     */
    int rotAcht_y;
    /**
     * x-Koordinate von Feld_18
     */
    int rotNeun_x;
    /**
     * y-Koordinate von Feld_18
     */
    int rotNeun_y;
    /**
     * x-Koordinate von Feld_19
     */
    int gelbEins_x;
    /**
     * y-Koordinate von Feld_19
     */
    int gelbEins_y;
    /**
     * x-Koordinate von Feld_20
     */
    int gelbZwei_x;
    /**
     * y-Koordinate von Feld_20
     */
    int gelbZwei_y;
    /**
     * x-Koordinate von Feld_21
     */
    int gelbDrei_x;
    /**
     * y-Koordinate von Feld_21
     */
    int gelbDrei_y;
    /**
     * x-Koordinate von Feld_22
     */
    int gelbVier_x;
    /**
     * y-Koordinate von Feld_22
     */
    int gelbVier_y;
    /**
     * x-Koordinate von Feld_23
     */
    int gelbFuenf_x;
    /**
     * y-Koordinate von Feld_23
     */
    int gelbFuenf_y;
    /**
     * x-Koordinate von Feld_24
     */
    int gelbSechs_x;
    /**
     * y-Koordinate von Feld_24
     */
    int gelbSechs_y;
    /**
     * x-Koordinate von Feld_25
     */
    int gelbSieben_x;
    /**
     * y-Koordinate von Feld_25
     */
    int gelbSieben_y;
    /**
     * x-Koordinate von Feld_26
     */
    int gelbAcht_x;
    /**
     * y-Koordinate von Feld_26
     */
    int gelbAcht_y;
    /**
     * x-Koordinate von Feld_27
     */
    int gelbNeun_x;
    /**
     * y-Koordinate von Feld_27
     */
    int gelbNeun_y;
    /**
     * x-Koordinate von Feld_28
     */
    int gruenEins_x;
    /**
     * y-Koordinate von Feld_28
     */
    int gruenEins_y;
    /**
     * x-Koordinate von Feld_29
     */
    int gruenZwei_x;
    /**
     * y-Koordinate von Feld_29
     */
    int gruenZwei_y;
    /**
     * x-Koordinate von Feld_30
     */
    int gruenDrei_x;
    /**
     * y-Koordinate von Feld_30
     */
    int gruenDrei_y;
    /**
     * x-Koordinate von Feld_31
     */
    int gruenVier_x;
    /**
     * y-Koordinate von Feld_31
     */
    int gruenVier_y;
    /**
     * x-Koordinate von Feld_32
     */
    int gruenFuenf_x;
    /**
     * y-Koordinate von Feld_32
     */
    int gruenFuenf_y;
    /**
     * x-Koordinate von Feld_33
     */
    int gruenSechs_x;
    /**
     * y-Koordinate von Feld_33
     */
    int gruenSechs_y;
    /**
     * x-Koordinate von Feld_34
     */
    int gruenSieben_x;
    /**
     * y-Koordinate von Feld_34
     */
    int gruenSieben_y;
    /**
     * x-Koordinate von Feld_35
     */
    int gruenAcht_x;
    /**
     * y-Koordinate von Feld_35
     */
    int gruenAcht_y;
    /**
     * x-Koordinate von Feld_36
     */
    int gruenNeun_x;
    /**
     * y-Koordinate von  Feld_36
     */
    int gruenNeun_y;

    /**
     * Zum Erstellen von freien Feldern
     * die unten gelisteten x- und y-Koordinaten sind von Feld 1 bis Feld 36 nach der Reihe nach
     *
     * @param blauEins_x
     * @param blauEins_y
     * @param blauZwei_x
     * @param blauZwei_y
     * @param blauDrei_x
     * @param blauDrei_y
     * @param blauVier_x
     * @param blauVier_y
     * @param blauFuenf_x
     * @param blauFuenf_y
     * @param blauSechs_x
     * @param blauSechs_y
     * @param blauSieben_x
     * @param blauSieben_y
     * @param blauAcht_x
     * @param blauAcht_y
     * @param blauNeun_x
     * @param blauNeun_y
     * @param gruenEins_x
     * @param gruenEins_y
     * @param gruenZwei_x
     * @param gruenZwei_y
     * @param gruenDrei_x
     * @param gruenDrei_y
     * @param gruenVier_x
     * @param gruenVier_y
     * @param gruenFuenf_x
     * @param gruenFuenf_y
     * @param gruenSechs_x
     * @param gruenSechs_y
     * @param gruenSieben_x
     * @param gruenSieben_y
     * @param gruenAcht_x
     * @param gruenAcht_y
     * @param gruenNeun_x
     * @param gruenNeun_y
     * @param gelbEins_x
     * @param gelbEins_y
     * @param gelbZwei_x
     * @param gelbZwei_y
     * @param gelbDrei_x
     * @param gelbDrei_y
     * @param gelbVier_x
     * @param gelbVier_y
     * @param gelbFuenf_x
     * @param gelbFuenf_y
     * @param gelbSechs_x
     * @param gelbSechs_y
     * @param gelbSieben_x
     * @param gelbSieben_y
     * @param gelbAcht_x
     * @param gelbAcht_y
     * @param gelbNeun_x
     * @param gelbNeun_y
     * @param rotEins_x
     * @param rotEins_y
     * @param rotZwei_x
     * @param rotZwei_y
     * @param rotDrei_x
     * @param rotDrei_y
     * @param rotVier_x
     * @param rotVier_y
     * @param rotFuenf_x
     * @param rotFuenf_y
     * @param rotSechs_x
     * @param rotSechs_y
     * @param rotSieben_x
     * @param rotSieben_y
     * @param rotAcht_x
     * @param rotAcht_y
     * @param rotNeun_x
     * @param rotNeun_y
     */
    public FreieFelder(int blauEins_x,
    int blauEins_y,
    int blauZwei_x,
    int blauZwei_y,
    int blauDrei_x,
    int blauDrei_y,
    int blauVier_x,
    int blauVier_y,
    int blauFuenf_x,
    int blauFuenf_y,
    int blauSechs_x,
    int blauSechs_y,
    int blauSieben_x,
    int blauSieben_y,
    int blauAcht_x,
    int blauAcht_y,
    int blauNeun_x,
    int blauNeun_y,
                       int gruenEins_x,
                       int gruenEins_y,
                       int gruenZwei_x,
                       int gruenZwei_y,
                       int gruenDrei_x,
                       int gruenDrei_y,
                       int gruenVier_x,
                       int gruenVier_y,
                       int gruenFuenf_x,
                       int gruenFuenf_y,
                       int gruenSechs_x,
                       int gruenSechs_y,
                       int gruenSieben_x,
                       int gruenSieben_y,
                       int gruenAcht_x,
                       int gruenAcht_y,
                       int gruenNeun_x,
                       int gruenNeun_y,

                       int gelbEins_x,
                       int gelbEins_y,
                       int gelbZwei_x,
                       int gelbZwei_y,
                       int gelbDrei_x,
                       int gelbDrei_y,
                       int gelbVier_x,
                       int gelbVier_y,
                       int gelbFuenf_x,
                       int gelbFuenf_y,
                       int gelbSechs_x,
                       int gelbSechs_y,
                       int gelbSieben_x,
                       int gelbSieben_y,
                       int gelbAcht_x,
                       int gelbAcht_y,
                       int gelbNeun_x,
                       int gelbNeun_y,
    int rotEins_x,
    int rotEins_y,
    int rotZwei_x,
    int rotZwei_y,
    int rotDrei_x,
    int rotDrei_y,
    int rotVier_x,
    int rotVier_y,
    int rotFuenf_x,
    int rotFuenf_y,
    int rotSechs_x,
    int rotSechs_y,
    int rotSieben_x,
    int rotSieben_y,
    int rotAcht_x,
    int rotAcht_y,
    int rotNeun_x,
    int rotNeun_y

    ){

    this.blauEins_x=blauEins_x;
    this.blauEins_y=blauEins_y;
    this.blauZwei_x=blauZwei_x;
        this.blauZwei_y=blauZwei_y;
        this.blauDrei_x=blauDrei_x;
        this.blauDrei_y=blauDrei_y;
        this.blauVier_x=blauVier_x;
        this.blauVier_y=blauVier_y;
        this.blauFuenf_x=blauFuenf_x;
        this.blauFuenf_y=blauFuenf_y;
        this.blauSechs_x=blauSechs_x;
        this.blauSechs_y=blauSechs_y;
        this.blauSieben_x=blauSieben_x;
        this.blauSieben_y=blauSieben_y;
        this.blauAcht_x=blauAcht_x;
        this.blauAcht_y=blauAcht_y;
        this.blauNeun_x=blauNeun_x;
        this.blauNeun_y=blauNeun_y;
        this.rotEins_x=rotEins_x;
        this.rotEins_y=rotEins_y;
        this.rotZwei_x=rotZwei_x;
        this.rotZwei_y=rotZwei_y;
        this.rotDrei_x=rotDrei_x;
        this.rotDrei_y=rotDrei_y;
        this.rotVier_x=rotVier_x;
        this.rotVier_y=rotVier_y;
        this.rotFuenf_x=rotFuenf_x;
        this.rotFuenf_y=rotFuenf_y;
        this.rotSechs_x=rotSechs_x;
        this.rotSechs_y=rotSechs_y;
        this.rotSieben_x=rotSieben_x;
        this.rotSieben_y=rotSieben_y;
        this.rotAcht_x=rotAcht_x;
        this.rotAcht_y=rotAcht_y;
        this.rotNeun_x=rotNeun_x;
        this.rotNeun_y=rotNeun_y;
        this.gelbEins_x=gelbEins_x;
        this.gelbEins_y=gelbEins_y;
        this.gelbZwei_x=gelbZwei_x;
        this.gelbZwei_y=gelbZwei_y;
        this.gelbDrei_x=gelbDrei_x;
        this.gelbDrei_y=gelbDrei_y;
        this.gelbVier_x=gelbVier_x;
        this.gelbVier_y=gelbVier_y;
        this.gelbFuenf_x=gelbFuenf_x;
        this.gelbFuenf_y=gelbFuenf_y;
        this.gelbSechs_x=gelbSechs_x;
        this.gelbSechs_y=gelbSechs_y;
        this.gelbSieben_x=gelbSieben_x;
        this.gelbSieben_y=gelbSieben_y;
        this.gelbAcht_x=gelbAcht_x;
        this.gelbAcht_y=gelbAcht_y;
        this.gelbNeun_x=gelbNeun_x;
        this.gelbNeun_y=gelbNeun_y;
        this.gruenEins_x=gruenEins_x;
        this.gruenEins_y=gruenEins_y;
        this.gruenZwei_x=gruenZwei_x;
        this.gruenZwei_y=gruenZwei_y;
        this.gruenDrei_x=gruenDrei_x;
        this.gruenDrei_y=gruenDrei_y;
        this.gruenVier_x=gruenVier_x;
        this.gruenVier_y=gruenVier_y;
        this.gruenFuenf_x=gruenFuenf_x;
        this.gruenFuenf_y=gruenFuenf_y;
        this.gruenSechs_x=gruenSechs_x;
        this.gruenSechs_y=gruenSechs_y;
        this.gruenSieben_x=gruenSieben_x;
        this.gruenSieben_y=gruenSieben_y;
        this.gruenAcht_x=gruenAcht_x;
        this.gruenAcht_y=gruenAcht_y;
        this.gruenNeun_x=gruenNeun_x;
        this.gruenNeun_y=gruenNeun_y;
    }
}
