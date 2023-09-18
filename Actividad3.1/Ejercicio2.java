import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Math;
public class Ejercicio2 extends JFrame implements ActionListener{
    private JTextField LadoText;
    private JButton Calcular;
    private JLabel Resultado;
    public Ejercicio2() {
        setTitle("Calculadora de triangulo equilatero");
        setSize(200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));
        panel.add(new JLabel("Lado:"));
        LadoText = new JTextField();
        panel.add(LadoText);
        Calcular = new JButton("Calcular");
        Calcular.addActionListener(this);
        panel.add(Calcular);
        Resultado = new JLabel("");
        panel.add(Resultado);
        add(panel);
    }
    public void actionPerformed(ActionEvent Calculo) {
        if (Calculo.getSource() == Calcular){
            try {
                double Lado = Double.parseDouble(LadoText.getText());
                double Perimetro = 3*Lado;
                double Altura = Math.sqrt((((Lado*Lado)-((Lado/2)*(Lado/2)))));
                double Area = Altura*Lado/2;
                String resultado = "Perimetro: " + Perimetro + "<br>Altura: " + Altura + "<br>Area: " + Area;
                Resultado.setText("<html>" + resultado + "</html>");
            } catch (NumberFormatException ex) {
                Resultado.setText("Por favor, ingrese valores válidos.");
            }
        }
    }

    public static void main(String[] args) {
        Ejercicio2 ventana = new Ejercicio2();
        ventana.setVisible(true);
    }
}