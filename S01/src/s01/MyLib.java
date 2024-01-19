/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s01;

import java.util.Scanner;

/**
 * S01 - Reverse a string; convert to upper case and vice versa.
 *
 * @author CE180986 Nguyen Cong Hieu
 */
public class MyLib {

    /**
     * Get String. When your input is empty or number or you put a special sign
     * that not letter between your string it will throw exception to notice
     * your input is wrong. it just accept .?! at the end.
     *
     * @param message The message that can help user know their input are valid
     * or invalid
     * @return A valid sentence
     */
    public static String getString(String message) {
        Scanner sc = new Scanner(System.in);
        String s = "";
        Boolean check = false;
        do {
            try {
                System.out.print(message);
                s = sc.nextLine();
                if (s.isEmpty() || s.equals(" ")) {
                    throw new Exception("The input string cannot be empty!");
                } else if (!s.trim().matches("^[a-zA-Z ]+?[.!?a-zA-Z]$")) {
                    throw new Exception("The input string cannot contain number or contain .?! inside your sentence.");
                } else {
                    check = true;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                check = false;
            }
        } while (!check);
        return s;
    }

}
