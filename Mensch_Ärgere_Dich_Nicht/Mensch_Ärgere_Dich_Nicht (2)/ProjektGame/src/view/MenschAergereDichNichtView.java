/**
 * In diesem package befinden sich alle Klassen, die zum View dazugehören.
 *
 */
package view;

import controlP5.*;
import controller.IMenschAergereDichNichtController;
import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;


/**
 * Die View-Klasse zum Zeichnen des Mensch-Ärgere-Dich-Nicht Spiels.
 *
 * @author Emre Özkoc
 */

public class MenschAergereDichNichtView extends PApplet implements IMenschAergereDichNichtView{

    /**
     * Es wird ein ControlP5 erstellt, um die Knöpfe zu erstellen.
     */
    private ControlP5 cp5;

    /**
     * Der Start-Knopf
     */
    private Button Start;

    /**
     * Knopf zum Würfeln
     */
    private Button Wuerfel;

    /**
     * Knopf zum Auswählen von Spieler blau
     */
    private Button Blau;
    /**
     * Knopf zum Auswählen von Spieler grün
     */
    private Button Gruen;
    /**
     * Knopf zum Auswählen von Spieler gelb
     */
    private Button Gelb;
    /**
     * Knopf zum Auswählen von Spieler rot
     */
    private Button Rot;

    /**
     * Bild von einer blauen Figur
     */
private PImage blau;
    /**
     * Bild von einer grünen Figur
     */
    private PImage gruen;
    /**
     * Bild von einer gelben Figur
     */
    private PImage gelb;
    /**
     * Bild von einer roten Figur
     */
    private PImage rot;
    /**
     * Bild von Würfelseite mit der Zahl 1
     */
    private PImage wuerfel_1;
    /**
     * Bild von Würfelseite mit der Zahl 2
     */
    private PImage wuerfel_2;
    /**
     * Bild von Würfelseite mit der Zahl 3
     */
    private PImage wuerfel_3;
    /**
     * Bild von Würfelseite mit der Zahl 4
     */
    private PImage wuerfel_4;
    /**
     * Bild von Würfelseite mit der Zahl 5
     */
    private PImage wuerfel_5;
    /**
     * Bild von Würfelseite mit der Zahl 6
     */
    private PImage wuerfel_6;

    /**
     * Steht für Hintergrundbild, welches mithilfe des Threads aus dem Internet aufgerufen wird.
     */
    private String h;

    /**
     * Der Controller-Interface, der bestimmt was gerade angezeigt werden soll.
     */
    private IMenschAergereDichNichtController controller;

    /**
     * Setzt die Größe von View fest.
     * @param width Länge
     * @param height Breite
     */
    public MenschAergereDichNichtView(int width,int height){
        setSize(width,height);
    }

    /**
     * Ist der Controller welches in View verwendet werden soll. Damit man das MVC Konzept benutzen kann.
     * @param controller welches verwendet werden soll.
     */
    public void setController(IMenschAergereDichNichtController controller){
        this.controller=controller;

    }

    /**
     * Lädt die Bilder, die im Spiel verwendet werden, setzt Framerate fest und erstellt die Knöpfe.
     */

    public void setup(){

        Thread t=new Thread(() ->{
                while (true) {
h="https://www.spiele4us.de/wp-content/uploads/2022/10/g029200140-unbekannt-mensch-aergere-dich-nicht-spielteppich-gebraucht-14460276655630a1916e09e.jpg";
                    loadImage(h);
                }

        });
        t.start();
        blau = loadImage("blau.jpg");
        gruen = loadImage("gruen.jpg");
        gelb = loadImage("gelb.jpg");
        rot = loadImage("rot.jpg");
        wuerfel_1 = loadImage("Wuerfel_1.png");
        wuerfel_2 = loadImage("Wuerfel_2.png");
        wuerfel_3 = loadImage("Wuerfel_3.png");
        wuerfel_4 = loadImage("Wuerfel_4.png");
        wuerfel_5 = loadImage("Wuerfel_5.png");
        wuerfel_6 = loadImage("Wuerfel_6.png");

        frameRate(120);
        cp5=new ControlP5(this);
        Start=cp5.addButton("Start");
        Wuerfel=cp5.addButton("Wuerfeln");
        Blau=cp5.addButton("Blau");
        Gruen=cp5.addButton("Gruen");
        Gelb=cp5.addButton("Gelb");
        Rot=cp5.addButton("Rot");
        Start.setPosition(width/3,height-200);
        Start.setSize(250,100);

    }

    /**
     * Zeichnet das Spiel, je nach Status des Controllers.
     */
    public void draw(){
        controller.nextFrame();
        controller.userInput(mouseX,mouseY);

    }

    /**
     * Holt sich die Information über den Start-Knopf von dem View.
     * @return Start-Knopf-Informationen
     */
    public Button getStart(){
        return Start;
    }
    /**
     * Holt sich die Information über den Würfel-Knopf von dem View.
     * @return Würfel-Knopf-Informationen
     */

    public Button getWuerfel(){return Wuerfel;}
    /**
     * Holt sich die Information über den Blau-Knopf von dem View.
     * @return Blau-Knopf-Informationen
     */
    public Button getBlau(){return Blau;}
    /**
     * Holt sich die Information über den Grün-Knopf von dem View.
     * @return Grün-Knopf-Informationen
     */
    public Button getGruen(){return Gruen;}
    /**
     * Holt sich die Information über den Gelb-Knopf von dem View.
     * @return Gelb-Knopf-Informationen
     */
    public Button getGelb(){return Gelb;}
    /**
     * Holt sich die Information über den Rot-Knopf von dem View.
     * @return Rot-Knopf-Informationen
     */
    public Button getRot(){return Rot;}

    /**
     * Was im Startbildschirm dargestellt werden soll.
     * Der Controller bestimmt, welche draw-Methode dran ist(Die Standart draw-Methode wird immer ausgeführt).
     */
    public void drawStart(){
        background(loadImage(h));


  Start.show();
Wuerfel.hide();
Blau.hide();
        Gruen.hide();
        Gelb.hide();
        Rot.hide();
    }
    /**
     * Was im Endbildschirm dargestellt werden soll.
     * Der Controller bestimmt, welche draw-Methode dran ist(Die Standart draw-Methode wird immer ausgeführt).
     */
    public void drawEnde(){
        Wuerfel.hide();
        background(255);
        PFont pFont=createFont("Arial", 30, false);
        textFont(pFont);
        textSize(100);
        text("1.",50,250);
        textSize(100);
        text("2.",250,250);
        textSize(100);
        text("3.",450,250);
        textSize(100);
        text("4.",650,250);

        if(controller.getBlau().platz==1){
            image(blau,50,500);
        }else if(controller.getGruen().platz==1){
            image(gruen,50,500);
        }else if(controller.getGelb().platz==1){
            image(gelb,50,500);
        }else if(controller.getRot().platz==1){
            image(rot,50,500);
        }
        if(controller.getBlau().platz==2){
            image(blau,250,500);
        }else if(controller.getGruen().platz==2){
            image(gruen,250,500);
        }else if(controller.getGelb().platz==2){
            image(gelb,250,500);
        }else if(controller.getRot().platz==2){
            image(rot,250,500);
        }
        if(controller.getBlau().platz==3){
            image(blau,450,500);
        }else if(controller.getGruen().platz==3){
            image(gruen,450,500);
        }else if(controller.getGelb().platz==3){
            image(gelb,450,500);
        }else if(controller.getRot().platz==3){
            image(rot,450,500);
        }
        if(controller.getBlau().platz==4){
            image(blau,650,500);
        }else if(controller.getGruen().platz==4){
            image(gruen,650,500);
        }else if(controller.getGelb().platz==4){
            image(gelb,650,500);
        }else if(controller.getRot().platz==4){
            image(rot,650,500);
        }

    }
    /**
     * Was im Auswahlbildschirm dargestellt werden soll.
     * Der Controller bestimmt, welche draw-Methode dran ist(Die Standart draw-Methode wird immer ausgeführt).
     */
    public void drawAuswahl(){
    background(255);
    fill(0);
        PFont pFont=createFont("Arial", 30, false);
        textFont(pFont);
    text("Wähle deine Figur aus:",200,250);
    textSize(100);
    Start.hide();
    Wuerfel.hide();
        Blau.show();
        Gruen.show();
        Gelb.show();
        Rot.show();

        image(blau,50,height-300);
        blau.resize(100,100);
        image(gruen,250,height-300);
        gruen.resize(100,100);
        image(gelb,450,height-310);
        gelb.resize(100,120);
        image(rot,650,height-310);
        rot.resize(100,120);

        Blau.setPosition(50,height-200);
        Blau.setSize(100,50);
        Gruen.setPosition(250,height-200);
        Gruen.setSize(100,50);
        Gelb.setPosition(450,height-200);
        Gelb.setSize(100,50);
        Rot.setPosition(650,height-200);
        Rot.setSize(100,50);
    }

    /**
     * Was dargestellt werden soll, wenn man als seine Farbe die blau wählt.
     * Der Controller bestimmt, welche draw-Methode dran ist(Die Standart draw-Methode wird immer ausgeführt).
     */
    public void drawGameBlau() {
        background(255);
        Blau.hide();
        Gruen.hide();
        Gelb.hide();
        Rot.hide();



        //blau
        fill(0, 0, 255);

        circle(410, 125, 50);
        circle(410, 200, 50);
        circle(410, 275, 50);
        circle(410, 350, 50);


        //rot
        fill(255, 0, 0);
        circle(125, 410, 50);
        circle(200, 410, 50);
        circle(275, 410, 50);
        circle(350, 410, 50);


        //gruen
        fill(0, 255, 0);

        circle(680, 410, 50);
        circle(610, 410, 50);
        circle(540, 410, 50);
        circle(470, 410, 50);


        //gelb
        fill(255, 255, 0);

        circle(410, 680, 50);
        circle(410, 610, 50);
        circle(410, 540, 50);
        circle(410, 470, 50);


        if (controller.getDran() == 1) {
            Wuerfel.show();
            Wuerfel.setPosition(560, 100);
        } else if (controller.getDran() != 1) {
            Wuerfel.hide();
        }
        if(controller.getBlau().Ende_4_x!=controller.getBlau().a.vier_x|controller.getBlau().Ende_4_y!=controller.getBlau().a.vier_y){
        if (controller.getDran() == 2) {
            if (controller.getWuerfel() == 1) {
                image(wuerfel_1, 560, 150);
                wuerfel_1.resize(100, 100);

            }
            if (controller.getWuerfel() == 2) {
                image(wuerfel_2, 560, 150);
                wuerfel_2.resize(100, 100);
            }
            if (controller.getWuerfel() == 3) {
                image(wuerfel_3, 560, 150);
                wuerfel_3.resize(100, 100);
            }
            if (controller.getWuerfel() == 4) {
                image(wuerfel_4, 560, 150);
                wuerfel_4.resize(100, 100);
            }
            if (controller.getWuerfel() == 5) {
                image(wuerfel_5, 560, 150);
                wuerfel_5.resize(100, 100);
            }
            if (controller.getWuerfel() == 6) {
                image(wuerfel_6, 560, 150);
                wuerfel_6.resize(100, 100);
            }
        }
        }

        if (controller.getDran() == 3) {
            if (controller.getGruen().Ende_4_x != controller.getGruen().a.vier_x|controller.getGruen().Ende_4_y != controller.getGruen().a.vier_y) {
                if (controller.getWuerfel() == 1) {
                    image(wuerfel_1, 560, 550);
                    wuerfel_1.resize(100, 100);
                }
                if (controller.getWuerfel() == 2) {
                    image(wuerfel_2, 560, 550);
                    wuerfel_2.resize(100, 100);
                }
                if (controller.getWuerfel() == 3) {
                    image(wuerfel_3, 560, 550);
                    wuerfel_3.resize(100, 100);
                }
                if (controller.getWuerfel() == 4) {
                    image(wuerfel_4, 560, 550);
                    wuerfel_4.resize(100, 100);
                }
                if (controller.getWuerfel() == 5) {
                    image(wuerfel_5, 560, 550);
                    wuerfel_5.resize(100, 100);
                }
                if (controller.getWuerfel() == 6) {
                    image(wuerfel_6, 560, 550);
                    wuerfel_6.resize(100, 100);
                }
            }
        }
        if (controller.getDran() == 4) {
            if (controller.getGelb().Ende_4_x != controller.getGelb().a.vier_x | controller.getGelb().Ende_4_y != controller.getGelb().a.vier_y) {
                if (controller.getWuerfel() == 1) {
                    image(wuerfel_1, 180, 550);
                    wuerfel_1.resize(100, 100);
                }
                if (controller.getWuerfel() == 2) {
                    image(wuerfel_2, 180, 550);
                    wuerfel_2.resize(100, 100);
                }
                if (controller.getWuerfel() == 3) {
                    image(wuerfel_3, 180, 550);
                    wuerfel_3.resize(100, 100);
                }
                if (controller.getWuerfel() == 4) {
                    image(wuerfel_4, 180, 550);
                    wuerfel_4.resize(100, 100);
                }
                if (controller.getWuerfel() == 5) {
                    image(wuerfel_5, 180, 550);
                    wuerfel_5.resize(100, 100);
                }
                if (controller.getWuerfel() == 6) {
                    image(wuerfel_6, 180, 550);
                    wuerfel_6.resize(100, 100);
                }
            }
        }
        if (controller.getDran() == 1) {
            if(controller.getRot().Ende_4_x!=controller.getRot().a.vier_x|controller.getRot().Ende_4_y!=controller.getRot().a.vier_y) {
                if (controller.getWuerfel() == 1) {
                    image(wuerfel_1, 180, 150);
                    wuerfel_1.resize(100, 100);
                }
                if (controller.getWuerfel() == 2) {
                    image(wuerfel_2, 180, 150);
                    wuerfel_2.resize(100, 100);
                }
                if (controller.getWuerfel() == 3) {
                    image(wuerfel_3, 180, 150);
                    wuerfel_3.resize(100, 100);
                }
                if (controller.getWuerfel() == 4) {
                    image(wuerfel_4, 180, 150);
                    wuerfel_4.resize(100, 100);
                }
                if (controller.getWuerfel() == 5) {
                    image(wuerfel_5, 180, 150);
                    wuerfel_5.resize(100, 100);
                }
                if (controller.getWuerfel() == 6) {
                    image(wuerfel_6, 180, 150);
                    wuerfel_6.resize(100, 100);
                }
            }
        }


            if (controller.getBlau().a.t == 1) {
                if(controller.getBlau().platz==1|controller.getBlau().platz==2|controller.getBlau().platz==3|controller.getBlau().platz==4){
                    fill(0, 0, 255);
                    circle(470, 50, 50);
                }else {
                    fill(64, 224, 208);
                    circle(470, 50, 50);
                }
            } else {
                fill(0, 0, 255);
                circle(470, 50, 50);
            }
            if (controller.getBlau().a.t == 2) {
                fill(64, 224, 208);
                circle(470, 125, 50);
            } else {
                fill(255);
                circle(470, 125, 50);
            }
            if (controller.getBlau().a.t == 3) {
                fill(64, 224, 208);
                circle(470, 200, 50);
            } else {
                fill(255);
                circle(470, 200, 50);
            }
            if (controller.getBlau().a.t == 4) {
                fill(64, 224, 208);
                circle(470, 275, 50);
            } else {
                fill(255);
                circle(470, 275, 50);
            }
            if (controller.getBlau().a.t == 5) {
                fill(64, 224, 208);
                circle(470, 350, 50);

            } else {
                fill(255);
                circle(470, 350, 50);
            }
            if (controller.getBlau().a.t == 6) {
                fill(64, 224, 208);
                circle(540, 350, 50);
            } else {
                fill(255);
                circle(540, 350, 50);
            }
            if (controller.getBlau().a.t == 7) {
                fill(64, 224, 208);
                circle(610, 350, 50);
            } else {
                fill(255);
                circle(610, 350, 50);
            }
            if (controller.getBlau().a.t == 8) {
                fill(64, 224, 208);
                circle(680, 350, 50);
            } else {
                fill(255);
                circle(680, 350, 50);
            }
            if (controller.getBlau().a.t == 9) {
                fill(64, 224, 208);
                circle(750, 350, 50);
            } else {
                fill(255);
                circle(750, 350, 50);
            }
            if (controller.getBlau().a.t == 10) {
                fill(64, 224, 208);
                circle(750, 410, 50);
            } else {
                fill(255);
                circle(750, 410, 50);
            }
            if (controller.getBlau().a.t == 11) {
                fill(64, 224, 208);
                circle(750, 470, 50);
            } else {
                fill(0, 255, 0);
                circle(750, 470, 50);
            }
            if (controller.getBlau().a.t == 12) {
                fill(64, 224, 208);
                circle(680, 470, 50);
            } else {
                fill(255);
                circle(680, 470, 50);
            }
            if (controller.getBlau().a.t == 13) {
                fill(64, 224, 208);
                circle(610, 470, 50);
            } else {
                fill(255);
                circle(610, 470, 50);
            }
            if (controller.getBlau().a.t == 14) {
                fill(64, 224, 208);
                circle(540, 470, 50);
            } else {
                fill(255);
                circle(540, 470, 50);
            }
            if (controller.getBlau().a.t == 15) {
                fill(64, 224, 208);
                circle(470, 470, 50);
            } else {
                fill(255);
                circle(470, 470, 50);
            }
            if (controller.getBlau().a.t == 16) {
                fill(64, 224, 208);
                circle(470, 540, 50);
            } else {
                fill(255);
                circle(470, 540, 50);
            }
            if (controller.getBlau().a.t == 17) {
                fill(64, 224, 208);
                circle(470, 610, 50);
            } else {
                fill(255);
                circle(470, 610, 50);
            }
            if (controller.getBlau().a.t == 18) {
                fill(64, 224, 208);
                circle(470, 680, 50);
            } else {
                fill(255);
                circle(470, 680, 50);
            }
            if (controller.getBlau().a.t == 19) {
                fill(64, 224, 208);
                circle(470, 750, 50);
            } else {
                fill(255);
                circle(470, 750, 50);
            }
            if (controller.getBlau().a.t == 20) {
                fill(64, 224, 208);
                circle(410, 750, 50);
            } else {
                fill(255);
                circle(410, 750, 50);
            }
            if (controller.getBlau().a.t == 21) {
                fill(64, 224, 208);
                circle(350, 750, 50);
            } else {
                fill(255, 255, 0);
                circle(350, 750, 50);
            }
            if (controller.getBlau().a.t == 22) {
                fill(64, 224, 208);
                circle(350, 680, 50);
            } else {
                fill(255);
                circle(350, 680, 50);
            }
            if (controller.getBlau().a.t == 23) {
                fill(64, 224, 208);
                circle(350, 610, 50);
            } else {
                fill(255);
                circle(350, 610, 50);
            }
            if (controller.getBlau().a.t == 24) {
                fill(64, 224, 208);
                circle(350, 540, 50);
            } else {
                fill(255);
                circle(350, 540, 50);
            }
            if (controller.getBlau().a.t == 25) {
                fill(64, 224, 208);
                circle(350, 470, 50);
            } else {
                fill(255);
                circle(350, 470, 50);
            }
            if (controller.getBlau().a.t == 26) {
                fill(64, 224, 208);
                circle(275, 470, 50);
            } else {
                fill(255);
                circle(275, 470, 50);
            }
            if (controller.getBlau().a.t == 27) {
                fill(64, 224, 208);
                circle(200, 470, 50);
            } else {
                fill(255);
                circle(200, 470, 50);
            }
            if (controller.getBlau().a.t == 28) {
                fill(64, 224, 208);
                circle(125, 470, 50);
            } else {
                fill(255);
                circle(125, 470, 50);
            }
            if (controller.getBlau().a.t == 29) {
                fill(64, 224, 208);
                circle(50, 470, 50);
            } else {
                fill(255);
                circle(50, 470, 50);
            }
            if (controller.getBlau().a.t == 30) {
                fill(64, 224, 208);
                circle(50, 410, 50);
            } else {
                fill(255);
                circle(50, 410, 50);
            }
            if (controller.getBlau().a.t == 31) {
                fill(64, 224, 208);
                circle(50, 350, 50);
            } else {
                fill(255, 0, 0);
                circle(50, 350, 50);
            }
            if (controller.getBlau().a.t == 32) {
                fill(64, 224, 208);
                circle(125, 350, 50);
            } else {
                fill(255);
                circle(125, 350, 50);
            }
            if (controller.getBlau().a.t == 33) {
                fill(64, 224, 208);
                circle(200, 350, 50);
            } else {
                fill(255);
                circle(200, 350, 50);
            }
            if (controller.getBlau().a.t == 34) {
                fill(64, 224, 208);
                circle(275, 350, 50);
            } else {
                fill(255);
                circle(275, 350, 50);
            }
            if (controller.getBlau().a.t == 35) {
                fill(64, 224, 208);
                circle(350, 350, 50);
            } else {
                fill(255);
                circle(350, 350, 50);
            }
            if (controller.getBlau().a.t == 36) {
                fill(64, 224, 208);
                circle(350, 275, 50);
            } else {
                fill(255);
                circle(350, 275, 50);
            }
            if (controller.getBlau().a.t == 37) {
                fill(64, 224, 208);
                circle(350, 200, 50);
            } else {
                fill(255);
                circle(350, 200, 50);
            }
            if (controller.getBlau().a.t == 38) {
                fill(64, 224, 208);
                circle(350, 125, 50);
            } else {
                fill(255);
                circle(350, 125, 50);
            }
            if (controller.getBlau().a.t == 39) {
                fill(64, 224, 208);
                circle(350, 50, 50);
            } else {
                fill(255);
                circle(350, 50, 50);
            }
            if (controller.getBlau().a.t == 40) {
                fill(64, 224, 208);
                circle(410, 50, 50);
            } else {
                fill(255);
                circle(410, 50, 50);
            }
            if (controller.getBlau().a.t == 41|(controller.getBlau().a.vier_x==controller.getBlau().Ende_4_x&&controller.getBlau().a.vier_y==controller.getBlau().Ende_4_y)) {
                fill(64, 224, 208);
                circle(410, 125, 50);
            } else {
                fill(0,0,255);
                circle(410, 125, 50);
            }
            if (controller.getBlau().a.t == 42|(controller.getBlau().a.drei_x==controller.getBlau().Ende_3_x&&controller.getBlau().a.drei_y==controller.getBlau().Ende_3_y)) {
                fill(64, 224, 208);
                circle(410, 200, 50);
            } else {
                fill(0,0,255);
                circle(410, 200, 50);
            }
            if (controller.getBlau().a.t == 43|(controller.getBlau().a.zwei_x==controller.getBlau().Ende_2_x&&controller.getBlau().a.zwei_y==controller.getBlau().Ende_2_y)) {
                fill(64, 224, 208);
                circle(410, 275, 50);
            } else {
                fill(0,0,255);
                circle(410, 275, 50);
            }
            if (controller.getBlau().a.t == 44|(controller.getBlau().a.eins_x==controller.getBlau().Ende_1_x&&controller.getBlau().a.eins_y==controller.getBlau().Ende_1_y)) {
                fill(64, 224, 208);
                circle(410, 350, 50);
            } else {
                fill(0,0,255);
                circle(410, 350, 50);
            }

        if(controller.getGruen().a.t==1){
            fill(0,250,154);
            circle(470,50,50);
        }
        if(controller.getGruen().a.t==2){
            fill(0,250,154);
            circle(470,125,50);
        }
        if(controller.getGruen().a.t==3){
            fill(0,250,154);
            circle(470,200,50);
        }
        if(controller.getGruen().a.t==4){
            fill(0,250,154);
            circle(470,275,50);
        }
        if(controller.getGruen().a.t==5){
            fill(0,250,154);
            circle(470,350,50);

        }
        if(controller.getGruen().a.t==6){
            fill(0,250,154);
            circle(540,350,50);
        }
        if(controller.getGruen().a.t==7){
            fill(0,250,154);
            circle(610,350,50);
        }
        if(controller.getGruen().a.t==8){
            fill(0,250,154);
            circle(680,350,50);
        }
        if(controller.getGruen().a.t==9){
            fill(0,250,154);
            circle(750,350,50);
        }
        if(controller.getGruen().a.t==10){
            fill(0,250,154);
            circle(750,410,50);
        }
        if(controller.getGruen().a.t==11){
            if(controller.getGruen().platz==1|controller.getGruen().platz==2|controller.getGruen().platz==3|controller.getGruen().platz==4){
                fill(0,255,0);
                circle(750,470,50);
            }else {
                fill(0,250,154);
                circle(750,470,50);
            }

        }
        if(controller.getGruen().a.t==12){
            fill(0,250,154);
            circle(680,470,50);
        }
        if(controller.getGruen().a.t==13){
            fill(0,250,154);
            circle(610,470,50);
        }
        if(controller.getGruen().a.t==14){
            fill(0,250,154);
            circle(540,470,50);
        }
        if(controller.getGruen().a.t==15){
            fill(0,250,154);
            circle(470,470,50);
        }
        if(controller.getGruen().a.t==16){
            fill(0,250,154);
            circle(470,540,50);
        } if(controller.getGruen().a.t==17){
            fill(0,250,154);
            circle(470,610,50);
        } if(controller.getGruen().a.t==18){
            fill(0,250,154);
            circle(470,680,50);
        }if(controller.getGruen().a.t==19){
            fill(0,250,154);
            circle(470,750,50);
        } if(controller.getGruen().a.t==20){
            fill(0,250,154);
            circle(410,750,50);
        }
        if(controller.getGruen().a.t==21){
            fill(0,250,154);
            circle(350,750,50);
        }
        if(controller.getGruen().a.t==22){
            fill(0,250,154);
            circle(350,680,50);
        }
        if(controller.getGruen().a.t==23){
            fill(0,250,154);
            circle(350,610,50);
        }
        if(controller.getGruen().a.t==24){
            fill(0,250,154);
            circle(350,540,50);
        }
        if(controller.getGruen().a.t==25){
            fill(0,250,154);
            circle(350,470,50);
        }
        if(controller.getGruen().a.t==26){
            fill(0,250,154);
            circle(275,470,50);
        }
        if(controller.getGruen().a.t==27){
            fill(0,250,154);
            circle(200,470,50);
        }
        if(controller.getGruen().a.t==28){
            fill(0,250,154);
            circle(125,470,50);
        }
        if(controller.getGruen().a.t==29){
            fill(0,250,154);
            circle(50,470,50);
        }
        if(controller.getGruen().a.t==30){
            fill(0,250,154);
            circle(50,410,50);
        }
        if(controller.getGruen().a.t==31){
            fill(0,250,154);
            circle(50,350,50);
        }
        if(controller.getGruen().a.t==32){
            fill(0,250,154);
            circle(125,350,50);
        }
        if(controller.getGruen().a.t==33){
            fill(0,250,154);
            circle(200,350,50);
        }
        if(controller.getGruen().a.t==34){
            fill(0,250,154);
            circle(275,350,50);
        }
        if(controller.getGruen().a.t==35){
            fill(0,250,154);
            circle(350,350,50);
        }
        if(controller.getGruen().a.t==36){
            fill(0,250,154);
            circle(350,275,50);
        }
        if(controller.getGruen().a.t==37){
            fill(0,250,154);
            circle(350,200,50);
        }
        if(controller.getGruen().a.t==38){
            fill(0,250,154);
            circle(350,125,50);
        } if(controller.getGruen().a.t==39){
            fill(0,250,154);
            circle(350,50,50);
        }
        if(controller.getGruen().a.t==40){
            fill(0,250,154);
            circle(410,50,50);
        }
        if(controller.getGruen().a.t==-1|(controller.getGruen().a.vier_x==controller.getGruen().Ende_4_x&&controller.getGruen().a.vier_y==controller.getGruen().Ende_4_y)) {
            fill(0, 250, 154);
            circle(680, 410, 50);
        }
        if(controller.getGruen().a.t==-2|(controller.getGruen().a.drei_x==controller.getGruen().Ende_3_x&&controller.getGruen().a.drei_y==controller.getGruen().Ende_3_y)){
            fill(0,250,154);
            circle(610, 410, 50);
        }
        if(controller.getGruen().a.t==-3|(controller.getGruen().a.zwei_x==controller.getGruen().Ende_2_x&&controller.getGruen().a.zwei_y==controller.getGruen().Ende_2_y)){
            fill(0,250,154);
            circle(540, 410, 50);
        }
        if(controller.getGruen().a.t<-3|(controller.getGruen().a.eins_x==controller.getGruen().Ende_1_x&&controller.getGruen().a.eins_y==controller.getGruen().Ende_1_y)){
            fill(0,250,154);
            circle(470, 410, 50);
        }

        if(controller.getGelb().a.t==1){
            fill(255,215,0);
            circle(470,50,50);
        }
        if(controller.getGelb().a.t==2){
            fill(255,215,0);
            circle(470,125,50);
        }
        if(controller.getGelb().a.t==3){
            fill(255,215,0);
            circle(470,200,50);
        }
        if(controller.getGelb().a.t==4){
            fill(255,215,0);
            circle(470,275,50);
        }
        if(controller.getGelb().a.t==5){
            fill(255,215,0);
            circle(470,350,50);

        }
        if(controller.getGelb().a.t==6){
            fill(255,215,0);
            circle(540,350,50);
        }
        if(controller.getGelb().a.t==7){
            fill(255,215,0);
            circle(610,350,50);
        }
        if(controller.getGelb().a.t==8){
            fill(255,215,0);
            circle(680,350,50);
        }
        if(controller.getGelb().a.t==9){
            fill(255,215,0);
            circle(750,350,50);
        }
        if(controller.getGelb().a.t==10){
            fill(255,215,0);
            circle(750,410,50);
        }
        if(controller.getGelb().a.t==11){
            fill(255,215,0);
            circle(750,470,50);
        }
        if(controller.getGelb().a.t==12){
            fill(255,215,0);
            circle(680,470,50);
        }
        if(controller.getGelb().a.t==13){
            fill(255,215,0);
            circle(610,470,50);
        }
        if(controller.getGelb().a.t==14){
            fill(255,215,0);
            circle(540,470,50);
        }
        if(controller.getGelb().a.t==15){
            fill(255,215,0);
            circle(470,470,50);
        }
        if(controller.getGelb().a.t==16){
            fill(255,215,0);
            circle(470,540,50);
        } if(controller.getGelb().a.t==17){
            fill(255,215,0);
            circle(470,610,50);
        } if(controller.getGelb().a.t==18){
            fill(255,215,0);
            circle(470,680,50);
        }if(controller.getGelb().a.t==19){
            fill(255,215,0);
            circle(470,750,50);
        } if(controller.getGelb().a.t==20){
            fill(255,215,0);
            circle(410,750,50);
        }
        if(controller.getGelb().a.t==21){
            if(controller.getGelb().platz==1|controller.getGelb().platz==2|controller.getGelb().platz==3|controller.getGelb().platz==4){
                fill(255,255,0);
                circle(350,750,50);
            }else {
                fill(255,215,0);
                circle(350,750,50);
            }

        }
        if(controller.getGelb().a.t==22){
            fill(255,215,0);
            circle(350,680,50);
        }
        if(controller.getGelb().a.t==23){
            fill(255,215,0);
            circle(350,610,50);
        }
        if(controller.getGelb().a.t==24){
            fill(255,215,0);
            circle(350,540,50);
        }
        if(controller.getGelb().a.t==25){
            fill(255,215,0);
            circle(350,470,50);
        }
        if(controller.getGelb().a.t==26){
            fill(255,215,0);
            circle(275,470,50);
        }
        if(controller.getGelb().a.t==27){
            fill(255,215,0);
            circle(200,470,50);
        }
        if(controller.getGelb().a.t==28){
            fill(255,215,0);
            circle(125,470,50);
        }
        if(controller.getGelb().a.t==29){
            fill(255,215,0);
            circle(50,470,50);
        }
        if(controller.getGelb().a.t==30){
            fill(255,215,0);
            circle(50,410,50);
        }
        if(controller.getGelb().a.t==31){
            fill(255,215,0);
            circle(50,350,50);
        }
        if(controller.getGelb().a.t==32){
            fill(255,215,0);
            circle(125,350,50);
        }
        if(controller.getGelb().a.t==33){
            fill(255,215,0);
            circle(200,350,50);
        }
        if(controller.getGelb().a.t==34){
            fill(255,215,0);
            circle(275,350,50);
        }
        if(controller.getGelb().a.t==35){
            fill(255,215,0);
            circle(350,350,50);
        }
        if(controller.getGelb().a.t==36){
            fill(255,215,0);
            circle(350,275,50);
        }
        if(controller.getGelb().a.t==37){
            fill(255,215,0);
            circle(350,200,50);
        }
        if(controller.getGelb().a.t==38){
            fill(255,215,0);
            circle(350,125,50);
        } if(controller.getGelb().a.t==39){
            fill(255,215,0);
            circle(350,50,50);
        }
        if(controller.getGelb().a.t==40){
            fill(255,215,0);
            circle(410,50,50);
        }
        if(controller.getGelb().a.t==-1|(controller.getGelb().a.vier_x==controller.getGelb().Ende_4_x&&controller.getGelb().a.vier_y==controller.getGelb().Ende_4_y)) {
            fill(255,215,0);
            circle(410, 680, 50);
        }
        if(controller.getGelb().a.t==-2|(controller.getGelb().a.drei_x==controller.getGelb().Ende_3_x&&controller.getGelb().a.drei_y==controller.getGelb().Ende_3_y)){
            fill(255,215,0);
            circle(410, 610, 50);
        }
        if(controller.getGelb().a.t==-3|(controller.getGelb().a.zwei_x==controller.getGelb().Ende_2_x&&controller.getGelb().a.zwei_y==controller.getGelb().Ende_2_y)){
            fill(255,215,0);
            circle(410, 540, 50);
        }
        if(controller.getGelb().a.t<-3|(controller.getGelb().a.eins_x==controller.getGelb().Ende_1_x&&controller.getGelb().a.eins_y==controller.getGelb().Ende_1_y)){
            fill(255,215,0);
            circle(410, 470, 50);
        }

        if(controller.getRot().a.t==1){
            fill(255,99,71);
            circle(470,50,50);
        }
        if(controller.getRot().a.t==2){
            fill(255,99,71);
            circle(470,125,50);
        }
        if(controller.getRot().a.t==3){
            fill(255,99,71);
            circle(470,200,50);
        }
        if(controller.getRot().a.t==4){
            fill(255,99,71);
            circle(470,275,50);
        }
        if(controller.getRot().a.t==5){
            fill(255,99,71);
            circle(470,350,50);

        }
        if(controller.getRot().a.t==6){
            fill(255,99,71);
            circle(540,350,50);
        }
        if(controller.getRot().a.t==7){
            fill(255,99,71);
            circle(610,350,50);
        }
        if(controller.getRot().a.t==8){
            fill(255,99,71);
            circle(680,350,50);
        }
        if(controller.getRot().a.t==9){
            fill(255,99,71);
            circle(750,350,50);
        }
        if(controller.getRot().a.t==10){
            fill(255,99,71);
            circle(750,410,50);
        }
        if(controller.getRot().a.t==11){
            fill(255,99,71);
            circle(750,470,50);
        }
        if(controller.getRot().a.t==12){
            fill(255,99,71);
            circle(680,470,50);
        }
        if(controller.getRot().a.t==13){
            fill(255,99,71);
            circle(610,470,50);
        }
        if(controller.getRot().a.t==14){
            fill(255,99,71);
            circle(540,470,50);
        }
        if(controller.getRot().a.t==15){
            fill(255,99,71);
            circle(470,470,50);
        }
        if(controller.getRot().a.t==16){
            fill(255,99,71);
            circle(470,540,50);
        } if(controller.getRot().a.t==17){
            fill(255,99,71);
            circle(470,610,50);
        } if(controller.getRot().a.t==18){
            fill(255,99,71);
            circle(470,680,50);
        }if(controller.getRot().a.t==19){
            fill(255,99,71);
            circle(470,750,50);
        } if(controller.getRot().a.t==20){
            fill(255,99,71);
            circle(410,750,50);
        }
        if(controller.getRot().a.t==21){
            fill(255,99,71);
            circle(350,750,50);
        }
        if(controller.getRot().a.t==22){
            fill(255,99,71);
            circle(350,680,50);
        }
        if(controller.getRot().a.t==23){
            fill(255,99,71);
            circle(350,610,50);
        }
        if(controller.getRot().a.t==24){
            fill(255,99,71);
            circle(350,540,50);
        }
        if(controller.getRot().a.t==25){
            fill(255,99,71);
            circle(350,470,50);
        }
        if(controller.getRot().a.t==26){
            fill(255,99,71);
            circle(275,470,50);
        }
        if(controller.getRot().a.t==27){
            fill(255,99,71);
            circle(200,470,50);
        }
        if(controller.getRot().a.t==28){
            fill(255,99,71);
            circle(125,470,50);
        }
        if(controller.getRot().a.t==29){
            fill(255,99,71);
            circle(50,470,50);
        }
        if(controller.getRot().a.t==30){
            fill(255,99,71);
            circle(50,410,50);
        }
        if(controller.getRot().a.t==31){
            if(controller.getRot().platz==1|controller.getRot().platz==2|controller.getRot().platz==3|controller.getRot().platz==4){
                fill(255, 0, 0);
                circle(50,350,50);
            }else {
                fill(255,99,71);
                circle(50,350,50);
            }
        }
        if(controller.getRot().a.t==32){
            fill(255,99,71);
            circle(125,350,50);
        }
        if(controller.getRot().a.t==33){
            fill(255,99,71);
            circle(200,350,50);
        }
        if(controller.getRot().a.t==34){
            fill(255,99,71);
            circle(275,350,50);
        }
        if(controller.getRot().a.t==35){
            fill(255,99,71);
            circle(350,350,50);
        }
        if(controller.getRot().a.t==36){
            fill(255,99,71);
            circle(350,275,50);
        }
        if(controller.getRot().a.t==37){
            fill(255,99,71);
            circle(350,200,50);
        }
        if(controller.getRot().a.t==38){
            fill(255,99,71);
            circle(350,125,50);
        } if(controller.getRot().a.t==39){
            fill(255,99,71);
            circle(350,50,50);
        }
        if(controller.getRot().a.t==40){
            fill(255,99,71);
            circle(410,50,50);
        }
        if(controller.getRot().a.t==-1|(controller.getRot().a.vier_x==controller.getRot().Ende_4_x&&controller.getRot().a.vier_y==controller.getRot().Ende_4_y)) {
            fill(255,99,71);
            circle(125, 410, 50);
        }
        else{
            fill(255, 0, 0);
            circle(125, 410, 50);
        }
        if(controller.getRot().a.t==-2|(controller.getRot().a.drei_x==controller.getRot().Ende_3_x&&controller.getRot().a.drei_y==controller.getRot().Ende_3_y)){
            fill(255,99,71);
            circle(200, 410, 50);
        }
        else{
            fill(255, 0, 0);
            circle(200, 410, 50);
        }
        if(controller.getRot().a.t==-3|(controller.getRot().a.zwei_x==controller.getRot().Ende_2_x&&controller.getRot().a.zwei_y==controller.getRot().Ende_2_y)){
            fill(255,99,71);
            circle(275, 410, 50);
        }
        else{
            fill(255, 0, 0);
            circle(275, 410, 50);
        }
        if(controller.getRot().a.t<-3|(controller.getRot().a.eins_x==controller.getRot().Ende_1_x&&controller.getRot().a.eins_y==controller.getRot().Ende_1_y)){
            fill(255,99,71);
            circle(350, 410, 50);
        } else{
            fill(255, 0, 0);
            circle(350, 410, 50);
        }

            //rot
        if(controller.getRot().a.eins_x==controller.getRot().Haus_1_x&&controller.getRot().a.eins_y==controller.getRot().Haus_1_y) {
            fill(255,99,71);
            circle(50, 50, 50);
        }else{
            fill(255, 0, 0);
            circle(50, 50, 50);
        }
        if(controller.getRot().a.zwei_x==controller.getRot().Haus_2_x&&controller.getRot().a.zwei_y==controller.getRot().Haus_2_y) {
            fill(255,99,71);
            circle(105, 50, 50);
        }else{
            fill(255, 0, 0);
            circle(105, 50, 50);
        }
        if(controller.getRot().a.drei_x==controller.getRot().Haus_3_x&&controller.getRot().a.drei_y==controller.getRot().Haus_3_y) {
            fill(255,99,71);
            circle(50, 105, 50);
        }else{
            fill(255, 0, 0);
            circle(50, 105, 50);
        }
        if(controller.getRot().a.vier_x==controller.getRot().Haus_4_x&&controller.getRot().a.vier_y==controller.getRot().Haus_4_y) {
            fill(255,99,71);
            circle(105, 105, 50);
        }else{
            fill(255, 0, 0);
            circle(105, 105, 50);
        }







            //blau
        if(controller.getBlau().a.eins_x==controller.getBlau().Haus_1_x&&controller.getBlau().a.eins_y==controller.getBlau().Haus_1_y) {
            fill(64,224,208);
            circle(695, 50, 50);
        }else{
            fill(0, 0, 255);
            circle(695, 50, 50);
        }
        if(controller.getBlau().a.zwei_x==controller.getBlau().Haus_2_x&&controller.getBlau().a.zwei_y==controller.getBlau().Haus_2_y) {
            fill(64,224,208);
            circle(750, 50, 50);
        }else{
            fill(0, 0, 255);
            circle(750, 50, 50);
        }
        if(controller.getBlau().a.drei_x==controller.getBlau().Haus_3_x&&controller.getBlau().a.drei_y==controller.getBlau().Haus_3_y) {
            fill(64,224,208);
            circle(695, 105, 50);
        }else{
            fill(0, 0, 255);
            circle(695, 105, 50);
        }
        if(controller.getBlau().a.vier_x==controller.getBlau().Haus_4_x&&controller.getBlau().a.vier_y==controller.getBlau().Haus_4_y) {
            fill(64,224,208);
            circle(750, 105, 50);
        }else{
            fill(0, 0, 255);
            circle(750, 105, 50);
        }



            //gelb
        if(controller.getGelb().a.eins_x==controller.getGelb().Haus_1_x&&controller.getGelb().a.eins_y==controller.getGelb().Haus_1_y) {
            fill(255,215,0);
            circle(50, 695, 50);
        }else{
            fill(255, 255, 0);
            circle(50, 695, 50);
        }
        if(controller.getGelb().a.zwei_x==controller.getGelb().Haus_2_x&&controller.getGelb().a.zwei_y==controller.getGelb().Haus_2_y) {
            fill(255,215,0);
            circle(105, 695, 50);
        }else{
            fill(255, 255, 0);
            circle(105, 695, 50);
        }
        if(controller.getGelb().a.drei_x==controller.getGelb().Haus_3_x&&controller.getGelb().a.drei_y==controller.getGelb().Haus_3_y) {
            fill(255,215,0);
            circle(50, 750, 50);
        }else{
            fill(255, 255, 0);
            circle(50, 750, 50);
        }
        if(controller.getGelb().a.vier_x==controller.getGelb().Haus_4_x&&controller.getGelb().a.vier_y==controller.getGelb().Haus_4_y) {
            fill(255,215,0);
            circle(105, 750, 50);
        }else{
            fill(255, 255, 0);
            circle(105, 750, 50);
        }








            //gruen
        if(controller.getGruen().a.eins_x==controller.getGruen().Haus_1_x&&controller.getGruen().a.eins_y==controller.getGruen().Haus_1_y) {
            fill(0,250,154);
            circle(695, 695, 50);
        }else{
            fill(0, 255, 0);
            circle(695, 695, 50);
        }
        if(controller.getGruen().a.zwei_x==controller.getGruen().Haus_2_x&&controller.getGruen().a.zwei_y==controller.getGruen().Haus_2_y) {
            fill(0,250,154);
            circle(750, 695, 50);
        }else{
            fill(0, 255, 0);
            circle(750, 695, 50);
        }
        if(controller.getGruen().a.drei_x==controller.getGruen().Haus_3_x&&controller.getGruen().a.drei_y==controller.getGruen().Haus_3_y) {
            fill(0,250,154);
            circle(695, 750, 50);
        }else{
            fill(0, 255, 0);
            circle(695, 750, 50);
        }
        if(controller.getGruen().a.vier_x==controller.getGruen().Haus_4_x&&controller.getGruen().a.vier_y==controller.getGruen().Haus_4_y) {
            fill(0,250,154);
            circle(750, 750, 50);
        }else{
            fill(0, 255, 0);
            circle(750, 750, 50);
        }






    }
    /**
     * Was dargestellt werden soll, wenn man als seine Farbe die grün wählt.
     * Der Controller bestimmt, welche draw-Methode dran ist(Die Standart draw-Methode wird immer ausgeführt).
     */
    public void drawGameGruen(){
        Blau.hide();
        Gruen.hide();
        Gelb.hide();
        Rot.hide();

        background(255);

        if(controller.getDran()==2){
            Wuerfel.show();
            Wuerfel.setPosition(560,675);
        }else if(controller.getDran()!=2){
            Wuerfel.hide();
        }

        if(controller.getDran()==2) {
            if(controller.getBlau().Ende_4_x!=controller.getBlau().a.vier_x | controller.getBlau().Ende_4_y!=controller.getBlau().a.vier_y) {
                if (controller.getWuerfel() == 1) {
                    image(wuerfel_1, 560, 150);
                    wuerfel_1.resize(100, 100);
                }
                if (controller.getWuerfel() == 2) {
                    image(wuerfel_2, 560, 150);
                    wuerfel_2.resize(100, 100);
                }
                if (controller.getWuerfel() == 3) {
                    image(wuerfel_3, 560, 150);
                    wuerfel_3.resize(100, 100);
                }
                if (controller.getWuerfel() == 4) {
                    image(wuerfel_4, 560, 150);
                    wuerfel_4.resize(100, 100);
                }
                if (controller.getWuerfel() == 5) {
                    image(wuerfel_5, 560, 150);
                    wuerfel_5.resize(100, 100);
                }
                if (controller.getWuerfel() == 6) {
                    image(wuerfel_6, 560, 150);
                    wuerfel_6.resize(100, 100);
                }
            }
        }
        if(controller.getDran()==3) {
            if (controller.getGruen().Ende_4_x != controller.getGruen().a.vier_x | controller.getGruen().Ende_4_y != controller.getGruen().a.vier_y) {
                if (controller.getWuerfel() == 1) {
                    image(wuerfel_1, 560, 550);
                    wuerfel_1.resize(100, 100);
                }
                if (controller.getWuerfel() == 2) {
                    image(wuerfel_2, 560, 550);
                    wuerfel_2.resize(100, 100);
                }
                if (controller.getWuerfel() == 3) {
                    image(wuerfel_3, 560, 550);
                    wuerfel_3.resize(100, 100);
                }
                if (controller.getWuerfel() == 4) {
                    image(wuerfel_4, 560, 550);
                    wuerfel_4.resize(100, 100);
                }
                if (controller.getWuerfel() == 5) {
                    image(wuerfel_5, 560, 550);
                    wuerfel_5.resize(100, 100);
                }
                if (controller.getWuerfel() == 6) {
                    image(wuerfel_6, 560, 550);
                    wuerfel_6.resize(100, 100);
                }
            }
        }
        if(controller.getDran()==4) {
            if (controller.getGelb().Ende_4_x != controller.getGelb().a.vier_x | controller.getGelb().Ende_4_y != controller.getGelb().a.vier_y) {
                if (controller.getWuerfel() == 1) {
                    image(wuerfel_1, 180, 550);
                    wuerfel_1.resize(100, 100);
                }
                if (controller.getWuerfel() == 2) {
                    image(wuerfel_2, 180, 550);
                    wuerfel_2.resize(100, 100);
                }
                if (controller.getWuerfel() == 3) {
                    image(wuerfel_3, 180, 550);
                    wuerfel_3.resize(100, 100);
                }
                if (controller.getWuerfel() == 4) {
                    image(wuerfel_4, 180, 550);
                    wuerfel_4.resize(100, 100);
                }
                if (controller.getWuerfel() == 5) {
                    image(wuerfel_5, 180, 550);
                    wuerfel_5.resize(100, 100);
                }
                if (controller.getWuerfel() == 6) {
                    image(wuerfel_6, 180, 550);
                    wuerfel_6.resize(100, 100);
                }
            }
        }
        if(controller.getDran()==1){
            if(controller.getRot().Ende_4_x!=controller.getRot().a.vier_x | controller.getRot().Ende_4_y!=controller.getRot().a.vier_y) {
                if (controller.getWuerfel() == 1) {
                    image(wuerfel_1, 180, 150);
                    wuerfel_1.resize(100, 100);
                }
                if (controller.getWuerfel() == 2) {
                    image(wuerfel_2, 180, 150);
                    wuerfel_2.resize(100, 100);
                }
                if (controller.getWuerfel() == 3) {
                    image(wuerfel_3, 180, 150);
                    wuerfel_3.resize(100, 100);
                }
                if (controller.getWuerfel() == 4) {
                    image(wuerfel_4, 180, 150);
                    wuerfel_4.resize(100, 100);
                }
                if (controller.getWuerfel() == 5) {
                    image(wuerfel_5, 180, 150);
                    wuerfel_5.resize(100, 100);
                }
                if (controller.getWuerfel() == 6) {
                    image(wuerfel_6, 180, 150);
                    wuerfel_6.resize(100, 100);
                }
            }
        }

fill(0,0,255);

        circle(410,125,50);
       circle(410,200,50);
        circle(410,275,50);
        circle(410,350,50);


        //rot
        fill(255,0,0);
        circle(125,410,50);
        circle(200,410,50);
        circle(275,410,50);
        circle(350,410,50);



        //gruen
        fill(0,255,0);

        circle(680,410,50);
        circle(610,410,50);
        circle(540,410,50);
        circle(470,410,50);


        //gelb
        fill(255,255,0);

        circle(410,680,50);
       circle(410,610,50);
        circle(410,540,50);
        circle(410,470,50);
        //rot
        if(controller.getRot().a.eins_x==controller.getRot().Haus_1_x&&controller.getRot().a.eins_y==controller.getRot().Haus_1_y) {
            fill(255,99,71);
            circle(50, 50, 50);
        }else{
            fill(255, 0, 0);
            circle(50, 50, 50);
        }
        if(controller.getRot().a.zwei_x==controller.getRot().Haus_2_x&&controller.getRot().a.zwei_y==controller.getRot().Haus_2_y) {
            fill(255,99,71);
            circle(105, 50, 50);
        }else{
            fill(255, 0, 0);
            circle(105, 50, 50);
        }
        if(controller.getRot().a.drei_x==controller.getRot().Haus_3_x&&controller.getRot().a.drei_y==controller.getRot().Haus_3_y) {
            fill(255,99,71);
            circle(50, 105, 50);
        }else{
            fill(255, 0, 0);
            circle(50, 105, 50);
        }
        if(controller.getRot().a.vier_x==controller.getRot().Haus_4_x&&controller.getRot().a.vier_y==controller.getRot().Haus_4_y) {
            fill(255,99,71);
            circle(105, 105, 50);
        }else{
            fill(255, 0, 0);
            circle(105, 105, 50);
        }







        //blau
        if(controller.getBlau().a.eins_x==controller.getBlau().Haus_1_x&&controller.getBlau().a.eins_y==controller.getBlau().Haus_1_y) {
            fill(64,224,208);
            circle(695, 50, 50);
        }else{
            fill(0, 0, 255);
            circle(695, 50, 50);
        }
        if(controller.getBlau().a.zwei_x==controller.getBlau().Haus_2_x&&controller.getBlau().a.zwei_y==controller.getBlau().Haus_2_y) {
            fill(64,224,208);
            circle(750, 50, 50);
        }else{
            fill(0, 0, 255);
            circle(750, 50, 50);
        }
        if(controller.getBlau().a.drei_x==controller.getBlau().Haus_3_x&&controller.getBlau().a.drei_y==controller.getBlau().Haus_3_y) {
            fill(64,224,208);
            circle(695, 105, 50);
        }else{
            fill(0, 0, 255);
            circle(695, 105, 50);
        }
        if(controller.getBlau().a.vier_x==controller.getBlau().Haus_4_x&&controller.getBlau().a.vier_y==controller.getBlau().Haus_4_y) {
            fill(64,224,208);
            circle(750, 105, 50);
        }else{
            fill(0, 0, 255);
            circle(750, 105, 50);
        }



        //gelb
        if(controller.getGelb().a.eins_x==controller.getGelb().Haus_1_x&&controller.getGelb().a.eins_y==controller.getGelb().Haus_1_y) {
            fill(255,215,0);
            circle(50, 695, 50);
        }else{
            fill(255, 255, 0);
            circle(50, 695, 50);
        }
        if(controller.getGelb().a.zwei_x==controller.getGelb().Haus_2_x&&controller.getGelb().a.zwei_y==controller.getGelb().Haus_2_y) {
            fill(255,215,0);
            circle(105, 695, 50);
        }else{
            fill(255, 255, 0);
            circle(105, 695, 50);
        }
        if(controller.getGelb().a.drei_x==controller.getGelb().Haus_3_x&&controller.getGelb().a.drei_y==controller.getGelb().Haus_3_y) {
            fill(255,215,0);
            circle(50, 750, 50);
        }else{
            fill(255, 255, 0);
            circle(50, 750, 50);
        }
        if(controller.getGelb().a.vier_x==controller.getGelb().Haus_4_x&&controller.getGelb().a.vier_y==controller.getGelb().Haus_4_y) {
            fill(255,215,0);
            circle(105, 750, 50);
        }else{
            fill(255, 255, 0);
            circle(105, 750, 50);
        }








        //gruen
        if(controller.getGruen().a.eins_x==controller.getGruen().Haus_1_x&&controller.getGruen().a.eins_y==controller.getGruen().Haus_1_y) {
            fill(0,250,154);
            circle(695, 695, 50);
        }else{
            fill(0, 255, 0);
            circle(695, 695, 50);
        }
        if(controller.getGruen().a.zwei_x==controller.getGruen().Haus_2_x&&controller.getGruen().a.zwei_y==controller.getGruen().Haus_2_y) {
            fill(0,250,154);
            circle(750, 695, 50);
        }else{
            fill(0, 255, 0);
            circle(750, 695, 50);
        }
        if(controller.getGruen().a.drei_x==controller.getGruen().Haus_3_x&&controller.getGruen().a.drei_y==controller.getGruen().Haus_3_y) {
            fill(0,250,154);
            circle(695, 750, 50);
        }else{
            fill(0, 255, 0);
            circle(695, 750, 50);
        }
        if(controller.getGruen().a.vier_x==controller.getGruen().Haus_4_x&&controller.getGruen().a.vier_y==controller.getGruen().Haus_4_y) {
            fill(0,250,154);
            circle(750, 750, 50);
        }else{
            fill(0, 255, 0);
            circle(750, 750, 50);
        }


        if (controller.getBlau().a.t == 1) {
            if(controller.getBlau().platz==1|controller.getBlau().platz==2|controller.getBlau().platz==3|controller.getBlau().platz==4){
                fill(0, 0, 255);
                circle(470, 50, 50);
            }else {
                fill(64, 224, 208);
                circle(470, 50, 50);
            }
        } else {
            fill(0, 0, 255);
            circle(470, 50, 50);
        }
        if (controller.getBlau().a.t == 2) {
            fill(64, 224, 208);
            circle(470, 125, 50);
        } else {
            fill(255);
            circle(470, 125, 50);
        }
        if (controller.getBlau().a.t == 3) {
            fill(64, 224, 208);
            circle(470, 200, 50);
        } else {
            fill(255);
            circle(470, 200, 50);
        }
        if (controller.getBlau().a.t == 4) {
            fill(64, 224, 208);
            circle(470, 275, 50);
        } else {
            fill(255);
            circle(470, 275, 50);
        }
        if (controller.getBlau().a.t == 5) {
            fill(64, 224, 208);
            circle(470, 350, 50);

        } else {
            fill(255);
            circle(470, 350, 50);
        }
        if (controller.getBlau().a.t == 6) {
            fill(64, 224, 208);
            circle(540, 350, 50);
        } else {
            fill(255);
            circle(540, 350, 50);
        }
        if (controller.getBlau().a.t == 7) {
            fill(64, 224, 208);
            circle(610, 350, 50);
        } else {
            fill(255);
            circle(610, 350, 50);
        }
        if (controller.getBlau().a.t == 8) {
            fill(64, 224, 208);
            circle(680, 350, 50);
        } else {
            fill(255);
            circle(680, 350, 50);
        }
        if (controller.getBlau().a.t == 9) {
            fill(64, 224, 208);
            circle(750, 350, 50);
        } else {
            fill(255);
            circle(750, 350, 50);
        }
        if (controller.getBlau().a.t == 10) {
            fill(64, 224, 208);
            circle(750, 410, 50);
        } else {
            fill(255);
            circle(750, 410, 50);
        }
        if (controller.getBlau().a.t == 11) {
            fill(64, 224, 208);
            circle(750, 470, 50);
        } else {
            fill(0, 255, 0);
            circle(750, 470, 50);
        }
        if (controller.getBlau().a.t == 12) {
            fill(64, 224, 208);
            circle(680, 470, 50);
        } else {
            fill(255);
            circle(680, 470, 50);
        }
        if (controller.getBlau().a.t == 13) {
            fill(64, 224, 208);
            circle(610, 470, 50);
        } else {
            fill(255);
            circle(610, 470, 50);
        }
        if (controller.getBlau().a.t == 14) {
            fill(64, 224, 208);
            circle(540, 470, 50);
        } else {
            fill(255);
            circle(540, 470, 50);
        }
        if (controller.getBlau().a.t == 15) {
            fill(64, 224, 208);
            circle(470, 470, 50);
        } else {
            fill(255);
            circle(470, 470, 50);
        }
        if (controller.getBlau().a.t == 16) {
            fill(64, 224, 208);
            circle(470, 540, 50);
        } else {
            fill(255);
            circle(470, 540, 50);
        }
        if (controller.getBlau().a.t == 17) {
            fill(64, 224, 208);
            circle(470, 610, 50);
        } else {
            fill(255);
            circle(470, 610, 50);
        }
        if (controller.getBlau().a.t == 18) {
            fill(64, 224, 208);
            circle(470, 680, 50);
        } else {
            fill(255);
            circle(470, 680, 50);
        }
        if (controller.getBlau().a.t == 19) {
            fill(64, 224, 208);
            circle(470, 750, 50);
        } else {
            fill(255);
            circle(470, 750, 50);
        }
        if (controller.getBlau().a.t == 20) {
            fill(64, 224, 208);
            circle(410, 750, 50);
        } else {
            fill(255);
            circle(410, 750, 50);
        }
        if (controller.getBlau().a.t == 21) {
            fill(64, 224, 208);
            circle(350, 750, 50);
        } else {
            fill(255, 255, 0);
            circle(350, 750, 50);
        }
        if (controller.getBlau().a.t == 22) {
            fill(64, 224, 208);
            circle(350, 680, 50);
        } else {
            fill(255);
            circle(350, 680, 50);
        }
        if (controller.getBlau().a.t == 23) {
            fill(64, 224, 208);
            circle(350, 610, 50);
        } else {
            fill(255);
            circle(350, 610, 50);
        }
        if (controller.getBlau().a.t == 24) {
            fill(64, 224, 208);
            circle(350, 540, 50);
        } else {
            fill(255);
            circle(350, 540, 50);
        }
        if (controller.getBlau().a.t == 25) {
            fill(64, 224, 208);
            circle(350, 470, 50);
        } else {
            fill(255);
            circle(350, 470, 50);
        }
        if (controller.getBlau().a.t == 26) {
            fill(64, 224, 208);
            circle(275, 470, 50);
        } else {
            fill(255);
            circle(275, 470, 50);
        }
        if (controller.getBlau().a.t == 27) {
            fill(64, 224, 208);
            circle(200, 470, 50);
        } else {
            fill(255);
            circle(200, 470, 50);
        }
        if (controller.getBlau().a.t == 28) {
            fill(64, 224, 208);
            circle(125, 470, 50);
        } else {
            fill(255);
            circle(125, 470, 50);
        }
        if (controller.getBlau().a.t == 29) {
            fill(64, 224, 208);
            circle(50, 470, 50);
        } else {
            fill(255);
            circle(50, 470, 50);
        }
        if (controller.getBlau().a.t == 30) {
            fill(64, 224, 208);
            circle(50, 410, 50);
        } else {
            fill(255);
            circle(50, 410, 50);
        }
        if (controller.getBlau().a.t == 31) {
            fill(64, 224, 208);
            circle(50, 350, 50);
        } else {
            fill(255, 0, 0);
            circle(50, 350, 50);
        }
        if (controller.getBlau().a.t == 32) {
            fill(64, 224, 208);
            circle(125, 350, 50);
        } else {
            fill(255);
            circle(125, 350, 50);
        }
        if (controller.getBlau().a.t == 33) {
            fill(64, 224, 208);
            circle(200, 350, 50);
        } else {
            fill(255);
            circle(200, 350, 50);
        }
        if (controller.getBlau().a.t == 34) {
            fill(64, 224, 208);
            circle(275, 350, 50);
        } else {
            fill(255);
            circle(275, 350, 50);
        }
        if (controller.getBlau().a.t == 35) {
            fill(64, 224, 208);
            circle(350, 350, 50);
        } else {
            fill(255);
            circle(350, 350, 50);
        }
        if (controller.getBlau().a.t == 36) {
            fill(64, 224, 208);
            circle(350, 275, 50);
        } else {
            fill(255);
            circle(350, 275, 50);
        }
        if (controller.getBlau().a.t == 37) {
            fill(64, 224, 208);
            circle(350, 200, 50);
        } else {
            fill(255);
            circle(350, 200, 50);
        }
        if (controller.getBlau().a.t == 38) {
            fill(64, 224, 208);
            circle(350, 125, 50);
        } else {
            fill(255);
            circle(350, 125, 50);
        }
        if (controller.getBlau().a.t == 39) {
            fill(64, 224, 208);
            circle(350, 50, 50);
        } else {
            fill(255);
            circle(350, 50, 50);
        }
        if (controller.getBlau().a.t == 40) {
            fill(64, 224, 208);
            circle(410, 50, 50);
        } else {
            fill(255);
            circle(410, 50, 50);
        }
        if (controller.getBlau().a.t == 41|(controller.getBlau().a.vier_x==controller.getBlau().Ende_4_x&&controller.getBlau().a.vier_y==controller.getBlau().Ende_4_y)) {
            fill(64, 224, 208);
            circle(410, 125, 50);
        } else {
            fill(0,0,255);
            circle(410, 125, 50);
        }
        if (controller.getBlau().a.t == 42|(controller.getBlau().a.drei_x==controller.getBlau().Ende_3_x&&controller.getBlau().a.drei_y==controller.getBlau().Ende_3_y)) {
            fill(64, 224, 208);
            circle(410, 200, 50);
        } else {
            fill(0,0,255);
            circle(410, 200, 50);
        }
        if (controller.getBlau().a.t == 43|(controller.getBlau().a.zwei_x==controller.getBlau().Ende_2_x&&controller.getBlau().a.zwei_y==controller.getBlau().Ende_2_y)) {
            fill(64, 224, 208);
            circle(410, 275, 50);
        } else {
            fill(0,0,255);
            circle(410, 275, 50);
        }
        if (controller.getBlau().a.t == 44|(controller.getBlau().a.eins_x==controller.getBlau().Ende_1_x&&controller.getBlau().a.eins_y==controller.getBlau().Ende_1_y)) {
            fill(64, 224, 208);
            circle(410, 350, 50);
        } else {
            fill(0,0,255);
            circle(410, 350, 50);
        }



        if(controller.getGruen().a.t==1){
            fill(0,250,154);
            circle(470,50,50);
        }
        if(controller.getGruen().a.t==2){
            fill(0,250,154);
            circle(470,125,50);
        }
        if(controller.getGruen().a.t==3){
            fill(0,250,154);
            circle(470,200,50);
        }
        if(controller.getGruen().a.t==4){
            fill(0,250,154);
            circle(470,275,50);
        }
        if(controller.getGruen().a.t==5){
            fill(0,250,154);
            circle(470,350,50);

        }
        if(controller.getGruen().a.t==6){
            fill(0,250,154);
            circle(540,350,50);
        }
        if(controller.getGruen().a.t==7){
            fill(0,250,154);
            circle(610,350,50);
        }
        if(controller.getGruen().a.t==8){
            fill(0,250,154);
            circle(680,350,50);
        }
        if(controller.getGruen().a.t==9){
            fill(0,250,154);
            circle(750,350,50);
        }
        if(controller.getGruen().a.t==10){
            fill(0,250,154);
            circle(750,410,50);
        }
        if(controller.getGruen().a.t==11){
            if(controller.getGruen().platz==1|controller.getGruen().platz==2|controller.getGruen().platz==3|controller.getGruen().platz==4){
                fill(0,255,0);
                circle(750,470,50);
            }else {
                fill(0,250,154);
                circle(750,470,50);
            }
        }
        if(controller.getGruen().a.t==12){
            fill(0,250,154);
            circle(680,470,50);
        }
        if(controller.getGruen().a.t==13){
            fill(0,250,154);
            circle(610,470,50);
        }
        if(controller.getGruen().a.t==14){
            fill(0,250,154);
            circle(540,470,50);
        }
        if(controller.getGruen().a.t==15){
            fill(0,250,154);
            circle(470,470,50);
        }
        if(controller.getGruen().a.t==16){
            fill(0,250,154);
            circle(470,540,50);
        } if(controller.getGruen().a.t==17){
            fill(0,250,154);
            circle(470,610,50);
        } if(controller.getGruen().a.t==18){
            fill(0,250,154);
            circle(470,680,50);
        }if(controller.getGruen().a.t==19){
            fill(0,250,154);
            circle(470,750,50);
        } if(controller.getGruen().a.t==20){
            fill(0,250,154);
            circle(410,750,50);
        }
        if(controller.getGruen().a.t==21){
            fill(0,250,154);
            circle(350,750,50);
        }
        if(controller.getGruen().a.t==22){
            fill(0,250,154);
            circle(350,680,50);
        }
        if(controller.getGruen().a.t==23){
            fill(0,250,154);
            circle(350,610,50);
        }
        if(controller.getGruen().a.t==24){
            fill(0,250,154);
            circle(350,540,50);
        }
        if(controller.getGruen().a.t==25){
            fill(0,250,154);
            circle(350,470,50);
        }
        if(controller.getGruen().a.t==26){
            fill(0,250,154);
            circle(275,470,50);
        }
        if(controller.getGruen().a.t==27){
            fill(0,250,154);
            circle(200,470,50);
        }
        if(controller.getGruen().a.t==28){
            fill(0,250,154);
            circle(125,470,50);
        }
        if(controller.getGruen().a.t==29){
            fill(0,250,154);
            circle(50,470,50);
        }
        if(controller.getGruen().a.t==30){
            fill(0,250,154);
            circle(50,410,50);
        }
        if(controller.getGruen().a.t==31){
            fill(0,250,154);
            circle(50,350,50);
        }
        if(controller.getGruen().a.t==32){
            fill(0,250,154);
            circle(125,350,50);
        }
        if(controller.getGruen().a.t==33){
            fill(0,250,154);
            circle(200,350,50);
        }
        if(controller.getGruen().a.t==34){
            fill(0,250,154);
            circle(275,350,50);
        }
        if(controller.getGruen().a.t==35){
            fill(0,250,154);
            circle(350,350,50);
        }
        if(controller.getGruen().a.t==36){
            fill(0,250,154);
            circle(350,275,50);
        }
        if(controller.getGruen().a.t==37){
            fill(0,250,154);
            circle(350,200,50);
        }
        if(controller.getGruen().a.t==38){
            fill(0,250,154);
            circle(350,125,50);
        } if(controller.getGruen().a.t==39){
            fill(0,250,154);
            circle(350,50,50);
        }
        if(controller.getGruen().a.t==40){
            fill(0,250,154);
            circle(410,50,50);
        }
        if(controller.getGruen().a.t==-1|(controller.getGruen().a.vier_x==controller.getGruen().Ende_4_x&&controller.getGruen().a.vier_y==controller.getGruen().Ende_4_y)) {
            fill(0, 250, 154);
            circle(680, 410, 50);
        }
        if(controller.getGruen().a.t==-2|(controller.getGruen().a.drei_x==controller.getGruen().Ende_3_x&&controller.getGruen().a.drei_y==controller.getGruen().Ende_3_y)){
            fill(0,250,154);
            circle(610, 410, 50);
        }
        if(controller.getGruen().a.t==-3|(controller.getGruen().a.zwei_x==controller.getGruen().Ende_2_x&&controller.getGruen().a.zwei_y==controller.getGruen().Ende_2_y)){
            fill(0,250,154);
            circle(540, 410, 50);
        }
        if(controller.getGruen().a.t<-3|(controller.getGruen().a.eins_x==controller.getGruen().Ende_1_x&&controller.getGruen().a.eins_y==controller.getGruen().Ende_1_y)){
            fill(0,250,154);
            circle(470, 410, 50);
        }




        if(controller.getGelb().a.t==1){
            fill(255,215,0);
            circle(470,50,50);
        }
        if(controller.getGelb().a.t==2){
            fill(255,215,0);
            circle(470,125,50);
        }
        if(controller.getGelb().a.t==3){
            fill(255,215,0);
            circle(470,200,50);
        }
        if(controller.getGelb().a.t==4){
            fill(255,215,0);
            circle(470,275,50);
        }
        if(controller.getGelb().a.t==5){
            fill(255,215,0);
            circle(470,350,50);

        }
        if(controller.getGelb().a.t==6){
            fill(255,215,0);
            circle(540,350,50);
        }
        if(controller.getGelb().a.t==7){
            fill(255,215,0);
            circle(610,350,50);
        }
        if(controller.getGelb().a.t==8){
            fill(255,215,0);
            circle(680,350,50);
        }
        if(controller.getGelb().a.t==9){
            fill(255,215,0);
            circle(750,350,50);
        }
        if(controller.getGelb().a.t==10){
            fill(255,215,0);
            circle(750,410,50);
        }
        if(controller.getGelb().a.t==11){
            fill(255,215,0);
            circle(750,470,50);
        }
        if(controller.getGelb().a.t==12){
            fill(255,215,0);
            circle(680,470,50);
        }
        if(controller.getGelb().a.t==13){
            fill(255,215,0);
            circle(610,470,50);
        }
        if(controller.getGelb().a.t==14){
            fill(255,215,0);
            circle(540,470,50);
        }
        if(controller.getGelb().a.t==15){
            fill(255,215,0);
            circle(470,470,50);
        }
        if(controller.getGelb().a.t==16){
            fill(255,215,0);
            circle(470,540,50);
        } if(controller.getGelb().a.t==17){
            fill(255,215,0);
            circle(470,610,50);
        } if(controller.getGelb().a.t==18){
            fill(255,215,0);
            circle(470,680,50);
        }if(controller.getGelb().a.t==19){
            fill(255,215,0);
            circle(470,750,50);
        } if(controller.getGelb().a.t==20){
            fill(255,215,0);
            circle(410,750,50);
        }
        if(controller.getGelb().a.t==21){
            if(controller.getGelb().platz==1|controller.getGelb().platz==2|controller.getGelb().platz==3|controller.getGelb().platz==4){
                fill(255,255,0);
                circle(350,750,50);
            }else {
                fill(255,215,0);
                circle(350,750,50);
            }
        }
        if(controller.getGelb().a.t==22){
            fill(255,215,0);
            circle(350,680,50);
        }
        if(controller.getGelb().a.t==23){
            fill(255,215,0);
            circle(350,610,50);
        }
        if(controller.getGelb().a.t==24){
            fill(255,215,0);
            circle(350,540,50);
        }
        if(controller.getGelb().a.t==25){
            fill(255,215,0);
            circle(350,470,50);
        }
        if(controller.getGelb().a.t==26){
            fill(255,215,0);
            circle(275,470,50);
        }
        if(controller.getGelb().a.t==27){
            fill(255,215,0);
            circle(200,470,50);
        }
        if(controller.getGelb().a.t==28){
            fill(255,215,0);
            circle(125,470,50);
        }
        if(controller.getGelb().a.t==29){
            fill(255,215,0);
            circle(50,470,50);
        }
        if(controller.getGelb().a.t==30){
            fill(255,215,0);
            circle(50,410,50);
        }
        if(controller.getGelb().a.t==31){
            fill(255,215,0);
            circle(50,350,50);
        }
        if(controller.getGelb().a.t==32){
            fill(255,215,0);
            circle(125,350,50);
        }
        if(controller.getGelb().a.t==33){
            fill(255,215,0);
            circle(200,350,50);
        }
        if(controller.getGelb().a.t==34){
            fill(255,215,0);
            circle(275,350,50);
        }
        if(controller.getGelb().a.t==35){
            fill(255,215,0);
            circle(350,350,50);
        }
        if(controller.getGelb().a.t==36){
            fill(255,215,0);
            circle(350,275,50);
        }
        if(controller.getGelb().a.t==37){
            fill(255,215,0);
            circle(350,200,50);
        }
        if(controller.getGelb().a.t==38){
            fill(255,215,0);
            circle(350,125,50);
        } if(controller.getGelb().a.t==39){
            fill(255,215,0);
            circle(350,50,50);
        }
        if(controller.getGelb().a.t==40){
            fill(255,215,0);
            circle(410,50,50);
        }
        if(controller.getGelb().a.t==-1|(controller.getGelb().a.vier_x==controller.getGelb().Ende_4_x&&controller.getGelb().a.vier_y==controller.getGelb().Ende_4_y)) {
            fill(255,215,0);
            circle(410, 680, 50);
        }
        if(controller.getGelb().a.t==-2|(controller.getGelb().a.drei_x==controller.getGelb().Ende_3_x&&controller.getGelb().a.drei_y==controller.getGelb().Ende_3_y)){
            fill(255,215,0);
            circle(410, 610, 50);
        }
        if(controller.getGelb().a.t==-3|(controller.getGelb().a.zwei_x==controller.getGelb().Ende_2_x&&controller.getGelb().a.zwei_y==controller.getGelb().Ende_2_y)){
            fill(255,215,0);
            circle(410, 540, 50);
        }
        if(controller.getGelb().a.t<-3|(controller.getGelb().a.eins_x==controller.getGelb().Ende_1_x&&controller.getGelb().a.eins_y==controller.getGelb().Ende_1_y)){
            fill(255,215,0);
            circle(410, 470, 50);
        }






        if(controller.getRot().a.t==1){
            fill(255,99,71);
            circle(470,50,50);
        }
        if(controller.getRot().a.t==2){
            fill(255,99,71);
            circle(470,125,50);
        }
        if(controller.getRot().a.t==3){
            fill(255,99,71);
            circle(470,200,50);
        }
        if(controller.getRot().a.t==4){
            fill(255,99,71);
            circle(470,275,50);
        }
        if(controller.getRot().a.t==5){
            fill(255,99,71);
            circle(470,350,50);

        }
        if(controller.getRot().a.t==6){
            fill(255,99,71);
            circle(540,350,50);
        }
        if(controller.getRot().a.t==7){
            fill(255,99,71);
            circle(610,350,50);
        }
        if(controller.getRot().a.t==8){
            fill(255,99,71);
            circle(680,350,50);
        }
        if(controller.getRot().a.t==9){
            fill(255,99,71);
            circle(750,350,50);
        }
        if(controller.getRot().a.t==10){
            fill(255,99,71);
            circle(750,410,50);
        }
        if(controller.getRot().a.t==11){
            fill(255,99,71);
            circle(750,470,50);
        }
        if(controller.getRot().a.t==12){
            fill(255,99,71);
            circle(680,470,50);
        }
        if(controller.getRot().a.t==13){
            fill(255,99,71);
            circle(610,470,50);
        }
        if(controller.getRot().a.t==14){
            fill(255,99,71);
            circle(540,470,50);
        }
        if(controller.getRot().a.t==15){
            fill(255,99,71);
            circle(470,470,50);
        }
        if(controller.getRot().a.t==16){
            fill(255,99,71);
            circle(470,540,50);
        } if(controller.getRot().a.t==17){
            fill(255,99,71);
            circle(470,610,50);
        } if(controller.getRot().a.t==18){
            fill(255,99,71);
            circle(470,680,50);
        }if(controller.getRot().a.t==19){
            fill(255,99,71);
            circle(470,750,50);
        } if(controller.getRot().a.t==20){
            fill(255,99,71);
            circle(410,750,50);
        }
        if(controller.getRot().a.t==21){
            fill(255,99,71);
            circle(350,750,50);
        }
        if(controller.getRot().a.t==22){
            fill(255,99,71);
            circle(350,680,50);
        }
        if(controller.getRot().a.t==23){
            fill(255,99,71);
            circle(350,610,50);
        }
        if(controller.getRot().a.t==24){
            fill(255,99,71);
            circle(350,540,50);
        }
        if(controller.getRot().a.t==25){
            fill(255,99,71);
            circle(350,470,50);
        }
        if(controller.getRot().a.t==26){
            fill(255,99,71);
            circle(275,470,50);
        }
        if(controller.getRot().a.t==27){
            fill(255,99,71);
            circle(200,470,50);
        }
        if(controller.getRot().a.t==28){
            fill(255,99,71);
            circle(125,470,50);
        }
        if(controller.getRot().a.t==29){
            fill(255,99,71);
            circle(50,470,50);
        }
        if(controller.getRot().a.t==30){
            fill(255,99,71);
            circle(50,410,50);
        }
        if(controller.getRot().a.t==31){
            if(controller.getRot().platz==1|controller.getRot().platz==2|controller.getRot().platz==3|controller.getRot().platz==4){
                fill(255, 0, 0);
                circle(50,350,50);
            }else {
                fill(255,99,71);
                circle(50,350,50);
            }
        }
        if(controller.getRot().a.t==32){
            fill(255,99,71);
            circle(125,350,50);
        }
        if(controller.getRot().a.t==33){
            fill(255,99,71);
            circle(200,350,50);
        }
        if(controller.getRot().a.t==34){
            fill(255,99,71);
            circle(275,350,50);
        }
        if(controller.getRot().a.t==35){
            fill(255,99,71);
            circle(350,350,50);
        }
        if(controller.getRot().a.t==36){
            fill(255,99,71);
            circle(350,275,50);
        }
        if(controller.getRot().a.t==37){
            fill(255,99,71);
            circle(350,200,50);
        }
        if(controller.getRot().a.t==38){
            fill(255,99,71);
            circle(350,125,50);
        } if(controller.getRot().a.t==39){
            fill(255,99,71);
            circle(350,50,50);
        }
        if(controller.getRot().a.t==40){
            fill(255,99,71);
            circle(410,50,50);
        }
        if(controller.getRot().a.t==-1|(controller.getRot().a.vier_x==controller.getRot().Ende_4_x&&controller.getRot().a.vier_y==controller.getRot().Ende_4_y)) {
            fill(255,99,71);
            circle(125, 410, 50);
        }
        else{
            fill(255, 0, 0);
            circle(125, 410, 50);
        }
        if(controller.getRot().a.t==-2|(controller.getRot().a.drei_x==controller.getRot().Ende_3_x&&controller.getRot().a.drei_y==controller.getRot().Ende_3_y)){
            fill(255,99,71);
            circle(200, 410, 50);
        }
        else{
            fill(255, 0, 0);
            circle(200, 410, 50);
        }
        if(controller.getRot().a.t==-3|(controller.getRot().a.zwei_x==controller.getRot().Ende_2_x&&controller.getRot().a.zwei_y==controller.getRot().Ende_2_y)){
            fill(255,99,71);
            circle(275, 410, 50);
        }
        else{
            fill(255, 0, 0);
            circle(275, 410, 50);
        }
        if(controller.getRot().a.t<-3|(controller.getRot().a.eins_x==controller.getRot().Ende_1_x&&controller.getRot().a.eins_y==controller.getRot().Ende_1_y)){
            fill(255,99,71);
            circle(350, 410, 50);
        } else{
            fill(255, 0, 0);
            circle(350, 410, 50);
        }

    }
    /**
     * Was dargestellt werden soll, wenn man als seine Farbe die gelb wählt.
     * Der Controller bestimmt, welche draw-Methode dran ist(Die Standart draw-Methode wird immer ausgeführt).
     */
    public void drawGameGelb(){
        Blau.hide();
        Gruen.hide();
        Gelb.hide();
        Rot.hide();
        Wuerfel.show();
        Wuerfel.setPosition(180,675);
        background(255);

        if(controller.getDran()==3){
            Wuerfel.show();
            Wuerfel.setPosition(180,675);
        }else if(controller.getDran()!=3){
            Wuerfel.hide();
        }

        if(controller.getDran()==2) {
            if(controller.getBlau().Ende_4_x!=controller.getBlau().a.vier_x|controller.getBlau().Ende_4_y!=controller.getBlau().a.vier_y) {
                if (controller.getWuerfel() == 1) {
                    image(wuerfel_1, 560, 150);
                    wuerfel_1.resize(100, 100);
                }
                if (controller.getWuerfel() == 2) {
                    image(wuerfel_2, 560, 150);
                    wuerfel_2.resize(100, 100);
                }
                if (controller.getWuerfel() == 3) {
                    image(wuerfel_3, 560, 150);
                    wuerfel_3.resize(100, 100);
                }
                if (controller.getWuerfel() == 4) {
                    image(wuerfel_4, 560, 150);
                    wuerfel_4.resize(100, 100);
                }
                if (controller.getWuerfel() == 5) {
                    image(wuerfel_5, 560, 150);
                    wuerfel_5.resize(100, 100);
                }
                if (controller.getWuerfel() == 6) {
                    image(wuerfel_6, 560, 150);
                    wuerfel_6.resize(100, 100);
                }
            }
        }
        if(controller.getDran()==3) {
            if (controller.getGruen().Ende_4_x != controller.getGruen().a.vier_x | controller.getGruen().Ende_4_y != controller.getGruen().a.vier_y) {
                if (controller.getWuerfel() == 1) {
                    image(wuerfel_1, 560, 550);
                    wuerfel_1.resize(100, 100);
                }
                if (controller.getWuerfel() == 2) {
                    image(wuerfel_2, 560, 550);
                    wuerfel_2.resize(100, 100);
                }
                if (controller.getWuerfel() == 3) {
                    image(wuerfel_3, 560, 550);
                    wuerfel_3.resize(100, 100);
                }
                if (controller.getWuerfel() == 4) {
                    image(wuerfel_4, 560, 550);
                    wuerfel_4.resize(100, 100);
                }
                if (controller.getWuerfel() == 5) {
                    image(wuerfel_5, 560, 550);
                    wuerfel_5.resize(100, 100);
                }
                if (controller.getWuerfel() == 6) {
                    image(wuerfel_6, 560, 550);
                    wuerfel_6.resize(100, 100);
                }
            }
        }
        if(controller.getDran()==4) {
            if (controller.getGelb().Ende_4_x != controller.getGelb().a.vier_x | controller.getGelb().Ende_4_y != controller.getGelb().a.vier_y) {
                if (controller.getWuerfel() == 1) {
                    image(wuerfel_1, 180, 550);
                    wuerfel_1.resize(100, 100);
                }
                if (controller.getWuerfel() == 2) {
                    image(wuerfel_2, 180, 550);
                    wuerfel_2.resize(100, 100);
                }
                if (controller.getWuerfel() == 3) {
                    image(wuerfel_3, 180, 550);
                    wuerfel_3.resize(100, 100);
                }
                if (controller.getWuerfel() == 4) {
                    image(wuerfel_4, 180, 550);
                    wuerfel_4.resize(100, 100);
                }
                if (controller.getWuerfel() == 5) {
                    image(wuerfel_5, 180, 550);
                    wuerfel_5.resize(100, 100);
                }
                if (controller.getWuerfel() == 6) {
                    image(wuerfel_6, 180, 550);
                    wuerfel_6.resize(100, 100);
                }
            }
        }
        if(controller.getDran()==1){
            if(controller.getRot().Ende_4_x!=controller.getRot().a.vier_x|controller.getRot().Ende_4_y!=controller.getRot().a.vier_y) {
                if (controller.getWuerfel() == 1) {
                    image(wuerfel_1, 180, 150);
                    wuerfel_1.resize(100, 100);
                }
                if (controller.getWuerfel() == 2) {
                    image(wuerfel_2, 180, 150);
                    wuerfel_2.resize(100, 100);
                }
                if (controller.getWuerfel() == 3) {
                    image(wuerfel_3, 180, 150);
                    wuerfel_3.resize(100, 100);
                }
                if (controller.getWuerfel() == 4) {
                    image(wuerfel_4, 180, 150);
                    wuerfel_4.resize(100, 100);
                }
                if (controller.getWuerfel() == 5) {
                    image(wuerfel_5, 180, 150);
                    wuerfel_5.resize(100, 100);
                }
                if (controller.getWuerfel() == 6) {
                    image(wuerfel_6, 180, 150);
                    wuerfel_6.resize(100, 100);
                }
            }
        }

        fill(0,0,255);

        circle(410,125,50);
        circle(410,200,50);
        circle(410,275,50);
        circle(410,350,50);


        //rot
        fill(255,0,0);
        circle(125,410,50);
        circle(200,410,50);
        circle(275,410,50);
        circle(350,410,50);



        //gruen
        fill(0,255,0);

        circle(680,410,50);
        circle(610,410,50);
        circle(540,410,50);
        circle(470,410,50);


        //gelb
        fill(255,255,0);

        circle(410,680,50);
        circle(410,610,50);
        circle(410,540,50);
        circle(410,470,50);
        //rot
        if(controller.getRot().a.eins_x==controller.getRot().Haus_1_x&&controller.getRot().a.eins_y==controller.getRot().Haus_1_y) {
            fill(255,99,71);
            circle(50, 50, 50);
        }else{
            fill(255, 0, 0);
            circle(50, 50, 50);
        }
        if(controller.getRot().a.zwei_x==controller.getRot().Haus_2_x&&controller.getRot().a.zwei_y==controller.getRot().Haus_2_y) {
            fill(255,99,71);
            circle(105, 50, 50);
        }else{
            fill(255, 0, 0);
            circle(105, 50, 50);
        }
        if(controller.getRot().a.drei_x==controller.getRot().Haus_3_x&&controller.getRot().a.drei_y==controller.getRot().Haus_3_y) {
            fill(255,99,71);
            circle(50, 105, 50);
        }else{
            fill(255, 0, 0);
            circle(50, 105, 50);
        }
        if(controller.getRot().a.vier_x==controller.getRot().Haus_4_x&&controller.getRot().a.vier_y==controller.getRot().Haus_4_y) {
            fill(255,99,71);
            circle(105, 105, 50);
        }else{
            fill(255, 0, 0);
            circle(105, 105, 50);
        }







        //blau
        if(controller.getBlau().a.eins_x==controller.getBlau().Haus_1_x&&controller.getBlau().a.eins_y==controller.getBlau().Haus_1_y) {
            fill(64,224,208);
            circle(695, 50, 50);
        }else{
            fill(0, 0, 255);
            circle(695, 50, 50);
        }
        if(controller.getBlau().a.zwei_x==controller.getBlau().Haus_2_x&&controller.getBlau().a.zwei_y==controller.getBlau().Haus_2_y) {
            fill(64,224,208);
            circle(750, 50, 50);
        }else{
            fill(0, 0, 255);
            circle(750, 50, 50);
        }
        if(controller.getBlau().a.drei_x==controller.getBlau().Haus_3_x&&controller.getBlau().a.drei_y==controller.getBlau().Haus_3_y) {
            fill(64,224,208);
            circle(695, 105, 50);
        }else{
            fill(0, 0, 255);
            circle(695, 105, 50);
        }
        if(controller.getBlau().a.vier_x==controller.getBlau().Haus_4_x&&controller.getBlau().a.vier_y==controller.getBlau().Haus_4_y) {
            fill(64,224,208);
            circle(750, 105, 50);
        }else{
            fill(0, 0, 255);
            circle(750, 105, 50);
        }



        //gelb
        if(controller.getGelb().a.eins_x==controller.getGelb().Haus_1_x&&controller.getGelb().a.eins_y==controller.getGelb().Haus_1_y) {
            fill(255,215,0);
            circle(50, 695, 50);
        }else{
            fill(255, 255, 0);
            circle(50, 695, 50);
        }
        if(controller.getGelb().a.zwei_x==controller.getGelb().Haus_2_x&&controller.getGelb().a.zwei_y==controller.getGelb().Haus_2_y) {
            fill(255,215,0);
            circle(105, 695, 50);
        }else{
            fill(255, 255, 0);
            circle(105, 695, 50);
        }
        if(controller.getGelb().a.drei_x==controller.getGelb().Haus_3_x&&controller.getGelb().a.drei_y==controller.getGelb().Haus_3_y) {
            fill(255,215,0);
            circle(50, 750, 50);
        }else{
            fill(255, 255, 0);
            circle(50, 750, 50);
        }
        if(controller.getGelb().a.vier_x==controller.getGelb().Haus_4_x&&controller.getGelb().a.vier_y==controller.getGelb().Haus_4_y) {
            fill(255,215,0);
            circle(105, 750, 50);
        }else{
            fill(255, 255, 0);
            circle(105, 750, 50);
        }








        //gruen
        if(controller.getGruen().a.eins_x==controller.getGruen().Haus_1_x&&controller.getGruen().a.eins_y==controller.getGruen().Haus_1_y) {
            fill(0,250,154);
            circle(695, 695, 50);
        }else{
            fill(0, 255, 0);
            circle(695, 695, 50);
        }
        if(controller.getGruen().a.zwei_x==controller.getGruen().Haus_2_x&&controller.getGruen().a.zwei_y==controller.getGruen().Haus_2_y) {
            fill(0,250,154);
            circle(750, 695, 50);
        }else{
            fill(0, 255, 0);
            circle(750, 695, 50);
        }
        if(controller.getGruen().a.drei_x==controller.getGruen().Haus_3_x&&controller.getGruen().a.drei_y==controller.getGruen().Haus_3_y) {
            fill(0,250,154);
            circle(695, 750, 50);
        }else{
            fill(0, 255, 0);
            circle(695, 750, 50);
        }
        if(controller.getGruen().a.vier_x==controller.getGruen().Haus_4_x&&controller.getGruen().a.vier_y==controller.getGruen().Haus_4_y) {
            fill(0,250,154);
            circle(750, 750, 50);
        }else{
            fill(0, 255, 0);
            circle(750, 750, 50);
        }




        if (controller.getBlau().a.t == 1) {
            if(controller.getBlau().platz==1|controller.getBlau().platz==2|controller.getBlau().platz==3|controller.getBlau().platz==4){
                fill(0, 0, 255);
                circle(470, 50, 50);
            }else {
                fill(64, 224, 208);
                circle(470, 50, 50);
            }
        } else {
            fill(0, 0, 255);
            circle(470, 50, 50);
        }
        if (controller.getBlau().a.t == 2) {
            fill(64, 224, 208);
            circle(470, 125, 50);
        } else {
            fill(255);
            circle(470, 125, 50);
        }
        if (controller.getBlau().a.t == 3) {
            fill(64, 224, 208);
            circle(470, 200, 50);
        } else {
            fill(255);
            circle(470, 200, 50);
        }
        if (controller.getBlau().a.t == 4) {
            fill(64, 224, 208);
            circle(470, 275, 50);
        } else {
            fill(255);
            circle(470, 275, 50);
        }
        if (controller.getBlau().a.t == 5) {
            fill(64, 224, 208);
            circle(470, 350, 50);

        } else {
            fill(255);
            circle(470, 350, 50);
        }
        if (controller.getBlau().a.t == 6) {
            fill(64, 224, 208);
            circle(540, 350, 50);
        } else {
            fill(255);
            circle(540, 350, 50);
        }
        if (controller.getBlau().a.t == 7) {
            fill(64, 224, 208);
            circle(610, 350, 50);
        } else {
            fill(255);
            circle(610, 350, 50);
        }
        if (controller.getBlau().a.t == 8) {
            fill(64, 224, 208);
            circle(680, 350, 50);
        } else {
            fill(255);
            circle(680, 350, 50);
        }
        if (controller.getBlau().a.t == 9) {
            fill(64, 224, 208);
            circle(750, 350, 50);
        } else {
            fill(255);
            circle(750, 350, 50);
        }
        if (controller.getBlau().a.t == 10) {
            fill(64, 224, 208);
            circle(750, 410, 50);
        } else {
            fill(255);
            circle(750, 410, 50);
        }
        if (controller.getBlau().a.t == 11) {
            fill(64, 224, 208);
            circle(750, 470, 50);
        } else {
            fill(0, 255, 0);
            circle(750, 470, 50);
        }
        if (controller.getBlau().a.t == 12) {
            fill(64, 224, 208);
            circle(680, 470, 50);
        } else {
            fill(255);
            circle(680, 470, 50);
        }
        if (controller.getBlau().a.t == 13) {
            fill(64, 224, 208);
            circle(610, 470, 50);
        } else {
            fill(255);
            circle(610, 470, 50);
        }
        if (controller.getBlau().a.t == 14) {
            fill(64, 224, 208);
            circle(540, 470, 50);
        } else {
            fill(255);
            circle(540, 470, 50);
        }
        if (controller.getBlau().a.t == 15) {
            fill(64, 224, 208);
            circle(470, 470, 50);
        } else {
            fill(255);
            circle(470, 470, 50);
        }
        if (controller.getBlau().a.t == 16) {
            fill(64, 224, 208);
            circle(470, 540, 50);
        } else {
            fill(255);
            circle(470, 540, 50);
        }
        if (controller.getBlau().a.t == 17) {
            fill(64, 224, 208);
            circle(470, 610, 50);
        } else {
            fill(255);
            circle(470, 610, 50);
        }
        if (controller.getBlau().a.t == 18) {
            fill(64, 224, 208);
            circle(470, 680, 50);
        } else {
            fill(255);
            circle(470, 680, 50);
        }
        if (controller.getBlau().a.t == 19) {
            fill(64, 224, 208);
            circle(470, 750, 50);
        } else {
            fill(255);
            circle(470, 750, 50);
        }
        if (controller.getBlau().a.t == 20) {
            fill(64, 224, 208);
            circle(410, 750, 50);
        } else {
            fill(255);
            circle(410, 750, 50);
        }
        if (controller.getBlau().a.t == 21) {
            fill(64, 224, 208);
            circle(350, 750, 50);
        } else {
            fill(255, 255, 0);
            circle(350, 750, 50);
        }
        if (controller.getBlau().a.t == 22) {
            fill(64, 224, 208);
            circle(350, 680, 50);
        } else {
            fill(255);
            circle(350, 680, 50);
        }
        if (controller.getBlau().a.t == 23) {
            fill(64, 224, 208);
            circle(350, 610, 50);
        } else {
            fill(255);
            circle(350, 610, 50);
        }
        if (controller.getBlau().a.t == 24) {
            fill(64, 224, 208);
            circle(350, 540, 50);
        } else {
            fill(255);
            circle(350, 540, 50);
        }
        if (controller.getBlau().a.t == 25) {
            fill(64, 224, 208);
            circle(350, 470, 50);
        } else {
            fill(255);
            circle(350, 470, 50);
        }
        if (controller.getBlau().a.t == 26) {
            fill(64, 224, 208);
            circle(275, 470, 50);
        } else {
            fill(255);
            circle(275, 470, 50);
        }
        if (controller.getBlau().a.t == 27) {
            fill(64, 224, 208);
            circle(200, 470, 50);
        } else {
            fill(255);
            circle(200, 470, 50);
        }
        if (controller.getBlau().a.t == 28) {
            fill(64, 224, 208);
            circle(125, 470, 50);
        } else {
            fill(255);
            circle(125, 470, 50);
        }
        if (controller.getBlau().a.t == 29) {
            fill(64, 224, 208);
            circle(50, 470, 50);
        } else {
            fill(255);
            circle(50, 470, 50);
        }
        if (controller.getBlau().a.t == 30) {
            fill(64, 224, 208);
            circle(50, 410, 50);
        } else {
            fill(255);
            circle(50, 410, 50);
        }
        if (controller.getBlau().a.t == 31) {
            fill(64, 224, 208);
            circle(50, 350, 50);
        } else {
            fill(255, 0, 0);
            circle(50, 350, 50);
        }
        if (controller.getBlau().a.t == 32) {
            fill(64, 224, 208);
            circle(125, 350, 50);
        } else {
            fill(255);
            circle(125, 350, 50);
        }
        if (controller.getBlau().a.t == 33) {
            fill(64, 224, 208);
            circle(200, 350, 50);
        } else {
            fill(255);
            circle(200, 350, 50);
        }
        if (controller.getBlau().a.t == 34) {
            fill(64, 224, 208);
            circle(275, 350, 50);
        } else {
            fill(255);
            circle(275, 350, 50);
        }
        if (controller.getBlau().a.t == 35) {
            fill(64, 224, 208);
            circle(350, 350, 50);
        } else {
            fill(255);
            circle(350, 350, 50);
        }
        if (controller.getBlau().a.t == 36) {
            fill(64, 224, 208);
            circle(350, 275, 50);
        } else {
            fill(255);
            circle(350, 275, 50);
        }
        if (controller.getBlau().a.t == 37) {
            fill(64, 224, 208);
            circle(350, 200, 50);
        } else {
            fill(255);
            circle(350, 200, 50);
        }
        if (controller.getBlau().a.t == 38) {
            fill(64, 224, 208);
            circle(350, 125, 50);
        } else {
            fill(255);
            circle(350, 125, 50);
        }
        if (controller.getBlau().a.t == 39) {
            fill(64, 224, 208);
            circle(350, 50, 50);
        } else {
            fill(255);
            circle(350, 50, 50);
        }
        if (controller.getBlau().a.t == 40) {
            fill(64, 224, 208);
            circle(410, 50, 50);
        } else {
            fill(255);
            circle(410, 50, 50);
        }
        if (controller.getBlau().a.t == 41|(controller.getBlau().a.vier_x==controller.getBlau().Ende_4_x&&controller.getBlau().a.vier_y==controller.getBlau().Ende_4_y)) {
            fill(64, 224, 208);
            circle(410, 125, 50);
        } else {
            fill(0,0,255);
            circle(410, 125, 50);
        }
        if (controller.getBlau().a.t == 42|(controller.getBlau().a.drei_x==controller.getBlau().Ende_3_x&&controller.getBlau().a.drei_y==controller.getBlau().Ende_3_y)) {
            fill(64, 224, 208);
            circle(410, 200, 50);
        } else {
            fill(0,0,255);
            circle(410, 200, 50);
        }
        if (controller.getBlau().a.t == 43|(controller.getBlau().a.zwei_x==controller.getBlau().Ende_2_x&&controller.getBlau().a.zwei_y==controller.getBlau().Ende_2_y)) {
            fill(64, 224, 208);
            circle(410, 275, 50);
        } else {
            fill(0,0,255);
            circle(410, 275, 50);
        }
        if (controller.getBlau().a.t == 44|(controller.getBlau().a.eins_x==controller.getBlau().Ende_1_x&&controller.getBlau().a.eins_y==controller.getBlau().Ende_1_y)) {
            fill(64, 224, 208);
            circle(410, 350, 50);
        } else {
            fill(0,0,255);
            circle(410, 350, 50);
        }



        if(controller.getGruen().a.t==1){
            fill(0,250,154);
            circle(470,50,50);
        }
        if(controller.getGruen().a.t==2){
            fill(0,250,154);
            circle(470,125,50);
        }
        if(controller.getGruen().a.t==3){
            fill(0,250,154);
            circle(470,200,50);
        }
        if(controller.getGruen().a.t==4){
            fill(0,250,154);
            circle(470,275,50);
        }
        if(controller.getGruen().a.t==5){
            fill(0,250,154);
            circle(470,350,50);

        }
        if(controller.getGruen().a.t==6){
            fill(0,250,154);
            circle(540,350,50);
        }
        if(controller.getGruen().a.t==7){
            fill(0,250,154);
            circle(610,350,50);
        }
        if(controller.getGruen().a.t==8){
            fill(0,250,154);
            circle(680,350,50);
        }
        if(controller.getGruen().a.t==9){
            fill(0,250,154);
            circle(750,350,50);
        }
        if(controller.getGruen().a.t==10){
            fill(0,250,154);
            circle(750,410,50);
        }
        if(controller.getGruen().a.t==11){
            if(controller.getGruen().platz==1|controller.getGruen().platz==2|controller.getGruen().platz==3|controller.getGruen().platz==4){
                fill(0,255,0);
                circle(750,470,50);
            }else {
                fill(0,250,154);
                circle(750,470,50);
            }
        }
        if(controller.getGruen().a.t==12){
            fill(0,250,154);
            circle(680,470,50);
        }
        if(controller.getGruen().a.t==13){
            fill(0,250,154);
            circle(610,470,50);
        }
        if(controller.getGruen().a.t==14){
            fill(0,250,154);
            circle(540,470,50);
        }
        if(controller.getGruen().a.t==15){
            fill(0,250,154);
            circle(470,470,50);
        }
        if(controller.getGruen().a.t==16){
            fill(0,250,154);
            circle(470,540,50);
        } if(controller.getGruen().a.t==17){
            fill(0,250,154);
            circle(470,610,50);
        } if(controller.getGruen().a.t==18){
            fill(0,250,154);
            circle(470,680,50);
        }if(controller.getGruen().a.t==19){
            fill(0,250,154);
            circle(470,750,50);
        } if(controller.getGruen().a.t==20){
            fill(0,250,154);
            circle(410,750,50);
        }
        if(controller.getGruen().a.t==21){
            fill(0,250,154);
            circle(350,750,50);
        }
        if(controller.getGruen().a.t==22){
            fill(0,250,154);
            circle(350,680,50);
        }
        if(controller.getGruen().a.t==23){
            fill(0,250,154);
            circle(350,610,50);
        }
        if(controller.getGruen().a.t==24){
            fill(0,250,154);
            circle(350,540,50);
        }
        if(controller.getGruen().a.t==25){
            fill(0,250,154);
            circle(350,470,50);
        }
        if(controller.getGruen().a.t==26){
            fill(0,250,154);
            circle(275,470,50);
        }
        if(controller.getGruen().a.t==27){
            fill(0,250,154);
            circle(200,470,50);
        }
        if(controller.getGruen().a.t==28){
            fill(0,250,154);
            circle(125,470,50);
        }
        if(controller.getGruen().a.t==29){
            fill(0,250,154);
            circle(50,470,50);
        }
        if(controller.getGruen().a.t==30){
            fill(0,250,154);
            circle(50,410,50);
        }
        if(controller.getGruen().a.t==31){
            fill(0,250,154);
            circle(50,350,50);
        }
        if(controller.getGruen().a.t==32){
            fill(0,250,154);
            circle(125,350,50);
        }
        if(controller.getGruen().a.t==33){
            fill(0,250,154);
            circle(200,350,50);
        }
        if(controller.getGruen().a.t==34){
            fill(0,250,154);
            circle(275,350,50);
        }
        if(controller.getGruen().a.t==35){
            fill(0,250,154);
            circle(350,350,50);
        }
        if(controller.getGruen().a.t==36){
            fill(0,250,154);
            circle(350,275,50);
        }
        if(controller.getGruen().a.t==37){
            fill(0,250,154);
            circle(350,200,50);
        }
        if(controller.getGruen().a.t==38){
            fill(0,250,154);
            circle(350,125,50);
        } if(controller.getGruen().a.t==39){
            fill(0,250,154);
            circle(350,50,50);
        }
        if(controller.getGruen().a.t==40){
            fill(0,250,154);
            circle(410,50,50);
        }
        if(controller.getGruen().a.t==-1|(controller.getGruen().a.vier_x==controller.getGruen().Ende_4_x&&controller.getGruen().a.vier_y==controller.getGruen().Ende_4_y)) {
            fill(0, 250, 154);
            circle(680, 410, 50);
        }
        if(controller.getGruen().a.t==-2|(controller.getGruen().a.drei_x==controller.getGruen().Ende_3_x&&controller.getGruen().a.drei_y==controller.getGruen().Ende_3_y)){
            fill(0,250,154);
            circle(610, 410, 50);
        }
        if(controller.getGruen().a.t==-3|(controller.getGruen().a.zwei_x==controller.getGruen().Ende_2_x&&controller.getGruen().a.zwei_y==controller.getGruen().Ende_2_y)){
            fill(0,250,154);
            circle(540, 410, 50);
        }
        if(controller.getGruen().a.t<-3|(controller.getGruen().a.eins_x==controller.getGruen().Ende_1_x&&controller.getGruen().a.eins_y==controller.getGruen().Ende_1_y)){
            fill(0,250,154);
            circle(470, 410, 50);
        }




        if(controller.getGelb().a.t==1){
            fill(255,215,0);
            circle(470,50,50);
        }
        if(controller.getGelb().a.t==2){
            fill(255,215,0);
            circle(470,125,50);
        }
        if(controller.getGelb().a.t==3){
            fill(255,215,0);
            circle(470,200,50);
        }
        if(controller.getGelb().a.t==4){
            fill(255,215,0);
            circle(470,275,50);
        }
        if(controller.getGelb().a.t==5){
            fill(255,215,0);
            circle(470,350,50);

        }
        if(controller.getGelb().a.t==6){
            fill(255,215,0);
            circle(540,350,50);
        }
        if(controller.getGelb().a.t==7){
            fill(255,215,0);
            circle(610,350,50);
        }
        if(controller.getGelb().a.t==8){
            fill(255,215,0);
            circle(680,350,50);
        }
        if(controller.getGelb().a.t==9){
            fill(255,215,0);
            circle(750,350,50);
        }
        if(controller.getGelb().a.t==10){
            fill(255,215,0);
            circle(750,410,50);
        }
        if(controller.getGelb().a.t==11){
            fill(255,215,0);
            circle(750,470,50);
        }
        if(controller.getGelb().a.t==12){
            fill(255,215,0);
            circle(680,470,50);
        }
        if(controller.getGelb().a.t==13){
            fill(255,215,0);
            circle(610,470,50);
        }
        if(controller.getGelb().a.t==14){
            fill(255,215,0);
            circle(540,470,50);
        }
        if(controller.getGelb().a.t==15){
            fill(255,215,0);
            circle(470,470,50);
        }
        if(controller.getGelb().a.t==16){
            fill(255,215,0);
            circle(470,540,50);
        } if(controller.getGelb().a.t==17){
            fill(255,215,0);
            circle(470,610,50);
        } if(controller.getGelb().a.t==18){
            fill(255,215,0);
            circle(470,680,50);
        }if(controller.getGelb().a.t==19){
            fill(255,215,0);
            circle(470,750,50);
        } if(controller.getGelb().a.t==20){
            fill(255,215,0);
            circle(410,750,50);
        }
        if(controller.getGelb().a.t==21){
            if(controller.getGelb().platz==1|controller.getGelb().platz==2|controller.getGelb().platz==3|controller.getGelb().platz==4){
                fill(255,255,0);
                circle(350,750,50);
            }else {
                fill(255,215,0);
                circle(350,750,50);
            }
        }
        if(controller.getGelb().a.t==22){
            fill(255,215,0);
            circle(350,680,50);
        }
        if(controller.getGelb().a.t==23){
            fill(255,215,0);
            circle(350,610,50);
        }
        if(controller.getGelb().a.t==24){
            fill(255,215,0);
            circle(350,540,50);
        }
        if(controller.getGelb().a.t==25){
            fill(255,215,0);
            circle(350,470,50);
        }
        if(controller.getGelb().a.t==26){
            fill(255,215,0);
            circle(275,470,50);
        }
        if(controller.getGelb().a.t==27){
            fill(255,215,0);
            circle(200,470,50);
        }
        if(controller.getGelb().a.t==28){
            fill(255,215,0);
            circle(125,470,50);
        }
        if(controller.getGelb().a.t==29){
            fill(255,215,0);
            circle(50,470,50);
        }
        if(controller.getGelb().a.t==30){
            fill(255,215,0);
            circle(50,410,50);
        }
        if(controller.getGelb().a.t==31){
            fill(255,215,0);
            circle(50,350,50);
        }
        if(controller.getGelb().a.t==32){
            fill(255,215,0);
            circle(125,350,50);
        }
        if(controller.getGelb().a.t==33){
            fill(255,215,0);
            circle(200,350,50);
        }
        if(controller.getGelb().a.t==34){
            fill(255,215,0);
            circle(275,350,50);
        }
        if(controller.getGelb().a.t==35){
            fill(255,215,0);
            circle(350,350,50);
        }
        if(controller.getGelb().a.t==36){
            fill(255,215,0);
            circle(350,275,50);
        }
        if(controller.getGelb().a.t==37){
            fill(255,215,0);
            circle(350,200,50);
        }
        if(controller.getGelb().a.t==38){
            fill(255,215,0);
            circle(350,125,50);
        } if(controller.getGelb().a.t==39){
            fill(255,215,0);
            circle(350,50,50);
        }
        if(controller.getGelb().a.t==40){
            fill(255,215,0);
            circle(410,50,50);
        }
        if(controller.getGelb().a.t==-1|(controller.getGelb().a.vier_x==controller.getGelb().Ende_4_x&&controller.getGelb().a.vier_y==controller.getGelb().Ende_4_y)) {
            fill(255,215,0);
            circle(410, 680, 50);
        }
        if(controller.getGelb().a.t==-2|(controller.getGelb().a.drei_x==controller.getGelb().Ende_3_x&&controller.getGelb().a.drei_y==controller.getGelb().Ende_3_y)){
            fill(255,215,0);
            circle(410, 610, 50);
        }
        if(controller.getGelb().a.t==-3|(controller.getGelb().a.zwei_x==controller.getGelb().Ende_2_x&&controller.getGelb().a.zwei_y==controller.getGelb().Ende_2_y)){
            fill(255,215,0);
            circle(410, 540, 50);
        }
        if(controller.getGelb().a.t<-3|(controller.getGelb().a.eins_x==controller.getGelb().Ende_1_x&&controller.getGelb().a.eins_y==controller.getGelb().Ende_1_y)){
            fill(255,215,0);
            circle(410, 470, 50);
        }






        if(controller.getRot().a.t==1){
            fill(255,99,71);
            circle(470,50,50);
        }
        if(controller.getRot().a.t==2){
            fill(255,99,71);
            circle(470,125,50);
        }
        if(controller.getRot().a.t==3){
            fill(255,99,71);
            circle(470,200,50);
        }
        if(controller.getRot().a.t==4){
            fill(255,99,71);
            circle(470,275,50);
        }
        if(controller.getRot().a.t==5){
            fill(255,99,71);
            circle(470,350,50);

        }
        if(controller.getRot().a.t==6){
            fill(255,99,71);
            circle(540,350,50);
        }
        if(controller.getRot().a.t==7){
            fill(255,99,71);
            circle(610,350,50);
        }
        if(controller.getRot().a.t==8){
            fill(255,99,71);
            circle(680,350,50);
        }
        if(controller.getRot().a.t==9){
            fill(255,99,71);
            circle(750,350,50);
        }
        if(controller.getRot().a.t==10){
            fill(255,99,71);
            circle(750,410,50);
        }
        if(controller.getRot().a.t==11){
            fill(255,99,71);
            circle(750,470,50);
        }
        if(controller.getRot().a.t==12){
            fill(255,99,71);
            circle(680,470,50);
        }
        if(controller.getRot().a.t==13){
            fill(255,99,71);
            circle(610,470,50);
        }
        if(controller.getRot().a.t==14){
            fill(255,99,71);
            circle(540,470,50);
        }
        if(controller.getRot().a.t==15){
            fill(255,99,71);
            circle(470,470,50);
        }
        if(controller.getRot().a.t==16){
            fill(255,99,71);
            circle(470,540,50);
        } if(controller.getRot().a.t==17){
            fill(255,99,71);
            circle(470,610,50);
        } if(controller.getRot().a.t==18){
            fill(255,99,71);
            circle(470,680,50);
        }if(controller.getRot().a.t==19){
            fill(255,99,71);
            circle(470,750,50);
        } if(controller.getRot().a.t==20){
            fill(255,99,71);
            circle(410,750,50);
        }
        if(controller.getRot().a.t==21){
            fill(255,99,71);
            circle(350,750,50);
        }
        if(controller.getRot().a.t==22){
            fill(255,99,71);
            circle(350,680,50);
        }
        if(controller.getRot().a.t==23){
            fill(255,99,71);
            circle(350,610,50);
        }
        if(controller.getRot().a.t==24){
            fill(255,99,71);
            circle(350,540,50);
        }
        if(controller.getRot().a.t==25){
            fill(255,99,71);
            circle(350,470,50);
        }
        if(controller.getRot().a.t==26){
            fill(255,99,71);
            circle(275,470,50);
        }
        if(controller.getRot().a.t==27){
            fill(255,99,71);
            circle(200,470,50);
        }
        if(controller.getRot().a.t==28){
            fill(255,99,71);
            circle(125,470,50);
        }
        if(controller.getRot().a.t==29){
            fill(255,99,71);
            circle(50,470,50);
        }
        if(controller.getRot().a.t==30){
            fill(255,99,71);
            circle(50,410,50);
        }
        if(controller.getRot().a.t==31){
            if(controller.getRot().platz==1|controller.getRot().platz==2|controller.getRot().platz==3|controller.getRot().platz==4){
                fill(255, 0, 0);
                circle(50,350,50);
            }else {
                fill(255,99,71);
                circle(50,350,50);
            }
        }
        if(controller.getRot().a.t==32){
            fill(255,99,71);
            circle(125,350,50);
        }
        if(controller.getRot().a.t==33){
            fill(255,99,71);
            circle(200,350,50);
        }
        if(controller.getRot().a.t==34){
            fill(255,99,71);
            circle(275,350,50);
        }
        if(controller.getRot().a.t==35){
            fill(255,99,71);
            circle(350,350,50);
        }
        if(controller.getRot().a.t==36){
            fill(255,99,71);
            circle(350,275,50);
        }
        if(controller.getRot().a.t==37){
            fill(255,99,71);
            circle(350,200,50);
        }
        if(controller.getRot().a.t==38){
            fill(255,99,71);
            circle(350,125,50);
        } if(controller.getRot().a.t==39){
            fill(255,99,71);
            circle(350,50,50);
        }
        if(controller.getRot().a.t==40){
            fill(255,99,71);
            circle(410,50,50);
        }
        if(controller.getRot().a.t==-1|(controller.getRot().a.vier_x==controller.getRot().Ende_4_x&&controller.getRot().a.vier_y==controller.getRot().Ende_4_y)) {
            fill(255,99,71);
            circle(125, 410, 50);
        }
        else{
            fill(255, 0, 0);
            circle(125, 410, 50);
        }
        if(controller.getRot().a.t==-2|(controller.getRot().a.drei_x==controller.getRot().Ende_3_x&&controller.getRot().a.drei_y==controller.getRot().Ende_3_y)){
            fill(255,99,71);
            circle(200, 410, 50);
        }
        else{
            fill(255, 0, 0);
            circle(200, 410, 50);
        }
        if(controller.getRot().a.t==-3|(controller.getRot().a.zwei_x==controller.getRot().Ende_2_x&&controller.getRot().a.zwei_y==controller.getRot().Ende_2_y)){
            fill(255,99,71);
            circle(275, 410, 50);
        }
        else{
            fill(255, 0, 0);
            circle(275, 410, 50);
        }
        if(controller.getRot().a.t<-3|(controller.getRot().a.eins_x==controller.getRot().Ende_1_x&&controller.getRot().a.eins_y==controller.getRot().Ende_1_y)){
            fill(255,99,71);
            circle(350, 410, 50);
        } else{
            fill(255, 0, 0);
            circle(350, 410, 50);
        }
    }

    /**
     * Was dargestellt werden soll, wenn man als seine Farbe die rot wählt.
     * Der Controller bestimmt, welche draw-Methode dran ist(Die Standart draw-Methode wird immer ausgeführt).
     */
    public void drawGameRot(){

        Blau.hide();
        Gruen.hide();
        Gelb.hide();
        Rot.hide();
        Wuerfel.show();
        Wuerfel.setPosition(180,100);
        background(255);

        if(controller.getDran()==4){
            Wuerfel.show();
            Wuerfel.setPosition(180,100);
        }else if(controller.getDran()!=4){
            Wuerfel.hide();
        }

        if(controller.getDran()==2) {
            if(controller.getBlau().Ende_4_x!=controller.getBlau().a.vier_x|controller.getBlau().Ende_4_y!=controller.getBlau().a.vier_y) {
                if (controller.getWuerfel() == 1) {
                    image(wuerfel_1, 560, 150);
                    wuerfel_1.resize(100, 100);
                }
                if (controller.getWuerfel() == 2) {
                    image(wuerfel_2, 560, 150);
                    wuerfel_2.resize(100, 100);
                }
                if (controller.getWuerfel() == 3) {
                    image(wuerfel_3, 560, 150);
                    wuerfel_3.resize(100, 100);
                }
                if (controller.getWuerfel() == 4) {
                    image(wuerfel_4, 560, 150);
                    wuerfel_4.resize(100, 100);
                }
                if (controller.getWuerfel() == 5) {
                    image(wuerfel_5, 560, 150);
                    wuerfel_5.resize(100, 100);
                }
                if (controller.getWuerfel() == 6) {
                    image(wuerfel_6, 560, 150);
                    wuerfel_6.resize(100, 100);
                }
            }
        }
        if(controller.getDran()==3) {
            if (controller.getGruen().Ende_4_x != controller.getGruen().a.vier_x | controller.getGruen().Ende_4_y != controller.getGruen().a.vier_y) {
                if (controller.getWuerfel() == 1) {
                    image(wuerfel_1, 560, 550);
                    wuerfel_1.resize(100, 100);
                }
                if (controller.getWuerfel() == 2) {
                    image(wuerfel_2, 560, 550);
                    wuerfel_2.resize(100, 100);
                }
                if (controller.getWuerfel() == 3) {
                    image(wuerfel_3, 560, 550);
                    wuerfel_3.resize(100, 100);
                }
                if (controller.getWuerfel() == 4) {
                    image(wuerfel_4, 560, 550);
                    wuerfel_4.resize(100, 100);
                }
                if (controller.getWuerfel() == 5) {
                    image(wuerfel_5, 560, 550);
                    wuerfel_5.resize(100, 100);
                }
                if (controller.getWuerfel() == 6) {
                    image(wuerfel_6, 560, 550);
                    wuerfel_6.resize(100, 100);
                }
            }
        }
        if(controller.getDran()==4) {
            if (controller.getGelb().Ende_4_x != controller.getGelb().a.vier_x | controller.getGelb().Ende_4_y != controller.getGelb().a.vier_y) {
                if (controller.getWuerfel() == 1) {
                    image(wuerfel_1, 180, 550);
                    wuerfel_1.resize(100, 100);
                }
                if (controller.getWuerfel() == 2) {
                    image(wuerfel_2, 180, 550);
                    wuerfel_2.resize(100, 100);
                }
                if (controller.getWuerfel() == 3) {
                    image(wuerfel_3, 180, 550);
                    wuerfel_3.resize(100, 100);
                }
                if (controller.getWuerfel() == 4) {
                    image(wuerfel_4, 180, 550);
                    wuerfel_4.resize(100, 100);
                }
                if (controller.getWuerfel() == 5) {
                    image(wuerfel_5, 180, 550);
                    wuerfel_5.resize(100, 100);
                }
                if (controller.getWuerfel() == 6) {
                    image(wuerfel_6, 180, 550);
                    wuerfel_6.resize(100, 100);
                }
            }
        }
        if(controller.getDran()==1) {
            if (controller.getRot().Ende_4_x != controller.getRot().a.vier_x | controller.getRot().Ende_4_y != controller.getRot().a.vier_y) {
                if (controller.getWuerfel() == 1) {
                    image(wuerfel_1, 180, 150);
                    wuerfel_1.resize(100, 100);
                }
                if (controller.getWuerfel() == 2) {
                    image(wuerfel_2, 180, 150);
                    wuerfel_2.resize(100, 100);
                }
                if (controller.getWuerfel() == 3) {
                    image(wuerfel_3, 180, 150);
                    wuerfel_3.resize(100, 100);
                }
                if (controller.getWuerfel() == 4) {
                    image(wuerfel_4, 180, 150);
                    wuerfel_4.resize(100, 100);
                }
                if (controller.getWuerfel() == 5) {
                    image(wuerfel_5, 180, 150);
                    wuerfel_5.resize(100, 100);
                }
                if (controller.getWuerfel() == 6) {
                    image(wuerfel_6, 180, 150);
                    wuerfel_6.resize(100, 100);
                }

            }
        }
        fill(0,0,255);
        circle(410,125,50);
        circle(410,200,50);
        circle(410,275,50);
        circle(410,350,50);


        //rot
        fill(255,0,0);
        circle(125,410,50);
        circle(200,410,50);
        circle(275,410,50);
        circle(350,410,50);


        //gruen
        fill(0,255,0);
        circle(680,410,50);
        circle(610,410,50);
        circle(540,410,50);
        circle(470,410,50);

        //gelb
        fill(255,255,0);
        circle(410,680,50);
        circle(410,610,50);
        circle(410,540,50);
        circle(410,470,50);

        //rot
        if(controller.getRot().a.eins_x==controller.getRot().Haus_1_x&&controller.getRot().a.eins_y==controller.getRot().Haus_1_y) {
            fill(255,99,71);
            circle(50, 50, 50);
        }else{
            fill(255, 0, 0);
            circle(50, 50, 50);
        }
        if(controller.getRot().a.zwei_x==controller.getRot().Haus_2_x&&controller.getRot().a.zwei_y==controller.getRot().Haus_2_y) {
            fill(255,99,71);
            circle(105, 50, 50);
        }else{
            fill(255, 0, 0);
            circle(105, 50, 50);
        }
        if(controller.getRot().a.drei_x==controller.getRot().Haus_3_x&&controller.getRot().a.drei_y==controller.getRot().Haus_3_y) {
            fill(255,99,71);
            circle(50, 105, 50);
        }else{
            fill(255, 0, 0);
            circle(50, 105, 50);
        }
        if(controller.getRot().a.vier_x==controller.getRot().Haus_4_x&&controller.getRot().a.vier_y==controller.getRot().Haus_4_y) {
            fill(255,99,71);
            circle(105, 105, 50);
        }else{
            fill(255, 0, 0);
            circle(105, 105, 50);
        }







        //blau
        if(controller.getBlau().a.eins_x==controller.getBlau().Haus_1_x&&controller.getBlau().a.eins_y==controller.getBlau().Haus_1_y) {
            fill(64,224,208);
            circle(695, 50, 50);
        }else{
            fill(0, 0, 255);
            circle(695, 50, 50);
        }
        if(controller.getBlau().a.zwei_x==controller.getBlau().Haus_2_x&&controller.getBlau().a.zwei_y==controller.getBlau().Haus_2_y) {
            fill(64,224,208);
            circle(750, 50, 50);
        }else{
            fill(0, 0, 255);
            circle(750, 50, 50);
        }
        if(controller.getBlau().a.drei_x==controller.getBlau().Haus_3_x&&controller.getBlau().a.drei_y==controller.getBlau().Haus_3_y) {
            fill(64,224,208);
            circle(695, 105, 50);
        }else{
            fill(0, 0, 255);
            circle(695, 105, 50);
        }
        if(controller.getBlau().a.vier_x==controller.getBlau().Haus_4_x&&controller.getBlau().a.vier_y==controller.getBlau().Haus_4_y) {
            fill(64,224,208);
            circle(750, 105, 50);
        }else{
            fill(0, 0, 255);
            circle(750, 105, 50);
        }



        //gelb
        if(controller.getGelb().a.eins_x==controller.getGelb().Haus_1_x&&controller.getGelb().a.eins_y==controller.getGelb().Haus_1_y) {
            fill(255,215,0);
            circle(50, 695, 50);
        }else{
            fill(255, 255, 0);
            circle(50, 695, 50);
        }
        if(controller.getGelb().a.zwei_x==controller.getGelb().Haus_2_x&&controller.getGelb().a.zwei_y==controller.getGelb().Haus_2_y) {
            fill(255,215,0);
            circle(105, 695, 50);
        }else{
            fill(255, 255, 0);
            circle(105, 695, 50);
        }
        if(controller.getGelb().a.drei_x==controller.getGelb().Haus_3_x&&controller.getGelb().a.drei_y==controller.getGelb().Haus_3_y) {
            fill(255,215,0);
            circle(50, 750, 50);
        }else{
            fill(255, 255, 0);
            circle(50, 750, 50);
        }
        if(controller.getGelb().a.vier_x==controller.getGelb().Haus_4_x&&controller.getGelb().a.vier_y==controller.getGelb().Haus_4_y) {
            fill(255,215,0);
            circle(105, 750, 50);
        }else{
            fill(255, 255, 0);
            circle(105, 750, 50);
        }








        //gruen
        if(controller.getGruen().a.eins_x==controller.getGruen().Haus_1_x&&controller.getGruen().a.eins_y==controller.getGruen().Haus_1_y) {
            fill(0,250,154);
            circle(695, 695, 50);
        }else{
            fill(0, 255, 0);
            circle(695, 695, 50);
        }
        if(controller.getGruen().a.zwei_x==controller.getGruen().Haus_2_x&&controller.getGruen().a.zwei_y==controller.getGruen().Haus_2_y) {
            fill(0,250,154);
            circle(750, 695, 50);
        }else{
            fill(0, 255, 0);
            circle(750, 695, 50);
        }
        if(controller.getGruen().a.drei_x==controller.getGruen().Haus_3_x&&controller.getGruen().a.drei_y==controller.getGruen().Haus_3_y) {
            fill(0,250,154);
            circle(695, 750, 50);
        }else{
            fill(0, 255, 0);
            circle(695, 750, 50);
        }
        if(controller.getGruen().a.vier_x==controller.getGruen().Haus_4_x&&controller.getGruen().a.vier_y==controller.getGruen().Haus_4_y) {
            fill(0,250,154);
            circle(750, 750, 50);
        }else{
            fill(0, 255, 0);
            circle(750, 750, 50);
        }



        if (controller.getBlau().a.t == 1) {
            if(controller.getBlau().platz==1|controller.getBlau().platz==2|controller.getBlau().platz==3|controller.getBlau().platz==4){
                fill(0, 0, 255);
                circle(470, 50, 50);
            }else {
                fill(64, 224, 208);
                circle(470, 50, 50);
            }
        } else {
            fill(0, 0, 255);
            circle(470, 50, 50);
        }
        if (controller.getBlau().a.t == 2) {
            fill(64, 224, 208);
            circle(470, 125, 50);
        } else {
            fill(255);
            circle(470, 125, 50);
        }
        if (controller.getBlau().a.t == 3) {
            fill(64, 224, 208);
            circle(470, 200, 50);
        } else {
            fill(255);
            circle(470, 200, 50);
        }
        if (controller.getBlau().a.t == 4) {
            fill(64, 224, 208);
            circle(470, 275, 50);
        } else {
            fill(255);
            circle(470, 275, 50);
        }
        if (controller.getBlau().a.t == 5) {
            fill(64, 224, 208);
            circle(470, 350, 50);

        } else {
            fill(255);
            circle(470, 350, 50);
        }
        if (controller.getBlau().a.t == 6) {
            fill(64, 224, 208);
            circle(540, 350, 50);
        } else {
            fill(255);
            circle(540, 350, 50);
        }
        if (controller.getBlau().a.t == 7) {
            fill(64, 224, 208);
            circle(610, 350, 50);
        } else {
            fill(255);
            circle(610, 350, 50);
        }
        if (controller.getBlau().a.t == 8) {
            fill(64, 224, 208);
            circle(680, 350, 50);
        } else {
            fill(255);
            circle(680, 350, 50);
        }
        if (controller.getBlau().a.t == 9) {
            fill(64, 224, 208);
            circle(750, 350, 50);
        } else {
            fill(255);
            circle(750, 350, 50);
        }
        if (controller.getBlau().a.t == 10) {
            fill(64, 224, 208);
            circle(750, 410, 50);
        } else {
            fill(255);
            circle(750, 410, 50);
        }
        if (controller.getBlau().a.t == 11) {
            fill(64, 224, 208);
            circle(750, 470, 50);
        } else {
            fill(0, 255, 0);
            circle(750, 470, 50);
        }
        if (controller.getBlau().a.t == 12) {
            fill(64, 224, 208);
            circle(680, 470, 50);
        } else {
            fill(255);
            circle(680, 470, 50);
        }
        if (controller.getBlau().a.t == 13) {
            fill(64, 224, 208);
            circle(610, 470, 50);
        } else {
            fill(255);
            circle(610, 470, 50);
        }
        if (controller.getBlau().a.t == 14) {
            fill(64, 224, 208);
            circle(540, 470, 50);
        } else {
            fill(255);
            circle(540, 470, 50);
        }
        if (controller.getBlau().a.t == 15) {
            fill(64, 224, 208);
            circle(470, 470, 50);
        } else {
            fill(255);
            circle(470, 470, 50);
        }
        if (controller.getBlau().a.t == 16) {
            fill(64, 224, 208);
            circle(470, 540, 50);
        } else {
            fill(255);
            circle(470, 540, 50);
        }
        if (controller.getBlau().a.t == 17) {
            fill(64, 224, 208);
            circle(470, 610, 50);
        } else {
            fill(255);
            circle(470, 610, 50);
        }
        if (controller.getBlau().a.t == 18) {
            fill(64, 224, 208);
            circle(470, 680, 50);
        } else {
            fill(255);
            circle(470, 680, 50);
        }
        if (controller.getBlau().a.t == 19) {
            fill(64, 224, 208);
            circle(470, 750, 50);
        } else {
            fill(255);
            circle(470, 750, 50);
        }
        if (controller.getBlau().a.t == 20) {
            fill(64, 224, 208);
            circle(410, 750, 50);
        } else {
            fill(255);
            circle(410, 750, 50);
        }
        if (controller.getBlau().a.t == 21) {
            fill(64, 224, 208);
            circle(350, 750, 50);
        } else {
            fill(255, 255, 0);
            circle(350, 750, 50);
        }
        if (controller.getBlau().a.t == 22) {
            fill(64, 224, 208);
            circle(350, 680, 50);
        } else {
            fill(255);
            circle(350, 680, 50);
        }
        if (controller.getBlau().a.t == 23) {
            fill(64, 224, 208);
            circle(350, 610, 50);
        } else {
            fill(255);
            circle(350, 610, 50);
        }
        if (controller.getBlau().a.t == 24) {
            fill(64, 224, 208);
            circle(350, 540, 50);
        } else {
            fill(255);
            circle(350, 540, 50);
        }
        if (controller.getBlau().a.t == 25) {
            fill(64, 224, 208);
            circle(350, 470, 50);
        } else {
            fill(255);
            circle(350, 470, 50);
        }
        if (controller.getBlau().a.t == 26) {
            fill(64, 224, 208);
            circle(275, 470, 50);
        } else {
            fill(255);
            circle(275, 470, 50);
        }
        if (controller.getBlau().a.t == 27) {
            fill(64, 224, 208);
            circle(200, 470, 50);
        } else {
            fill(255);
            circle(200, 470, 50);
        }
        if (controller.getBlau().a.t == 28) {
            fill(64, 224, 208);
            circle(125, 470, 50);
        } else {
            fill(255);
            circle(125, 470, 50);
        }
        if (controller.getBlau().a.t == 29) {
            fill(64, 224, 208);
            circle(50, 470, 50);
        } else {
            fill(255);
            circle(50, 470, 50);
        }
        if (controller.getBlau().a.t == 30) {
            fill(64, 224, 208);
            circle(50, 410, 50);
        } else {
            fill(255);
            circle(50, 410, 50);
        }
        if (controller.getBlau().a.t == 31) {
            fill(64, 224, 208);
            circle(50, 350, 50);
        } else {
            fill(255, 0, 0);
            circle(50, 350, 50);
        }
        if (controller.getBlau().a.t == 32) {
            fill(64, 224, 208);
            circle(125, 350, 50);
        } else {
            fill(255);
            circle(125, 350, 50);
        }
        if (controller.getBlau().a.t == 33) {
            fill(64, 224, 208);
            circle(200, 350, 50);
        } else {
            fill(255);
            circle(200, 350, 50);
        }
        if (controller.getBlau().a.t == 34) {
            fill(64, 224, 208);
            circle(275, 350, 50);
        } else {
            fill(255);
            circle(275, 350, 50);
        }
        if (controller.getBlau().a.t == 35) {
            fill(64, 224, 208);
            circle(350, 350, 50);
        } else {
            fill(255);
            circle(350, 350, 50);
        }
        if (controller.getBlau().a.t == 36) {
            fill(64, 224, 208);
            circle(350, 275, 50);
        } else {
            fill(255);
            circle(350, 275, 50);
        }
        if (controller.getBlau().a.t == 37) {
            fill(64, 224, 208);
            circle(350, 200, 50);
        } else {
            fill(255);
            circle(350, 200, 50);
        }
        if (controller.getBlau().a.t == 38) {
            fill(64, 224, 208);
            circle(350, 125, 50);
        } else {
            fill(255);
            circle(350, 125, 50);
        }
        if (controller.getBlau().a.t == 39) {
            fill(64, 224, 208);
            circle(350, 50, 50);
        } else {
            fill(255);
            circle(350, 50, 50);
        }
        if (controller.getBlau().a.t == 40) {
            fill(64, 224, 208);
            circle(410, 50, 50);
        } else {
            fill(255);
            circle(410, 50, 50);
        }
        if (controller.getBlau().a.t == 41|(controller.getBlau().a.vier_x==controller.getBlau().Ende_4_x&&controller.getBlau().a.vier_y==controller.getBlau().Ende_4_y)) {
            fill(64, 224, 208);
            circle(410, 125, 50);
        } else {
            fill(0,0,255);
            circle(410, 125, 50);
        }
        if (controller.getBlau().a.t == 42|(controller.getBlau().a.drei_x==controller.getBlau().Ende_3_x&&controller.getBlau().a.drei_y==controller.getBlau().Ende_3_y)) {
            fill(64, 224, 208);
            circle(410, 200, 50);
        } else {
            fill(0,0,255);
            circle(410, 200, 50);
        }
        if (controller.getBlau().a.t == 43|(controller.getBlau().a.zwei_x==controller.getBlau().Ende_2_x&&controller.getBlau().a.zwei_y==controller.getBlau().Ende_2_y)) {
            fill(64, 224, 208);
            circle(410, 275, 50);
        } else {
            fill(0,0,255);
            circle(410, 275, 50);
        }
        if (controller.getBlau().a.t == 44|(controller.getBlau().a.eins_x==controller.getBlau().Ende_1_x&&controller.getBlau().a.eins_y==controller.getBlau().Ende_1_y)) {
            fill(64, 224, 208);
            circle(410, 350, 50);
        } else {
            fill(0,0,255);
            circle(410, 350, 50);
        }
        if(controller.getGruen().a.t==1){
            fill(0,250,154);
            circle(470,50,50);
        }
        if(controller.getGruen().a.t==2){
            fill(0,250,154);
            circle(470,125,50);
        }
        if(controller.getGruen().a.t==3){
            fill(0,250,154);
            circle(470,200,50);
        }
        if(controller.getGruen().a.t==4){
            fill(0,250,154);
            circle(470,275,50);
        }
        if(controller.getGruen().a.t==5){
            fill(0,250,154);
            circle(470,350,50);
        }
        if(controller.getGruen().a.t==6){
            fill(0,250,154);
            circle(540,350,50);
        }
        if(controller.getGruen().a.t==7){
            fill(0,250,154);
            circle(610,350,50);
        }
        if(controller.getGruen().a.t==8){
            fill(0,250,154);
            circle(680,350,50);
        }
        if(controller.getGruen().a.t==9){
            fill(0,250,154);
            circle(750,350,50);
        }
        if(controller.getGruen().a.t==10){
            fill(0,250,154);
            circle(750,410,50);
        }
        if(controller.getGruen().a.t==11){
            if(controller.getGruen().platz==1|controller.getGruen().platz==2|controller.getGruen().platz==3|controller.getGruen().platz==4){
                fill(0,255,0);
                circle(750,470,50);
            }else {
                fill(0,250,154);
                circle(750,470,50);
            }
        }
        if(controller.getGruen().a.t==12){
            fill(0,250,154);
            circle(680,470,50);
        }
        if(controller.getGruen().a.t==13){
            fill(0,250,154);
            circle(610,470,50);
        }
        if(controller.getGruen().a.t==14){
            fill(0,250,154);
            circle(540,470,50);
        }
        if(controller.getGruen().a.t==15){
            fill(0,250,154);
            circle(470,470,50);
        }
        if(controller.getGruen().a.t==16){
            fill(0,250,154);
            circle(470,540,50);
        } if(controller.getGruen().a.t==17){
            fill(0,250,154);
            circle(470,610,50);
        } if(controller.getGruen().a.t==18){
            fill(0,250,154);
            circle(470,680,50);
        }if(controller.getGruen().a.t==19){
            fill(0,250,154);
            circle(470,750,50);
        } if(controller.getGruen().a.t==20){
            fill(0,250,154);
            circle(410,750,50);
        }
        if(controller.getGruen().a.t==21){
            fill(0,250,154);
            circle(350,750,50);
        }
        if(controller.getGruen().a.t==22){
            fill(0,250,154);
            circle(350,680,50);
        }
        if(controller.getGruen().a.t==23){
            fill(0,250,154);
            circle(350,610,50);
        }
        if(controller.getGruen().a.t==24){
            fill(0,250,154);
            circle(350,540,50);
        }
        if(controller.getGruen().a.t==25){
            fill(0,250,154);
            circle(350,470,50);
        }
        if(controller.getGruen().a.t==26){
            fill(0,250,154);
            circle(275,470,50);
        }
        if(controller.getGruen().a.t==27){
            fill(0,250,154);
            circle(200,470,50);
        }
        if(controller.getGruen().a.t==28){
            fill(0,250,154);
            circle(125,470,50);
        }
        if(controller.getGruen().a.t==29){
            fill(0,250,154);
            circle(50,470,50);
        }
        if(controller.getGruen().a.t==30){
            fill(0,250,154);
            circle(50,410,50);
        }
        if(controller.getGruen().a.t==31){
            fill(0,250,154);
            circle(50,350,50);
        }
        if(controller.getGruen().a.t==32){
            fill(0,250,154);
            circle(125,350,50);
        }
        if(controller.getGruen().a.t==33){
            fill(0,250,154);
            circle(200,350,50);
        }
        if(controller.getGruen().a.t==34){
            fill(0,250,154);
            circle(275,350,50);
        }
        if(controller.getGruen().a.t==35){
            fill(0,250,154);
            circle(350,350,50);
        }
        if(controller.getGruen().a.t==36){
            fill(0,250,154);
            circle(350,275,50);
        }
        if(controller.getGruen().a.t==37){
            fill(0,250,154);
            circle(350,200,50);
        }
        if(controller.getGruen().a.t==38){
            fill(0,250,154);
            circle(350,125,50);
        } if(controller.getGruen().a.t==39){
            fill(0,250,154);
            circle(350,50,50);
        }
        if(controller.getGruen().a.t==40){
            fill(0,250,154);
            circle(410,50,50);
        }
        if(controller.getGruen().a.t==-1|(controller.getGruen().a.vier_x==controller.getGruen().Ende_4_x&&controller.getGruen().a.vier_y==controller.getGruen().Ende_4_y)) {
            fill(0, 250, 154);
            circle(680, 410, 50);
        }
        if(controller.getGruen().a.t==-2|(controller.getGruen().a.drei_x==controller.getGruen().Ende_3_x&&controller.getGruen().a.drei_y==controller.getGruen().Ende_3_y)){
            fill(0,250,154);
            circle(610, 410, 50);
        }
        if(controller.getGruen().a.t==-3|(controller.getGruen().a.zwei_x==controller.getGruen().Ende_2_x&&controller.getGruen().a.zwei_y==controller.getGruen().Ende_2_y)){
            fill(0,250,154);
            circle(540, 410, 50);
        }
        if(controller.getGruen().a.t<-3|(controller.getGruen().a.eins_x==controller.getGruen().Ende_1_x&&controller.getGruen().a.eins_y==controller.getGruen().Ende_1_y)){
            fill(0,250,154);
            circle(470, 410, 50);
        }

        if(controller.getGelb().a.t==1){
            fill(255,215,0);
            circle(470,50,50);
        }
        if(controller.getGelb().a.t==2){
            fill(255,215,0);
            circle(470,125,50);
        }
        if(controller.getGelb().a.t==3){
            fill(255,215,0);
            circle(470,200,50);
        }
        if(controller.getGelb().a.t==4){
            fill(255,215,0);
            circle(470,275,50);
        }
        if(controller.getGelb().a.t==5){
            fill(255,215,0);
            circle(470,350,50);

        }
        if(controller.getGelb().a.t==6){
            fill(255,215,0);
            circle(540,350,50);
        }
        if(controller.getGelb().a.t==7){
            fill(255,215,0);
            circle(610,350,50);
        }
        if(controller.getGelb().a.t==8){
            fill(255,215,0);
            circle(680,350,50);
        }
        if(controller.getGelb().a.t==9){
            fill(255,215,0);
            circle(750,350,50);
        }
        if(controller.getGelb().a.t==10){
            fill(255,215,0);
            circle(750,410,50);
        }
        if(controller.getGelb().a.t==11){
            fill(255,215,0);
            circle(750,470,50);
        }
        if(controller.getGelb().a.t==12){
            fill(255,215,0);
            circle(680,470,50);
        }
        if(controller.getGelb().a.t==13){
            fill(255,215,0);
            circle(610,470,50);
        }
        if(controller.getGelb().a.t==14){
            fill(255,215,0);
            circle(540,470,50);
        }
        if(controller.getGelb().a.t==15){
            fill(255,215,0);
            circle(470,470,50);
        }
        if(controller.getGelb().a.t==16){
            fill(255,215,0);
            circle(470,540,50);
        } if(controller.getGelb().a.t==17){
            fill(255,215,0);
            circle(470,610,50);
        } if(controller.getGelb().a.t==18){
            fill(255,215,0);
            circle(470,680,50);
        }if(controller.getGelb().a.t==19){
            fill(255,215,0);
            circle(470,750,50);
        } if(controller.getGelb().a.t==20){
            fill(255,215,0);
            circle(410,750,50);
        }
        if(controller.getGelb().a.t==21){
            if(controller.getGelb().platz==1|controller.getGelb().platz==2|controller.getGelb().platz==3|controller.getGelb().platz==4){
                fill(255,255,0);
                circle(350,750,50);
            }else {
                fill(255,215,0);
                circle(350,750,50);
            }
        }
        if(controller.getGelb().a.t==22){
            fill(255,215,0);
            circle(350,680,50);
        }
        if(controller.getGelb().a.t==23){
            fill(255,215,0);
            circle(350,610,50);
        }
        if(controller.getGelb().a.t==24){
            fill(255,215,0);
            circle(350,540,50);
        }
        if(controller.getGelb().a.t==25){
            fill(255,215,0);
            circle(350,470,50);
        }
        if(controller.getGelb().a.t==26){
            fill(255,215,0);
            circle(275,470,50);
        }
        if(controller.getGelb().a.t==27){
            fill(255,215,0);
            circle(200,470,50);
        }
        if(controller.getGelb().a.t==28){
            fill(255,215,0);
            circle(125,470,50);
        }
        if(controller.getGelb().a.t==29){
            fill(255,215,0);
            circle(50,470,50);
        }
        if(controller.getGelb().a.t==30){
            fill(255,215,0);
            circle(50,410,50);
        }
        if(controller.getGelb().a.t==31){
            fill(255,215,0);
            circle(50,350,50);
        }
        if(controller.getGelb().a.t==32){
            fill(255,215,0);
            circle(125,350,50);
        }
        if(controller.getGelb().a.t==33){
            fill(255,215,0);
            circle(200,350,50);
        }
        if(controller.getGelb().a.t==34){
            fill(255,215,0);
            circle(275,350,50);
        }
        if(controller.getGelb().a.t==35){
            fill(255,215,0);
            circle(350,350,50);
        }
        if(controller.getGelb().a.t==36){
            fill(255,215,0);
            circle(350,275,50);
        }
        if(controller.getGelb().a.t==37){
            fill(255,215,0);
            circle(350,200,50);
        }
        if(controller.getGelb().a.t==38){
            fill(255,215,0);
            circle(350,125,50);
        } if(controller.getGelb().a.t==39){
            fill(255,215,0);
            circle(350,50,50);
        }
        if(controller.getGelb().a.t==40){
            fill(255,215,0);
            circle(410,50,50);
        }
        if(controller.getGelb().a.t==-1|(controller.getGelb().a.vier_x==controller.getGelb().Ende_4_x&&controller.getGelb().a.vier_y==controller.getGelb().Ende_4_y)) {
            fill(255,215,0);
            circle(410, 680, 50);
        }
        if(controller.getGelb().a.t==-2|(controller.getGelb().a.drei_x==controller.getGelb().Ende_3_x&&controller.getGelb().a.drei_y==controller.getGelb().Ende_3_y)){
            fill(255,215,0);
            circle(410, 610, 50);
        }
        if(controller.getGelb().a.t==-3|(controller.getGelb().a.zwei_x==controller.getGelb().Ende_2_x&&controller.getGelb().a.zwei_y==controller.getGelb().Ende_2_y)){
            fill(255,215,0);
            circle(410, 540, 50);
        }
        if(controller.getGelb().a.t<-3|(controller.getGelb().a.eins_x==controller.getGelb().Ende_1_x&&controller.getGelb().a.eins_y==controller.getGelb().Ende_1_y)){
            fill(255,215,0);
            circle(410, 470, 50);
        }

        if(controller.getRot().a.t==1){
            fill(255,99,71);
            circle(470,50,50);
        }
        if(controller.getRot().a.t==2){
            fill(255,99,71);
            circle(470,125,50);
        }
        if(controller.getRot().a.t==3){
            fill(255,99,71);
            circle(470,200,50);
        }
        if(controller.getRot().a.t==4){
            fill(255,99,71);
            circle(470,275,50);
        }
        if(controller.getRot().a.t==5){
            fill(255,99,71);
            circle(470,350,50);

        }
        if(controller.getRot().a.t==6){
            fill(255,99,71);
            circle(540,350,50);
        }
        if(controller.getRot().a.t==7){
            fill(255,99,71);
            circle(610,350,50);
        }
        if(controller.getRot().a.t==8){
            fill(255,99,71);
            circle(680,350,50);
        }
        if(controller.getRot().a.t==9){
            fill(255,99,71);
            circle(750,350,50);
        }
        if(controller.getRot().a.t==10){
            fill(255,99,71);
            circle(750,410,50);
        }
        if(controller.getRot().a.t==11){
            fill(255,99,71);
            circle(750,470,50);
        }
        if(controller.getRot().a.t==12){
            fill(255,99,71);
            circle(680,470,50);
        }
        if(controller.getRot().a.t==13){
            fill(255,99,71);
            circle(610,470,50);
        }
        if(controller.getRot().a.t==14){
            fill(255,99,71);
            circle(540,470,50);
        }
        if(controller.getRot().a.t==15){
            fill(255,99,71);
            circle(470,470,50);
        }
        if(controller.getRot().a.t==16){
            fill(255,99,71);
            circle(470,540,50);
        } if(controller.getRot().a.t==17){
            fill(255,99,71);
            circle(470,610,50);
        } if(controller.getRot().a.t==18){
            fill(255,99,71);
            circle(470,680,50);
        }if(controller.getRot().a.t==19){
            fill(255,99,71);
            circle(470,750,50);
        } if(controller.getRot().a.t==20){
            fill(255,99,71);
            circle(410,750,50);
        }
        if(controller.getRot().a.t==21){
            fill(255,99,71);
            circle(350,750,50);
        }
        if(controller.getRot().a.t==22){
            fill(255,99,71);
            circle(350,680,50);
        }
        if(controller.getRot().a.t==23){
            fill(255,99,71);
            circle(350,610,50);
        }
        if(controller.getRot().a.t==24){
            fill(255,99,71);
            circle(350,540,50);
        }
        if(controller.getRot().a.t==25){
            fill(255,99,71);
            circle(350,470,50);
        }
        if(controller.getRot().a.t==26){
            fill(255,99,71);
            circle(275,470,50);
        }
        if(controller.getRot().a.t==27){
            fill(255,99,71);
            circle(200,470,50);
        }
        if(controller.getRot().a.t==28){
            fill(255,99,71);
            circle(125,470,50);
        }
        if(controller.getRot().a.t==29){
            fill(255,99,71);
            circle(50,470,50);
        }
        if(controller.getRot().a.t==30){
            fill(255,99,71);
            circle(50,410,50);
        }
        if(controller.getRot().a.t==31){
            if(controller.getRot().platz==1|controller.getRot().platz==2|controller.getRot().platz==3|controller.getRot().platz==4){
                fill(255, 0, 0);
                circle(50,350,50);
            }else {
                fill(255,99,71);
                circle(50,350,50);
            }
        }
        if(controller.getRot().a.t==32){
            fill(255,99,71);
            circle(125,350,50);
        }
        if(controller.getRot().a.t==33){
            fill(255,99,71);
            circle(200,350,50);
        }
        if(controller.getRot().a.t==34){
            fill(255,99,71);
            circle(275,350,50);
        }
        if(controller.getRot().a.t==35){
            fill(255,99,71);
            circle(350,350,50);
        }
        if(controller.getRot().a.t==36){
            fill(255,99,71);
            circle(350,275,50);
        }
        if(controller.getRot().a.t==37){
            fill(255,99,71);
            circle(350,200,50);
        }
        if(controller.getRot().a.t==38){
            fill(255,99,71);
            circle(350,125,50);
        } if(controller.getRot().a.t==39){
            fill(255,99,71);
            circle(350,50,50);
        }
        if(controller.getRot().a.t==40){
            fill(255,99,71);
            circle(410,50,50);
        }
        if(controller.getRot().a.t==-1|(controller.getRot().a.vier_x==controller.getRot().Ende_4_x&&controller.getRot().a.vier_y==controller.getRot().Ende_4_y)) {
            fill(255,99,71);
            circle(125, 410, 50);
        }
        else{
            fill(255, 0, 0);
            circle(125, 410, 50);
        }
        if(controller.getRot().a.t==-2|(controller.getRot().a.drei_x==controller.getRot().Ende_3_x&&controller.getRot().a.drei_y==controller.getRot().Ende_3_y)){
            fill(255,99,71);
            circle(200, 410, 50);
        }
        else{
            fill(255, 0, 0);
            circle(200, 410, 50);
        }
        if(controller.getRot().a.t==-3|(controller.getRot().a.zwei_x==controller.getRot().Ende_2_x&&controller.getRot().a.zwei_y==controller.getRot().Ende_2_y)){
            fill(255,99,71);
            circle(275, 410, 50);
        }
        else{
            fill(255, 0, 0);
            circle(275, 410, 50);
        }
        if(controller.getRot().a.t<-3|(controller.getRot().a.eins_x==controller.getRot().Ende_1_x&&controller.getRot().a.eins_y==controller.getRot().Ende_1_y)){
            fill(255,99,71);
            circle(350, 410, 50);
        } else{
            fill(255, 0, 0);
            circle(350, 410, 50);
        }
    }
}
