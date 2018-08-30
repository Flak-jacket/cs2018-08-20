package by.it.vladimirov.lesson05;

/*
Один большой массив и два маленьких
1. Создать массив m на 20 целых чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива a и b на 10 целых чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький,
    вторую половину во второй маленький.
5. Вывести массивы a и b на экран командами:
        System.out.println("a="+Arrays.toString(a));
        System.out.println("b="+Arrays.toString(b));

Например, для такого ввода
1 2 3 4 5 6 7 8 9 10 11 22 33 44 55 66 77 88 99 0

ожидается такой вывод:
a=[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
b=[11, 22, 33, 44, 55, 66, 77, 88, 99, 0]

*/



/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class TaskB2 {
    public static void main(String[] args) throws Exception
        {
            int [] bigArray = new int [20];
            int [] smallArray1 = new int [10];
            int [] smallArray2 = new int [10];

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            for (int i=0; i < bigArray.length; i++) {
                bigArray[i] = Integer.parseInt(reader.readLine());
            }

            smallArray1 = Arrays.copyOfRange(bigArray, 0, 10);
            smallArray2 = Arrays.copyOfRange(bigArray, 10, 20);


            System.out.println("a="+Arrays.toString(smallArray1));
            System.out.println("b="+Arrays.toString(smallArray2));
        }
    }

