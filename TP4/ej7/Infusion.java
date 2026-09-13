public abstract class Infusion {

    public Infusion() {
    }

    public void PrepararyTomar(){
        System.out.println("Calentando agua....");
        agregarTipoInfusion();
        endulzar();
        System.out.println("Tomando la bebida..... glu glu glu");
    }

    protected abstract void  agregarTipoInfusion();

    protected abstract void endulzar();
}
