import java.util.Scanner;

public class Cuenta {
    private int numeroCuenta;
    private long DNI;
    private double saldo;

    Scanner scanner = new Scanner();

    public Cuenta() {

    }

    public Cuenta(int numeroCuenta, long DNI, double saldo) {
        this.scanner = new Scanner(System.in);
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return this.numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDNI() {
        return this.DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public double setSaldo(double saldo) {
        this.saldo = saldo;
        return saldo;
    }

    public void crearCuenta() {
        System.out.println("Ingresar numero de cuenta");
        this.numeroCuenta = this.scanner.nextInt();
        System.out.println("Ingresar DNI");
        this.DNI = (long)this.scanner.nextInt();
        System.out.println("Ingresar saldo");
        this.saldo = this.scanner.nextDouble();
    }

    public void ingresar() {
        System.out.println("Saldo para ingresar:");
        this.saldo += this.scanner.nextDouble();
    }

    public void retirar() {
        System.out.println("Saldo para retirar");
        double retiro = this.scanner.nextDouble();
        if (retiro <= this.saldo) {
            this.saldo -= retiro;
        } else {
            this.saldo = 0.0;
        }

    }

    public void extraccionRapida() {
        double cantidad = this.saldo * 0.2;
        this.saldo -= cantidad;
    }

    public void consultarDatos() {
        System.out.println("Numero de cuenta:" + this.numeroCuenta);
        System.out.println("DNI:" + this.DNI);
        System.out.println("Saldo :" + this.saldo);
    }

    public void consultarSaldo() {
        System.out.println("saldo en la cuenta:" + this.saldo);
    }
}

}
