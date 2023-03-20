package oscillation;

import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PVector;

public class Mover {
    PApplet context;

    PVector position;
    PVector velocity;
    PVector acceleration;
    float mass;
    float angle=0;
    float aVelocity=0;
    float aAcceleartion=0;


    Mover(PApplet context, float m, float x, float y) {
        this.context = context;
        this.mass = m;
        this.position = new PVector(x, y);
        this.velocity = new PVector(context.random(-1, 1), context.random(-1, 1));
        this.acceleration = new PVector(0, 0);
    }

    void applyForce(PVector force){
        PVector f = PVector.div(force, mass);
        acceleration.add(f);
    }

    void update(){
        this.velocity.add(acceleration);
        this.position.add(velocity);

        aAcceleartion = acceleration.x / 10.0f;
        aVelocity += aAcceleartion;
        aVelocity = PApplet.constrain(aVelocity, -0.1f, 0.1f);
        angle += aVelocity;

        acceleration.mult(0);
    }

    void display(){
        context.stroke(0);
        context.fill(175, 200);
        context.rectMode(PConstants.CENTER);
        context.pushMatrix();
        context.translate(position.x, position.y);
        context.rotate(angle);
        context.rect(0, 0, mass * 16, mass * 16);
        context.popMatrix();
    }

}
