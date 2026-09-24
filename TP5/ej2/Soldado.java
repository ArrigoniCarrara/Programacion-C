public class Soldado extends Personaje implements IHostil{

    private final int ATAQUE = 50;

    public Soldado(String equipo, int costo, int energia) {
        super(equipo, costo, energia);
        costo = 100;
        energia = 500;
    }


    @Override
    public void recibeDano(int dano) {
            this.energia -= dano;
    }

    public void atacar(Unidad enemigo){
        enemigo.recibeDano(ATAQUE);
    }
}
