package by.it.vladimirov.lesson04;

/*

На входе вводится число и месяц 2018 года.
Программа должна выводить номер дня года, считая 1 января первым днем,
а 31 декабря 365-м.

Пример:
Ввод:
1 1

Вывод
1

Ввод:
31 12

Вывод
365

Ввод:
13 9

Вывод
256

 */
import java.util.Scanner;
public class TaskC2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
                int y = in.nextInt();
        int x = in.nextInt();
        int summ=0;
        if (x==1) {
        summ=0+y;
        System.out.println(summ);}
        else if (x==2){
        summ=31+y;
        System.out.println(summ);}
        else if (x==3){
            summ=59+y;
            System.out.println(summ);}
        else if (x==4){
            summ=90+y;
            System.out.println(summ);}
        else if (x==5){
            summ=120+y;
            System.out.println(summ);}
        else if (x==6){
            summ=151+y;
            System.out.println(summ);}
        else if (x==7){
            summ=181+y;
            System.out.println(summ);}
        else if (x==8){
            summ=212+y;
            System.out.println(summ);}
        else if (x==9){
            summ=243+y;
            System.out.println(summ);}
        else if (x==10){
            summ=273+y;
            System.out.println(summ);}
        else if (x==11){
            summ=304+y;
            System.out.println(summ);}
        else if (x==12){
            summ=334+y;
            System.out.println(summ);}
            else
            System.out.println("Введите верную дату");


    }
}
