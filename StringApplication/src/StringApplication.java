import java.util.Map;

public class StringApplication {
    public static void main(String[] args) {
        StringProgramme stringProgramme = new StringProgramme();

        //******************
        // First Repeated
        //******************
        String firstRepeated = stringProgramme.firstRepeated("india");
        System.out.println("firstRepeated : " + firstRepeated);

        //******************
        // Reverse a string
        //******************
        String reverse = stringProgramme.reverse("indian");
        System.out.println("reverse : " + reverse);

        //******************
        // Anagram
        //******************

        boolean anagram = stringProgramme.anagram("listen", "silent");
        System.out.println("anagram : " + anagram);

        anagram = stringProgramme.anagram("listen", "silentr");
        System.out.println("anagram : " + anagram);

        //******************
        // Remove Duplicate
        //******************

        String removeDuplicate = stringProgramme.removeDuplicate("arjoo");
        System.out.println("removeDuplicate : " + removeDuplicate);

        //******************
        // Reverse Word in Sentence
        //******************

        String reverseWordInSentence = stringProgramme.reverseWordInSentence("Hi, this is arjoo");
        System.out.println("reverseWordInSentence : " + reverseWordInSentence);

        //******************
        // Check Palindrome
        //******************

        boolean isPalindrome = stringProgramme.isPalindrome("EYE");
        System.out.println("isPalindrome : " + isPalindrome);

        isPalindrome = stringProgramme.isPalindrome("EYES");
        System.out.println("isPalindrome : " + isPalindrome);

        //******************
        // Count characters in String
        //******************

        Map<Character, Integer> map = stringProgramme.countChars("EYE");
        System.out.println("countChars : " + map);

        Map<String, Long> countCharsJava8 = stringProgramme.countCharsJava8("EYE");
        System.out.println("countCharsJava8 : " + countCharsJava8);

        //******************
        // Reverse using java 8
        //******************
        System.out.println("reverse in java 8 : " + stringProgramme.reverseInJava8("apple"));


    }
}
