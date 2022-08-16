package Ch_13_IO.IOStreams.InputStreams.ObjectInputStream;

import java.io.Serializable;

public class dog implements Serializable {
    String name;
    String breed;

    public dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
}
