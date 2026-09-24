public class Fuego extends Decorator{
    public Fuego(Personaje personaje) {
        super(personaje);
    }

    @Override
    public double getArmadura(){
        double armadura = this.getPersonaje().getArmadura();
        return armadura - armadura * 0.5;
    }
    @Override
    public double getAtaqueCorto(){
        double ataque = this.getPersonaje().getAtaqueCorto();
        return ataque * 1.8;
    }

    @Override
    public double getAtaqueDistante(){
        double ataque = this.getPersonaje().getAtaqueDistante();
        return ataque * 1.7;
    }
}
