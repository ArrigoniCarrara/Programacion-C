public abstract class Decorator extends Personaje{

    private Personaje personaje;

    public Decorator(Personaje personaje) {
        super(personaje.getNombre());
        this.personaje = personaje;
    }

        public Personaje getPersonaje(){
            return this.personaje;
        }

        public void setPersonaje(Personaje personaje){
                this.personaje = personaje;
        }
    // para no hacer this.getpersonaje().getArmadura() en las clases que hereden esta claase
    @Override
    public double getArmadura() {
        return personaje.getArmadura();
    }

    @Override
    public double getAtaqueCorto() {
        return personaje.getAtaqueCorto();
    }

    @Override
    public double getAtaqueDistante() {
        return personaje.getAtaqueDistante();
    }
}
