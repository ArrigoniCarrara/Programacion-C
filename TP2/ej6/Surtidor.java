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

    public boolean extraerGasoil(int litros) {
        if (litros <= 0) return false;
        if(cantGasoil < litros) {
            ventaGasoil += cantGasoil;
            cantGasoil = 0;
            return false;
        }
        else {
            ventaGasoil += litros;
            cantGasoil -= litros;
            return true;
        }
    }

    public boolean extraerSuper(int litros) {
        if (litros <= 0) return false;
        if(cantSuper < litros) {
            ventaSuper += cantSuper;
            cantSuper = 0;
            return false;
        }
        else{
            ventaSuper += litros;
            cantSuper -= litros;
            return true;
        }
    }

    public boolean extraerPremium(int litros) {
        if (litros <= 0) return false;
        if(cantPremium < litros) {
            ventaPremium += cantPremium;
            cantPremium = 0;
            return false;
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
