public class Pedido {

    private Empleado emp;
    private String fecha;
    private LineaDePedido[] vec;

    public Pedido(Empleado emp, String fecha, LineaDePedido[] vec) {
        this.emp = emp;
        this.fecha = fecha;
        this.vec = vec;
    }

    public Empleado getEmp() {
        return emp;
    }

    public void setEmp(Empleado emp) {
        this.emp = emp;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public LineaDePedido[] getVec() {
        return vec;
    }

}
