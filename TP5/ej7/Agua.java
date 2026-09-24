public class Agua extends Decorator{
    public Agua(Personaje personaje) {
        super(personaje);
    }

    @Override
    public double getArmadura(){
        double armadura = this.getPersonaje().getArmadura();
        return armadura - armadura * 0.15;
    }
    @Override
    public double getAtaqueCorto(){
        double ataque = this.getPersonaje().getAtaqueCorto();
        return ataque * 1.2;
    }

    @Override
    public double getAtaqueDistante(){
        return this.getPersonaje().getAtaqueDistante();
    }
}
