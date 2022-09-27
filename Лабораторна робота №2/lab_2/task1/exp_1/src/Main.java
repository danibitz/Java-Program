// Приклад 2.1. Згенеровано та перехоплено RuntimeException.
public class Main {
    public static void main(String[] args) {
        try{
            System.out.println(" 0 ");
            throw new RuntimeException("Неперевірена помилка");
        } catch (RuntimeException e) {	// виняток перехоплено
            System.out.println(" 1 " + e); // виняток опрацьовано
        }
        System.out.println(" 2 ");
    }
}
