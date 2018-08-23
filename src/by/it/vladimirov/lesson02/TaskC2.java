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
import java.util.Scanner;
class TaskC2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int s=x+y;
            System.out.printf("DEC:%d \n", s);
        System.out.print("BIN:");
        String convert = Integer.toBinaryString(s);
        System.out.println(convert);
        System.out.print("HEX:");
        convert = Integer.toOctalString(s);
        System.out.println(convert);
        System.out.print("OCT:");
        convert = Integer.toHexString(s).toUpperCase();
        System.out.println(convert);

    }
}
