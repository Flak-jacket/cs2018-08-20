package by.it.vladimirov.lesson03;

/*
Lesson 03. Task B2. Нужно написать программу, которая вводит три числа  a b c типа int с клавиатуры
и вычисляет корни квадратного уравнения a*a*x + b*x + c = 0:
1) Если два корня, то выводится два корня через пробел.
2) Если один корень, то выводится только одно число - корень.
3) Если нет действительных корней, то выводится сообщение об ошибке "Отрицательный дискриминант"

В программе должен быть определен статический метод dis вычисления дискриминанта,
который принимает на входе три числа типа int a,b,c
а на выходе возвращает число типа double

Примеры работы

Ввод:
2 5 3
Вывод:
-1.0 -1.5

Ввод:
2 4 2
Вывод:
-1.0

Ввод:
2 2 2
Вывод:
Отрицательный дискриминант

*/
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskB2
{
    static int a, b, c;
    static float d;
    static double x1, x2;

    public static void main(String args []) throws IOException
    {
        try{
            Scanner s = new Scanner(System.in);
            a = s.nextInt();
            b = s.nextInt();
            c = s.nextInt();
            System.out.println("Ввод:\n"+a+" " + b+" " + c);

            d = (b * b) - (4 * a * c);
            System.out.println("Вывод:");

            if(d < 0)
                System.out.print("Отрицательный дискриминант");
            else
            if(d == 0)
            {
                x1 = (-b) / (2 * a);
                System.out.println (x1);
            }
            else
            {
                x1 = (-b + Math.sqrt(d)) / (2 * a);
                x2 = (-b - Math.sqrt(d)) / (2 * a);
                if (x1 == x2)
                    System.out.println ("x1 = x2 " + x1);
                else
                    System.out.println (x1 + " " + x2);
            }
        }catch(InputMismatchException e){System.out.println("Отрицательный дискриминант");}
    }
}

