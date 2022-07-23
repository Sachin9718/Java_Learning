package callByReference;

public class passObjectReference {
    public static void main(String[] args) {
        objectPassing obj = new objectPassing(10, 10);


        System.out.println("obj.a  and obj.b before calling method -> " + obj.a + " " + obj.b);

        obj.meth(obj);

        System.out.println("obj.a  and obj.b after calling method -> " + obj.a + " " + obj.b);
    }
    // here we passing the whole object in the meth method 
    // so all the action in meth will effect on object data variables
}
