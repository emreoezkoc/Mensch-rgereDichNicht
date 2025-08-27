import controller.MenschAergereDichNIchtController;
import model.MenschAergereDichNichtModel;
import processing.core.PApplet;
import view.MenschAergereDichNichtView;

public class Main extends PApplet  {

    public static void main(String[]args) {
        var model=new MenschAergereDichNichtModel();
        var controller = new MenschAergereDichNIchtController();
        var view = new MenschAergereDichNichtView(800, 800);

        controller.setView(view);
        controller.setModel(model);
        view.setController(controller);


        PApplet.runSketch(new String[]{"Mensch-Aergere-Dich-Nicht"}, view);

    }
}
