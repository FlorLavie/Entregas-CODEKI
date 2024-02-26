//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Operacion {
    private int numero1;
    private int numero2;

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
        this.numero1 = 0;
        this.numero2 = 0;
    }

    public int getNumero1() {
        return this.numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return this.numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = 2;
    }

    public void creaOperacion() {
        System.out.println("Ingresar numero 1");
        Scanner scanner = new Scanner(System.in);
        this.numero1 = scanner.nextInt();
        System.out.println("Ingresar numero 2");
        this.numero2 = scanner.nextInt();
    }

    public int sumar() {
        return this.numero1 + this.numero2;
    }

    public int restar() {
        return this.numero1 - this.numero2;
    }

    public int multiplicar() {
        if (this.numero1 != 0 && this.numero2 != 0) {
            return this.numero1 * this.numero2;
        } else {
            System.out.println("no se puede multiplicar");
            return 0;
        }
    }

    public int dividir() {
        return (int)((double)this.numero1 / (double)this.numero2);
    }
}
