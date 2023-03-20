package oscillation;

import processing.core.PApplet;

public class Baton extends PApplet {
    @Override
    public void settings() {
        size(750, 150);
    }

    @Override
    public void setup() {
        smooth();
    }
    float angle = 0;
    @Override
    public void draw() {
        background(255);
        fill(127);
        stroke(0);
        rectMode(CENTER);
        translate(width / 2, height / 2);
        rotate(angle);

        line(-50, 0, 50, 0);
        stroke(0);
        strokeWeight(2);
        fill(127);
        ellipse(50, 0, 16, 16);
        ellipse(-50, 0, 16, 16);
        angle += 0.05;

    }
    public static void main(String[] args) {
        PApplet.main(new String[]{"oscillation.Baton"});
    }

}
