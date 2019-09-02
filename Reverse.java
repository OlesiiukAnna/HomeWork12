package home.Task_12;

/*
Написать метод `String reverse(String s) {...}`.
Входящий параметр: s - строка которая состоит из слов через пробел
Метод должен вернуть слова в обратном порядке
Пример:
"man has dog" => "dog has man"
 */

public class Reverse {
    public static void main(String[] args) {
        System.out.println("man has dog");
        String string = "man has dog";
        System.out.println(reverse(string));
    }

    private static String reverse(String line) {
        String[] words = line.split("\\s");
        String[] reversedWords = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            reversedWords[i] = words[words.length - 1 - i];
        }

        StringBuilder builder = new StringBuilder();
        for (String word : reversedWords) {
            builder.append(word).append(" ");
        }

        return builder.toString().trim();
    }
}
