
 import java.util.ArrayList;
 import java.util.Calendar;
 import java.util.List;
 import java.util.Scanner;
 public class Main
 {  public static void main(String[] args) {
     Scanner scantxt = new Scanner(System.in);  // функція для можливості введення інформації з клавіатури
     /*
                _______________________________________________________________________________
                 Language: Ukrainian

                                                ЗАВДАННЯ
                 Завдання 1.2. Використовуючи розглянуті у цій роботі приклади 1.3 та 1.4,
                 виконати завдання згідно з заданим варіантом у вигляді двох проектів:
                    1-й проект – без використання методів;
                    2-й проект – зі створенням методів кожної підзадачі.

                                                Варіант 8

                    Розробити клас для зберігання інформації про людей:
                    Ім'я, прізвище, рік_народження, місяць_народження

                    та реалізувати алгоритм роботи з масивом даних об'єктів, в якому потрібно:
                    –	визначити найстарішу людину;
                    –	визначити середній вік (використовувати лише рік народження)
                        та людей старших за середній вік;
                    –	упорядкувати масив за прізвищем в порядку, зворотному алфавітному;
                    -   організувати пошук за прізвищем, виправлення одного з полів та
                        виведення повної інформації про людину після редагування.
                _______________________________________________________________________________
      */
     // 1.2) Task Example №1.3

     int currentYear = Calendar.getInstance().get(Calendar.YEAR); // поточний рік
     System.out.println("\n\nЛаскаво просимо до програми!\n Список людей: ");
     People[] humans = new People[] {
             new People("Vlad", "Zabiyakov", 1998, 1),
             new People("Kolya", "Donchenko", 2004, 11),
             new People("Alina", "Demidenko", 1991, 7),
             new People("Nastya", "Schevchuk", 1998, 5),
             new People("Matvei", "Pogorelov", 2005, 6),
             new People("Katya", "Tkachenko", 1998, 9),
     };
     System.out.println("\tІм'я " + "\t   Прізвище" + "\t Рік народження" + "\t Місяць ");
     for (int i = 0; i < humans.length; i++)
     {  if (humans[i].year_of_birth > 0)
         System.out.println((i + 1) + ")  " + humans[i].namePerson + "\t "
           + humans[i].surNamePerson + "\t \t" + humans[i].year_of_birth + "\t \t" + humans[i].month_of_birth);
     }
     //пошук старої/дорослої людини
     int ageYear = 0, year = 0;
     People oldestPeople = null;

     for (int i = 0; i < humans.length; i++) {
         if (currentYear - humans[i].getYear_of_birth() > ageYear) {
             ageYear = currentYear - humans[i].getYear_of_birth();
             year = humans[i].getYear_of_birth();
             // важаємо що це стара людина
             oldestPeople = humans[i];
         }
     }  // перевіряємо за кі-ть людей з роком
     List<People> ppl = new ArrayList<>();
     for (People p: humans) {
         if(p.getYear_of_birth() == year) {
             ppl.add(p);
         }
     }
     // якщо більше 1 то перевіряємо за місяцем народж
     int idx = 0;
     if(ppl.size() > 1) {
         int monthMin = ppl.get(0).getMonth_of_birth();
         for (int i = 1; i < ppl.size(); i++) {
             if (ppl.get(i).getMonth_of_birth() < monthMin) {
                 idx = i;
             }
         }
         oldestPeople = ppl.get(idx); // вот он самый взрослый
     }
     System.out.println("\n Найстарша людина: "); // выводим его в консоль
     System.out.println("Ім'я " + "\t Прізвище" + "\t Рік народження" + "\t Місяць народження");
     System.out.println(oldestPeople);

     // Сортування за прізвищем
     People temp = humans[0];
     for (int i = 0; i < humans.length; i++){
         for (int j = i + 1; j < humans.length; j++){
             if(temp.surNamePerson.compareTo(humans[i].surNamePerson) > 0 ){
                 temp = humans[i];
                 humans[i] = humans[j];
                 humans[j] = temp;
             }
         }
     }
     System.out.println("\nВідсортований масив за прізвищем у зворотному порядку: ");
     for (int i = 0; i < humans.length; i++){
         System.out.println("\t" + humans[i].namePerson + " \t" + humans[i].surNamePerson + " \t" +
                 humans[i].year_of_birth + " \t" + humans[i].month_of_birth);
     }

     // Вивведення людей ср.вік та старших за середній
     {   double mid_year = 0; // значення для пошуку ср.віку
         for (int i = 0; i < humans.length; i++)
             mid_year += humans[i].year_of_birth;
         double sr = mid_year / humans.length;// середній вік
         double vik_sr_people = currentYear - sr;

         System.out.println("\nСередній вік = " + vik_sr_people);
         System.out.println(" Люди старші за середній вік :\n" + "\n№" + "\t Ім'я "
                 + "\t Прізвище" + "\t Рік народження");

         for (int i = 0; i < humans.length; i++) {
             if (humans[i].year_of_birth < sr)
                 System.out.println((i + 1) + ")\t " + humans[i].namePerson + "\t \t"
                         + humans[i].surNamePerson + "\t " + humans[i].year_of_birth );
         }
     }

     //  організувати пошук за прізвищем, виправлення одного з полів та
     //  виведення повної інформації про людину після редагування.
      int index;
     System.out.print("\nВедіть прізвище людини : ");
     String surNamePerson = scantxt.nextLine();

     for (int i = 0; i < humans.length; i++){
         if(humans[i].surNamePerson.equals(surNamePerson)){
              index = i;

             System.out.println("Виберіть, що потрібно виправити: ");
             System.out.println("1 - Ім'я людини \n2 - Прізвище людини \n3 - Рік народження \n4 - Місяць народження");
             System.out.print(" -> ");
             int action = scantxt.nextInt();
             scantxt.nextLine();

             switch (action){
                 case 1:
                     System.out.print("Введіть нове Ім'я : ");
                     humans[i].namePerson = scantxt.nextLine();
                     break;
                 case 2:
                     System.out.print("Введіть нове Прізвище : ");
                     humans[i].surNamePerson = scantxt.nextLine();
                     break;
                 case 3:
                     System.out.print("Введіть новий рік народження людини : ");
                     humans[i].year_of_birth = Integer.parseInt(scantxt.next());
                     break;
                 case 4:
                     System.out.print("Введіть новий місяць народження людини : ");
                     humans[i].month_of_birth = scantxt.nextInt();
                     break;
                 default:
                     System.out.print("Помилка вибору, такої дії немає!");
                     break;
             }
             System.out.println("Інформація про людину після виправлення: \n");
             System.out.println("\t Ім'я " + "\t   Прізвище" + "\t Рік народження" + "\t Місяць ");
             System.out.println("\t" + humans[i].namePerson + "\t "
                     + humans[i].surNamePerson + "\t \t" + humans[i].year_of_birth + "\t \t" + humans[i].month_of_birth);
         }
     }
 }
 } // The End program