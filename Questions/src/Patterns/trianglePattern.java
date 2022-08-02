package Patterns;

public class trianglePattern {
    public static void main(String[] args) {
        a();
        b();
        c(); //-> to chandresh sir
        d();
        e();
        
    }

    private static void a() {
        int l = 1;
        for (int i = 1; i < 6; i++) {
            int j = 1;
            for (int k = 0; k < l; k++) {
                System.out.print(j);
                j++;
            }
            l+=2;
            System.out.println();
        }
        System.out.println();
    }

    private static void b() {
        int l = 1;
        for (int i = 1; i < 6; i++) {
            int j = 1;
            for (int k = 1; k < l; k++) {
                System.out.print(j);
                j++;
            }
            l++;
            int m = j;
            for (int k = 1; k < l; k++) {
                System.out.print(m);
                m--;
            }
            System.out.println();

        }
        System.out.println();
    }
    
    private static void c() {
        for (int i = 1; i < 6; i++) {
            int k = 0;
            int n = 1;
            for (int j = 0; j < k; j++) {
                System.out.print(n);
            }
            System.out.println();
        }
    }
    
    private static void d() {
        int l = 1;
        for (int i = 1; i < 6; i++) {
            int j = 1;
            for (int k = 1; k < l; k++) {
                System.out.print(j);
                j+=2;
            }
            l++;
            int m = j;
            for (int k = 1; k < l; k++) {
                System.out.print(m);
                m-=2;
            }
            System.out.println();

        }
        System.out.println();
    }

    private static void e() {
        for (int i = 0; i < 5; i++) {
            int l = 1;
            int n = 1;
            for (int j = 0; j <= l; j++) {
                System.out.print(n);
                n++;
            }
            l++;
            System.out.println();
        }
    }


}
