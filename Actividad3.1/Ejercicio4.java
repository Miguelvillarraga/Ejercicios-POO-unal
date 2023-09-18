import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Ejercicio4 extends JFrame implements ActionListener{
    private JTextField NITText, NombreText, PatrimonioText, EstratoText;
    private JButton Calcular;
    private JLabel Resultado;
    public Ejercicio4() {
        setTitle("Calculadora pago matricula");
        setSize(350, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));
        panel.add(new JLabel("Numero Matricula:"));
        NITText = new JTextField();
        panel.add(NITText);
        panel.add(new JLabel("Nombre estudiante:"));
        NombreText = new JTextField();
        panel.add(NombreText);
        panel.add(new JLabel("Patrimonio:"));
        PatrimonioText = new JTextField();
        panel.add(PatrimonioText);
        panel.add(new JLabel("Estrato:"));
        EstratoText = new JTextField();
        panel.add(EstratoText);
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
                int NIT = Integer.parseInt(NITText.getText());
                String Nombres = NombreText.getText();
                double Patrimonio = Double.parseDouble(PatrimonioText.getText());
                int Estrato = Integer.parseInt(EstratoText.getText());
                double r;
                if ((Patrimonio>2000000) && (Estrato>3)){
                    r = (50000+(Patrimonio*0.03));
                }else{
                    r = 50000;
                }
                Resultado.setText("<html>"+"NIT: "+NIT+"<br>"+"Nombre: "+Nombres+"<br>"+"Valor matricula: $"+r+"</html>");
            } catch (NumberFormatException ex) {
                Resultado.setText("Por favor, ingrese valores válidos.");
            }
        }
    }

    public static void main(String[] args) {
        Ejercicio4 ventana = new Ejercicio4();
        ventana.setVisible(true);
    }
}