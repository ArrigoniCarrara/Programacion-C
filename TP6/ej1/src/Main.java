//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            try{
                 Usuario usuario = new Usuario("Messi", "holamundo");
                 usuario.setNombre("Rodrigo");
                 usuario.setContra("unodostrescuatro");
                 System.out.println(usuario.getNombre());
                 System.out.println(usuario.getContra());
            }catch (Exception e){
                    System.out.println(e.getMessage());
            }
        }
}