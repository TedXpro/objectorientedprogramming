/* Programming Challenge 20: Lo Shu Magic Square */
package code.src.startingoutwithjava.chapter7arrays.loshumagicsquare;

/**
 * This program uses the LoShuMagic class tp check if
 * an array of numbers is a Lo Shu Magic square.
 */
public class LoShi {
    public static void main(String[] args) {
        LoShuMagic lo = new LoShuMagic();

        lo.setNumbers();
        lo.display();
    }
}
