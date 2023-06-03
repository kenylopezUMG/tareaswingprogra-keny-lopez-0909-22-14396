package tareaprograswing;

import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


public class Tareaswing {
    private JFrame frame;
    private BackgroundPanel panel;
    private JButton botonSumar;
    private JButton botonRestar;
    private JButton botonMultiplicar;
    private JButton botonDividir;
    private JButton botonRaizCuadrada;
    private JButton botonEsPrimo;
    private JButton botonSumatoria;
    private JButton botonSeno;
    private JButton botonCadenaInvertida;
    private JButton botonVerificarPar;
    private JButton botonMensajeEspecial;
    private JButton botonFactorial;
    private JTextArea resultadoTextArea;

    private Calculadora calculadora;
    private CalculadoraEspecial calculadoraEspecial;

    public Tareaswing() {
        calculadora = new Calculadora("Steven");
        calculadoraEspecial = new CalculadoraEspecial();

        frame = new JFrame("Tarea PrograPOO");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Dimension dimension = new Dimension(500, 400);
        frame.setPreferredSize(dimension);
        
        //cambiar la ruta de la imagen por una que desee//
        panel = new BackgroundPanel("/home/steven/Descargas/beautiful-anime-girl.jpg");
        panel.setLayout(new FlowLayout());

        botonSumar = new JButton("Sumar");
        botonSumar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double resultado = calculadora.sumar(10, 5);
                resultadoTextArea.setText("El resultado de la suma es = " + resultado);
            }
        });
        personalizeButton(botonSumar);

        botonRestar = new JButton("Restar");
        botonRestar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double resultado = calculadora.restar(10, 5);
                resultadoTextArea.setText("El resultado de la resta es = " + resultado);
            }
        });
        personalizeButton(botonRestar);

        botonMultiplicar = new JButton("Multiplicar");
        botonMultiplicar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double resultado = calculadora.multiplicar(10, 5);
                resultadoTextArea.setText("El resultado de la multiplicación es = " + resultado);
            }
        });
        personalizeButton(botonMultiplicar);

        botonDividir = new JButton("Dividir");
        botonDividir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double resultado = calculadora.dividir(10, 5);
                resultadoTextArea.setText("El resultado de la división es = " + resultado);
            }
        });
        personalizeButton(botonDividir);

        botonRaizCuadrada = new JButton("Raíz Cuadrada");
        botonRaizCuadrada.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double resultado = calculadora.raizCuadrada(16);
                resultadoTextArea.setText("El resultado de la raíz cuadrada es = " + resultado);
            }
        });
        personalizeButton(botonRaizCuadrada);

        botonEsPrimo = new JButton("Verificar Primo");
        botonEsPrimo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boolean esPrimo = calculadora.esPrimo(11);
                resultadoTextArea.setText("¿Es primo? = " + esPrimo);
            }
        });
        personalizeButton(botonEsPrimo);

        botonSumatoria = new JButton("Sumatoria Aleatoria");
        botonSumatoria.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int resultado = calculadoraEspecial.sumatoriaDeNumerosAleatorios();
                resultadoTextArea.setText("Resultado del Método 1 de Calculadora Especial = " + resultado);
            }
        });
        personalizeButton(botonSumatoria);

        botonSeno = new JButton("Seno de Ángulos");
        botonSeno.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double resultado = calculadoraEspecial.SenoDeAngulos();
                resultadoTextArea.setText("Resultado del Método 2 de Calculadora Especial = " + resultado);
            }
        });
        personalizeButton(botonSeno);

        botonCadenaInvertida = new JButton("Cadena Invertida");
        botonCadenaInvertida.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String resultado = calculadoraEspecial.CadenaInvertida();
                resultadoTextArea.setText("Resultado del Método 3 de Calculadora Especial = " + resultado);
            }
        });
        personalizeButton(botonCadenaInvertida);

        botonVerificarPar = new JButton("Verificar Número Par");
        botonVerificarPar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boolean esPar = calculadoraEspecial.VerificarNumeroPar();
                resultadoTextArea.setText("Resultado del Método 4 de Calculadora Especial = " + esPar);
            }
        });
        personalizeButton(botonVerificarPar);

        botonFactorial = new JButton("Factorial de un Número");
        botonFactorial.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int resultado = calculadoraEspecial.Factorialdeunnumero();
                resultadoTextArea.setText("Resultado del Método 6 de Calculadora Especial = " + resultado);
            }
        });
        personalizeButton(botonFactorial);

        resultadoTextArea = new JTextArea();
        resultadoTextArea.setEditable(false);
        personalizeTextArea(resultadoTextArea);

        panel.add(botonSumar);
        panel.add(botonRestar);
        panel.add(botonMultiplicar);
        panel.add(botonDividir);
        panel.add(botonRaizCuadrada);
        panel.add(botonEsPrimo);
        panel.add(botonSumatoria);
        panel.add(botonSeno);
        panel.add(botonCadenaInvertida);
        panel.add(botonVerificarPar);
        panel.add(botonFactorial);
        panel.add(resultadoTextArea);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    private void personalizeButton(JButton button) {
    button.setFont(new Font("Arial", Font.BOLD, 16));
    button.setBackground(Color.BLUE);
    button.setForeground(Color.WHITE);

    int borderThickness = 8; // Grosor del borde
    int bevelType = BevelBorder.RAISED; // Tipo de relieve (RAISED, LOWERED)
    Color highlightOuter = Color.LIGHT_GRAY; // Color del borde externo resaltado
    Color shadowInner = Color.DARK_GRAY; // Color del borde interno sombreado

    Border bevelBorder = new BevelBorder(bevelType, highlightOuter, shadowInner);
    Border emptyBorder = new EmptyBorder(borderThickness, borderThickness, borderThickness, borderThickness);
    button.setBorder(new CompoundBorder(bevelBorder, emptyBorder));
}
    
    private void personalizeTextArea(JTextArea textArea) {
        textArea.setFont(new Font("Arial", Font.PLAIN, 14));
        textArea.setBackground(Color.LIGHT_GRAY);
        textArea.setForeground(Color.BLACK);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Tareaswing();
            }
        });
    }
}

class BackgroundPanel extends JPanel {
    private Image backgroundImage;

    public BackgroundPanel(String imagePath) {
        try {
            backgroundImage = ImageIO.read(new File(imagePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
    }
}