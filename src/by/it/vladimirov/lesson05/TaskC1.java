package by.it.vladimirov.lesson05;
/*
Три массива
1.  Введите с клавиатуры 20 чисел, сохраните их в список и рассортируйте по трём другим спискам:
    Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
    Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2.  Статический метод void printList(List<Integer> list) должен выводить на экран
    все элементы переданного ему списка list, каждый элемент - с новой строки.
3.  Используя метод printList выведите ваши три списка на экран.
    Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

import java.util.List;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.lang.Integer;
public class TaskC1 {
    public static void main(String[] args) throws Exception
    {
        //add your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer>list = new ArrayList<>();
        List<Integer>two = new ArrayList<>();
        List<Integer>three = new ArrayList<>();
        List<Integer>other = new ArrayList<>();

        for(int i = 0; i < 20; i++){
            int a = Integer.parseInt(br.readLine());
            list.add(a);
        }

        for(int i = 0; i < list.size(); i++){
            Integer x = list.get(i);
            if(x % 3 ==0 && x % 2 == 0){
                three.add(x);
                two.add(x);
            }

            else if(x%3==0)
                three.add(x);

            else if(x%2==0){
                two.add(x);

            }else{
                other.add(x);
            }
        }
        printList(three);
        printList(two);
        printList(other);
    }


    public static void printList(List list) {
        for(int i = 0;i < list.size(); i++){
            System.out.println(list.get(i));
        }

    }
}

