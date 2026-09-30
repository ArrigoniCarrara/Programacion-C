//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            CuentaBancaria cuenta1 = new CuentaBancaria(3050, "Pablo");
            try{
                cuenta1.depositar(100);
            }catch(DepositoInvalidoException e) {
                System.out.println(e.getMessage() + " -> la cantidad ingresada fue " + e.getCantidad());
            }

            try{
                cuenta1.extraer(100);
            }
            catch(ExtraccionInvalidaException e){
            System.out.println(e.getMessage() + " -> la cantidad ingresada fue " + e.getCantidad() + " y el saldo disponible actualmente es de " + e.getSaldoact());
        }
    }
}