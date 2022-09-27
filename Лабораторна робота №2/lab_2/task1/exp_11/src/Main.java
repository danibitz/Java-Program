// Приклад 2.11.
public class Main {
    // public static class Except4{
    public static void main(String[] args) {
        try{
            System.out.println("0");
            throw new NullPointerException("Помилка");
        } catch (NullPointerException e) {
            System.out.println("1" );
        } finally {
            System.out.println("2" );
            }
        System.out.println("3");
    }
    // public static class Except4{
}