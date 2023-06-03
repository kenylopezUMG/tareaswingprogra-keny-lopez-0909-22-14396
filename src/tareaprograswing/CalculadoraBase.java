package tareaprograswing;

import java.util.Random;

public class CalculadoraBase {
    public String tipoCalculadora;
    public String color;
    public int dimensionPantalla;
    private String numeroDeSerie;
    private String nombrePropietario;
    
    public CalculadoraBase(String propietario) {
        this.tipoCalculadora = "Calculadora Básica";
        this.dimensionPantalla = 10;
        this.numeroDeSerie = "12345abc";
        this.color = "Azul";
        this.nombrePropietario = propietario;
    }
    
    public CalculadoraBase() {
    }
    
    public double sumar(double primerNumero, double segundoNumero) {
        return primerNumero + segundoNumero;
    }
    
    public double restar(double primerNumero, double segundoNumero) {
        return primerNumero - segundoNumero;
    }
    
    public double multiplicar(double primerNumero, double segundoNumero) {
        return primerNumero * segundoNumero;
    }
    
    public double dividir(double primerNumero, double segundoNumero) {
        return primerNumero / segundoNumero;
    }
    
    public double raizCuadrada(double numero) {
        return Math.sqrt(numero);
    }
    
    public boolean esPrimo(int numeroBuscado) {
        boolean primo = false;
        int contador = 0;
        for (int i = numeroBuscado; i > 0; i--) {
            if (numeroBuscado % i == 0) {
                contador++;
            }
        }
        if (contador == 2) {
            return true;
        } else {
            return false;
        }
    }   
    
    public int sumatoriaDeNumerosAleatorios() {
        int resultado = 0;
        // Realiza la suma de dos números generados aleatoriamente
        Random random = new Random();
        int num1 = random.nextInt(100);
        int num2 = random.nextInt(100);
        resultado = num1 + num2;
        return resultado;
    }
    
    public double SenoDeAngulos() {
        double resultado = 0.0;
        // Calcula el seno de un ángulo aleatorio en radianes
        Random random = new Random();
        double angulo = Math.toRadians(random.nextDouble() * 360);
        resultado = Math.sin(angulo);
        return resultado;
    }
    
    public String CadenaInvertida() {
        String resultado = "";
        // Genera una cadena de texto aleatoria
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            char c = (char) (random.nextInt(26) + 'a');
            sb.append(c);
        }
        resultado = sb.toString();
        return resultado;
    }
    
    public boolean VerificarNumeroPar() {
        boolean resultado = false;
        // Verifica si un número aleatorio es par
        Random random = new Random();
        int numero = random.nextInt(100);
        resultado = numero % 2 == 0;
        return resultado;
    }
    
    public int Factorialdeunnumero() {
        int resultado = 0;
        // Calcula el factorial de un número aleatorio
        Random random = new Random();
        int numero = random.nextInt(10) + 1;
        resultado = factorial(numero);
        return resultado;
    }
    
    private int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}