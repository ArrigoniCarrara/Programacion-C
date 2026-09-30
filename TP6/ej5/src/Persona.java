import java.util.Objects;

public class Persona implements Cloneable, Comparable<Persona>{

    private int dni;
    private String apellido;
    private Domicilio domicilio;
    private Animal mascota;


    public Persona(int dni, String apellido, Domicilio domicilio, Animal mascota) {
        this.dni = dni;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.mascota = mascota;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }


    @Override
    public Object clone() throws CloneNotSupportedException {
            try{
                Persona clon = (Persona)super.clone();
                clon.domicilio = (Domicilio)domicilio.clone();
                return clon;
            }catch(CloneNotSupportedException e){
                System.out.println("No se puede clonar");
                return null;
            }
    }

    @Override
    public int compareTo(Persona otro) {
        if(Objects.equals(this.apellido, otro.getApellido())){
            if(dni > otro.getDni()){
                return 1;
            }
            else
                return -1;
        }else{
            return apellido.compareTo(otro.getApellido());
        }
    }
}
