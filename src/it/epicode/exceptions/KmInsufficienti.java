package it.epicode.exceptions;

public class KmInsufficienti extends RuntimeException {
    public KmInsufficienti () {
        super();
    }
    public KmInsufficienti(String message) {
        super(message);
    }
}
