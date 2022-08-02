package Patterns;

public class q53 {
    public static void main(String[] args) {
        a();
        b();
        c();
        // d();  -> Question ask to chandresh sir
        e();
    }

    public static void a() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("1");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void b() {
        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void c() {
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void d() {
        int k = 1;
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6; j++) {
                if(k==1){
                    System.out.print("1");
                }
                if(j==0){
                    System.out.println("0");
                }

            }

            System.out.println();
        }
        System.out.println();
    }

    public static void e() {
        int k = 1;
        for (int i = 1; i < 6; i++) {
            int l = k;
            for (int j = 1; j < 6; j++) {
                System.out.print(l);
                l++;
            }
            k++;

            System.out.println();
        }
        System.out.println();
    }


















}
