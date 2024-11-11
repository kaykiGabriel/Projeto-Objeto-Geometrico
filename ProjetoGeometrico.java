// Classe abstrata Forma
abstract class Forma {
    // Método abstrato para calcular a área
    public abstract double calcularArea();

    // Método para exibir o nome da forma e a área
    public void exibirInfo() {
        System.out.println("Área: " + calcularArea());
    }
}

// Classe Círculo que herda de Forma
class Circulo extends Forma {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public void exibirInfo() {
        System.out.println("Forma: Círculo");
        super.exibirInfo();
    }
}

// Classe Retângulo que herda de Forma
class Retangulo extends Forma {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return largura * altura;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Forma: Retângulo");
        super.exibirInfo();
    }
}

// Classe Triângulo que herda de Forma
class Triangulo extends Forma {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Forma: Triângulo");
        super.exibirInfo();
    }
}

// Classe principal para teste
public class ProjetoGeometrico {
    public static void main(String[] args) {
        Forma circulo = new Circulo(5);
        Forma retangulo = new Retangulo(4, 6);
        Forma triangulo = new Triangulo(3, 7);

        // Exibindo informações sobre cada forma
        circulo.exibirInfo();
        retangulo.exibirInfo();
        triangulo.exibirInfo();
    }
}
