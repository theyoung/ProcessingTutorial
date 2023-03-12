package introduction;

import processing.core.PApplet;

public class RandomDistribution extends PApplet {

    float[] randomCounts;

    @Override
    public void settings() {
        size(640,360);
    }

    @Override
    public void setup(){
        randomCounts = new float[20];
    }

    @Override
    public void draw(){
        background(255);

        int index = (int)random(randomCounts.length);
        randomCounts[index]++;

        stroke(0);
        strokeWeight(2);
        fill(127);

        int w = width / randomCounts.length;

        for(int x = 0; x < randomCounts.length; x++){
            rect(x*w, height - randomCounts[x],w-1,randomCounts[x]);
        }
    }
}
