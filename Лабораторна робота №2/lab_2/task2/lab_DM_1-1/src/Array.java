import java.util.InputMismatchException;
import java.util.Scanner;
public class Array {
    private int n;
    private int[] arr;
    private Scanner sctxt = new Scanner(System.in);

    public  void enterArraySize(){  // ввод размера массива
        System.out.print("Ведіть розмір масива: ");
        try{
            n = sctxt.nextInt();
            arr = new int[n];
        } catch (InputMismatchException e) {
            System.out.println("Помилка: Ви ввели неправильне значення розміру массива" +
                    "\n\t\tнеправильний тип даних.\n");
            System. exit(0); // принудительно завершаем работу программы
        }
    }
    public void fillArray(){ // заполнение массива числами
        if(n !=0 ){
            System.out.println("Заповніть матрицю: ");
            for (int i = 0; i < n; i++){
                System.out.print("Ведіть елемент a[" + + (i+1) + "] = ");
                try {
                    arr[i] = sctxt.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Помилка: Ви ввели рядок замість числа");
                    System. exit(0); // принудительно завершаем работу программы
                }
            }
        } else  System.out.println("Помилка: Ви ввели нуль! "); // вывод массива на консоль
    }
    public void printArray() { // вывод массива на консоль
        if (n != 0) {
            System.out.println("Массив: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + "\t");
            }
            System.out.println();
        }
    }
    // обчислює середнє значення серед негативних елементів одновимірного масиву:
    public double printMidNumArray(){
        double average = 0;
        int negative_count = 0;
        if (arr.length > 0)
        {
            double sum = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] < 0) {
                    sum += arr[j];
                    negative_count++; // считаем ко-во отрицательных чисел в массиве
                }
            } average = (sum/negative_count); // ср.арифметич. только отрицательных чисел
        }
        else System.out.println("Була допущена помилка");
        if (negative_count <= 0) {
            throw new IllegalArgumentException("Немає негативних чисел!");
        }
        //System.out.println("Нет отрицательных чисел!");
        return  average;
    }
}
