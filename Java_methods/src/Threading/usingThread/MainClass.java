package Threading.usingThread;
// Job 2 and Job 3 executing parallely 

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Start Main Thread");
        

        // This another class will run simultaneously but  the main class finish at last 
        // main class always terminate the program
        // job 2 a Thread
        System.out.println("Calling Second Thread");
        ThreadClass obj = new ThreadClass();
        obj.start();
        
        // job 3
        for (int i = 0; i < 10; i++) {
            System.out.println("# #Printer 1 : " + i);
        }

        
        System.out.println("Finish Main thread");
    }
}



