package vectors;

import processing.core.PApplet;

public class VectorSub extends PApplet{

    @Override
    public void settings() {
        size(600,300);
    }

    PVector center;
    @Override
    public void setup() {
        frameRate(10);
        center = new PVector(width/2,height/2);
    }

    @Override
    public void draw() {
        background(255);
        PVector mouse = new PVector(mouseX, mouseY);

        mouse.sub(center);

        translate(width/2,height/2);
        strokeWeight(2.0f);
        stroke(0);
        line(0,0,mouse.x, mouse.y);


    }


    public static void main(String[] args) {
        PApplet.main(new String[]{"vectors.VectorSub"});
    }
}
