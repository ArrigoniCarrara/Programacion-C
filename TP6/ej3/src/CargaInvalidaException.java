public class CargaInvalidaException extends RuntimeException {
    private DatoCargaInvalido datoCargaInvalido;

    public CargaInvalidaException(String message, DatoCargaInvalido datoCargaInvalido) {
        super(message);
        this.datoCargaInvalido = datoCargaInvalido;
    }

    public DatoCargaInvalido getDatoCargaInvalido() {
        return datoCargaInvalido;
    }

}
