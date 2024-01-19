/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s01;

/**
 * S01 - Reverse a string; convert to upper case and vice versa.
 *
 * @author CE180986 Nguyen Cong Hieu
 */
public class S01 {

    private String s;

    /**
     * User enter a string
     */
    public void input() {
        s = MyLib.getString("Enter a string: ");
    }

    /**
     * Reverse the string that user have entered
     *
     * @param s take the string from input
     * @return reverse string
     */
    public String reverseString(String s) {
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            reverse += c;
        }
        return reverse;
    }

    /**
     * Convert character from the string if it is letter from lowercase to
     * uppercase and otherwise
     *
     * @param reverse take the reversed string
     * @return convert string
     */
    public String changeString(String reverse) {
        String change = "";
        for (int i = 0; i < reverse.length(); i++) {
            char cc = reverse.charAt(i);
            if (Character.isUpperCase(cc)) {
                change += Character.toLowerCase(cc);
            } else if (Character.isLowerCase(cc)) {
                change += Character.toUpperCase(cc);
            } else if (Character.isDigit(cc)) {
                continue;
            } else {
                change += cc;
            }
        }
        return change;
    }

    /**
     * Return a convert and reverse string
     *
     * @return String
     */
    @Override
    public String toString() {
        return reverseString(changeString(s));
    }

    /**
     * Main method to use input, reverse and convert methods
     *
     * @param args not use
     */
    public static void main(String[] args) {
        // TODO code application logic here
        S01 s1 = new S01();
        s1.input();
        System.out.print(s1.toString());
    }

}
