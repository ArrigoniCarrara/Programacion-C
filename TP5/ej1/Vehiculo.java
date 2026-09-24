public class Vehiculo implements Emisor_de_Sonido{
    private String patente;
    private String num_chasis;
    private String num_motor;

    public Vehiculo(String patente, String num_chasis, String num_motor) {
        this.patente = patente;
        this.num_chasis = num_chasis;
        this.num_motor = num_motor;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getNum_chasis() {
        return num_chasis;
    }

    public void setNum_chasis(String num_chasis) {
        this.num_chasis = num_chasis;
    }

    public String getNum_motor() {
        return num_motor;
    }

    public void setNum_motor(String num_motor) {
        this.num_motor = num_motor;
    }



    public void EmiteSonido() {
        System.out.println("rum rum rum");
    }
}
