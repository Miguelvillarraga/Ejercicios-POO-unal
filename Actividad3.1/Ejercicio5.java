import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Ejercicio5 extends JFrame implements ActionListener{
    private JTextField NombreText, SalarioHoraText, HorasText;
    private JButton Calcular;
    private JLabel Resultado;
    public Ejercicio5() {
        setTitle("Calculadora salario");
        setSize(350, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));
        panel.add(new JLabel("Nombre empleado:"));
        NombreText = new JTextField();
        panel.add(NombreText);
        panel.add(new JLabel("Salario por hora:"));
        SalarioHoraText = new JTextField();
        panel.add(SalarioHoraText);
        panel.add(new JLabel("Horas trabajadas:"));
        HorasText = new JTextField();
        panel.add(HorasText);
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
                String Nombres = NombreText.getText();
                double SalarioHora = Double.parseDouble(SalarioHoraText.getText());
                int Horas = Integer.parseInt(HorasText.getText());
                double Salario = SalarioHora*Horas;
                if (Salario>450000){
                    Resultado.setText("<html>"+"Nombre: "+Nombres+"<br>"+"Salario: $"+Salario+"</html>");
                }else{
                    Resultado.setText("<html>"+"Nombre: "+Nombres+"</html>");
                }
            } catch (NumberFormatException ex) {
                Resultado.setText("Por favor, ingrese valores válidos.");
            }
        }
    }

    public static void main(String[] args) {
        Ejercicio5 ventana = new Ejercicio5();
        ventana.setVisible(true);
    }
}