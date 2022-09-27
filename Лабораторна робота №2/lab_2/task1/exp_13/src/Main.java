// Приклад 2.13.Приклад роботи з аргументами методу main.
// На рис. 2.5 представлено налаштування проекту та завдання
// вхідних значень аргументів.
public class Main {
    //public class Except6{
        public static void main(String[] args) {
            try{
                int l = args.length;
                System.out.println("розмір масиву=" + l);
                int h=10/l;
                args[l + 1] = "10";
            } catch (ArithmeticException e) {
                System.out.println("Ділення на нуль");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Індекс не існує");
            }
        }
   // }
}