package callByReference;

public class objectPassing {
    int a, b;

    objectPassing(int k, int l) {
        a = k;
        b = l;
    }

    // here passing the object in method
    public void meth(objectPassing obj) {
        obj.a *= 10;
        obj.b *= 10;
        // here in meth method object is passed
    }

}
