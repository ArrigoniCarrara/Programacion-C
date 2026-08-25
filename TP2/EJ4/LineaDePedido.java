public class LineaDePedido {

    private Producto pro;
    private int cant;

    public LineaDePedido(Producto pro, int cant) {
        this.pro = pro;
        this.cant = cant;
    }

    public Producto getPro() {
        return pro;
    }

    public void setPro(Producto pro) {
        this.pro = pro;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }
}
