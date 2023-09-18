import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Figuras extends JFrame implements ActionListener{
    private JTextField CirculoRadioText, RectanguloLadoText, RectanguloAnchoText,TrianguloAlturaText, TrianguloLadoText, CuadradoLadoText;
    private JButton Calcular;
    private JLabel N1, N2, N3, N4,N5, N6, N7, N8, Circulo, Rectangulo, Triangulo, Cuadrado, ResultadoCirculo, ResultadoRectangulo, ResultadoTriangulo, ResultadoCuadrado;
    public Figuras() {
        setTitle("Figuras");
        setSize(450, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(15, 2));

        Circulo = new JLabel("Circulo");
        panel.add(Circulo);
        
        N1 = new JLabel("");
        panel.add(N1);

        panel.add(new JLabel("Radio:"));
        CirculoRadioText = new JTextField();
        panel.add(CirculoRadioText);

        N5 = new JLabel("");
        panel.add(N5);

        ResultadoCirculo = new JLabel("");
        panel.add(ResultadoCirculo);

        Rectangulo = new JLabel("Rectangulo");
        panel.add(Rectangulo);

        N2 = new JLabel("");
        panel.add(N2);
        
        panel.add(new JLabel("Lado:"));
        RectanguloLadoText = new JTextField();
        panel.add(RectanguloLadoText);

        panel.add(new JLabel("Ancho:"));
        RectanguloAnchoText = new JTextField();
        panel.add(RectanguloAnchoText);

        N6 = new JLabel("");
        panel.add(N6);

        ResultadoRectangulo = new JLabel("");
        panel.add(ResultadoRectangulo);

        Cuadrado = new JLabel("Cuadrado");
        panel.add(Cuadrado);

        N3 = new JLabel("");
        panel.add(N3);

        panel.add(new JLabel("Lado:"));
        CuadradoLadoText = new JTextField();
        panel.add(CuadradoLadoText);

        N7 = new JLabel("");
        panel.add(N7);

        ResultadoCuadrado = new JLabel("");
        panel.add(ResultadoCuadrado);

        Triangulo = new JLabel("Triangulo");
        panel.add(Triangulo);

        N4 = new JLabel("");
        panel.add(N4);

        panel.add(new JLabel("Lado:"));
        TrianguloLadoText = new JTextField();
        panel.add(TrianguloLadoText);

        panel.add(new JLabel("Altura:"));
        TrianguloAlturaText = new JTextField();
        panel.add(TrianguloAlturaText);

        N8 = new JLabel("");
        panel.add(N8);

        ResultadoTriangulo = new JLabel("");
        panel.add(ResultadoTriangulo);

        Calcular = new JButton("Calcular");
        Calcular.addActionListener(this);

        panel.add(Calcular);
        add(panel);
    }

    public void actionPerformed(ActionEvent Calculo) {
        if (Calculo.getSource() == Calcular){
            try {
                double RadioCirculo = Double.parseDouble(CirculoRadioText.getText());
                double LadoRectangulo = Double.parseDouble(RectanguloLadoText.getText());
                double AnchoRectangulo = Double.parseDouble(RectanguloAnchoText.getText());
                double LadoTriangulo = Double.parseDouble(TrianguloLadoText.getText());
                double AlturaTriangulo = Double.parseDouble(TrianguloAlturaText.getText());
                double LadoCuadrado = Double.parseDouble(CuadradoLadoText.getText());
                double AreaCirculo, PerimetroCirculo, AreaRectangulo, PerimetroRectangulo, AreaCuadrado, PerimetroCuadrado, AreaTriangulo, PerimetroTriangulo;
                String TipoTriangulo;
                Circulo figura1 = new Circulo(RadioCirculo);
                Rectangulo figura2  = new Rectangulo(LadoRectangulo, AnchoRectangulo);
                Cuadrado figura3 = new Cuadrado(LadoCuadrado);
                TrianguloRectangulo figura4 = new TrianguloRectangulo(LadoTriangulo,AlturaTriangulo);
                AreaCirculo= figura1.Area();
                PerimetroCirculo= figura1.Perimetro();
                AreaRectangulo = figura2.Area();
                PerimetroRectangulo = figura2.Perimetro();
                AreaCuadrado = figura3.Area();
                PerimetroCuadrado = figura3.Perimetro();
                AreaTriangulo= figura4.Area();
                PerimetroTriangulo= figura4.Perimetro();
                TipoTriangulo = figura4.TipoTriangulo();
                ResultadoCirculo.setText("<html>"+"Area: "+AreaCirculo+"<br>"+"Perimetro: "+PerimetroCirculo+"</html>");
                ResultadoRectangulo.setText("<html>"+"Area: "+AreaRectangulo+"<br>"+"Perimetro: "+PerimetroRectangulo+"</html>");
                ResultadoCuadrado.setText("<html>"+"Area: "+AreaCuadrado+"<br>"+"Perimetro: "+PerimetroCuadrado+"</html>");
                ResultadoTriangulo.setText("<html>"+"Area: "+AreaTriangulo+"<br>"+"Perimetro: "+ PerimetroTriangulo+"<br>"+TipoTriangulo+"</html>");
            } catch (NumberFormatException ex) {
                ResultadoCirculo.setText("Por favor, ingrese valores válidos.");
                ResultadoRectangulo.setText("Por favor, ingrese valores válidos.");
                ResultadoCuadrado.setText("Por favor, ingrese valores válidos.");
                ResultadoTriangulo.setText("Por favor, ingrese valores válidos.");
            }
        }
    }
    public static void main(String[] args){
        Figuras ventana = new Figuras();
        ventana.setVisible(true);
    }
}