package oscillation;

import processing.core.PApplet;
import processing.core.PVector;

public class Attractor {
    PApplet context;
    float mass;
    PVector position;
    float g;

    Attractor(PApplet context) {
        this.context = context;
        position = new PVector(context.width / 2, context.height / 2);
        mass = 20;
        g = 0.4f;
    }

    PVector attract(Mover mover) {
        PVector force = PVector.sub(position, mover.position);
        float distance = force.mag();
        distance = PApplet.constrain(distance, 5.0f, 25.0f);
        force.normalize();
        float strength = (g * mass * mover.mass) / (distance * distance);
        force.mult(strength);
        return force;
    }

    void display(){
        context.stroke(0);
        context.strokeWeight(2);
        context.fill(127);
        context.ellipse(position.x, position.y, 48, 48);
    }
}
