import java.util.ArrayList;

public class Contacto {
    private String nombre;
    private String tel_fijo;
    private ArrayList<String> tel_cel = new ArrayList<>();

    public Contacto() {
        this.tel_cel = new ArrayList<>();
    }

    public Contacto(String nombre, String tel_fijo) {
        this.nombre = nombre;
        this.tel_fijo = tel_fijo;
        this.tel_cel = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTel_fijo() {
        return tel_fijo;
    }

    public void setTel_fijo(String tel_fijo) {
        this.tel_fijo = tel_fijo;
    }

    public ArrayList<String> getTel_cel() {
        return tel_cel;
    }

    public void setTel_cel(ArrayList<String> tel_cel) {
        this.tel_cel = tel_cel;
    }

    public void agrego_cel(String celular) {
        if (celular != null && !celular.isBlank()) {
            tel_cel.add(celular);
        }
    }

}
