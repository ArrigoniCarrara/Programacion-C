//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            int[] aux = new int[5];
            aux[0] = 10;
            aux[1] = 20;
            aux[2] = 30;
            aux[3] = 40;
            aux[4] = 50;

            ConjuntoNumeros original = new ConjuntoNumeros( aux, 5, "¿Original o Clon?");

            ConjuntoNumeros clone = (ConjuntoNumeros)original.clone();

            System.out.println("Original: ");
            for(int i = 0; i < original.getLargo(); i++){
                System.out.println(original.getCelda()[i]);
            }

            System.out.println("----------------------------------------------");

            System.out.println("Clon: ");
            for(int i = 0; i < clone.getLargo(); i++){
                System.out.println(clone.getCelda()[i]);
            }

            System.out.println("------------------Despues de cambios de original------------------------");

            aux[0] = 50;
            aux[1] = 40;
            aux[2] = 30;
            aux[3] = 20;
            aux[4] = 10;

            original.setCelda(aux);

            System.out.println("Original: ");
            for(int i = 0; i < original.getLargo(); i++){
                System.out.println(original.getCelda()[i]);
            }


            System.out.println("Clon: ");
            for(int i = 0; i < clone.getLargo(); i++){
                System.out.println(clone.getCelda()[i]);
            }

            /*
            *   Modifica la clase ConjuntoNumeros, de forma que su atributo celda, en
                lugar de ser un array de int, será un array de objetos de tipo Numero.
                Analiza las consecuencias que tendrá esto en el clone
                * --> En este caso tendria que clonar cada uno de los objetos numero con un ciclo
                *
       public Object clone() {
        try {
            ConjuntoNumeros clon = (ConjuntoNumeros) super.clone();
            if (this.celda != null) {
                clon.celda = this.celda.clone();
                for (int i = 0; i < this.celda.length; i++) {
                    if (this.celda[i] != null) {
                        clon.celda[i] = (Numero) this.celda[i].clone();
                    }
                }
            }
            return clon;
        } catch (CloneNotSupportedException e) {
        System.out.println("Error al clonar: " + e.getMessage());
        return null;
        }
      }

            * */
    }
}