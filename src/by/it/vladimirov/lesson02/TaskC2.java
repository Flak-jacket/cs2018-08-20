package by.it.vladimirov.lesson02;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и 4 раза выводит их сумму с обозначением системы счисления на экран в
ДЕСЯТИЧНОМ ДВОИЧНОМ ШЕСТНАДЦАТИРИЧНОМ ВОСЬМИРИЧНОМ виде

Вот пример ввода с клавиатуры:
34 26

Тогда вывод ожидается такой (обратите внимание на регистр букв):
DEC:34+26=60
BIN:100010+11010=111100
HEX:22+1a=3c
OCT:42+32=74
*/
import java.util.Locale;
import java.util.Scanner;
class TaskC2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int s=x+y;
            System.out.printf("DEC:%d+%d=%d\n", x, y, s);
        System.out.print("BIN:");
        String convert = Integer.toBinaryString(x);
        System.out.print(convert);
        System.out.print("+");
        convert = Integer.toBinaryString(y);
        System.out.print(convert);
        System.out.print("=");
        convert = Integer.toBinaryString(s);
        System.out.println(convert);
        System.out.print("HEX:");
        convert = Integer.toHexString(x).toUpperCase();
        System.out.print(convert.toLowerCase());
        System.out.print("+");
        convert = Integer.toHexString(y).toUpperCase();
        System.out.print(convert.toLowerCase());
        System.out.print("=");
        convert = Integer.toHexString(s).toUpperCase();
        System.out.println(convert.toLowerCase());
        System.out.print("OCT:");
        convert = Integer.toOctalString(x);
        System.out.print(convert.toLowerCase());
        System.out.print("+");
        convert = Integer.toOctalString(y);
        System.out.print(convert.toLowerCase());
        System.out.print("=");
        convert = Integer.toOctalString(s);
        System.out.println(convert.toLowerCase());
    }
}
