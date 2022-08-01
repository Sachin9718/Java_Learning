package loops;

import java.util.Scanner;

public class twentyOne_thirtyFour {
    private static Scanner sc;

    public static void main(String[] args) {
        // NOTE! -> access the methods one by one only
        // power();
        // factor();
        // factorial();
        // HCF();
        // LCM();
        // prime();
        // primeall();
        // primefactors();
        // armstrong();
        // armstrongall();
        // perfectnum();
        // perfectnumall();
        // strong();
        // stringall();
        // fibbinaci();
        // BinOct();
        // BinDec();
        // BinHex();
        // OctBin();
        // OctDec();
        // OctHex();
        // DecBin();
        // DecHex();
        // HexBin();
        // HexOct();
        // HexDec();
    }

    // Twenty One
    public static void power() {
        // Scanner sc = new Scanner(System.in);
        sc = new Scanner(System.in);
        System.out.print("Number: ");
        int num = sc.nextInt();
        System.out.print("Power: ");
        int pow = sc.nextInt();
        int result = 1;
        for (int i = pow; i > 0; i--) {
            result *= num;
        }
        System.out.println("Result: " + result);
        // sc.close();
        System.out.println();
    }

    // Twenty two and Twenty three
    public static void factor() {
        sc = new Scanner(System.in);
        System.out.println("Facotor: ");
        int number = sc.nextInt();
        System.out.print("Factors of " + number + " are: ");

        for (int i = 1; i <= number; ++i) {

            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
        // sc.close();
        System.out.println();

    }

    // Twenty four
    public static void factorial() {
        sc = new Scanner(System.in);
        System.out.print("Factorial: ");
        int num = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }

        System.out.print("\nFactorial Is = " + fact);
        // sc.close();
        System.out.println();
    }

    // twenty five
    public static void HCF() {
        sc = new Scanner(System.in);
        System.out.println("Enter two numbers two find HCf: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int hcf = 0;
        for (int i = 1; i <= a || i <= b; i++) {
            if (a % i == 0 && b % i == 0)
                hcf = i;
        }
        System.out.println("HCF of given two numbers is ::" + hcf);
        System.out.println();
        // sc.close();
    }

    // Twenty six
    public static void LCM() {
        sc = new Scanner(System.in);
        System.out.println("Enter two numbers to find LCM: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max;
        int step;
        int lcm = 0;

        if (a > b) {
            max = step = a;
        } else {
            max = step = b;
        }

        while (a != 0) {
            if (max % a == 0 && max % b == 0) {
                lcm = max;
                break;
            }
            max += step;
        }
        System.out.println("LCM of given numbers is :: " + lcm);
    }

    // Twenty seven
    public static void prime() {
        sc = new Scanner(System.in);
        System.out.print("Numebr for prime: ");
        int num = sc.nextInt();

        for (int i = 2; i <= num / i;) {
            if (num % i == 0) {
                System.out.println("Prime number ");
                break;
            } else {
                System.out.println("Not a Prime number");
                break;
            }
        }
        System.out.println();
    }

    // Twenty eight and Twenty nine
    public static void primeall() {
        sc = new Scanner(System.in);
        System.out.print("Enter number for all Prime: ");
        int num = sc.nextInt();
        int count;
        int sum = 0;
        for (int number = 1; number <= num; number++) {
            count = 0;
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0 && number != 1) {
                System.out.print(number + " ");
                sum += number;
            }
        }
        System.out.println("\nSum of all prime numbers: " + sum);
        System.out.println();

    }

    // thrirty
    private static void primefactors() {
        sc = new Scanner(System.in);
        System.out.println("Enter a number ::");
        int number = sc.nextInt();

        for (int i = 2; i < number; i++) {
            while (number % i == 0) {
                System.out.println(i + " ");
                number = number / i;
            }
        }
        if (number > 2) {
            System.out.println(number);
        }
    }

    // thirty one
    private static void armstrong() {
        sc = new Scanner(System.in);
        System.out.println("Armstrong number:");
        int number = sc.nextInt();
        int originalNumber, remainder, result = 0;

        originalNumber = number;

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if (result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");

        System.out.println();

    }

    // thirty two
    private static void armstrongall() {
        sc = new Scanner(System.in);
        System.out.print("To print all armstrong number: ");
        int arm = sc.nextInt();

        int n, b, sum = 0;
        for (int i = 1; i <= arm; i++) {
            n = i;
            while (n > 0) {
                b = n % 10;
                sum = sum + (b * b * b);
                n = n / 10;
            }
            if (sum == i) {
                System.out.print(i + " ");
            }
            sum = 0;
        }
        System.out.println();
    }

    // thirty three
    private static void perfectnum() {
        sc = new Scanner(System.in);
        System.out.print("Find Perfect num: ");
        int sum = 0;

        int num = sc.nextInt();

        // Calculate sum of all proper divisors
        for (int i = 1; i < num; i++) {

            if (num % i == 0) {
                sum += i;
            }
        }
        if (sum == num) {
            System.out.println(num + " is PERFECT NUMBER");
        } else {
            System.out.println(num + " is NOT PERFECT NUMBER");
        }
        System.out.println();
    }

    // Thirty four
    private static void perfectnumall() {
        sc = new Scanner(System.in);
        System.out.println("All Perfect num: ");
        int number = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i) {
                System.out.println(i + " ");
            }
        }
        System.out.println();
    }

    // Thirty five
    private static void strong() {
        int Number, Temp, Reminder, Sum = 0, i, Factorial;
        sc = new Scanner(System.in);

        System.out.print(" Enter Number: ");
        Number = sc.nextInt();
        Temp = Number;
        while (Temp > 0) {
            Factorial = 1;
            i = 1;
            Reminder = Temp % 10;
            while (i <= Reminder) {
                Factorial = Factorial * i;
                i++;
            }
            Sum = Sum + Factorial;
            Temp = Temp / 10;
        }

        if (Number == Sum) {
            System.out.println("\n " + Number + " is a Strong Number");
        } else {
            System.out.println("\n " + Number + " is Not a Strong Number");
        }
    }

    // Thirty six
    private static void stringall() {
        sc = new Scanner(System.in);
        System.out.println("Enter num for all strong numbers: ");
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {

        }
    }

    // Thirty seven
    private static void fibbinaci() {
        sc = new Scanner(System.in);
        int t1 = 0, t2 = 1;
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt(); // Declare and Initialize the number of terms
        System.out.print("First " + n + " terms of fibonnaci series: ");
        // Print the fibonacci series
        for (int i = 1; i <= n; ++i) {
            System.out.print(t1 + " ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }

    // Fourty
    private static void BinOct() {
        int bin, i = 1, j;
        int oct[] = new int[100];
        sc = new Scanner(System.in);
        System.out.print("Enter the Binary Number : ");
        bin = sc.nextInt();
        while (bin != 0) {
            oct[i++] = bin % 8;
            bin = bin / 8;
        }
        System.out.print("The Octal number is: ");
        for (j = i - 1; j > 0; j--) {
            System.out.print(oct[j]);
        }
    }

    // Fourty one
    private static void BinDec() {
        sc = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        int n = sc.nextInt();

        int decimal = 0, p = 0;

        while (n != 0) {
            decimal += ((n % 10) * Math.pow(2, p));
            n = n / 10;
            p++;
        }

        System.out.println("Decimal :" + decimal);
    }

    // Fourty two
    private static void BinHex() {
        int[] hex = new int[1000];
        int i = 1, j = 0, rem, dec = 0, bin;
        sc = new Scanner(System.in);
        System.out.print("Input a Binary Number: ");
        bin = sc.nextInt();
        while (bin > 0) {
            rem = bin % 2;
            dec = dec + rem * i;
            i = i * 2;
            bin = bin / 10;
        }
        i = 0;
        while (dec != 0) {
            hex[i] = dec % 16;
            dec = dec / 16;
            i++;
        }
        System.out.print("HexaDecimal value: ");
        for (j = i - 1; j >= 0; j--) {
            if (hex[j] > 9) {
                System.out.print((char) (hex[j] + 55) + "\n");
            } else {
                System.out.print(hex[j] + "\n");
            }
        }
    }

    // Fourty three
    private static void OctBin() {
        sc = new Scanner(System.in);
        System.out.print("Octal: ");
        int num = sc.nextInt();
        System.out.println("Binary: " + Integer.toBinaryString(num));
    }

    // Fouty four
    private static void OctDec() {
        sc = new Scanner(System.in);
        System.out.print("Octal: ");
        int onum = sc.nextInt();
        int num = 0;
        int p = 0;
        while (true) {
            if (onum == 0) {
                break;
            } else {
                int temp = onum % 10;
                num += temp * Math.pow(8, p);
                onum = onum / 10;
                p++;
            }
        }
        System.out.println("Decimal: " + num);
    }

    // Fourty five
    private static void OctHex() {
        String octnum, hexnum;
        int decnum;
        Scanner scan = new Scanner(System.in);

        // Taking 5123 as an example of
        // Octal Number.
        octnum = "5123";

        // Convert Octal to Decimal
        decnum = Integer.parseInt(octnum, 8);

        // Convert Decimal to Hexadecimal
        hexnum = Integer.toHexString(decnum);

        System.out.print("Equivalent Hexadecimal Value = " + hexnum);
    }

    // Fourty six
    private static void DecBin() {
        int dec = 25;
        // converting to binary and representing it in a string
        String bin = Integer.toBinaryString(dec);
        System.out.println(bin);
    }

    // Fourty seven
    private static void DecHex() {
        sc = new Scanner(System.in);
        System.out.print("Enter a decimal number : ");
        // read the decimal number
        int nbr = sc.nextInt();
        String str = Integer.toHexString(nbr);
        System.out.println("The hexadecimal number is : " + str);
    }

    // Forty eight
    private static void HexBin() {
        int i = 0, len;
        String hexadecimal;

        sc = new Scanner(System.in);

        System.out.print("Enter the Hexadecimal Number: ");
        hexadecimal = sc.nextLine();

        len = hexadecimal.length();
        char[] hexDigit = hexadecimal.toCharArray();

        System.out.print("\nEquivalent Binary Value = ");
        while (i < len) {
            switch (hexDigit[i]) {
                case '0':
                    System.out.print("0000");
                    break;
                case '1':
                    System.out.print("0001");
                    break;
                case '2':
                    System.out.print("0010");
                    break;
                case '3':
                    System.out.print("0011");
                    break;
                case '4':
                    System.out.print("0100");
                    break;
                case '5':
                    System.out.print("0101");
                    break;
                case '6':
                    System.out.print("0110");
                    break;
                case '7':
                    System.out.print("0111");
                    break;
                case '8':
                    System.out.print("1000");
                    break;
                case '9':
                    System.out.print("1001");
                    break;
                case 'a':
                case 'A':
                    System.out.print("1010");
                    break;
                case 'b':
                case 'B':
                    System.out.print("1011");
                    break;
                case 'c':
                case 'C':
                    System.out.print("1100");
                    break;
                case 'd':
                case 'D':
                    System.out.print("1101");
                    break;
                case 'e':
                case 'E':
                    System.out.print("1110");
                    break;
                case 'f':
                case 'F':
                    System.out.print("1111");
                    break;
                default:
                    System.out.println("\nInvalid Hexadecimal Digit!");
                    return;
            }
            i++;
        }
    }

    // Forty nine
    private static void HexOct() {
        int decimal = 0, rem, i = 0, len;
        String hexadecimal;
        int[] octal = new int[20];

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the Hexadecimal Number: ");
        hexadecimal = s.nextLine();

        len = hexadecimal.length();
        len--;

        while (len >= 0) {
            rem = hexadecimal.charAt(len);
            if (rem >= 48 && rem <= 57)
                rem = rem - 48;
            else if (rem >= 65 && rem <= 70)
                rem = rem - 55;
            else if (rem >= 97 && rem <= 102)
                rem = rem - 87;
            else {
                System.out.println("\nInvalid Hexadecimal Digit!");
                return;
            }
            decimal = (int) (decimal + (rem * Math.pow(16, i)));
            i++;
            len--;
        }

        i = 0;
        while (decimal != 0) {
            octal[i] = decimal % 8;
            i++;
            decimal = decimal / 8;
        }

        System.out.print("\nEquivalent Octal Value = ");
        for (i = (i - 1); i >= 0; i--)
            System.out.print(octal[i]);
    }

    // Fifty
    private static void HexDec() {
        sc = new Scanner(System.in);
        System.out.print("Enter any hexadecimal number: ");
        String hexnum = sc.nextLine();
        sc.close();

        // converting hex to decimal by passing base 16
        int num = Integer.parseInt(hexnum, 16);

        System.out.print("Decimal : " + num);

    }

}
