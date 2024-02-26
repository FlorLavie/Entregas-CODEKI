
public interface calculosFormas {
    double PI = 3.14;

    double calcularArea();

    double calcularPerimetro();

    public static class Circulo implements calculosFormas {
        private double radio;

        public Circulo(double radio) {
            this.radio = radio;
        }

        public double calcularArea() {
            return 3.14 * Math.pow(this.radio, 2.0);
        }

        public double calcularPerimetro() {
            return 3.14 * this.radio * 2.0;
        }
    }

    public static class Rectangulo implements calculosFormas {
        private double base;
        private double altura;

        public Rectangulo(double base, double altura) {
            this.base = base;
            this.altura = altura;
        }

        public double calcularArea() {
            return this.base * this.altura;
        }

        public double calcularPerimetro() {
            return 2.0 * (this.base + this.altura);
        }
    }
}
