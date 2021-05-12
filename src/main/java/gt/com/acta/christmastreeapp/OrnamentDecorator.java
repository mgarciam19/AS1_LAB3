package gt.com.acta.christmastreeapp;

import java.util.*;

public class OrnamentDecorator extends ChristmasTreeDecorator {

    public OrnamentDecorator() {
    }

    public void addOrnament(IChristmasTree christmasTree) {
        System.out.println("Colocando adornos de Ornamento sobre: " + christmasTree);
    }

}