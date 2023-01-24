import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isCorrectName = false;
        while (!isCorrectName) {
            String name = scanner.nextLine(); //Считывает строку из System.in
            isCorrectName = checkName(name);
            if (!isCorrectName) {
                System.out.println("Введите корректное имя!");
            } else {
                System.out.println(formatName(name));
            }
        }
    }

    private static boolean checkName(String name) {
        //Написать код здесь
        int a = 0;
        name = name.trim();
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ' ') {
                a++;
            }
        }
        return (a == 2) ? true : false;


    }

    private static String formatName(String name) {
        //Написать код здесь
        String output = "";//все слова с заглавной буквы.
        String[] words = name.split(" ");//разделяем на массив из слов
        sortByLength(words);
        for (String word : words) {
            String first = word.substring(0, 1).toUpperCase();
            String all = word.substring(1) + ' ';
            output += first + all;
        }
        return output;
    }


    private static void sortByLength(String[] words) {
        //Написать код здесь
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = 0; j < words.length - 1; j++) {
                if (words[j].length() > words[j + 1].length()) {
                    String tmp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = tmp;
                }
            }
        }
    }
}

