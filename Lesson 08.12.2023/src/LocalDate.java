import java.util.Arrays;
import java.util.Comparator;
public class LocalDate {
    public static void main(String[] args) {
        //1 Создайте массив из 8 элементов. В массиве должны храниться даты (класс LocalDate).
        // Чтобы создать элемент LocalDate используйте метод LocalDate.of(год, месяц, день), где год, месяц и день– целые числа.
        //Выведите массив в консоль.
        //2 Напишите метод, который отсортирует массив дат по году. Выведите массив в консоль.
        //3 Напишите метод, который отсортирует массив дат по дню месяца. Выведите массив в консоль.
        //Сортировку можно выполнить по любому из изученных алгоритмов.
        //Пример создания массива с датами
        java.time.LocalDate[] dates = new java.time.LocalDate[]{
                java.time.LocalDate.of(1996, 3, 15),
                java.time.LocalDate.of(1958, 2, 28),
                java.time.LocalDate.of(2021, 1, 10),
                java.time.LocalDate.of(2024, 4, 16),
                java.time.LocalDate.of(2020, 7, 19),
                java.time.LocalDate.of(2018, 6, 11),
                java.time.LocalDate.of(2016, 5, 1),
                java.time.LocalDate.of(2000, 8, 5),
        };
        System.out.println(Arrays.toString(dates)+"\n"+"Sortirovka massiva dat po Godam:");

        Arrays.sort(dates, Comparator.comparing(java.time.LocalDate::getYear));
        for (java.time.LocalDate date1 : dates) {
            System.out.println(date1);
        }
        System.out.println("Sortirovka massiva dat po dnyu Mesyaca:");
        Arrays.sort(dates, Comparator.comparing(java.time.LocalDate::getMonth));
        for (java.time.LocalDate date1 : dates) {
            System.out.println(date1);
        }
    }
}

