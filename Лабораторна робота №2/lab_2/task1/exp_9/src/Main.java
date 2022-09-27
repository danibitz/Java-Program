/*
 конструкції try-finally.
 Перехоплення покинутого виключення catch не проводиться.
 Секція finally виконується завжди.

 Приклад 2.9.
 Генерація виняткової ситуації у методі
 та додаткове використання оператора return.
*/

public class Main {
    public static class Except2{
        public static int m(){
            try {
                System.out.println("0");
                return 55;		// вихід із методу
            }
            finally {
                System.out.println("1");
            }
        }
        public static void main(String[] args){
            System.out.println(m());
        }
    }
}