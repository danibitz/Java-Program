// Приклад 2.7.
// Не можна перехопити покинутий виняток за допомогою чужого catch,
// навіть якщо перехоплювач підходить.
public class Main {

    public static void main(String[] args) {
        try{
            System.out.println("0");
            throw new NullPointerException("Помилка");
        } catch (NullPointerException e) {
            System.out.println("1" );
            throw new ArithmeticException();
        } catch (ArithmeticException e) {
            System.out.println("2" );
        }
        System.out.println("3");
    }
}