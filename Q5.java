
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johan
 */
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String reversed = reverseString(s);
        
        if (s.equalsIgnoreCase(reversed))
            System.out.println("True");
        else
            System.out.println("False");
    }
    
    public static String reverseString(String s) {
        String reversed = "";
        
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }
        
        return reversed;
    }
}
