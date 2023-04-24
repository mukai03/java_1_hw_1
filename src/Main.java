import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String stringName = new String();                               // 1
        final int NUM = 5;                                              // 2
        String word = "Hello World!";                                   // 3
        stringName = NUM + " " + word;                                  // 4
        System.out.println(stringName + " " + NUM + " " + word);        // 5
        if (NUM < 0){
            System.out.println("Вы сохранили отрицательное число");
        }else if (NUM > 0){
            System.out.println("Вы сохранили положительное число");
        }else {
            System.out.println("Вы сохранили нуль");                    // 6
        }
        System.out.println("Введите ваше имя:");                        // 7
        Scanner scanner = new Scanner(System.in);                       // 8
        String name = scanner.nextLine();
        System.out.println("Здравствуйте, " + name + "!");              // 9
    }
}