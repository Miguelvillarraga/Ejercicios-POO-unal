import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Ejercicio3 extends JFrame implements ActionListener{
    private JTextField AText, BText;
    private JButton Calcular;
    private JLabel Resultado;
    public Ejercicio3() {
        setTitle("Calculadora comparación entre dos numeros");
        setSize(250, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));
        panel.add(new JLabel("Número A:"));
        AText = new JTextField();
        panel.add(AText);
        panel.add(new JLabel("Número B:"));
        BText = new JTextField();
        panel.add(BText);
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
                if (A<B){
                    Resultado.setText("A es menor que B");
                } else if (B<A){
                    Resultado.setText("A es mayor que B");
                }else{
                    Resultado.setText("A es igual que B");
                }
            } catch (NumberFormatException ex) {
                Resultado.setText("Por favor, ingrese valores válidos.");
            }
        }
    }

    public static void main(String[] args) {
        Ejercicio3 ventana = new Ejercicio3();
        ventana.setVisible(true);
    }
}