public class Producto {

    private String nombrecod;
    private  String desc;
    private double precio;

    public Producto(String nombrecod, String desc, double precio){
            this.nombrecod = nombrecod;
            this.desc = desc;
            this.precio = precio;
    }

    public String getNombrecod() {
        return nombrecod;
    }

    public void setNombrecod(String nombrecod) {
        this.nombrecod = nombrecod;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
