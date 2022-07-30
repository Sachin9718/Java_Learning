package string;
import java.util.Scanner;
public class twentyOne {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String delFirstCharStr;
        char del_ch;
        System.out.print("\nPlease Enter String to Delete First Character =  ");
        delFirstCharStr = sc.nextLine();

        System.out.print("\nEnter the Character to Delete =  ");
        del_ch = sc.next().charAt(0);

        StringBuilder sb = new StringBuilder(delFirstCharStr);
        int i = delFirstCharStr.indexOf(del_ch);
        sb.deleteCharAt(i);
        System.out.println("\nFirst Occurance deleted: " + del_ch + " = " + sb);
        int j = delFirstCharStr.lastIndexOf(del_ch);
        sb.deleteCharAt(j);
        System.out.println("\nLast Occurance deleted " + del_ch + " = " + sb);
        sc.close();
    }
}
