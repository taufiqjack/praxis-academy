package generic;

/**
 * SimpleGeneric
 */
public class SimpleGeneric {

    public static void main(String[] args) {
        SimpleGen<String> sgs = new SimpleGen<String>("JAVA2NOVICE");
        sgs.printType();
        SimpleGen<Boolean> sgb = new SimpleGen<Boolean>(Boolean.TRUE);
        sgb.printType();
    }
}
