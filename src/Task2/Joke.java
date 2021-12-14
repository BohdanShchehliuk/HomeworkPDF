package Task2;

import java.util.Arrays;

public class Joke {
    public static void main(String[] args) {
        String word = "Java";
        String string = "Мовлення як вид людської діяльності завжди зорієнтоване на виконання певного комунікативного " +
                "завдання. Висловлюючи думки і почуття, людина ставить конкретну мету — щось повідомити, про щось переконати " +
                "тощо. Існує багато визначень тексту. Наведемо окремі з них.";
        String newString[] = string.split(" ");
        String keyWords[] = {"як", "у", "на", "і", "про", "з", "під", "перед", "після", "з-за" + "при", "над", "під", "серед", "без",
                "біля", "для", "коло", "проти", "через", "до", "від", "крізь","в"};
        String stringNew = "";

        for (int i = 0; i < newString.length; i++) {
            for (int j = 0; j < keyWords.length; j++) {
                if (newString[i].equals(keyWords[j])) {
                    newString[i] = word;
                }
            }
            stringNew = stringNew + " "+ newString[i];
        }
        System.out.println(stringNew);
    }
}
