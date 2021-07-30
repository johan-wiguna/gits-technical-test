
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
public class Q3 {
    public static String time12;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        time12 = sc.nextLine();
        
        System.out.println(convert12HourTime());
    }
    
    public static String convert12HourTime() {
        String meridiem = time12.substring(time12.length()-2);
        String min12 = time12.substring(3, 5);
        String hour12 = time12.substring(0, 2);
        String hour24 = "";
        String time24 = "";
        
        if (Integer.parseInt(hour12) > 12 || Integer.parseInt(min12) > 59) {
            return "Masukan tidak valid!";
        } else {
            if (meridiem.equals("AM")) {
                if (hour12.equals("12")) hour24 = "00";
                else {
                    hour24 = hour12;
                }
            } else {
                if (hour12.equals("12")) hour24 = "12";
                else {
                    int hour24int = Integer.parseInt(hour12) + 12;
                    hour24 = Integer.toString(hour24int);
                }
            }

            time24 = hour24 + ":" + min12;

            return time24;
        }
    }
}
