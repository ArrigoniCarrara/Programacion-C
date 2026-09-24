public class Cuartel extends Edificio implements IConstruible{

    public Cuartel(String equipo, int costo, int energia, int tiempo_construccion) {
        super(equipo, costo, energia, tiempo_construccion);
        costo = 500;
        energia = 3000;
    }

    @Override
    public void recibeDano(int dano){
            energia -= dano * 0.5;
    }
}
