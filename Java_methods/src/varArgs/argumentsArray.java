package varArgs;

public class argumentsArray {
    // use an array to pass large number of arguments to a method
    // This method is old and very tedius

    public void meth(int arr[]) {
        System.out.print("Number of arguments are: " + arr.length +" contents: " );

        for(int x : arr){
            System.out.print(x + " ");   
        }
        System.out.println();
    }

}
