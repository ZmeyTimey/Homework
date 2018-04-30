package task2.model;

/**
 * Created by Тимей on 28.04.2018.
 * Part 2
 */
public class LetterIdentifier {

    private static final String VOWELS = "aeiouyаеёиоуыэюя";
    private static final String CONSONANTS = "bcdfghjklmnpqrstvwxzбвгджзйклмнпрсхцчшщ";

    public static boolean isVowel1(char letter) {

        letter = Character.toLowerCase(letter);

        return (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o'
                || letter == 'u' || letter == 'y' || letter == 'а' || letter == 'е'
                || letter == 'ё' ||  letter == 'и' || letter == 'о' ||  letter == 'у'
                || letter == 'ы' ||  letter == 'э' || letter == 'ю' || letter == 'я');
    }


    public static boolean isConsonant1(char letter) {

        letter = Character.toLowerCase(letter);

        return (letter == 'b' || letter == 'c' || letter == 'd' || letter == 'f'
                || letter == 'g' || letter == 'h' || letter == 'j' || letter == 'k'
                || letter == 'l' || letter == 'm' || letter == 'n' || letter == 'p'
                || letter == 'q' || letter == 'r' || letter == 's' || letter == 't'
                || letter == 'v' || letter == 'w' || letter == 'x' || letter == 'z'
                || letter == 'б' || letter == 'в' || letter == 'г' || letter == 'д'
                || letter == 'ж' || letter == 'з' || letter == 'й' || letter == 'к'
                || letter == 'л' || letter == 'м' || letter == 'н' || letter == 'п'
                || letter == 'р' || letter == 'с' || letter == 'т' || letter == 'ф'
                || letter == 'х' || letter == 'ц' || letter == 'ч' || letter == 'ш'
                || letter == 'щ');
    }


    public static boolean isVowel2(char letter) {

        letter = Character.toLowerCase(letter);

        return (VOWELS.contains(Character.toString(Character.toLowerCase(letter))));
        }

    public static boolean isConsonant2(char letter) {

        letter = Character.toLowerCase(letter);

        return (CONSONANTS.contains(Character.toString(Character.toLowerCase(letter))));
    }

    public static boolean isVowel3(char letter) {

        letter = Character.toLowerCase(letter);

        return VOWELS.indexOf(Character.toLowerCase(letter)) != -1;
    }


    public static boolean checkIfConsonant3(char letter) {

        letter = Character.toLowerCase(letter);

        return CONSONANTS.indexOf(Character.toLowerCase(letter)) != -1;
        }

    public static boolean isVowel4(char letter) {

        letter = Character.toLowerCase(letter);

        boolean isVowel = false;

        char[] vowels = VOWELS.toCharArray();

        for (char l : vowels) {
            if (letter == l) {
                isVowel = true;
                break;
            }
        }
        return isVowel;
    }

     public static boolean checkIfConsonant6(char letter) {

         letter = Character.toLowerCase(letter);

            boolean isConsonant = false;

            char[] consonants = CONSONANTS.toCharArray();

            for (char v : consonants) {
                if (letter == v) {
                    isConsonant = true;
                    break;
                }
            }
            return isConsonant;
        }

    }
