//Kabrina Brady

import java.util.Scanner;

public class VowelFoundBrady {
    public static void main(String[] args) {
        String word = "";
        int vowel = 0;
        Scanner input = new Scanner(System.in);

        while (word != "exit") {
            System.out.println("Please enter a word or type 'exit': ");
            word = input.next();
            word.toLowerCase();

            if (word.equals("exit")){
                break;
            }

            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (ch == 'a') {
                    vowel++;
                    System.out.println("Vowel detected.");
                    break;
                } else if (ch == 'e') {
                    vowel++;
                    System.out.println("Vowel detected.");
                    break;
                } else if (ch == 'i') {
                    vowel++;
                    System.out.println("Vowel detected.");
                    break;
                } else if (ch == 'o') {
                    vowel++;
                    System.out.println("Vowel detected.");
                    break;
                } else if (ch == 'u') {
                    vowel++;
                    System.out.println("Vowel detected.");
                    break;
                }
                if (vowel == 0) {
                    if (ch == 'y') {
                        System.out.println("Vowel detected.");
                        break;
                    }
                }
            }
        }
    }
}