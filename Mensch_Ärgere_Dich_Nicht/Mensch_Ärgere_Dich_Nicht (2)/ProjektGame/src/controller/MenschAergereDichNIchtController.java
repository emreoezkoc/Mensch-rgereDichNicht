
/**
 * In diesem package befinden sich alle Klassen, die zum Controller dazugehören.
 * Außerdem befindet sich in diesem package auch der GameState, also der Status des Spiels.
 */

package controller;

import model.MenschAergereDichNichtModel;
import model.Spieler;
import view.IMenschAergereDichNichtView;


/**
 *
 *Eine Controller implementation für eine GUI-View. Dieser Controller erstellt und benutzt eine
 * {@link MenschAergereDichNichtModel}.
 *Diese Klasse ist dafür verantwortlich, was im View gezeichnet wird.
 *
 * @author Emre Özkoc
 */

public class MenschAergereDichNIchtController implements IMenschAergereDichNichtController {

    /**
     * Der Status des Spiels
     */
    private GameState state;

    /**
     * Die Modell-Klasse, welche im Controller benutzt wird.
     * Es wird in der Methode setModel festgelegt, welches Modell verwendet wird, um das Spiel zu zeichnen.
     */
    private MenschAergereDichNichtModel model;

    /**
     * Der View-Interface, womit die Methoden, wie z.B. draw-Methoden, ausführen kann.
     */
    private IMenschAergereDichNichtView view;

    /**
     * Erzeugt einen neuen Controller-Objekt.
     *
     */

    public MenschAergereDichNIchtController() {

    }

    /**
     * Die Zahl, mit dem man bestimmen kann,wer gerade dran ist, indem man den Spielern eine Zahl zuordnet.
     */
    private int dran;

    /**
     * Holt sich die Information über den Würfel von dem Modell.
     * @return die Zahl von dem Würfel
     */

    public int getWuerfel() {
        return model.a;
    }

    /**
     * Stellt den Model ein, welches im Controller benutzt wird.
     * @param model welches benutzt werden soll.
     */

    public void setModel(MenschAergereDichNichtModel model) {
        this.model = model;
        this.state = GameState.Start;
        model.newGame();

    }

    /**
     * Holt sich die Information über den blauen Spieler von dem Modell.
     * @return Spieler Blau Informationen
     */

    public Spieler getBlau() {
        return model.blau;
    }

    /**
     * Holt sich die Information über den grünen Spieler von dem Modell.
     * @return Spieler Grün Informationen
     */

    public Spieler getGruen() {
        return model.gruen;
    }

    /**
     * Holt sich die Information über den gelben Spieler von dem Modell.
     * @return Spieler Gelb Informationen
     */

    public Spieler getGelb() {
        return model.gelb;
    }

    /**
     * Holt sich die Information über den roten Spieler von dem Modell.
     * @return Spieler Rot Informationen
     */

    public Spieler getRot() {
        return model.rot;
    }
    /**
     * Stellt den View ein,welches im Controller benutzt wird.
     * @param view welches benutzt werden soll.
     */

    public void setView(IMenschAergereDichNichtView view) {
        this.view = view;
    }

    /**
     * Holt sich die Information von dem Modell, welcher Spieler gerade dran ist.
     * @return die Zahl welche anzeigt, welcher Spieler dran ist.
     */

    public int getDran() {
        return dran;
    }

    /**
     *Ruft die draw-Methoden, abhängig von dem Spielstatus.
     */
    public void nextFrame() {
        if (state == GameState.Start) {
            view.drawStart();
        }

        if (state == GameState.Auswahl) {
            view.drawAuswahl();
            model.newGame();

        }
        if (state == GameState.Blau) {
            view.drawGameBlau();

        }
        if (state == GameState.Gruen) {
            view.drawGameGruen();

        }
        if (state == GameState.Gelb) {
            view.drawGameGelb();

        }
        if (state == GameState.Rot) {
            view.drawGameRot();

        }if(state==GameState.Ende){
            view.drawEnde();
        }

    }

    /**
     * Mit dieser Methode ist es möglich, wenn man dran ist, zu würfeln, um seine Figur zu bewegen.
     * Außerdem sorgt diese Methode dafür, dass wenn deine Figur oder die Figur deiner Gegner auf das Feld draufkommt, auf dem
     * sich eine Figur befindet, dass dieser nach Hause geschickt wird.
     * Diese Methode überprüft auch, ob das Spiel zu Ende ist, wenn ja, dann wird das Spiel beendet.
     * @param x ist die x-Koordinate von dem Maus
     * @param y ist die y-Koordinate von dem Maus
     */

    public void userInput(int x, int y) {
        switch (state) {
            case Start -> {
                if (view.getStart().isPressed()) {
                    state = GameState.Auswahl;

                }
            }
            case Auswahl -> {


                if (view.getBlau().isPressed()) {
                    state = GameState.Blau;
                    dran = 1;

                }
                if (view.getGruen().isPressed()) {
                    state = GameState.Gruen;
                    dran = 2;
                }
                if (view.getGelb().isPressed()) {
                    state = GameState.Gelb;
                    dran = 3;

                }
                if (view.getRot().isPressed()) {
                    state = GameState.Rot;
                    dran = 4;
                }
            }
            case Blau -> {

                                if (dran == 1) {
if(model.blau.Ende_4_x==model.blau.a.vier_x&&model.blau.Ende_4_y==model.blau.a.vier_y){
    dran=2;
}else{
                                    view.getWuerfel().show();
                                    if (view.getWuerfel().isPressed()) {
                                        System.out.println("Dran ist 1 und Wuerfel ist" + model.a);
                                        model.move(model.blau);
                                        model.rauswerfen(model.gruen, model.blau);
                                        model.rauswerfen(model.gelb, model.blau);
                                        model.rauswerfen(model.rot, model.blau);
                                        model.platzieren(model.blau);


                                        System.out.println(getBlau().a.t);
                                        System.out.println(getBlau().platz);

                                        dran = 2;
                                        try {
                                            Thread.sleep(500);
                                        } catch (InterruptedException e) {
                                            throw new RuntimeException(e);
                                        }
                                    }
                                    }
                                }


                              else if (dran == 2) {
                                    if (model.gruen.Ende_4_x == model.gruen.a.vier_x && model.gruen.Ende_4_y == model.gruen.a.vier_y) {
                                        dran = 3;
                                    }else{

                                    view.getWuerfel().hide();
                                    System.out.println("Dran ist 2 und Wuerfel ist" + model.a);
                                    model.move(model.gruen);
                                    model.rauswerfen(model.blau, model.gruen);
                                    model.rauswerfen(model.gelb, model.gruen);
                                    model.rauswerfen(model.rot, model.gruen);
                                    model.platzieren(model.gruen);


                                    System.out.println(getGruen().a.t);
                                    System.out.println(getGruen().platz);


                                    dran = 3;
                                    try {
                                        Thread.sleep(500);
                                    } catch (InterruptedException e) {
                                        throw new RuntimeException(e);
                                    }
                                }
                                }


                               else if (dran == 3) {
                                    if(model.gelb.Ende_4_x==model.gelb.a.vier_x&&model.gelb.Ende_4_y==model.gelb.a.vier_y){
                                        dran=4;
                                    }else{
                                    view.getWuerfel().hide();

                                    model.move(model.gelb);
                                    model.rauswerfen(model.gruen, model.gelb);
                                    model.rauswerfen(model.blau, model.gelb);
                                    model.rauswerfen(model.rot, model.gelb);
                                    model.platzieren(model.gelb);

                                    System.out.println("Dran ist 3 und Wuerfel ist" + model.a);

                                    System.out.println(getGelb().a.t);
                                    System.out.println(getGelb().platz);


                                    dran = 4;
                                 try {
                                        Thread.sleep(500);
                                    } catch (InterruptedException e) {
                                        throw new RuntimeException(e);
                                    }
                               }
                                }



                               else if (dran == 4) {
                                    if(model.rot.Ende_4_x==model.rot.a.vier_x&&model.rot.Ende_4_y==model.rot.a.vier_y){
                                        dran=1;
                                    }else {

                                        view.getWuerfel().hide();

                                        model.move(model.rot);
                                        model.rauswerfen(model.gruen, model.rot);
                                        model.rauswerfen(model.gelb, model.rot);
                                        model.rauswerfen(model.blau, model.rot);
                                        model.platzieren(model.rot);
                                        System.out.println("Dran ist 4 und Wuerfel ist" + model.a);
                                        System.out.println(getRot().a.t);

                                        System.out.println(getRot().platz);
                                        dran = 1;
                                        try {
                                            Thread.sleep(500);
                                        } catch (InterruptedException e) {
                                            throw new RuntimeException(e);
                                        }
                                    }
                                }


                if(getBlau().platz==4|getGelb().platz==4|getGruen().platz==4|getRot().platz==4){
                                    state=GameState.Ende;
                                }





            }

        case Gruen -> {


                    if (dran == 1) {
                        if(model.blau.Ende_4_x==model.blau.a.vier_x&&model.blau.Ende_4_y==model.blau.a.vier_y){
                            dran=2;
                        }else {
                            view.getWuerfel().hide();
                            System.out.println("Dran ist 1 und Wuerfel ist" + model.a);

                            model.move(model.blau);
                            model.rauswerfen(model.gruen, model.blau);
                            model.rauswerfen(model.gelb, model.blau);
                            model.rauswerfen(model.rot, model.blau);
                            model.platzieren(model.blau);


                            System.out.println(getBlau().a.t);
                            dran = 2;

                            try {
                                Thread.sleep(500);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                    else if (dran == 2) {
                        if (model.gruen.Ende_4_x == model.gruen.a.vier_x && model.gruen.Ende_4_y == model.gruen.a.vier_y) {
                            dran = 3;
                        }else{
                        view.getWuerfel().show();
                        if (view.getWuerfel().isPressed()) {
                            System.out.println("Dran ist 2 und Wuerfel ist" + model.a);
                            model.move(model.gruen);
                            model.rauswerfen(model.blau, model.gruen);
                            model.rauswerfen(model.gelb, model.gruen);
                            model.rauswerfen(model.rot, model.gruen);
                            model.platzieren(model.gruen);
                            System.out.println(getGruen().a.t);
                            dran = 3;

                            try {
                                Thread.sleep(500);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                        }
                    } else if (dran == 3) {
                        if(model.gelb.Ende_4_x==model.gelb.a.vier_x&&model.gelb.Ende_4_y==model.gelb.a.vier_y){
                            dran=4;
                        }else {
                            view.getWuerfel().hide();
                            System.out.println("Dran ist 3 und Wuerfel ist" + model.a);
                            model.move(model.gelb);
                            model.rauswerfen(model.gruen, model.gelb);
                            model.rauswerfen(model.blau, model.gelb);
                            model.rauswerfen(model.rot, model.gelb);
                            model.platzieren(model.gelb);


                            System.out.println(getGelb().a.t);
                            dran = 4;
                            try {
                                Thread.sleep(500);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    } else if (dran == 4) {
                        if (model.rot.Ende_4_x == model.rot.a.vier_x && model.rot.Ende_4_y == model.rot.a.vier_y) {
                            dran = 1;
                        } else {

                            view.getWuerfel().hide();
                            System.out.println("Dran ist 4 und Wuerfel ist" + model.a);
                            model.move(model.rot);
                            model.rauswerfen(model.gruen, model.rot);
                            model.rauswerfen(model.gelb, model.rot);
                            model.rauswerfen(model.blau, model.rot);
                            model.platzieren(model.rot);


                            System.out.println(getRot().a.t);

                            dran = 1;
                            try {
                                Thread.sleep(500);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                        if (getBlau().platz == 4 | getGelb().platz == 4 | getGruen().platz == 4 | getRot().platz == 4) {
                            state = GameState.Ende;
                        }

        }

            case Gelb -> {


                if (dran == 1) {
                    if(model.blau.Ende_4_x==model.blau.a.vier_x&&model.blau.Ende_4_y==model.blau.a.vier_y){
                        dran=2;
                    }else {
                        view.getWuerfel().hide();
                        System.out.println("Dran ist 1 und Wuerfel ist" + model.a);
                        model.move(model.blau);
                        model.rauswerfen(model.gruen, model.blau);
                        model.rauswerfen(model.gelb, model.blau);
                        model.rauswerfen(model.rot, model.blau);
                        model.platzieren(model.blau);


                        System.out.println(getBlau().a.t);
                        dran = 2;

                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
                else if (dran == 2) {
                    if (model.gruen.Ende_4_x == model.gruen.a.vier_x && model.gruen.Ende_4_y == model.gruen.a.vier_y) {
                        dran = 3;
                    }else {
                        view.getWuerfel().hide();

                        System.out.println("Dran ist 2 und Wuerfel ist" + model.a);
                        model.move(model.gruen);
                        model.rauswerfen(model.blau, model.gruen);
                        model.rauswerfen(model.gelb, model.gruen);
                        model.rauswerfen(model.rot, model.gruen);
                        model.platzieren(model.gruen);


                        System.out.println(getGruen().a.t);
                        dran = 3;
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                } else if (dran == 3) {
                    if(model.gelb.Ende_4_x==model.gelb.a.vier_x&&model.gelb.Ende_4_y==model.gelb.a.vier_y){
                        dran=4;
                    }else{
                    view.getWuerfel().show();
                    if (view.getWuerfel().isPressed()) {
                        System.out.println("Dran ist 3 und Wuerfel ist" + model.a);
                        model.move(model.gelb);
                        model.rauswerfen(model.blau, model.gelb);
                        model.rauswerfen(model.gruen, model.gelb);
                        model.rauswerfen(model.rot, model.gelb);
                        model.platzieren(model.gelb);

                        dran = 4;
                        System.out.println(getGelb().a.t);
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    }

                } else if (dran == 4) {
                    if(model.rot.Ende_4_x==model.rot.a.vier_x&&model.rot.Ende_4_y==model.rot.a.vier_y){
                        dran=1;
                    }else {

                        view.getWuerfel().hide();

                        model.move(model.rot);
                        model.rauswerfen(model.gruen, model.rot);
                        model.rauswerfen(model.gelb, model.rot);
                        model.rauswerfen(model.blau, model.rot);
                        model.platzieren(model.rot);

                        System.out.println("Dran ist 4 und Wuerfel ist" + model.a);

                        System.out.println(getRot().a.t);

                        dran = 1;
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }

                    }
                }
                        if(getBlau().platz==4|getGelb().platz==4|getGruen().platz==4|getRot().platz==4){
                            state=GameState.Ende;
                        }

            }
            case Rot -> {



                if (dran == 1) {
                    if(model.blau.Ende_4_x==model.blau.a.vier_x&&model.blau.Ende_4_y==model.blau.a.vier_y){
                        dran=2;
                    }else {
                        view.getWuerfel().hide();

                        model.move(model.blau);
                        model.rauswerfen(model.gruen, model.blau);
                        model.rauswerfen(model.gelb, model.blau);
                        model.rauswerfen(model.rot, model.blau);
                        model.platzieren(model.blau);

                        System.out.println("Dran ist 1 und Wuerfel ist" + model.a);
                        System.out.println(getBlau().a.t);

                        dran = 2;
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
                else if (dran == 2) {
                    if (model.gruen.Ende_4_x == model.gruen.a.vier_x && model.gruen.Ende_4_y == model.gruen.a.vier_y) {
                        dran = 3;
                    }else {
                        view.getWuerfel().hide();

                        System.out.println("Dran ist 2 und Wuerfel ist" + model.a);
                        model.move(model.gruen);
                        model.rauswerfen(model.blau, model.gruen);
                        model.rauswerfen(model.gelb, model.gruen);
                        model.rauswerfen(model.rot, model.gruen);
                        model.platzieren(model.gruen);


                        System.out.println(getGruen().a.t);

                        dran = 3;
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
                else if (dran == 3) {
                    if(model.gelb.Ende_4_x==model.gelb.a.vier_x&&model.gelb.Ende_4_y==model.gelb.a.vier_y){
                        dran=4;
                    }else {
                        view.getWuerfel().hide();

                        model.move(model.gelb);
                        model.rauswerfen(model.gruen, model.gelb);
                        model.rauswerfen(model.blau, model.gelb);
                        model.rauswerfen(model.rot, model.gelb);
                        model.platzieren(model.gelb);

                        System.out.println("Dran ist 3 und Wuerfel ist" + model.a);

                        System.out.println(getGelb().a.t);
                        dran = 4;
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                } else if (dran == 4) {
                    if(model.rot.Ende_4_x==model.rot.a.vier_x&&model.rot.Ende_4_y==model.rot.a.vier_y){
                        dran=1;
                    }else {

                    view.getWuerfel().show();
                    if (view.getWuerfel().isPressed()) {

                        model.move(model.rot);
                        model.rauswerfen(model.gruen, model.rot);
                        model.rauswerfen(model.gelb, model.rot);
                        model.rauswerfen(model.blau, model.rot);
                        model.platzieren(model.rot);

                        System.out.println("Dran ist 4 und Wuerfel ist" + model.a);
                        dran = 1;
                        System.out.println(getRot().a.t);

                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    }
                }
                        if(getBlau().platz==4|getGelb().platz==4|getGruen().platz==4|getRot().platz==4){
                            state=GameState.Ende;
                        }

            }

        }
    }
}