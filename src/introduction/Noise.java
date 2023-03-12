package introduction;

import processing.core.PApplet;

public class Noise extends PApplet {
    @Override
    public void settings() {
        size(600,300);
    }

    @Override
    public void setup() {
        frameRate(10);
        background(255);
    }

    float t1 = 0f;
    float t2 = 1000f;

    @Override
    public void draw() {
        float n1= noise(t1);
        float n2 = noise(t2);
        float x = map(n1, 0, 1, 0, width);
        float y = map(n2, 0, 1, 0, height);

        ellipse(x, y, 16, 16);

        t1 += 0.01f;
        t2 += 0.01f;
    }

    public static void main(String[] args) {
        PApplet.main(new String[]{"introduction.Noise"});
    }
}
