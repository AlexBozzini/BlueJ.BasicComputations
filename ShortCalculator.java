

import java.util.Scanner;
public class ShortCalculator {
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers (range:0-65535)");

        int x = in.nextInt();
        int y = in.nextInt();

        short xShort = (short) x;
        short yShort = (short) y;

        short sum = (short)(xShort + yShort);
        short difference = (short)(xShort - yShort);
        short product = (short)(xShort * yShort);
        short quotient = (short)(xShort / yShort);
        short remainder = (short)(xShort % yShort);

        System.out.println(sum);
        System.out.println(difference);
        System.out.println(product);
        System.out.println(quotient);
        System.out.println(remainder);
    }
}
