package gt.com.acta.christmastreeapp;

import java.util.*;

public class ChristmasTreeFactory {

    public ChristmasTreeFactory() {
    }

    public IChristmasTree getChristmasTree(ChristmasTreeType christmasTreeType) {
        switch(christmasTreeType){
		case WhitePineTree:{
			return new WhitePineTree();
		}
		case ScotchPineTree:{
			return new ScotchPineTree();
		}
		case SpruseTree:{
			return new SpruseTree();
		}
		case ParsnipTree:{
			return new ParsnipTree:();
		}
		case FraserFirTree:{
			return new FraserFirTree:();
		}
	}
        return null;
    }

}