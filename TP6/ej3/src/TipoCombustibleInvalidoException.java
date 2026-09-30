public class TipoCombustibleInvalidoException extends CargaInvalidaException {

    private DatoCargaInvalido datoCargaInvalido;

    public TipoCombustibleInvalidoException(String message,  DatoCargaInvalido datoCargaInvalido) {
        super(message, datoCargaInvalido);
    }
}

