/*
Приклад 2.6.
Послідовність перехоплення має відповідати ієрархії класів винятків.
Предок не повинен перехоплювати виняток раніше за нащадків.
Вказаний приклад видає помилку компілятора.
Програму запустити неможливо.
*/

public class Main {
    public static void main(String[] args) {
        try{
            System.out.println("0");
            throw new NullPointerException("Помилка");
        } catch (ArithmeticException e) {
            System.out.println("1" );
        } catch (Exception e) {
            System.out.println("2" );
        } catch (RuntimeException e)
        { System.out.println("3" );
        }
        System.out.println("4");
    }
}

/*
public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("Помилка");
        }  catch (ArithmeticException e) {
            System.out.println("1" );
        } catch (RuntimeException e) {
            System.out.println("2" );
        } catch (Exception e) {
            System.out.println("3" );
        }
        System.out.println("4");
    }
}
*/