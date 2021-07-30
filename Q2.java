
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
public class Q2 {
    public static String email;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        email = sc.nextLine();
        
        boolean isValid = validateEmail();
        String status = (isValid == true) ? "valid" : "tidak valid";
        
        System.out.println("Email yang dimasukkan " + status + "!");
    }
    
    public static boolean validateEmail() {
        // Asumsi '@' hanya muncul sekali atau tidak sama sekali
        if (!email.contains("@"))
            return false;
        else {
            int atIdx = email.indexOf("@");
            String beforeAt = email.substring(0, atIdx);
            String afterAt = email.substring(atIdx + 1);
            
            if (beforeAt.length() > 20)
                return false;
            if (!afterAt.contains("."))
                return false;
            if (!afterAt.contains(".co.id") && !afterAt.contains(".id"))
                return false;
        }
        
        return true;
    }
}
