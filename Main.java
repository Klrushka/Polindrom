

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = new String();
        String STR = new String();

        str = input.nextLine();

        STR = str.toUpperCase(Locale.ROOT);

        char [] a = new char[1000];
        a = STR.toCharArray();

        StringBuilder StrBuilder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if ( a[i] >=  'A' && a[i] <= 'Z' || a[i] >= '0' && a[i] <= '9'){
                StrBuilder.append(a[i]);
            }
        }
        String First, Second;
       First =  StrBuilder.toString();
       StrBuilder.reverse();
       Second = StrBuilder.toString();
        System.out.println(First.equals(Second));
    }
}

