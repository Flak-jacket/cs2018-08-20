package by.it.vladimirov.lesson05;

/*
Создайте список строк.
Вводите строки с клавиатуры, пока пользователь не введет слово END.
Каждую введенную строку, кроме слова END добавьте в список типа ArrayList.

Напечатайте список, не используйте для этого цикл.
Список - это объект. Его можно просто напечатать, как переменную.

Для вот такого ввода:
ONE
TWO
THREE
FOUR
FIVE
END
Ожидается такой вывод:
[ONE, TWO, THREE, FOUR, FIVE]

*/
import java.util.ArrayList;
import java.util.Scanner;
public class TaskA2 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        Scanner in = new Scanner(System.in);

        while(true)
        {
            String line= in.nextLine();
            if (line.equals("END"))
                System.out.println(line);
            System.out.println(line);
                break;

            list.add(line);

        }
    }

}
