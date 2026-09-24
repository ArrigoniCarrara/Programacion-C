public class Torre extends Edificio implements IConstruible, IHostil{
    private final int ATAQUE = 10;
    public Torre(String equipo, int costo, int energia, int  tiempo_construccion) {
        super(equipo, costo, energia,  tiempo_construccion);
        costo = 200;
        energia = 2000;
    }

    @Override
    public void recibeDano(int dano){
        energia -= dano;
    }

    public void atacar(Unidad enemigo){
        enemigo.recibeDano(ATAQUE);
    }
}
