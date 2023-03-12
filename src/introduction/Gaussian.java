package introduction;

import processing.core.PApplet;

import java.util.Random;

public class Gaussian extends PApplet {

    Random generator;

    @Override
    public void settings() {
        size(640, 360);
        generator = new Random();

    }

    @Override
    public void setup() {

        background(255);
        frameRate(10);
    }

    @Override
    public void draw() {
        // Get a gaussian random number w/ mean of 0 and standard deviation of 1.0
        float xloc = randomGaussian();

        float sd = 60;                // Define a standard deviation
        float mean = width/2;         // Define a mean value (middle of the screen along the x-axis)
        xloc = ( xloc * sd ) + mean;  // Scale the gaussian random number by standard deviation and mean

        fill(0, 10);
        noStroke();
        ellipse(xloc, height/2, 16, 16);   // Draw an ellipse at our "normal" random position

    }

    public static void main(String[] args) {
        PApplet.main(new String[]{"introduction.Gaussian"});
    }
}
