package by.it.vladimirov.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/
import java.util.Scanner;
import java.util.ArrayList;
public class TaskB1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        System.out.println(list.size());

        for (String s : list) {
            System.out.println(s);
        }
    }
}
