package atelier07perso;

import java.util.Calendar;
import java.util.Date;

public class Exercice2 {
    public static void main(String[] args) {
        // Utilisation de la classe Calendar
        Calendar calendar = Calendar.getInstance();
        System.out.println("Date et heure actuelles avec Calendar : " + calendar.getTime());

        // Utilisation de la classe Date
        Date currentDate = new Date();
        System.out.println("Date et heure actuelles avec Date : " + currentDate);
    }
}
