/*
                                ЗАВДАННЯ
Завдання 2.Для програми згідно з заданим варіантом:
•	визначити експериментально, помилки яких класів буде згенеровано;
•	створити обробники виняткових ситуацій з використанням виявлених класів
    та всіх секцій конструкції обробника з відповідними повідомленнями,
    що дозволяють коректно виконати програму.

Завдання виконати у вигляді двох проектів:
1)	без використання власних методів
2)	з використанням методів для кожної підзадачі, які можуть генерувати
    виняткову ситуацію.

У програмі, яка обчислює середнє значення серед негативних елементів одновимірного масиву,
що вводиться з клавіатури (тип елементів int), можуть виникати помилки в таких випадках:
–	введення рядка замість числа;
–	невідповідність числового типу даних;
–	негативні елементи відсутні.
*/

import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n;
        Scanner sctxt = new Scanner(System.in);
        System.out.print("Ведіть розмір масива: ");
        try{
            n  = sctxt.nextInt(); // ввод размера массива
            int[] arr = new int[n];
            if(n !=0 ){
            System.out.println("Заповніть матрицю: ");
                for (int i = 0; i < n; i++) { // заполнение массива числами
                     System.out.print("Ведіть елемент a[" + + (i+1) + "] = ");
                     try {
                         arr[i] = sctxt.nextInt();
                     } catch (InputMismatchException e) {
                         System.out.println("Помилка: Ви ввели рядок замість числа");
                         System. exit(0); // принудительно завершаем работу программы
                          }
                } System.out.println("Массив: ");
            } else  System.out.println("Помилка: Ви ввели нуль! "); // вывод массива на консоль
             for (int i = 0; i < n; i++){
                  System.out.print(arr[i] + "\t");
              } System.out.println();

            double average = 0; // результат ср.арифметич.
            int negative_count = 0; // счетчик отрицательных чисел в массиве
            try {
            if (arr.length > 0) {
                double sum = 0;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] < 0) {
                        sum += arr[j];
                        negative_count++; // считаем ко-во отрицательных чисел в массиве
                    }
                } average = (sum/negative_count); // ср.арифметич. только отрицательных чисел
            }  else System.out.println("Була допущена помилка");
            } catch (IllegalArgumentException ill) {
                throw new RuntimeException(ill);
            }
            if (negative_count <= 0) {
                throw new IllegalArgumentException("Немає негативних чисел!");
            }
            System.out.println("Середнє значення серед негативних елементів  = " + average);
        }
        catch (InputMismatchException e) {
            System.out.println("Помилка: Ви ввели неправильне значення розміру массива" +
                    "\n\t\tнеправильний тип даних.\n");
            System. exit(0); // принудительно завершаем работу программы
             }
        catch (IllegalArgumentException e){
            System.out.println("Помилка в самій програмі! " + e);
        }  finally {
            System. exit(0);
        }
    }
}