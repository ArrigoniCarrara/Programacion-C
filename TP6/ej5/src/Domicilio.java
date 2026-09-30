import java.io.Serializable;

public class Domicilio implements Cloneable{
    private int calle;
    private int numero;

    public Domicilio() {
    }

    public Domicilio(int calle, int numero) {
        this.calle = calle;
        this.numero = numero;
    }

    public int getCalle() {
        return calle;
    }

    public void setCalle(int calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        try{
            Domicilio clon = (Domicilio)super.clone();
            return clon;
        }
        catch (CloneNotSupportedException e){
            System.out.println("No se puede clonar");
            return null;
        }
    }
}
