public class Empleado {

    private String nombre;
    private String tel;
    private String gmail;

    public Empleado(String nombre, String tel, String gmail){
            this.nombre = nombre;
            this.tel = tel;
            this.gmail = gmail;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }
}
