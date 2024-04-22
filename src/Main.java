import it.epicode.classes.Auto;
import it.epicode.exceptions.DivisionePerZeroKmException;
import it.epicode.exceptions.KmInsufficienti;
import it.epicode.exceptions.ViolazioneLimitiArrayException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.err;


public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {

        // Esercizio 1

        Scanner scanner = new Scanner (System.in);
//        int[] numeri = new int[5];
//        for (int i = 0; i < numeri.length; i++) {
//            numeri[i] = new Random().nextInt(1,11);
//            System.out.println(numeri[i]);
//        }
//
//        int numeroValore = -1;
//        int posizione = -1;
//
//        while(posizione != 0) {
//            try {
//                System.out.println("Inserisci un numero da 1 a 5 per scegliere la posizione, 0 per uscire.");
//                posizione = scanner.nextInt();
//                scanner.nextLine();
//                if (posizione == 0) {
//                    System.out.println("Sei uscito dal programma");
//                    break;
//                }
//                if (posizione < 1 || posizione > numeri.length) {
//                    throw new ViolazioneLimitiArrayException("Il numero della posizione non è valido.");
//                }
//                System.out.println("Inserisci un numero da 1 a 11 per scegliere il valore.");
//                numeroValore = scanner.nextInt();
//                scanner.nextLine();
//                numeri[posizione - 1] = numeroValore;
//                if (numeroValore < 1 || numeroValore > 11) {
//                    throw new ViolazioneLimitiArrayException("Il valore non è valido.");
//                }
//            } catch (ViolazioneLimitiArrayException err) {
//                // System.out.println(err.getMessage());
//                logger.error(err.getMessage());
//            } catch (Exception err) {
//                // logger.error(err.getMessage());
//                logger.error("Si è verificato un errore nella scelta della posizione e del valore numerico.");
//            }
//        }
//
//        for (int i = 0; i < numeri.length; i++) {
//            System.out.println(numeri[i]);
//        }

        // Esercizio 2

        try {
            System.out.println("Calcolo del numero di km/litro percorsi da un'auto: ");

            System.out.println("Inserisci il chilometraggio: ");
            int km = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Inserisci i litri di carburante usati: ");
            int litri = scanner.nextInt();
            scanner.nextLine();

            Auto auto = new Auto(km, litri);
            auto.showResults();

        } catch (DivisionePerZeroKmException | KmInsufficienti err) {
            logger.error("Errore durante il calcolo dei km/litro: " + err.getMessage());
        } catch (Exception err) {
            logger.error("Si è verificato un errore nel calcolo dei km/litro: " + err.getMessage());
        }
    }
}

