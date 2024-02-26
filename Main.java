//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Operacion operacion = new Operacion();
        operacion.creaOperacion();
        System.out.println("Suma:" + operacion.sumar());
        System.out.println("Resta:" + operacion.restar());
        System.out.println("Multiplicar:" + operacion.multiplicar());
        System.out.println("Suma:" + operacion.dividir());
    }
}
