package gt.com.acta.christmastreeapp;

import java.util.*;

public class AntiguaChristmasTreeApp {

    public AntiguaChristmasTreeApp() {
    }

    public static void main(String[] args) {
        // TODO implement here
	ChristmasTreeFactory christmasFactory = new ChristmasTreeFactory();
	ChristmasTreeFacade christmasFacade = new ChristmasTreeFacade();

	IChristmasTree Tree = christmasFactory.getChristmasTree(WhitePineTree);
	Tree1.place();


	IChristmasTree Tree2 = christmasFactory.getChristmasTree(ScotchPineTree);
	Tree2.place();


	IChristmasTree Tree3 = christmasFactory.getChristmasTree(SpruseTree);
	Tree3.place();


	IChristmasTree Tree4 = christmasFactory.getChristmasTree(ParsnipTree);
	Tree4.place();


	IChristmasTree Tree5 = christmasFactory.getChristmasTree(FraserFirTree);
	Tree5.place();
    }

}