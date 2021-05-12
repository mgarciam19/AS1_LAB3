package gt.com.acta.christmastreeapp;

import java.util.*;

public class LightsDecorator extends ChristmasTreeDecorator {

    public LightsDecorator() {
    }

    public void addLights(IChristmasTree christmasTree) {
        System.out.println("Colocando luces sobre: " + christmasTree);
    }

}