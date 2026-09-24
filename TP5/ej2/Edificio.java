public abstract class Edificio extends Unidad implements IConstruible{

    protected int tiempo_construccion;

    public Edificio(String equipo,  int costo, int energia, int tiempo_construccion) {
        super(equipo, costo, energia);
        this.tiempo_construccion = tiempo_construccion;
    }


    @Override
    public void recibeDano(int dano){

    }

    @Override
    public int getTiempo_construccion() {
        return tiempo_construccion;
    }
}
