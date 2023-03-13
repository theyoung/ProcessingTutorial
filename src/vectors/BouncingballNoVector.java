package vectors;

import processing.core.PApplet;

public class BouncingballNoVector extends PApplet {
    @Override
    public void settings() {
        size(600, 300);
    }

    @Override
    public void setup() {
        frameRate(10);
        smooth();
    }

    float x = 100;
    float y = 100;
    float xSpeed = 2.5f;
    float ySpeed = 2.f;

    @Override
    public void draw() {
        background(255);

        x += xSpeed;
        y += ySpeed;

        if (width < x || x < 0) {
            xSpeed = xSpeed * -1;
        }
        if (height < y || y < 0) {
            ySpeed = ySpeed * -1;
        }

        stroke(0);
        strokeWeight(2);
        fill(127);
        ellipse(x,y, 48,48);
    }

    public static void main(String[] args) {
        PApplet.main(new String[]{"vectors.BouncingballNoVector"});
    }
}
