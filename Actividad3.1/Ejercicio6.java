import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Math;
public class Ejercicio6 extends JFrame implements ActionListener{
    private JTextField AText, BText, CText;
    private JButton Calcular;
    private JLabel Resultado;
    public Ejercicio6() {
        setTitle("Calculadora ecuaciones de segundo grado");
        setSize(350, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));
        panel.add(new JLabel("Valor de A:"));
        AText = new JTextField();
        panel.add(AText);
        panel.add(new JLabel("Valor de B:"));
        BText = new JTextField();
        panel.add(BText);
        panel.add(new JLabel("Valor de C:"));
        CText = new JTextField();
        panel.add(CText);
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
                double A = Double.parseDouble(AText.getText());
                double B = Double.parseDouble(BText.getText());
                double C = Double.parseDouble(CText.getText());
                double disc = B * B - 4 * A * C;
                double X1,X2;
                if (disc>0){
                    X1 = (-B + Math.sqrt(disc)) / (2 * A);
                    X2 = (-B - Math.sqrt(disc)) / (2 * A);
                    Resultado.setText("<html>"+"X1 = "+X1+"<br>"+"X2 = "+X2+"</html>");
                }else if (disc==0){
                    X1 = -B / (2 * A);
                    Resultado.setText("X = "+X1);
                }else{
                    Resultado.setText("No hay soluciones reales.");
                }
            } catch (NumberFormatException ex) {
                Resultado.setText("Por favor, ingrese valores válidos.");
            }
        }
    }

    public static void main(String[] args) {
        Ejercicio6 ventana = new Ejercicio6();
        ventana.setVisible(true);
    }
}