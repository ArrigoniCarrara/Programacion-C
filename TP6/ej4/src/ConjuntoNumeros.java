public class ConjuntoNumeros implements Cloneable{
    private int[] celda;
    private int largo;
    private String nombre;

    public ConjuntoNumeros(int[] celda, int largo, String nombre) {
        this.celda = celda;
        this.largo = largo;
        this.nombre = nombre;
    }

    public int[] getCelda() {
        return celda;
    }

    public int getLargo() {
        return largo;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public Object clone(){
        try {
            ConjuntoNumeros clon = (ConjuntoNumeros) super.clone();
            clon.celda = celda.clone();
            return clon;
        }catch(CloneNotSupportedException e){
            System.out.println("No se puede clonar en el objeto");
            return null;
        }
    }

    public void setCelda(int[] celda) {
        this.celda = celda;
    }
}
