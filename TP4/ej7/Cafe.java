public class Cafe extends Infusion{
    private boolean dulce;

    public Cafe(boolean dulce) {
        this.dulce = dulce;
    }

    @Override
    public void endulzar(){
        if(dulce)
            System.out.println("Agrego Azucar");
    }

    @Override
    public void agregarTipoInfusion(){
            System.out.println("Agrego Café Molido");
    }
}
