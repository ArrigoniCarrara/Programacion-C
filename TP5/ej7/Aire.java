public class Aire extends Decorator{
    public Aire(Personaje personaje) {
        super(personaje);
    }

    @Override
    public double getArmadura(){
        double armadura = this.getPersonaje().getArmadura();
        return armadura - armadura * 0.1;
    }
    @Override
    public double getAtaqueCorto(){
        double ataque = this.getPersonaje().getAtaqueCorto();
        return ataque * 1.2;
    }

    @Override
    public double getAtaqueDistante(){
        double ataque = this.getPersonaje().getAtaqueDistante();
        return ataque * 1.1;
    }
}
