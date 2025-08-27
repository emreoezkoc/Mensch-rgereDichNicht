
import model.MenschAergereDichNichtModel;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
public class Testen {

    private  MenschAergereDichNichtModel model=new MenschAergereDichNichtModel();
    char[][] gamestate;


    @Test
    public void Feld(){
        model.newGame();
        gamestate=model.gameState;
        for(int i=0;i<gamestate.length;i++){
            for(int j=0;j<gamestate.length;j++){
                if(i==model.blau.Haus_1_x&&j==model.blau.Haus_1_y){
                    assertEquals('F',gamestate[model.blau.Haus_1_x][model.blau.Haus_1_y]);
                }else if(i==model.blau.Haus_2_x&&j==model.blau.Haus_2_y){
                    assertEquals('F',gamestate[model.blau.Haus_2_x][model.blau.Haus_2_y]);
                }else if(i==model.blau.Haus_3_x&&j==model.blau.Haus_3_y){
                    assertEquals('F',gamestate[model.blau.Haus_3_x][model.blau.Haus_3_y]);
                }else if(i==model.blau.Haus_4_x&&j==model.blau.Haus_4_y){
                    assertEquals('F',gamestate[model.blau.Haus_4_x][model.blau.Haus_4_y]);
                }

                else if(i==model.gruen.Haus_1_x&&j==model.gruen.Haus_1_y) {
                    assertEquals('F',gamestate[model.gruen.Haus_1_x][model.gruen.Haus_1_y]);
                }else if(i==model.gruen.Haus_2_x&&j==model.gruen.Haus_2_y) {
                    assertEquals('F',gamestate[model.gruen.Haus_2_x][model.gruen.Haus_2_y]);
                }else if(i==model.gruen.Haus_3_x&&j==model.gruen.Haus_3_y) {
                    assertEquals('F',gamestate[model.gruen.Haus_3_x][model.gruen.Haus_3_y]);
                }else if(i==model.gruen.Haus_4_x&&j==model.gruen.Haus_4_y) {
                    assertEquals('F',gamestate[model.gruen.Haus_4_x][model.gruen.Haus_4_y]);
                }

                else if(i==model.gelb.Haus_1_x&&j==model.gelb.Haus_1_y) {
                    assertEquals('F',gamestate[model.gelb.Haus_1_x][model.gelb.Haus_1_y]);
                }else if(i==model.gelb.Haus_2_x&&j==model.gelb.Haus_2_y) {
                    assertEquals('F',gamestate[model.gelb.Haus_2_x][model.gelb.Haus_2_y]);
                }else if(i==model.gelb.Haus_3_x&&j==model.gelb.Haus_3_y) {
                    assertEquals('F',gamestate[model.gelb.Haus_3_x][model.gelb.Haus_3_y]);
                }else if(i==model.gelb.Haus_4_x&&j==model.gelb.Haus_4_y) {
                    assertEquals('F',gamestate[model.gelb.Haus_4_x][model.gelb.Haus_4_y]);
                }

                else if(i==model.rot.Haus_1_x&&j==model.rot.Haus_1_y) {
                    assertEquals('F',gamestate[model.rot.Haus_1_x][model.rot.Haus_1_y]);
                }else if(i==model.rot.Haus_2_x&&j==model.rot.Haus_2_y) {
                    assertEquals('F',gamestate[model.rot.Haus_2_x][model.rot.Haus_2_y]);
                }else if(i==model.rot.Haus_3_x&&j==model.rot.Haus_3_y) {
                    assertEquals('F',gamestate[model.rot.Haus_3_x][model.rot.Haus_3_y]);
                }else if(i==model.rot.Haus_4_x&&j==model.rot.Haus_4_y) {
                    assertEquals('F',gamestate[model.rot.Haus_4_x][model.rot.Haus_4_y]);
                }else{
                    assertEquals('0', gamestate[i][j]);
                }





                assertEquals('F',gamestate[model.gruen.Haus_2_x][model.gruen.Haus_2_y]);
                assertEquals('F',gamestate[model.gruen.Haus_3_x][model.gruen.Haus_3_y]);
                assertEquals('F',gamestate[model.gruen.Haus_4_x][model.gruen.Haus_4_y]);

                assertEquals('F',gamestate[model.gelb.Haus_1_x][model.gelb.Haus_1_y]);
                assertEquals('F',gamestate[model.gelb.Haus_2_x][model.gelb.Haus_2_y]);
                assertEquals('F',gamestate[model.gelb.Haus_3_x][model.gelb.Haus_3_y]);
                assertEquals('F',gamestate[model.gelb.Haus_4_x][model.gelb.Haus_4_y]);

                assertEquals('F',gamestate[model.rot.Haus_1_x][model.rot.Haus_1_y]);
                assertEquals('F',gamestate[model.rot.Haus_2_x][model.rot.Haus_2_y]);
                assertEquals('F',gamestate[model.rot.Haus_3_x][model.rot.Haus_3_y]);
                assertEquals('F',gamestate[model.rot.Haus_4_x][model.rot.Haus_4_y]);

            }
        }
    }

    @Test
    public void Würfel(){
        model.wuerfeln();

        assertTrue(model.a==1|model.a==2|model.a==3|model.a==4|model.a==5|model.a==6);
    }

    @Test
    public void Raus(){
        model.newGame();
        model.a=6;
        model.raus(model.blau);

        assertEquals(1, model.blau.a.t);
        model.raus(model.gruen);
        assertEquals(11, model.gruen.a.t);
        model.raus(model.gelb);
        assertEquals(21, model.gelb.a.t);
        model.raus(model.rot);
        assertEquals(31, model.rot.a.t);

    }
    @Test
    public void Raus_2(){
        model.newGame();
        model.a=6;
        model.blau.a.eins_x=model. blau.Ende_1_x;
        model. blau.a.eins_y=model. blau.Ende_1_y;
        model.gruen.a.eins_x=model.gruen.Ende_1_x;
        model.gruen.a.eins_y=model.gruen.Ende_1_y;
        model.gelb.a.eins_x=model.gelb.Ende_1_x;
        model.gelb.a.eins_y=model.gelb.Ende_1_y;
        model.rot.a.eins_x=model.rot.Ende_1_x;
        model.rot.a.eins_y=model.rot.Ende_1_y;

        model.raus(model. blau);
        assertEquals(1, model. blau.a.t);
        model.raus(model.gruen);
        assertEquals(11, model.gruen.a.t);
        model.raus(model.gelb);
        assertEquals(21, model.gelb.a.t);
        model.raus(model.rot);
        assertEquals(31, model.rot.a.t);
    }
    @Test
    public void Raus_3(){
        model.newGame();
        model.a=6;
        model.blau.a.eins_x=model.blau.Ende_1_x;
        model.blau.a.eins_y=model.blau.Ende_1_y;
        model.gruen.a.eins_x=model.gruen.Ende_1_x;
        model.gruen.a.eins_y=model.gruen.Ende_1_y;
        model.gelb.a.eins_x=model.gelb.Ende_1_x;
        model.gelb.a.eins_y=model.gelb.Ende_1_y;
        model.rot.a.eins_x=model.rot.Ende_1_x;
        model.rot.a.eins_y=model.rot.Ende_1_y;
        model.blau.a.zwei_x=model.blau.Ende_2_x;
        model.blau.a.zwei_y=model.blau.Ende_2_y;
        model.gruen.a.zwei_x=model.gruen.Ende_2_x;
        model.gruen.a.zwei_y=model.gruen.Ende_2_y;
        model.gelb.a.zwei_x=model.gelb.Ende_2_x;
        model.gelb.a.zwei_y=model.gelb.Ende_2_y;
        model.rot.a.zwei_x=model.rot.Ende_2_x;
        model.rot.a.zwei_y=model.rot.Ende_2_y;

        model.raus(model.blau);
        assertEquals(1, model.blau.a.t);
        model.raus(model.gruen);
        assertEquals(11, model.gruen.a.t);
        model.raus(model.gelb);
        assertEquals(21, model.gelb.a.t);
        model.raus(model.rot);
        assertEquals(31, model.rot.a.t);
    }

    @Test
    public void Raus_4(){
        model.newGame();
        model.a=6;
        model.blau.a.eins_x=model.blau.Ende_1_x;
        model.blau.a.eins_y=model.blau.Ende_1_y;
        model.gruen.a.eins_x=model.gruen.Ende_1_x;
        model.gruen.a.eins_y=model.gruen.Ende_1_y;
        model.gelb.a.eins_x=model.gelb.Ende_1_x;
        model.gelb.a.eins_y=model.gelb.Ende_1_y;
        model.rot.a.eins_x=model.rot.Ende_1_x;
        model.rot.a.eins_y=model.rot.Ende_1_y;
        model.blau.a.zwei_x=model.blau.Ende_2_x;
        model.blau.a.zwei_y=model.blau.Ende_2_y;
        model.gruen.a.zwei_x=model.gruen.Ende_2_x;
        model.gruen.a.zwei_y=model.gruen.Ende_2_y;
        model.gelb.a.zwei_x=model.gelb.Ende_2_x;
        model.gelb.a.zwei_y=model.gelb.Ende_2_y;
        model.rot.a.zwei_x=model.rot.Ende_2_x;
        model.rot.a.zwei_y=model.rot.Ende_2_y;
        model.blau.a.drei_x=model.blau.Ende_3_x;
        model.blau.a.drei_y=model.blau.Ende_3_y;
        model.gruen.a.drei_x=model.gruen.Ende_3_x;
        model.gruen.a.drei_y=model.gruen.Ende_3_y;
        model.gelb.a.drei_x=model.gelb.Ende_3_x;
        model.gelb.a.drei_y=model.gelb.Ende_3_y;
        model.rot.a.drei_x=model.rot.Ende_3_x;
        model.rot.a.drei_y=model.rot.Ende_3_y;

        model.raus(model.blau);
        assertEquals(1, model.blau.a.t);
        model.raus(model.gruen);
        assertEquals(11, model.gruen.a.t);
        model.raus(model.gelb);
        assertEquals(21, model.gelb.a.t);
        model.raus(model.rot);
        assertEquals(31, model.rot.a.t);
    }

    @Test
    public void FeldÄndern(){
        model.newGame();
        model.a=6;
        assertEquals('F', model.gameState[model.blau.a.eins_x][model.blau.a.eins_y]);
        model.raus(model.blau);
        assertEquals('F', model.gameState[model.blau.a.eins_x][model.blau.a.eins_y]);

        assertEquals('F', model.gameState[model.gruen.a.eins_x][model.gruen.a.eins_y]);
        model.raus(model.gruen);
        assertEquals('F', model.gameState[model.gruen.a.eins_x][model.gruen.a.eins_y]);

        assertEquals('F', model.gameState[model.gelb.a.eins_x][model.gelb.a.eins_y]);
        model.raus(model.gelb);
        assertEquals('F', model.gameState[model.gelb.a.eins_x][model.gelb.a.eins_y]);

        assertEquals('F', model.gameState[model.rot.a.eins_x][model.rot.a.eins_y]);
        model.raus(model.rot);
        assertEquals('F', model.gameState[model.rot.a.eins_x][model.rot.a.eins_y]);
    }

    @Test
    public void FeldÄndern_2(){
        model.newGame();
        model.a=6;
        model.blau.a.eins_x=model.blau.Ende_1_x;
        model.blau.a.eins_y=model.blau.Ende_1_y;
        model.gruen.a.eins_x=model.gruen.Ende_1_x;
        model.gruen.a.eins_y=model.gruen.Ende_1_y;
        model.gelb.a.eins_x=model.gelb.Ende_1_x;
        model.gelb.a.eins_y=model.gelb.Ende_1_y;
        model.rot.a.eins_x=model.rot.Ende_1_x;
        model.rot.a.eins_y=model.rot.Ende_1_y;


        assertEquals('F', model.gameState[model.blau.a.zwei_x][model.blau.a.zwei_y]);
        model.raus(model.blau);
        assertEquals('F', model.gameState[model.blau.a.zwei_x][model.blau.a.zwei_y]);

        assertEquals('F', model.gameState[model.gruen.a.zwei_x][model.gruen.a.zwei_y]);
        model.raus(model.gruen);
        assertEquals('F', model.gameState[model.gruen.a.zwei_x][model.gruen.a.zwei_y]);

        assertEquals('F', model.gameState[model.gelb.a.zwei_x][model.gelb.a.zwei_y]);
        model.raus(model.gelb);
        assertEquals('F', model.gameState[model.gelb.a.zwei_x][model.gelb.a.zwei_y]);

        assertEquals('F', model.gameState[model.rot.a.zwei_x][model.rot.a.zwei_y]);
        model.raus(model.rot);
        assertEquals('F', model.gameState[model.rot.a.zwei_x][model.rot.a.zwei_y]);
    }
    @Test
    public void FeldÄndern_3(){
        model.newGame();
        model.a=6;
        model.blau.a.eins_x=model.blau.Ende_1_x;
        model.blau.a.eins_y=model.blau.Ende_1_y;
        model.gruen.a.eins_x=model.gruen.Ende_1_x;
        model.gruen.a.eins_y=model.gruen.Ende_1_y;
        model.gelb.a.eins_x=model.gelb.Ende_1_x;
        model.gelb.a.eins_y=model.gelb.Ende_1_y;
        model.rot.a.eins_x=model.rot.Ende_1_x;
        model.rot.a.eins_y=model.rot.Ende_1_y;
        model.blau.a.zwei_x=model.blau.Ende_2_x;
        model.blau.a.zwei_y=model.blau.Ende_2_y;
        model.gruen.a.zwei_x=model.gruen.Ende_2_x;
        model.gruen.a.zwei_y=model.gruen.Ende_2_y;
        model.gelb.a.zwei_x=model.gelb.Ende_2_x;
        model.gelb.a.zwei_y=model.gelb.Ende_2_y;
        model.rot.a.zwei_x=model.rot.Ende_2_x;
        model.rot.a.zwei_y=model.rot.Ende_2_y;


        assertEquals('F', model.gameState[model.blau.a.drei_x][model.blau.a.drei_y]);
        model.raus(model.blau);
        assertEquals('F', model.gameState[model.blau.a.drei_x][model.blau.a.drei_y]);

        assertEquals('F', model.gameState[model.gruen.a.drei_x][model.gruen.a.drei_y]);
        model.raus(model.gruen);
        assertEquals('F', model.gameState[model.gruen.a.drei_x][model.gruen.a.drei_y]);

        assertEquals('F', model.gameState[model.gelb.a.drei_x][model.gelb.a.drei_y]);
        model.raus(model.gelb);
        assertEquals('F', model.gameState[model.gelb.a.drei_x][model.gelb.a.drei_y]);

        assertEquals('F', model.gameState[model.rot.a.drei_x][model.rot.a.drei_y]);
        model.raus(model.rot);
        assertEquals('F', model.gameState[model.rot.a.drei_x][model.rot.a.drei_y]);
    }
    @Test
    public void FeldÄndern_4(){
        model.newGame();
        model.a=6;
        model.blau.a.eins_x=model.blau.Ende_1_x;
        model.blau.a.eins_y=model.blau.Ende_1_y;
        model.gruen.a.eins_x=model.gruen.Ende_1_x;
        model.gruen.a.eins_y=model.gruen.Ende_1_y;
        model.gelb.a.eins_x=model.gelb.Ende_1_x;
        model.gelb.a.eins_y=model.gelb.Ende_1_y;
        model.rot.a.eins_x=model.rot.Ende_1_x;
        model.rot.a.eins_y=model.rot.Ende_1_y;
        model.blau.a.zwei_x=model.blau.Ende_2_x;
        model.blau.a.zwei_y=model.blau.Ende_2_y;
        model.gruen.a.zwei_x=model.gruen.Ende_2_x;
        model.gruen.a.zwei_y=model.gruen.Ende_2_y;
        model.gelb.a.zwei_x=model.gelb.Ende_2_x;
        model.gelb.a.zwei_y=model.gelb.Ende_2_y;
        model.rot.a.zwei_x=model.rot.Ende_2_x;
        model.rot.a.zwei_y=model.rot.Ende_2_y;
        model.blau.a.drei_x=model.blau.Ende_3_x;
        model.blau.a.drei_y=model.blau.Ende_3_y;
        model.gruen.a.drei_x=model.gruen.Ende_3_x;
        model.gruen.a.drei_y=model.gruen.Ende_3_y;
        model.gelb.a.drei_x=model.gelb.Ende_3_x;
        model.gelb.a.drei_y=model.gelb.Ende_3_y;
        model.rot.a.drei_x=model.rot.Ende_3_x;
        model.rot.a.drei_y=model.rot.Ende_3_y;


        assertEquals('F', model.gameState[model.blau.a.vier_x][model.blau.a.vier_y]);
        model.raus(model.blau);
        assertEquals('F', model.gameState[model.blau.a.vier_x][model.blau.a.vier_y]);

        assertEquals('F', model.gameState[model.gruen.a.vier_x][model.gruen.a.vier_y]);
        model.raus(model.gruen);
        assertEquals('F', model.gameState[model.gruen.a.vier_x][model.gruen.a.vier_y]);

        assertEquals('F', model.gameState[model.gelb.a.vier_x][model.gelb.a.vier_y]);
        model.raus(model.gelb);
        assertEquals('F', model.gameState[model.gelb.a.vier_x][model.gelb.a.vier_y]);

        assertEquals('F', model.gameState[model.rot.a.vier_x][model.rot.a.vier_y]);
        model.raus(model.rot);
        assertEquals('F', model.gameState[model.rot.a.vier_x][model.rot.a.vier_y]);
    }

    @Test
    public void Bewegen(){
        model.newGame();
        model.blau.a.eins_x=model.blau.Start_x;
        model.blau.a.eins_y=model.blau.Start_y;
        int x=model.blau.a.eins_x;
        int y=model.blau.a.eins_y;
        model.move(model.blau);
        model.gameState[x][y]='0';
        model.gameState[model.blau.a.eins_x][model.blau.a.eins_y]='F';
    }
    @Test
    public void Bewegen_2(){
        model.newGame();
        model.blau.a.zwei_x=model.blau.Start_x;
        model.blau.a.zwei_y=model.blau.Start_y;
        int x=model.blau.a.zwei_x;
        int y=model.blau.a.zwei_y;
        model.move(model.blau);
        model.gameState[x][y]='0';
        model.gameState[model.blau.a.zwei_x][model.blau.a.zwei_y]='F';
    }
    @Test
    public void Bewegen_3(){
        model.newGame();
        model.blau.a.drei_x=model.blau.Start_x;
        model.blau.a.drei_y=model.blau.Start_y;
        int x=model.blau.a.drei_x;
        int y=model.blau.a.drei_y;
        model.move(model.blau);
        model.gameState[x][y]='0';
        model.gameState[model.blau.a.drei_x][model.blau.a.drei_y]='F';
    }
    @Test
    public void Bewegen_4(){
        model.newGame();
        model.blau.a.vier_x=model.blau.Start_x;
        model.blau.a.vier_y=model.blau.Start_y;
        int x=model.blau.a.vier_x;
        int y=model.blau.a.vier_y;
        model.move(model.blau);
        model.gameState[x][y]='0';
        model.gameState[model.blau.a.vier_x][model.blau.a.vier_y]='F';
    }
    @Test
    public void Bewegen_5(){
        model.newGame();
        model.move(model.blau);
    }

    @Test
    public void Platzieren(){
        model.newGame();
        model.blau.a.vier_x=model.blau.Ende_4_x;
        model.blau.a.vier_y=model.blau.Ende_4_y;
        model.platzieren(model.blau);
        model.gelb.a.vier_x=model.gelb.Ende_4_x;
        model.gelb.a.vier_y=model.gelb.Ende_4_y;
        model.platzieren(model.gelb);
        model.rot.a.vier_x=model.rot.Ende_4_x;
        model.rot.a.vier_y=model.rot.Ende_4_y;
        model.platzieren(model.rot);
        model.gruen.a.vier_x=model.gruen.Ende_4_x;
        model.gruen.a.vier_y=model.gruen.Ende_4_y;
        model.platzieren(model.gruen);

        assertEquals(1, model.blau.platz);
        assertEquals(2, model.gelb.platz);
        assertEquals(3, model.rot.platz);
        assertEquals(4, model.gruen.platz);
    }
    @Test
    public void Platzieren_2(){
        model.newGame();
        model.gelb.a.vier_x=model.gelb.Ende_4_x;
        model.gelb.a.vier_y=model.gelb.Ende_4_y;
        model.platzieren(model.gelb);
        model.blau.a.vier_x=model.blau.Ende_4_x;
        model.blau.a.vier_y=model.blau.Ende_4_y;
        model.platzieren(model.blau);
        model.gruen.a.vier_x=model.gruen.Ende_4_x;
        model.gruen.a.vier_y=model.gruen.Ende_4_y;
        model.platzieren(model.gruen);
        model.rot.a.vier_x=model.rot.Ende_4_x;
        model.rot.a.vier_y=model.rot.Ende_4_y;
        model.platzieren(model.rot);

        assertEquals(1, model.gelb.platz);
        assertEquals(2, model.blau.platz);
        assertEquals(3, model.gruen.platz);
        assertEquals(4, model.rot.platz);

    }

    @Test
    public void Platzieren_3(){
        model.newGame();
        model.rot.a.vier_x=model.rot.Ende_4_x;
        model.rot.a.vier_y=model.rot.Ende_4_y;
        model.platzieren(model.rot);
        model.gruen.a.vier_x=model.gruen.Ende_4_x;
        model.gruen.a.vier_y=model.gruen.Ende_4_y;
        model.platzieren(model.gruen);
        model.blau.a.vier_x=model.blau.Ende_4_x;
        model.blau.a.vier_y=model.blau.Ende_4_y;
        model.platzieren(model.blau);
        model.gelb.a.vier_x=model.gelb.Ende_4_x;
        model.gelb.a.vier_y=model.gelb.Ende_4_y;
        model.platzieren(model.gelb);


        assertEquals(1, model.rot.platz);
        assertEquals(2, model.gruen.platz);
        assertEquals(3, model.blau.platz);
        assertEquals(4, model.gelb.platz);
    }

    @Test
    public void Platzieren_4(){
        model.newGame();
        model.gruen.a.vier_x=model.gruen.Ende_4_x;
        model.gruen.a.vier_y=model.gruen.Ende_4_y;
        model.platzieren(model.gruen);
        model.rot.a.vier_x=model.rot.Ende_4_x;
        model.rot.a.vier_y=model.rot.Ende_4_y;
        model.platzieren(model.rot);
        model.gelb.a.vier_x=model.gelb.Ende_4_x;
        model.gelb.a.vier_y=model.gelb.Ende_4_y;
        model.platzieren(model.gelb );

        model.blau.a.vier_x=model.blau.Ende_4_x;
        model.blau.a.vier_y=model.blau.Ende_4_y;
        model.platzieren(model.blau);

        assertEquals(1, model.gruen.platz);
        assertEquals(2, model.rot.platz);
        assertEquals(3, model.gelb.platz);
        assertEquals(4, model.blau.platz);

    }
    @Test
    public void BlauBewegen(){
        model.newGame();
        model.blau.a.t=0;
        model.a=1;
        assertEquals(0, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(1, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(2, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(3, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(4, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(5, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(6, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(7, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(8, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(9, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(10, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(11, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(12, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(13, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(14, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(15, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(16, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(17, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(18, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(19, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(20, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(21, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(22, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(23, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(24, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(25, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(26, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(27, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(28, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(29, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(30, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(31, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(32, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(33, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(34, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(35, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(36, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(37, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(38, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(39, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(40, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(41, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(42, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(43, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(model.blau.Ende_1_x,model.blau.a.eins_x);
        assertEquals(model.blau.Ende_1_y,model.blau.a.eins_y);
        assertEquals(0,model.blau.a.t);

    }
    @Test
    public void BlauBewegen_2(){
        model.newGame();
        model.blau.a.eins_x=model.blau.Ende_1_x;
        model.blau.a.eins_y=model.blau.Ende_1_y;
        model.blau.a.t=0;
        model.a=1;
        assertEquals(0, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(1, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(2, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(3, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(4, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(5, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(6, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(7, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(8, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(9, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(10, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(11, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(12, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(13, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(14, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(15, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(16, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(17, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(18, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(19, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(20, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(21, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(22, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(23, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(24, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(25, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(26, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(27, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(28, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(29, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(30, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(31, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(32, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(33, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(34, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(35, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(36, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(37, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(38, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(39, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(40, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(41, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(42, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(model.blau.Ende_2_x,model.blau.a.zwei_x);
        assertEquals(model.blau.Ende_2_y,model.blau.a.zwei_y);
        assertEquals(0,model.blau.a.t);
    }
    @Test
    public void BlauBewegen_3(){
        model.newGame();
        model.blau.a.eins_x=model.blau.Ende_1_x;
        model.blau.a.eins_y=model.blau.Ende_1_y;
        model.blau.a.zwei_x=model.blau.Ende_2_x;
        model.blau.a.zwei_y=model.blau.Ende_2_y;
        model.blau.a.t=0;
        model.a=1;
        assertEquals(0, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(1, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(2, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(3, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(4, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(5, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(6, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(7, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(8, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(9, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(10, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(11, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(12, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(13, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(14, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(15, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(16, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(17, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(18, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(19, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(20, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(21, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(22, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(23, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(24, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(25, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(26, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(27, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(28, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(29, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(30, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(31, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(32, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(33, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(34, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(35, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(36, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(37, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(38, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(39, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(40, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(41, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(model.blau.Ende_3_x,model.blau.a.drei_x);
        assertEquals(model.blau.Ende_3_y,model.blau.a.drei_y);
        assertEquals(0,model.blau.a.t);

    }
    @Test
    public void BlauBewegen_4(){
        model.newGame();
        model.blau.a.eins_x=model.blau.Ende_1_x;
        model.blau.a.eins_y=model.blau.Ende_1_y;
        model.blau.a.zwei_x=model.blau.Ende_2_x;
        model.blau.a.zwei_y=model.blau.Ende_2_y;
        model.blau.a.drei_x= model.blau.Ende_3_x;
        model.blau.a.drei_y=model.blau.Ende_3_y;
        model.blau.a.t=0;
        model.a=1;
        assertEquals(0, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(1, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(2, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(3, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(4, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(5, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(6, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(7, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(8, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(9, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(10, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(11, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(12, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(13, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(14, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(15, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(16, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(17, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(18, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(19, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(20, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(21, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(22, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(23, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(24, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(25, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(26, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(27, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(28, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(29, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(30, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(31, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(32, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(33, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(34, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(35, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(36, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(37, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(38, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(39, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(40, model.blau.a.t);
        model.bewegen(model.blau);
        assertEquals(model.blau.Ende_4_x,model.blau.a.vier_x);
        assertEquals(model.blau.Ende_4_y,model.blau.a.vier_y);
        assertEquals(0,model.blau.a.t);

    }
    @Test
    public void BlauBewegen_5(){
        model.newGame();
        model.blau.a.eins_x=model.blau.Ende_1_x;
        model.blau.a.eins_y=model.blau.Ende_1_y;
        model.blau.a.t=40;
        model.a=5;
        model.bewegen(model.blau);
        assertEquals(model.blau.Ende_2_x,model.blau.a.zwei_x);
        assertEquals(model.blau.Ende_2_y,model.blau.a.zwei_y);
        assertEquals(0,model.blau.a.t);
    }
    @Test
    public void BlauBewegen_6(){
        model.newGame();
        model.blau.a.eins_x=model.blau.Ende_1_x;
        model.blau.a.eins_y=model.blau.Ende_1_y;
        model.blau.a.zwei_x=model.blau.Ende_2_x;
        model.blau.a.zwei_y=model.blau.Ende_2_y;
        model.blau.a.t=40;
        model.a=5;
        model.bewegen(model.blau);
        assertEquals(model.blau.Ende_3_x,model.blau.a.drei_x);
        assertEquals(model.blau.Ende_3_y,model.blau.a.drei_y);
        assertEquals(0,model.blau.a.t);

    }
    @Test
    public void BlauBewegen_7(){

        model.newGame();
        model.blau.a.eins_x=model.blau.Ende_1_x;
        model.blau.a.eins_y=model.blau.Ende_1_y;
        model.blau.a.zwei_x=model.blau.Ende_2_x;
        model.blau.a.zwei_y=model.blau.Ende_2_y;
        model.blau.a.drei_x=model.blau.Ende_3_x;
        model.blau.a.drei_y=model.blau.Ende_3_y;
        model.blau.a.t=40;
        model.a=4;
        model.bewegen(model.blau);
        assertEquals(model.blau.Ende_4_x,model.blau.a.vier_x);
        assertEquals(model.blau.Ende_4_y,model.blau.a.vier_y);
        assertEquals(0,model.blau.a.t);
    }
    @Test
    public void BlauBewegen_8(){

        model.newGame();
        model.blau.a.eins_x=model.blau.Ende_1_x;
        model.blau.a.eins_y=model.blau.Ende_1_y;
        model.blau.a.zwei_x=model.blau.Ende_2_x;
        model.blau.a.zwei_y=model.blau.Ende_2_y;
        model.blau.a.drei_x=model.blau.Ende_3_x;
        model.blau.a.drei_y=model.blau.Ende_3_y;
        model.blau.a.t=40;
        model.a=2;
        model.bewegen(model.blau);
        assertEquals(model.blau.Ende_4_x,model.blau.a.vier_x);
        assertEquals(model.blau.Ende_4_y,model.blau.a.vier_y);
        assertEquals(0,model.blau.a.t);
    }
    @Test
    public void BlauBewegen_9(){

        model.newGame();
        model.blau.a.eins_x=model.blau.Ende_1_x;
        model.blau.a.eins_y=model.blau.Ende_1_y;
        model.blau.a.zwei_x=model.blau.Ende_2_x;
        model.blau.a.zwei_y=model.blau.Ende_2_y;
        model.blau.a.drei_x=model.blau.Ende_3_x;
        model.blau.a.drei_y=model.blau.Ende_3_y;
        model.blau.a.t=40;
        model.a=3;
        model.bewegen(model.blau);
        assertEquals(model.blau.Ende_4_x,model.blau.a.vier_x);
        assertEquals(model.blau.Ende_4_y,model.blau.a.vier_y);
        assertEquals(0,model.blau.a.t);
    }
    @Test
    public void BlauBewegen_10(){

        model.newGame();
        model.blau.a.eins_x=model.blau.Ende_1_x;
        model.blau.a.eins_y=model.blau.Ende_1_y;
        model.blau.a.zwei_x=model.blau.Ende_2_x;
        model.blau.a.zwei_y=model.blau.Ende_2_y;
        model.blau.a.t=40;
        model.a=3;
        model.bewegen(model.blau);
        assertEquals(model.blau.Ende_3_x,model.blau.a.drei_x);
        assertEquals(model.blau.Ende_3_y,model.blau.a.drei_y);
        assertEquals(0,model.blau.a.t);
    }

    @Test
    public void GruenFeldRuntersetzen(){

        model.newGame();
        model.gruen.a.t=40;
        model.a=3;
        assertEquals(40,model.gruen.a.t);
        model.bewegen(model.gruen);
        assertEquals(3, model.gruen.a.t);
    }
    @Test
    public void GelbFeldRuntersetzen(){

        model.newGame();
        model.gelb.a.t=40;
        model.a=3;
        assertEquals(40,model.gelb.a.t);
        model.bewegen(model.gelb);
        assertEquals(3, model.gelb.a.t);
    }
    @Test
    public void RotFeldRuntersetzen(){

        model.newGame();
        model.rot.a.t=40;
        model.a=3;
        assertEquals(40,model.rot.a.t);
        model.bewegen(model.rot);
        assertEquals(3, model.rot.a.t);
    }
    @Test
    public void GrünBewegen(){

        model.newGame();
        model.gruen.a.t=10;
        model.a=1;
        assertEquals(10, model.gruen.a.t);
        model.bewegen(model.gruen);
        assertEquals(-1, model.gruen.a.t);
        model.bewegen(model.gruen);
        assertEquals(-2, model.gruen.a.t);
        model.bewegen(model.gruen);
        assertEquals(-3, model.gruen.a.t);
        model.bewegen(model.gruen);
        assertEquals(model.gruen.Ende_1_x,model.gruen.a.eins_x);
        assertEquals(model.gruen.Ende_1_y,model.gruen.a.eins_y);
        assertEquals(0,model.gruen.a.t);
    }
    @Test
    public void GrünBewegen_1(){

        model.newGame();
        model.gruen.a.eins_x=model.gruen.Ende_1_x;
        model.gruen.a.eins_y=model.gruen.Ende_1_y;
        model.gruen.a.t=10;
        model.a=1;
        assertEquals(10, model.gruen.a.t);
        model.bewegen(model.gruen);
        assertEquals(-1, model.gruen.a.t);
        model.bewegen(model.gruen);
        assertEquals(-2, model.gruen.a.t);
        model.bewegen(model.gruen);
        assertEquals(model.gruen.Ende_2_x,model.gruen.a.zwei_x);
        assertEquals(model.gruen.Ende_2_y,model.gruen.a.zwei_y);
        assertEquals(0,model.gruen.a.t);

    }
    @Test
    public void GrünBewegen_2(){

        model.newGame();
        model.gruen.a.eins_x=model.gruen.Ende_1_x;
        model.gruen.a.eins_y=model.gruen.Ende_1_y;
        model.gruen.a.zwei_x=model.gruen.Ende_2_x;
        model.gruen.a.zwei_y=model.gruen.Ende_2_y;
        model.gruen.a.t=10;
        model.a=1;
        assertEquals(10, model.gruen.a.t);
        model.bewegen(model.gruen);
        assertEquals(-1, model.gruen.a.t);
        model.bewegen(model.gruen);
        assertEquals(model.gruen.Ende_3_x,model.gruen.a.drei_x);
        assertEquals(model.gruen.Ende_3_y,model.gruen.a.drei_y);
        assertEquals(0,model.gruen.a.t);

    }
    @Test
    public void GrünBewegen_3(){

        model.newGame();
        model.gruen.a.eins_x=model.gruen.Ende_1_x;
        model.gruen.a.eins_y=model.gruen.Ende_1_y;
        model.gruen.a.zwei_x=model.gruen.Ende_2_x;
        model.gruen.a.zwei_y=model.gruen.Ende_2_y;
        model.gruen.a.drei_x=model.gruen.Ende_3_x;
        model.gruen.a.drei_y=model.gruen.Ende_3_y;
        model.gruen.a.t=10;
        model.a=1;
        assertEquals(10, model.gruen.a.t);
        model.bewegen(model.gruen);
        assertEquals(model.gruen.Ende_4_x,model.gruen.a.vier_x);
        assertEquals(model.gruen.Ende_4_y,model.gruen.a.vier_y);
        assertEquals(0,model.gruen.a.t);

    }
    @Test
    public void GrünBewegen_4(){

        model.newGame();
        model.gruen.a.eins_x=model.gruen.Ende_1_x;
        model.gruen.a.eins_y=model.gruen.Ende_1_y;
        model.gruen.a.zwei_x=model.gruen.Ende_2_x;
        model.gruen.a.zwei_y=model.gruen.Ende_2_y;
        model.gruen.a.drei_x=model.gruen.Ende_3_x;
        model.gruen.a.drei_y=model.gruen.Ende_3_y;
        model.gruen.a.t=10;
        model.a=2;
        assertEquals(10, model.gruen.a.t);
        model.bewegen(model.gruen);
        assertEquals(model.gruen.Ende_4_x,model.gruen.a.vier_x);
        assertEquals(model.gruen.Ende_4_y,model.gruen.a.vier_y);
        assertEquals(0,model.gruen.a.t);


    }
    @Test
    public void GrünBewegen_5(){

        model.newGame();
        model.gruen.a.eins_x=model.gruen.Ende_1_x;
        model.gruen.a.eins_y=model.gruen.Ende_1_y;
        model.gruen.a.zwei_x=model.gruen.Ende_2_x;
        model.gruen.a.zwei_y=model.gruen.Ende_2_y;
        model.gruen.a.drei_x=model.gruen.Ende_3_x;
        model.gruen.a.drei_y=model.gruen.Ende_3_y;
        model.gruen.a.t=10;
        model.a=3;
        assertEquals(10, model.gruen.a.t);
        model.bewegen(model.gruen);
        assertEquals(model.gruen.Ende_4_x,model.gruen.a.vier_x);
        assertEquals(model.gruen.Ende_4_y,model.gruen.a.vier_y);
        assertEquals(0,model.gruen.a.t);
    }
    @Test
    public void GrünBewegen_6(){

        model.newGame();
        model.gruen.a.eins_x=model.gruen.Ende_1_x;
        model.gruen.a.eins_y=model.gruen.Ende_1_y;
        model.gruen.a.zwei_x=model.gruen.Ende_2_x;
        model.gruen.a.zwei_y=model.gruen.Ende_2_y;
        model.gruen.a.drei_x=model.gruen.Ende_3_x;
        model.gruen.a.drei_y=model.gruen.Ende_3_y;
        model.gruen.a.t=10;
        model.a=4;
        assertEquals(10, model.gruen.a.t);
        model.bewegen(model.gruen);
        assertEquals(model.gruen.Ende_4_x,model.gruen.a.vier_x);
        assertEquals(model.gruen.Ende_4_y,model.gruen.a.vier_y);
        assertEquals(0,model.gruen.a.t);
    }
    @Test
    public void GrünBewegen_7(){

        model.newGame();
        model.gruen.a.eins_x=model.gruen.Ende_1_x;
        model.gruen.a.eins_y=model.gruen.Ende_1_y;
        model.gruen.a.zwei_x=model.gruen.Ende_2_x;
        model.gruen.a.zwei_y=model.gruen.Ende_2_y;
        model.gruen.a.t=10;
        model.a=3;
        assertEquals(10, model.gruen.a.t);
        model.bewegen(model.gruen);
        assertEquals(model.gruen.Ende_3_x,model.gruen.a.drei_x);
        assertEquals(model.gruen.Ende_3_y,model.gruen.a.drei_y);
        assertEquals(0,model.gruen.a.t);
    }
    @Test
    public void GrünBewegen_8(){

        model.newGame();
        model.gruen.a.eins_x=model.gruen.Ende_1_x;
        model.gruen.a.eins_y=model.gruen.Ende_1_y;
        model.gruen.a.zwei_x=model.gruen.Ende_2_x;
        model.gruen.a.zwei_y=model.gruen.Ende_2_y;
        model.gruen.a.t=10;
        model.a=4;
        assertEquals(10, model.gruen.a.t);
        model.bewegen(model.gruen);
        assertEquals(model.gruen.Ende_3_x,model.gruen.a.drei_x);
        assertEquals(model.gruen.Ende_3_y,model.gruen.a.drei_y);
        assertEquals(0,model.gruen.a.t);
    }
    @Test
    public void GrünBewegen_9(){

        model.newGame();
        model.gruen.a.eins_x=model.gruen.Ende_1_x;
        model.gruen.a.eins_y=model.gruen.Ende_1_y;
        model.gruen.a.t=10;
        model.a=4;
        assertEquals(10, model.gruen.a.t);
        model.bewegen(model.gruen);
        assertEquals(model.gruen.Ende_2_x,model.gruen.a.zwei_x);
        assertEquals(model.gruen.Ende_2_y,model.gruen.a.zwei_y);
        assertEquals(0,model.gruen.a.t);
    }
    @Test
    public void GelbBewegen(){
        model.newGame();
        model.gelb.a.t=20;
        model.a=1;
        assertEquals(20,model.gelb.a.t);
        model.bewegen(model.gelb);
        assertEquals(-1, model.gelb.a.t);
        model.bewegen(model.gelb);
        assertEquals(-2, model.gelb.a.t);
        model.bewegen(model.gelb);
        assertEquals(-3, model.gelb.a.t);
        model.bewegen(model.gelb);
        assertEquals(model.gelb.Ende_1_x,model.gelb.a.eins_x);
        assertEquals(model.gelb.Ende_1_y,model.gelb.a.eins_y);
        assertEquals(0,model.gelb.a.t);
    }
    @Test
    public void GelbBewegen_1(){
        model.newGame();
        model.gelb.a.eins_x=model.gelb.Ende_1_x;
        model.gelb.a.eins_y=model.gelb.Ende_1_y;
        model.gelb.a.t=20;
        model.a=1;
        assertEquals(20,model.gelb.a.t);
        model.bewegen(model.gelb);
        assertEquals(-1,model.gelb.a.t);
        model.bewegen(model.gelb);
        assertEquals(-2,model.gelb.a.t);
        model.bewegen(model.gelb);
        assertEquals(model.gelb.Ende_2_x,model.gelb.a.zwei_x);
        assertEquals(model.gelb.Ende_2_y,model.gelb.a.zwei_y);
        assertEquals(0,model.gelb.a.t);
    }
    @Test
    public void GelbBewegen_2(){
        model.newGame();
        model.gelb.a.eins_x=model.gelb.Ende_1_x;
        model.gelb.a.eins_y=model.gelb.Ende_1_y;
        model.gelb.a.t=20;
        model.a=4;
        assertEquals(20,model.gelb.a.t);
        model.bewegen(model.gelb);
        assertEquals(model.gelb.Ende_2_x,model.gelb.a.zwei_x);
        assertEquals(model.gelb.Ende_2_y,model.gelb.a.zwei_y);
        assertEquals(0,model.gelb.a.t);

    }
    @Test
    public void GelbBewegen_3(){
        model.newGame();
        model.gelb.a.eins_x=model.gelb.Ende_1_x;
        model.gelb.a.eins_y=model.gelb.Ende_1_y;
        model.gelb.a.zwei_x=model.gelb.Ende_2_x;
        model.gelb.a.zwei_y=model.gelb.Ende_2_y;
        model.gelb.a.t=20;
        model.a=1;
        assertEquals(20,model.gelb.a.t);
        model.bewegen(model.gelb);
        assertEquals(-1,model.gelb.a.t);
        model.bewegen(model.gelb);
        assertEquals(model.gelb.Ende_3_x,model.gelb.a.drei_x);
        assertEquals(model.gelb.Ende_3_y,model.gelb.a.drei_y);
        assertEquals(0,model.gelb.a.t);
    }
    @Test
    public void GelbBewegen_4(){
        model.newGame();
        model.gelb.a.eins_x=model.gelb.Ende_1_x;
        model.gelb.a.eins_y=model.gelb.Ende_1_y;
        model.gelb.a.zwei_x=model.gelb.Ende_2_x;
        model.gelb.a.zwei_y=model.gelb.Ende_2_y;
        model.gelb.a.t=20;
        model.a=3;
        assertEquals(20,model.gelb.a.t);
        model.bewegen(model.gelb);
        assertEquals(model.gelb.Ende_3_x,model.gelb.a.drei_x);
        assertEquals(model.gelb.Ende_3_y,model.gelb.a.drei_y);
        assertEquals(0,model.gelb.a.t);

    }
    @Test
    public void GelbBewegen_5(){
        model.newGame();
        model.gelb.a.eins_x=model.gelb.Ende_1_x;
        model.gelb.a.eins_y=model.gelb.Ende_1_y;
        model.gelb.a.zwei_x=model.gelb.Ende_2_x;
        model.gelb.a.zwei_y=model.gelb.Ende_2_y;
        model.gelb.a.t=20;
        model.a=4;
        assertEquals(20,model.gelb.a.t);
        model.bewegen(model.gelb);
        assertEquals(model.gelb.Ende_3_x,model.gelb.a.drei_x);
        assertEquals(model.gelb.Ende_3_y,model.gelb.a.drei_y);
        assertEquals(0,model.gelb.a.t);

    }
    @Test
    public void GelbBewegen_6(){
        model.newGame();
        model.gelb.a.eins_x=model.gelb.Ende_1_x;
        model.gelb.a.eins_y=model.gelb.Ende_1_y;
        model.gelb.a.zwei_x=model.gelb.Ende_2_x;
        model.gelb.a.zwei_y=model.gelb.Ende_2_y;
        model.gelb.a.drei_x=model.gelb.Ende_3_x;
        model.gelb.a.drei_y=model.gelb.Ende_3_y;
        model.gelb.a.t=20;
        model.a=1;
        assertEquals(20,model.gelb.a.t);
        model.bewegen(model.gelb);
        assertEquals(model.gelb.Ende_4_x,model.gelb.a.vier_x);
        assertEquals(model.gelb.Ende_4_y,model.gelb.a.vier_y);
        assertEquals(0,model.gelb.a.t);
    }
    @Test
    public void GelbBewegen_7(){
        model.newGame();
        model.gelb.a.eins_x=model.gelb.Ende_1_x;
        model.gelb.a.eins_y=model.gelb.Ende_1_y;
        model.gelb.a.zwei_x=model.gelb.Ende_2_x;
        model.gelb.a.zwei_y=model.gelb.Ende_2_y;
        model.gelb.a.drei_x=model.gelb.Ende_3_x;
        model.gelb.a.drei_y=model.gelb.Ende_3_y;
        model.gelb.a.t=20;
        model.a=3;
        assertEquals(20,model.gelb.a.t);
        model.bewegen(model.gelb);
        assertEquals(model.gelb.Ende_4_x,model.gelb.a.vier_x);
        assertEquals(model.gelb.Ende_4_y,model.gelb.a.vier_y);
        assertEquals(0,model.gelb.a.t);
    }
    @Test
    public void GelbBewegen_8(){
        model.newGame();
        model.gelb.a.eins_x=model.gelb.Ende_1_x;
        model.gelb.a.eins_y=model.gelb.Ende_1_y;
        model.gelb.a.zwei_x=model.gelb.Ende_2_x;
        model.gelb.a.zwei_y=model.gelb.Ende_2_y;
        model.gelb.a.drei_x=model.gelb.Ende_3_x;
        model.gelb.a.drei_y=model.gelb.Ende_3_y;
        model.gelb.a.t=20;
        model.a=4;
        assertEquals(20,model.gelb.a.t);
        model.bewegen(model.gelb);
        assertEquals(model.gelb.Ende_4_x,model.gelb.a.vier_x);
        assertEquals(model.gelb.Ende_4_y,model.gelb.a.vier_y);
        assertEquals(0,model.gelb.a.t);

    }
    @Test
    public void GelbBewegen_9(){
        model.newGame();
        model.gelb.a.eins_x=model.gelb.Ende_1_x;
        model.gelb.a.eins_y=model.gelb.Ende_1_y;
        model.gelb.a.zwei_x=model.gelb.Ende_2_x;
        model.gelb.a.zwei_y=model.gelb.Ende_2_y;
        model.gelb.a.drei_x=model.gelb.Ende_3_x;
        model.gelb.a.drei_y=model.gelb.Ende_3_y;
        model.gelb.a.t=20;
        model.a=2;
        assertEquals(20,model.gelb.a.t);
        model.bewegen(model.gelb);
        assertEquals(model.gelb.Ende_4_x,model.gelb.a.vier_x);
        assertEquals(model.gelb.Ende_4_y,model.gelb.a.vier_y);
        assertEquals(0,model.gelb.a.t);

    }
    @Test
    public void RotBewegen(){
        model.newGame();
        model.rot.a.t=30;
        model.a=1;
        assertEquals(30,model.rot.a.t);
        model.bewegen(model.rot);
        assertEquals(-1,model.rot.a.t);
        model.bewegen(model.rot);
        assertEquals(-2,model.rot.a.t);
        model.bewegen(model.rot);
        assertEquals(-3,model.rot.a.t);
        model.bewegen(model.rot);
        assertEquals(model.rot.Ende_1_x,model.rot.a.eins_x);
        assertEquals(model.rot.Ende_1_y,model.rot.a.eins_y);
        assertEquals(0,model.rot.a.t);
    }
    @Test
    public void RotBewegen_1(){
        model.newGame();
        model.rot.a.eins_x=model.rot.Ende_1_x;
        model.rot.a.eins_y=model.rot.Ende_1_y;
        model.rot.a.t=30;
        model.a=1;
        assertEquals(30,model.rot.a.t);
        model.bewegen(model.rot);
        assertEquals(-1,model.rot.a.t);
        model.bewegen(model.rot);
        assertEquals(-2,model.rot.a.t);
        model.bewegen(model.rot);
        assertEquals(model.rot.Ende_2_x,model.rot.a.zwei_x);
        assertEquals(model.rot.Ende_2_y,model.rot.a.zwei_y);
        assertEquals(0,model.rot.a.t);
    }
    @Test
    public void RotBewegen_2(){
        model.newGame();
        model.rot.a.eins_x=model.rot.Ende_1_x;
        model.rot.a.eins_y=model.rot.Ende_1_y;
        model.rot.a.t=30;
        model.a=4;
        assertEquals(30,model.rot.a.t);
        model.bewegen(model.rot);
        assertEquals(model.rot.Ende_2_x,model.rot.a.zwei_x);
        assertEquals(model.rot.Ende_2_y,model.rot.a.zwei_y);
        assertEquals(0,model.rot.a.t);
    }
    @Test
    public void RotBewegen_3(){
        model.newGame();
        model.rot.a.eins_x=model.rot.Ende_1_x;
        model.rot.a.eins_y=model.rot.Ende_1_y;
        model.rot.a.zwei_x=model.rot.Ende_2_x;
        model.rot.a.zwei_y=model.rot.Ende_2_y;
        model.rot.a.t=30;
        model.a=1;
        assertEquals(30,model.rot.a.t);
        model.bewegen(model.rot);
        assertEquals(-1,model.rot.a.t);
        model.bewegen(model.rot);
        assertEquals(model.rot.Ende_3_x,model.rot.a.drei_x);
        assertEquals(model.rot.Ende_3_y,model.rot.a.drei_y);
        assertEquals(0,model.rot.a.t);
    }
    @Test
    public void RotBewegen_4(){
        model.newGame();
        model.rot.a.eins_x=model.rot.Ende_1_x;
        model.rot.a.eins_y=model.rot.Ende_1_y;
        model.rot.a.zwei_x=model.rot.Ende_2_x;
        model.rot.a.zwei_y=model.rot.Ende_2_y;
        model.rot.a.t=30;
        model.a=3;
        assertEquals(30,model.rot.a.t);
        model.bewegen(model.rot);
        assertEquals(model.rot.Ende_3_x,model.rot.a.drei_x);
        assertEquals(model.rot.Ende_3_y,model.rot.a.drei_y);
        assertEquals(0,model.rot.a.t);
    }
    @Test
    public void RotBewegen_5(){
        model.newGame();
        model.rot.a.eins_x=model.rot.Ende_1_x;
        model.rot.a.eins_y=model.rot.Ende_1_y;
        model.rot.a.zwei_x=model.rot.Ende_2_x;
        model.rot.a.zwei_y=model.rot.Ende_2_y;
        model.rot.a.t=30;
        model.a=4;
        assertEquals(30,model.rot.a.t);
        model.bewegen(model.rot);
        assertEquals(model.rot.Ende_3_x,model.rot.a.drei_x);
        assertEquals(model.rot.Ende_3_y,model.rot.a.drei_y);
        assertEquals(0,model.rot.a.t);
    }
    @Test
    public void RotBewegen_6(){
        model.newGame();
        model.rot.a.eins_x=model.rot.Ende_1_x;
        model.rot.a.eins_y=model.rot.Ende_1_y;
        model.rot.a.zwei_x=model.rot.Ende_2_x;
        model.rot.a.zwei_y=model.rot.Ende_2_y;
        model.rot.a.drei_x=model.rot.Ende_3_x;
        model.rot.a.drei_y=model.rot.Ende_3_y;
        model.rot.a.t=30;
        model.a=1;
        assertEquals(30,model.rot.a.t);
        model.bewegen(model.rot);
        assertEquals(model.rot.Ende_4_x,model.rot.a.vier_x);
        assertEquals(model.rot.Ende_4_y,model.rot.a.vier_y);
        assertEquals(0,model.rot.a.t);

    }
    @Test
    public void RotBewegen_7(){
        model.newGame();
        model.rot.a.eins_x=model.rot.Ende_1_x;
        model.rot.a.eins_y=model.rot.Ende_1_y;
        model.rot.a.zwei_x=model.rot.Ende_2_x;
        model.rot.a.zwei_y=model.rot.Ende_2_y;
        model.rot.a.drei_x=model.rot.Ende_3_x;
        model.rot.a.drei_y=model.rot.Ende_3_y;
        model.rot.a.t=30;
        model.a=3;
        assertEquals(30,model.rot.a.t);
        model.bewegen(model.rot);
        assertEquals(model.rot.Ende_4_x,model.rot.a.vier_x);
        assertEquals(model.rot.Ende_4_y,model.rot.a.vier_y);
        assertEquals(0,model.rot.a.t);
    }
    @Test
    public void RotBewegen_8(){
        model.newGame();
        model.rot.a.eins_x=model.rot.Ende_1_x;
        model.rot.a.eins_y=model.rot.Ende_1_y;
        model.rot.a.zwei_x=model.rot.Ende_2_x;
        model.rot.a.zwei_y=model.rot.Ende_2_y;
        model.rot.a.drei_x=model.rot.Ende_3_x;
        model.rot.a.drei_y=model.rot.Ende_3_y;
        model.rot.a.t=30;
        model.a=4;
        assertEquals(30,model.rot.a.t);
        model.bewegen(model.rot);
        assertEquals(model.rot.Ende_4_x,model.rot.a.vier_x);
        assertEquals(model.rot.Ende_4_y,model.rot.a.vier_y);
        assertEquals(0,model.rot.a.t);
    }
    @Test
    public void RotBewegen_9(){
        model.newGame();
        model.rot.a.eins_x=model.rot.Ende_1_x;
        model.rot.a.eins_y=model.rot.Ende_1_y;
        model.rot.a.zwei_x=model.rot.Ende_2_x;
        model.rot.a.zwei_y=model.rot.Ende_2_y;
        model.rot.a.drei_x=model.rot.Ende_3_x;
        model.rot.a.drei_y=model.rot.Ende_3_y;
        model.rot.a.t=30;
        model.a=2;
        assertEquals(30,model.rot.a.t);
        model.bewegen(model.rot);
        assertEquals(model.rot.Ende_4_x,model.rot.a.vier_x);
        assertEquals(model.rot.Ende_4_y,model.rot.a.vier_y);
        assertEquals(0,model.rot.a.t);
    }
    @Test
    public void Rauswerfen(){
        model.newGame();
        model.gruen.a.eins_x=model.blau.Start_x;
        model.gruen.a.eins_y=model.blau.Start_y;
        model.blau.a.eins_x=model.blau.Start_x;
        model.blau.a.eins_y=model.blau.Start_y;
        model.rauswerfen(model.gruen,model.blau);
        assertEquals(model.gruen.Haus_1_x,model.gruen.a.eins_x);
        assertEquals(model.gruen.Haus_1_y,model.gruen.a.eins_y);
    }
    @Test
    public void Rauswerfen_2(){
        model.newGame();
        model.gruen.a.zwei_x=model.blau.Start_x;
        model.gruen.a.zwei_y=model.blau.Start_y;
        model.blau.a.eins_x=model.blau.Start_x;
        model.blau.a.eins_y=model.blau.Start_y;
        model.rauswerfen(model.gruen,model.blau);
        assertEquals(model.gruen.Haus_2_x,model.gruen.a.zwei_x);
        assertEquals(model.gruen.Haus_2_y,model.gruen.a.zwei_y);
    }
    @Test
    public void Rauswerfen_3(){
        model.newGame();
        model.gruen.a.drei_x=model.blau.Start_x;
        model.gruen.a.drei_y=model.blau.Start_y;
        model.blau.a.eins_x=model.blau.Start_x;
        model.blau.a.eins_y=model.blau.Start_y;
        model.rauswerfen(model.gruen,model.blau);
        assertEquals(model.gruen.Haus_3_x,model.gruen.a.drei_x);
        assertEquals(model.gruen.Haus_3_y,model.gruen.a.drei_y);
    }
    @Test
    public void Rauswerfen_4(){
        model.newGame();
        model.gruen.a.vier_x=model.blau.Start_x;
        model.gruen.a.vier_y=model.blau.Start_y;
        model.blau.a.eins_x=model.blau.Start_x;
        model.blau.a.eins_y=model.blau.Start_y;
        model.rauswerfen(model.gruen,model.blau);
        assertEquals(model.gruen.Haus_4_x,model.gruen.a.vier_x);
        assertEquals(model.gruen.Haus_4_y,model.gruen.a.vier_y);
    }
    @Test
    public void Rauswerfen_5(){
        model.newGame();
        model.gruen.a.eins_x=model.blau.Start_x;
        model.gruen.a.eins_y=model.blau.Start_y;
        model.blau.a.zwei_x=model.blau.Start_x;
        model.blau.a.zwei_y=model.blau.Start_y;
        model.rauswerfen(model.gruen,model.blau);
        assertEquals(model.gruen.Haus_1_x,model.gruen.a.eins_x);
        assertEquals(model.gruen.Haus_1_y,model.gruen.a.eins_y);
    }
    @Test
    public void Rauswerfen_6(){
        model.newGame();
        model.gruen.a.zwei_x=model.blau.Start_x;
        model.gruen.a.zwei_y=model.blau.Start_y;
        model.blau.a.zwei_x=model.blau.Start_x;
        model.blau.a.zwei_y=model.blau.Start_y;
        model.rauswerfen(model.gruen,model.blau);
        assertEquals(model.gruen.Haus_2_x,model.gruen.a.zwei_x);
        assertEquals(model.gruen.Haus_2_y,model.gruen.a.zwei_y);
    }
    @Test
    public void Rauswerfen_7(){
        model.newGame();
        model.gruen.a.drei_x=model.blau.Start_x;
        model.gruen.a.drei_y=model.blau.Start_y;
        model.blau.a.zwei_x=model.blau.Start_x;
        model.blau.a.zwei_y=model.blau.Start_y;
        model.rauswerfen(model.gruen,model.blau);
        assertEquals(model.gruen.Haus_3_x,model.gruen.a.drei_x);
        assertEquals(model.gruen.Haus_3_y,model.gruen.a.drei_y);
    }
    @Test
    public void Rauswerfen_8(){
        model.newGame();
        model.gruen.a.vier_x=model.blau.Start_x;
        model.gruen.a.vier_y=model.blau.Start_y;
        model.blau.a.zwei_x=model.blau.Start_x;
        model.blau.a.zwei_y=model.blau.Start_y;
        model.rauswerfen(model.gruen,model.blau);
        assertEquals(model.gruen.Haus_4_x,model.gruen.a.vier_x);
        assertEquals(model.gruen.Haus_4_y,model.gruen.a.vier_y);
    }
    @Test
    public void Rauswerfen_9(){
        model.newGame();
        model.gruen.a.eins_x=model.blau.Start_x;
        model.gruen.a.eins_y=model.blau.Start_y;
        model.blau.a.drei_x=model.blau.Start_x;
        model.blau.a.drei_y=model.blau.Start_y;
        model.rauswerfen(model.gruen,model.blau);
        assertEquals(model.gruen.Haus_1_x,model.gruen.a.eins_x);
        assertEquals(model.gruen.Haus_1_y,model.gruen.a.eins_y);
    }
    @Test
    public void Rauswerfen_10(){
        model.newGame();
        model.gruen.a.zwei_x=model.blau.Start_x;
        model.gruen.a.zwei_y=model.blau.Start_y;
        model.blau.a.drei_x=model.blau.Start_x;
        model.blau.a.drei_y=model.blau.Start_y;
        model.rauswerfen(model.gruen,model.blau);
        assertEquals(model.gruen.Haus_2_x,model.gruen.a.zwei_x);
        assertEquals(model.gruen.Haus_2_y,model.gruen.a.zwei_y);
    }
    @Test
    public void Rauswerfen_11(){
        model.newGame();
        model.gruen.a.drei_x=model.blau.Start_x;
        model.gruen.a.drei_y=model.blau.Start_y;
        model.blau.a.drei_x=model.blau.Start_x;
        model.blau.a.drei_y=model.blau.Start_y;
        model.rauswerfen(model.gruen,model.blau);
        assertEquals(model.gruen.Haus_3_x,model.gruen.a.drei_x);
        assertEquals(model.gruen.Haus_3_y,model.gruen.a.drei_y);
    }
    @Test
    public void Rauswerfen_12(){
        model.newGame();
        model.gruen.a.vier_x=model.blau.Start_x;
        model.gruen.a.vier_y=model.blau.Start_y;
        model.blau.a.drei_x=model.blau.Start_x;
        model.blau.a.drei_y=model.blau.Start_y;
        model.rauswerfen(model.gruen,model.blau);
        assertEquals(model.gruen.Haus_4_x,model.gruen.a.vier_x);
        assertEquals(model.gruen.Haus_4_y,model.gruen.a.vier_y);
    }
    @Test
    public void Rauswerfen_13(){
        model.newGame();
        model.gruen.a.eins_x=model.blau.Start_x;
        model.gruen.a.eins_y=model.blau.Start_y;
        model.blau.a.vier_x=model.blau.Start_x;
        model.blau.a.vier_y=model.blau.Start_y;
        model.rauswerfen(model.gruen,model.blau);
        assertEquals(model.gruen.Haus_1_x,model.gruen.a.eins_x);
        assertEquals(model.gruen.Haus_1_y,model.gruen.a.eins_y);
    }
    @Test
    public void Rauswerfen_14(){
        model.newGame();
        model.gruen.a.zwei_x=model.blau.Start_x;
        model.gruen.a.zwei_y=model.blau.Start_y;
        model.blau.a.vier_x=model.blau.Start_x;
        model.blau.a.vier_y=model.blau.Start_y;
        model.rauswerfen(model.gruen,model.blau);
        assertEquals(model.gruen.Haus_2_x,model.gruen.a.zwei_x);
        assertEquals(model.gruen.Haus_2_y,model.gruen.a.zwei_y);
    }
    @Test
    public void Rauswerfen_15(){
        model.newGame();
        model.gruen.a.drei_x=model.blau.Start_x;
        model.gruen.a.drei_y=model.blau.Start_y;
        model.blau.a.vier_x=model.blau.Start_x;
        model.blau.a.vier_y=model.blau.Start_y;
        model.rauswerfen(model.gruen,model.blau);
        assertEquals(model.gruen.Haus_3_x,model.gruen.a.drei_x);
        assertEquals(model.gruen.Haus_3_y,model.gruen.a.drei_y);
    }
    @Test
    public void Rauswerfen_16(){
        model.newGame();
        model.gruen.a.vier_x=model.blau.Start_x;
        model.gruen.a.vier_y=model.blau.Start_y;
        model.blau.a.vier_x=model.blau.Start_x;
        model.blau.a.vier_y=model.blau.Start_y;
        model.rauswerfen(model.gruen,model.blau);
        assertEquals(model.gruen.Haus_4_x,model.gruen.a.vier_x);
        assertEquals(model.gruen.Haus_4_y,model.gruen.a.vier_y);
    }
}
