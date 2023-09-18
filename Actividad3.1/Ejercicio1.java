import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Ejercicio1 extends JFrame implements ActionListener{
    private JTextField codigoField, nombresField, horasField, valorHoraField, retencionField;
    private JButton Calcular;
    private JLabel Resultado;
    public Ejercicio1() {
        setTitle("Calculadora de Salario de Empleado");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2));
        panel.add(new JLabel("Código del Empleado:"));
        codigoField = new JTextField();
        panel.add(codigoField);
        panel.add(new JLabel("Nombres del Empleado:"));
        nombresField = new JTextField();
        panel.add(nombresField);
        panel.add(new JLabel("Horas Trabajadas al Mes:"));
        horasField = new JTextField();
        panel.add(horasField);
        panel.add(new JLabel("Valor por Hora Trabajada:"));
        valorHoraField = new JTextField();
        panel.add(valorHoraField);
        panel.add(new JLabel("Porcentaje de Retención (%):"));
        retencionField = new JTextField();
        panel.add(retencionField);
        Calcular = new JButton("Calcular Salario");
        Calcular.addActionListener(this);
        panel.add(Calcular);
        Resultado = new JLabel("");
        panel.add(Resultado);
        add(panel);
    }

    public void actionPerformed(ActionEvent Calculo) {
        if (Calculo.getSource() == Calcular){
            try {
                int codigo = Integer.parseInt(codigoField.getText());
                String nombres = nombresField.getText();
                int horasTrabajadas = Integer.parseInt(horasField.getText());
                double valorHora = Double.parseDouble(valorHoraField.getText());
                double retencion = Double.parseDouble(retencionField.getText());
                double salarioBruto = horasTrabajadas * valorHora;
                double salarioNeto = salarioBruto * (1 - (retencion / 100));
                String resultado = "Código: " + codigo + "<br>Nombres: " + nombres + "<br>Salario Bruto: $" + salarioBruto + "<br>Salario Neto: $" + salarioNeto;
                Resultado.setText("<html>" + resultado + "</html>");
            } catch (NumberFormatException ex) {
                Resultado.setText("Por favor, ingrese valores válidos.");
            }
        }
    }

    public static void main(String[] args) {
        Ejercicio1 ventana = new Ejercicio1();
        ventana.setVisible(true);
    }
}