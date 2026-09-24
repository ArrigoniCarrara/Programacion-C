public class Tierra extends Decorator{
    public Tierra(Personaje personaje) {
        super(personaje);
    }

    @Override
    public double getArmadura(){
        return this.getPersonaje().getArmadura() * 1.25;
    }
    @Override
    public double getAtaqueCorto(){
        double ataque = this.getPersonaje().getAtaqueCorto();
        return ataque - ataque * 0.25;
    }

    @Override
    public double getAtaqueDistante(){
        double ataque = this.getPersonaje().getAtaqueDistante();
        return ataque - ataque * 0.3;
    }
}
