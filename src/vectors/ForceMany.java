package vectors;

import processing.core.PApplet;
import processing.core.PVector;

public class ForceMany extends PApplet {
    Mover m;

    @Override
    public void settings() {
        size(640,360);
    }

    public void setup() {

        m = new Mover(this);
    }

    public void draw() {
        background(255);

        PVector wind = new PVector(0.01f,0);
        PVector gravity = new PVector(0,0.1f * m.mass);
        m.applyForce(wind);
        m.applyForce(gravity);

        m.update();
        m.display();
        m.checkEdges();
    }
    public static void main(String[] args) {
        PApplet.main(new String[]{"vectors.ForceMany"});
    }

}
