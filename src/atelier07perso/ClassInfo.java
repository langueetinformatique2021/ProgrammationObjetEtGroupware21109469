package atelier07perso;

import java.util.Calendar;
import java.util.Date;

public class ClassInfo {
    public static void main(String[] args) {
        // Informations sur la classe Calendar
        System.out.println("Classe Calendar :");
        System.out.println("Paquetage : java.util");
        System.out.println("Champs statiques : Calendar.YEAR, Calendar.MONTH, Calendar.DAY_OF_MONTH, etc.");
        System.out.println("Constructeurs : Non disponible directement (classe abstraite).");
        System.out.println("Sous-classe principale : GregorianCalendar.");
        System.out.println("Interfaces implémentées : Serializable, Cloneable.");
        
        // Informations sur la classe Date
        System.out.println("\nClasse Date :");
        System.out.println("Paquetage : java.util");
        System.out.println("Constructeurs : Date(), Date(long millis).");
        System.out.println("Interfaces implémentées : Serializable.");
    }
}