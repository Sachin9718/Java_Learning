package Interface.variables;

import java.util.Random;

public class DecissionMaker implements SharedConstants {
    Random rand = new Random();

    int ask() {

        int prob = (int) (100 * rand.nextInt());

        if (prob < 30) return NO;
        else if (prob < 60) return YES;
        else if (prob < 70) return MAYBE;
        else if (prob < 85) return SOON;
        else if (prob < 90) return LATER;
        else if (prob < 100) return NEVER;
        else return 0;

    }
}
