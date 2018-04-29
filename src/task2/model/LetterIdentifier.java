package task2.model;

/**
 * Created by Тимей on 28.04.2018.
 * Part 2
 */
public class LetterIdentifier {

    public static boolean isVowel(char letter) {

        return (letter == 'a' || letter == 'A' || letter == 'e' || letter == 'E'
                || letter == 'i' || letter == 'I' || letter == 'o' || letter == 'O'
                || letter == 'u' || letter == 'U' || letter == 'y' || letter == 'Y'
                || letter == 'а' || letter == 'А' || letter == 'е' || letter == 'Е'
                || letter == 'ё' || letter == 'Ё' || letter == 'и' || letter == 'И'
                || letter == 'о' || letter == 'О' || letter == 'у' || letter == 'У'
                || letter == 'ы' || letter == 'Ы' || letter == 'э' || letter == 'Э'
                || letter == 'ю' || letter == 'Ю' || letter == 'я' || letter == 'Я');
    }


    public static boolean isConsonant(char letter) {

        return (letter == 'b' || letter == 'B' || letter == 'c' || letter == 'C'
                || letter == 'd' || letter == 'D' || letter == 'f' || letter == 'F'
                || letter == 'g' || letter == 'G' || letter == 'h' || letter == 'H'
                || letter == 'j' || letter == 'J' || letter == 'k' || letter == 'K'
                || letter == 'l' || letter == 'L' || letter == 'm' || letter == 'M'
                || letter == 'n' || letter == 'N' || letter == 'p' || letter == 'P'
                || letter == 'q' || letter == 'Q' || letter == 'r' || letter == 'R'
                || letter == 's' || letter == 'S' || letter == 't' || letter == 'T'
                || letter == 'v' || letter == 'V' || letter == 'w' || letter == 'W'
                || letter == 'x' || letter == 'X' || letter == 'z' || letter == 'Z'
                || letter == 'б' || letter == 'Б' || letter == 'в' || letter == 'В'
                || letter == 'г' || letter == 'Г' || letter == 'д' || letter == 'Д'
                || letter == 'ж' || letter == 'Ж' || letter == 'з' || letter == 'З'
                || letter == 'й' || letter == 'Й' || letter == 'к' || letter == 'К'
                || letter == 'л' || letter == 'Л' || letter == 'м' || letter == 'М'
                || letter == 'н' || letter == 'Н' || letter == 'п' || letter == 'П'
                || letter == 'р' || letter == 'Р' || letter == 'с' || letter == 'С'
                || letter == 'т' || letter == 'Т' || letter == 'ф' || letter == 'Ф'
                || letter == 'х' || letter == 'Х' || letter == 'ц' || letter == 'Ц'
                || letter == 'ч' || letter == 'Ч' || letter == 'ш' || letter == 'Ш'
                || letter == 'щ' || letter == 'Щ');
    }
}
