
/**
 * In diesem package befinden sich alle Klassen, die zum Modell dazugehören.
 * Dies sind Figuren, Spieler, FreieFelder und die Modell-Klasse.
 * In diesen Klassen befinden sich alle Methoden und Variablen, welche man für das Spiel braucht.
 */

package model;




/**
 * Mit dieser Klasse kann man einen Spieler erstellen mit seinen Start-, Haus- und Ende- Koordinaten.
 * Der Spieler besteht aus vier Figuren.
 * Die Figuren müssen vorher erstellt werden, um sie dem Spieler zu übergeben.
 *
 * Bsp:
 *
 * Spieler a= new Spieler(1,2,3,4,5,6,7,8,9,Figuren-name,0)
 *
 * platz muss am Anfang 0 sein, weil am Anfang noch kein Spieler alle seine Figuren in ihre Endposition gebracht haben.
 *
 * @author Emre Özkoc
 */
public class Spieler {
    /**
     * x-Koordinate von Start-Position
     */
   public  int Start_x;
    /**
     * y-Koordinate von Start-Position
     */
    public int Start_y;
    /**
     * x-Koordinate von Haus_1-Position
     */
    public int Haus_1_x;
    /**
     * y-Koordinate von Haus_1-Position
     */
  public  int Haus_1_y;
    /**
     * x-Koordinate von Haus_2-Position
     */
  public   int Haus_2_x;
    /**
     * y-Koordinate von Haus_2-Position
     */
  public  int Haus_2_y;
    /**
     * x-Koordinate von Haus_3-Position
     */
  public   int Haus_3_x;
    /**
     * y-Koordinate von Haus_3-Position
     */
  public  int Haus_3_y;
    /**
     * x-Koordinate von Haus_4-Position
     */
 public    int Haus_4_x;
    /**
     * y-Koordinate von Haus_4-Position
     */
  public  int Haus_4_y;
    /**
     * x-Koordinate von Ende_1-Position
     */
  public   int Ende_1_x;
    /**
     * y-Koordinate von Ende_1-Position
     */
  public  int Ende_1_y;
    /**
     * x-Koordinate von Ende_2-Position
     */
  public   int Ende_2_x;
    /**
     * y-Koordinate von Ende_2-Position
     */
   public int Ende_2_y;
    /**
     * x-Koordinat von Ende_3-Position
     */
   public  int Ende_3_x;
   /**
     * y-Koordinat von Ende_3-Position
     */
  public  int Ende_3_y;
    /**
     * x-Koordinat von Ende_4-Position
     */
   public  int Ende_4_x;
    /**
     * y-Koordinat von Ende_4-Position
     */
   public int Ende_4_y;
    /**
     * Die Figuren, welche zu dem Spieler gehören
     */
     public Figuren a;
    /**
     * Auf welchem Platz der Spieler zurzeit steht
     */
     public int platz;

    /**
     * Zum Erstellen von Figuren
     * @param Start_x x-Koordinate von Start
     * @param Start_y y-Koordinate von Start
     * @param Haus_1_x x-Koordinate von Haus_1
     * @param Haus_1_y y-Koordinate von Haus_1
     * @param Haus_2_x x-Koordinate von Haus_2
     * @param Haus_2_y y-Koordinate von Haus_2
     * @param Haus_3_x x-Koordinate von Haus_3
     * @param Haus_3_y y-Koordinate von Haus_3
     * @param Haus_4_x x-Koordinate von Haus_4
     * @param Haus_4_y y-Koordinate von Haus_4
     * @param Ende_1_x x-Koordinate von Ende_1
     * @param Ende_1_y y-Koordinate von Ende_1
     * @param Ende_2_x x-Koordinate von Ende_2
     * @param Ende_2_y y-Koordinate von Ende_2
     * @param Ende_3_x x-Koordinate von Ende_3
     * @param Ende_3_y y-Koordinate von Ende_3
     * @param Ende_4_x x-Koordinate von Ende_4
     * @param Ende_4_y y-Koordinate von Ende_4
     * @param a sind die Figuren
     * @param platz auf welchem Platz der Spieler sich befindet
     */
    public Spieler(int Start_x, int Start_y,int Haus_1_x,int Haus_1_y, int Haus_2_x,int Haus_2_y, int Haus_3_x,int Haus_3_y, int Haus_4_x,int Haus_4_y, int Ende_1_x, int Ende_1_y,int Ende_2_x,int Ende_2_y, int Ende_3_x, int Ende_3_y,int Ende_4_x,int Ende_4_y, Figuren a,int platz){
      this.Start_x=Start_x;
      this.Start_y=Start_y;
      this.Haus_1_x=Haus_1_x;
        this.Haus_1_y=Haus_1_y;
        this.Haus_2_x=Haus_2_x;
        this.Haus_2_y=Haus_2_y;
        this.Haus_3_x=Haus_3_x;
        this.Haus_3_y=Haus_3_y;
        this.Haus_4_x=Haus_4_x;
        this.Haus_4_y=Haus_4_y;
        this.Ende_1_x=Ende_1_x;
        this.Ende_1_y=Ende_1_y;
        this.Ende_2_x=Ende_2_x;
        this.Ende_2_y=Ende_2_y;
        this.Ende_3_x=Ende_3_x;
        this.Ende_3_y=Ende_3_y;
        this.Ende_4_x=Ende_4_x;
        this.Ende_4_y=Ende_4_y;
        this.a=a;
        this.platz=platz;


    }



    }


