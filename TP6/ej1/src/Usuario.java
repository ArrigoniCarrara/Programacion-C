public class Usuario {
    private String nombre;
    private String contra;

    public Usuario(String nombre, String contra) throws NombreInvalidoException,  ContrasenaInvalidaException {
        if(nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        }else{
            throw new NombreInvalidoException("El nombre no puede ser nulo");
        }

        if(contra != null && contra.length() > 6 &&  Character.isLetter(contra.charAt(0))){
            this.contra = contra;
        }else{
            throw new ContrasenaInvalidaException("La contraseña es invalida");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        }else{
            throw new NombreInvalidoException("El nombre no puede ser nulo");
        }
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        if(contra != null && contra.length() > 6 &&  Character.isLetter(contra.charAt(0))){
            this.contra = contra;
        }else{
            throw new ContrasenaInvalidaException("La contraseña es invalida");
        }
    }
}
