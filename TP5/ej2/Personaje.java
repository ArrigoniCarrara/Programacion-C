public abstract class Personaje extends Unidad {

    public Personaje(String equipo,  int costo, int energia) {
        super(equipo, costo, energia);
    }

    @Override
    public abstract void recibeDano(int dano);


}
