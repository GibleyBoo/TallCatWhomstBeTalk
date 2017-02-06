/**
 * Created by objo15 on 2017-02-06.
 */

import javax.swing.*;

public class BussBiljetter {
    public static void main(String[] args) {
        inputDialog(false);
    }

    private static void inputDialog(boolean restart) {
        String msg = "Vad är din ålder?";
        if (restart == true) {

        }

        String ageINPUT = JOptionPane.showInputDialog(msg);
        int age = Integer.parseInt(ageINPUT);
        JOptionPane.showMessageDialog(null, "Biljetten kostar: " + calcPrice(age));
    }

    private static int calcPrice(int age) {
        int price;
        if ((age >= 0) && (age <= 6)) {
            price = 0;
        } else if ((age >= 7) && (age <= 19)) {
            price = 14;
        } else if ((age >= 20) && (age <= 25)) {
            price = 28;
        } else if ((age >= 26) && (age <= 64)) {
            price = 34;
        } else if ((age >= 65) && (age < 128)) {
            price = 28;
        } else {
            throw new IllegalArgumentException("Felaktig ålder");

        }
        return price;
    }
}
