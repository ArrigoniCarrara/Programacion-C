public class Medico extends Personaje{

    public Medico(String equipo, int costo, int energia) {
        super(equipo, costo, energia);
        costo = 40;
        energia = 100;
    }


    @Override
    public void recibeDano(int dano) {
        energia -= dano * 1.5;
    }
}