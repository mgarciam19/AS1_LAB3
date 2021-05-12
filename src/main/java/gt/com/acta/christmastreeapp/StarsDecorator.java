package gt.com.acta.christmastreeapp;

import java.util.*;

public class StarsDecorator extends ChristmasTreeDecorator {

    public StarsDecorator() {
    }

    public void addStars(IChristmasTree christmasTree) {
        System.out.println("Colocando la Estrella sobre la punta del : " + christmasTree);
    }

}