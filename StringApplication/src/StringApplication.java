

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

    }
}
