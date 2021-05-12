package gt.com.acta.christmastreeapp;

import java.util.*;

public class GiftsDecorator extends ChristmasTreeDecorator {

    public GiftsDecorator() {
    }

    public void addGifts(IChristmasTree christmasTree) {
        System.out.println("Colocando regalos bajo: " + christmasTree);
    }

}