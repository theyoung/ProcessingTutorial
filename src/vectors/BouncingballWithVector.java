package vectors;

import processing.core.PApplet;

public class BouncingballWithVector extends PApplet {

    @Override
    public void settings() {
        size(600,300);
    }

    PVector axis;
    PVector velocity;
    @Override
    public void setup() {
        frameRate(10);
        axis = new PVector(0,0);
        velocity = new PVector(1,2);
    }

    @Override
    public void draw() {
        background(255);

        if(axis.x < 0 || width < axis.x) velocity.x = velocity.x * -1;
        if(axis.y < 0 || height < axis.y) velocity.y = velocity.y * -1;

        axis.add(velocity);

        stroke(0);
        fill(177);
        ellipse(axis.x, axis.y, 30, 30);
    }


    public static void main(String[] args) {
        PApplet.main(new String[]{"vectors.BouncingballWithVector"});
    }
}
