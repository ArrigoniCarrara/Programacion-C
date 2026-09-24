public abstract class Personaje {

    protected String nombre; // Agregado para identificar quién ataca a quién

    public Personaje(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // Métodos que deberán sobrescribir los personajes (y luego tus decoradores)
    public abstract double getArmadura();
    public abstract double getAtaqueCorto();
    public abstract double getAtaqueDistante();

    public Personaje eligeAdversario() {
        return Mazo.getInstance().getAdversarioAleatorio(this);
    }
}
