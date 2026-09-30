public class Surtidor {
    private int cantGasoil;
    private int cantPremium;
    private int cantSuper;
    private int cantMax;
    private int ventaGasoil;
    private int ventaPremium;
    private int ventaSuper;

    public Surtidor() {
    }

    public Surtidor(int cantMax) {
        this.cantGasoil = cantMax;
        this.cantPremium = cantMax;
        this.cantSuper = cantMax;
        this.cantMax = cantMax;
    }

    public boolean extraerGasoil(int litros) throws CargaInvalidaException, FaltaCombustibleException{
        if (litros < 0){
            DatoCargaInvalido invalido = new DatoCargaInvalido("Gasoil", cantGasoil, litros);
            throw new CargaInvalidaException("La cantidad requerida es negativa", invalido);
        }

        if(cantGasoil < litros) {
            litros -= cantGasoil;
            ventaGasoil += litros - cantGasoil;
            cantGasoil = 0;

            DatoCargaInvalido invalido = new DatoCargaInvalido("Gasoil", cantGasoil, litros);
            throw new FaltaCombustibleException("La cantidad de combustible no es suficiente para satisfacer la cantidad requerida", invalido);
        }
        else {
            ventaGasoil += litros;
            cantGasoil -= litros;
            return true;
        }
    }

    public boolean extraerSuper(int litros) {
        if (litros < 0){
            DatoCargaInvalido invalido = new DatoCargaInvalido("Super", cantSuper, litros);
            throw new CargaInvalidaException("La cantidad requerida es negativa", invalido);
        }
        if(cantSuper < litros) {
            litros -= cantSuper;
            ventaSuper += litros - cantSuper;
            cantSuper = 0;

            DatoCargaInvalido invalido = new DatoCargaInvalido("Super", cantSuper, litros);
            throw new FaltaCombustibleException("La cantidad de combustible no es suficiente para satisfacer la cantidad requerida", invalido);
        }
        else{
            ventaSuper += litros;
            cantSuper -= litros;
            return true;
        }
    }

    public boolean extraerPremium(int litros) {
        if (litros < 0){
            DatoCargaInvalido invalido = new DatoCargaInvalido("Premium", cantPremium, litros);
            throw new CargaInvalidaException("La cantidad requerida es negativa", invalido);
        }
        if(cantPremium < litros) {
            litros -= cantPremium;
            ventaPremium += litros - cantPremium;
            cantPremium = 0;

            DatoCargaInvalido invalido = new DatoCargaInvalido("Premium", cantPremium, litros);
            throw new FaltaCombustibleException("La cantidad de combustible no es suficiente para satisfacer la cantidad requerida", invalido);
        }
        else{
            ventaPremium += litros;
            cantPremium -= litros;
            return true;
        }
    }

    public void llenarDepositoGasoil(){

        cantGasoil = cantMax;

    }

    public void llenarDepositoSuper(){

        cantSuper = cantMax;

    }

    public void llenarDepositoPremium(){

        cantPremium = cantMax;

    }

    public int getCantGasoil() {
        return cantGasoil;
    }

    public int getCantPremium() {
        return cantPremium;
    }

    public int getCantSuper() {
        return cantSuper;
    }

    public int getCantMax() {
        return cantMax;
    }

    public int getVentaGasoil() {
        return ventaGasoil;
    }

    public int getVentaPremium() {
        return ventaPremium;
    }

    public int getVentaSuper() {
        return ventaSuper;
    }

}
