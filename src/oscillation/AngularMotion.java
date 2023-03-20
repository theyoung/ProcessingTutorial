package oscillation;

import processing.core.PApplet;
import processing.core.PVector;

public class AngularMotion extends PApplet {
    Mover[] movers = new Mover[20];
    Attractor a;
    @Override
    public void settings() {
        size(640, 360);
    }

    @Override
    public void setup() {
        for (int i = 0; i < movers.length; i++) {
            movers[i] = new Mover(this, random(0.1f, 2f), random(width), random(height));
        }
        a = new Attractor(this);
    }

    @Override
    public void draw() {
        background(255);
        a.display();

        for (int i = 0; i < movers.length; i++) {
            PVector force = a.attract(movers[i]);
            movers[i].applyForce(force);

            movers[i].update();
            movers[i].display();
        }
    }
    public static void main(String[] args) {
        PApplet.main(new String[]{"oscillation.AngularMotion"});
    }
}
