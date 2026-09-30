public class FaltaCombustibleException extends CargaInvalidaException {

    private DatoCargaInvalido datoCargaInvalido;

    public FaltaCombustibleException(String message,  DatoCargaInvalido datoCargaInvalido) {
        super(message, datoCargaInvalido);
    }
}
