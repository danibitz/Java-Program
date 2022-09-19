import java.util.Scanner;

public class RecSotr1 {
    public static void main(String[] args) {
        /*
                _______________________________________________________________________________

                                                ЗАВДАННЯ
                    Завдання 1.1.Створити програми, наведені в прикладах 1.1 та 1.2,
                    та відпрацювати їх за допомогою налагоджувача. Приділити увагу
                    операціям створення об'єктів досліджуваних класів.
                _______________________________________________________________________________
                */
        // 1.1) Task Example №1.2

        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть кількість співробітників => ");
        int kol = sc.nextInt();
        sc.nextLine();      // очищення буфера

        Sotrudnik[] sotr = new Sotrudnik[kol];
        System.out.println("Введіть інформацію про кожного співробітника: ");
        for (int i = 0; i <  sotr.length; i++){
            sotr[i] = new Sotrudnik();

            System.out.println("Введіть прізвище " + (i+1) + " співробітника  => ");
            sotr[i].fam = sc.nextLine();

            System.out.println("Введіть його ім'я " + (i+1) + " співробітника => ");
            sotr[i].im = sc.nextLine();

            System.out.println("Введіть його по батькові " + (i+1) + " співробітника => ");
            sotr[i].otch = sc.nextLine();

            System.out.println("Введіть його посаду " + (i+1) + " співробітника => ");
            sotr[i].doljnost = sc.nextLine();

            System.out.println("Введіть кількість дітей => ");
            sotr[i].kolDet = sc.nextInt();
            sc.nextLine();      // очищення буфера

            if(sotr[i].kolDet != 0){
                sotr[i].reb = new Rebenok[sotr[i].kolDet];
                System.out.println("Діти => ");
                for (int j = 0; j < sotr[i].reb.length; j++){
                    sotr[i].reb[j] = new Rebenok();

                    System.out.println("Введіть його ім'я " + (j+1) + " дитини => ");
                    sotr[i].reb[j].imaR = sc.nextLine();

                    System.out.println("Введіть вік " + (j+1) + " дитини => ");
                    sotr[i].reb[j].vozrastR = sc.nextInt();
                    sc.nextLine();      // очищення буфера
                }
            }
        }

        System.out.println("\nСпівробітники фірми \n фам \t ім'я \t отч \t посада");
        for (int i = 0; i <  sotr.length; i++){
            System.out.println(sotr[i].fam + "\t" +  sotr[i].im + "\t" +  sotr[i].otch + "\t"
                    +  sotr[i].doljnost);
            System.out.println("Діти: ");
            for (int j = 0; j < sotr[i].reb.length; j++){
                System.out.println("\t\t" + sotr[i].reb[j].imaR + "\t\t" +
                        sotr[i].reb[j].vozrastR);
                System.out.println();
            }
        }
    } // The End program
}