
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
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        System.out.println(reverseString(s));
    }
    
    public static String reverseString(String s) {
        String reversed = "";
        
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }
        
        return reversed;
    }
}
