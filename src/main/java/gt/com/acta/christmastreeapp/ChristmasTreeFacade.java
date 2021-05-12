package gt.com.acta.christmastreeapp;

import java.util.*;

public class ChristmasTreeFacade {

    private List<IChristmasTree> christmasTrees;

    public ChristmasTreeFacade() {
        ChristmasTreeFactory factory = new ChristmasTreeFactory();
        this.christmasTrees.add(factory.getChristmasTree(ChristmasTreeType.ParsnipTree));
        this.christmasTrees.add(factory.getChristmasTree(ChristmasTreeType.FraserFirTree));
        this.christmasTrees.add(factory.getChristmasTree(ChristmasTreeType.ScotchPineTree));
        this.christmasTrees.add(factory.getChristmasTree(ChristmasTreeType.SpruceTree));
        this.christmasTrees.add(factory.getChristmasTree(ChristmasTreeType.WhitePineTree));
    }

    public void placeSpruseTree() {
        // TODO implement here
        
    }

    public void placeParsnipTree() {
        // TODO implement here
    }

    public void placeWhitePineTree() {
        // TODO implement here
    }

    public void placeFraserFirTree() {
        // TODO implement here
    }

    public void placeScotchPineTree() {
        // TODO implement here
    }

}