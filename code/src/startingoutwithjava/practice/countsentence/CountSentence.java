package code.src.startingoutwithjava.practice.countsentence;

/**
 * This class counts the number of lowercase,
 * uppercase, digits and words in a class.
 */
public class CountSentence {
    private int lowerCase,
            upperCase,
            digits,
            words,
            specialSymbols;
    private String sentence;

    /**
     * This constructor initializes the String sentence.
     * 
     * @param sentence holds the value of the string.
     */
    public CountSentence(String sentence) {
        this.sentence = sentence;
    }

    /**
     * This method counts the number of upperCase,
     * lowerCase, and digits in sentence.
     * Yo#@nnew0 amdoAmMNN 98,.21
     */
    public void countChar() {
        char ch;
        for (int i = 0; i < sentence.length(); i++) {
            ch = sentence.charAt(i);

            if (Character.isLowerCase(ch))
                lowerCase++;
            else if (Character.isUpperCase(ch))
                upperCase++;
            else if (Character.isDigit(ch))
                digits++;
            else if (ch == ' ')
                continue;
            else
                specialSymbols++;
        }
    }

    /**
     * This method counts the number of words in sentence
     * using memory space efficiently.
     */
    public void countWords() {
        int wordLenght = 0;
        char ch, space = ' ';
        for (int i = 0; i < sentence.length(); i++) {
            ch = sentence.charAt(i);
            if (ch == space) {
                if (wordLenght != 0) {
                    words++;
                    wordLenght = 0;
                }
            } else
                wordLenght++;
        }
        if (wordLenght != 0)
            words++;
    }
    
    /**
     * This method counts the number of words using the 
     * split method of String.
     */
    public void countWordsSplit() {
        String[] s = sentence.split(" ");
        words = s.length;
    }

    /**
     * This method displays the fields.
     */
    public void display() {
        System.out.println("The number of lowerCase is: " + lowerCase);
        System.out.println("The number of uppercase is: " + upperCase);
        System.out.println("The number of Special Symbols: " + specialSymbols);
        System.out.println("The number of digit is: " + digits);
        System.out.println("The number of words: " + words);
    }
}
