package it.epicode.classes;

import it.epicode.exceptions.DivisionePerZeroKmException;
import it.epicode.exceptions.KmInsufficienti;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Auto {
    private static final Logger logger = LoggerFactory.getLogger(Auto.class);
    private int km;
    private int litri;

    public Auto(int km, int litri) {
        this.km = km;
        this.litri = litri;
    }

    public void showResults() {
        try {
            if (litri <= 0) {
                throw new DivisionePerZeroKmException("Non è possibile dividere per zero i litri consumati.");
            }
            if (km < 0) {
                throw new KmInsufficienti("I km inseriti non sono sufficienti");
            }

            System.out.println(km + "/" + litri + " percorsi: " + (km / litri) + "km/l");

        } catch (DivisionePerZeroKmException err) {
            logger.error(err.getMessage());
        } catch (KmInsufficienti err) {
            logger.error(err.getMessage());
        }
    }
}
