package vectors;

import processing.core.PApplet;
import processing.core.PVector;

class Mover {

    PVector location;
    PVector velocity;
    PVector acceleration;
    float mass;

    PApplet sketch;

    Mover(PApplet sketch) {
        this.sketch = sketch;
        mass = 10;
        location = new PVector(30,30);
        velocity = new PVector(0,0);
        acceleration = new PVector(0,0);
    }

    void applyForce(PVector force) {
        PVector f = PVector.div(force,mass);
        acceleration.add(f);
    }

    void update() {
        velocity.add(acceleration);
        location.add(velocity);
        acceleration.mult(0);
    }

    void display() {
        this.sketch.stroke(0);
        this.sketch.fill(175);
        this.sketch.ellipse(location.x,location.y,mass*16,mass*16);
    }

    void checkEdges() {
        if (location.x > this.sketch.width) {
            location.x = this.sketch.width;
            velocity.x *= -1;
        } else if (location.x < 0) {
            velocity.x *= -1;
            location.x = 0;
        }

        if (location.y > this.sketch.height) {velocity.y *= -1;
            location.y = this.sketch.height;
        }
    }
}
