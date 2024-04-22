package it.epicode.exceptions;

public class DivisionePerZeroKmException extends RuntimeException {
    public DivisionePerZeroKmException () {
        super();
    }
    public DivisionePerZeroKmException(String message) {
        super(message);
    }


}
