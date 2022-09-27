// конструкції try-finally.
// Перехоплення покинутого виключення catch не проводиться.
// Секція finally виконується завжди.
// Приклад 2.8.Генерація виключення у методі.
public class Main {
    public static class Except1 {
    public static int m() {
        try {
            System.out.println("0");
            throw new RuntimeException();
        } finally {
            System.out.println("1");
        }
    }
}
    public static void main(String[] args) {
        System.out.println(Except1.m());
    }
}