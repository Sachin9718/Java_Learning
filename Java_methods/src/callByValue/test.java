package callByValue;


public class test {
    public void meth(int i, int j) {
        i *= 10;
        j += 10;
        System.out.println("i and j inside the meth method -> " + i + " " + j);
    }
}
