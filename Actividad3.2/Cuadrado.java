public class Cuadrado {
    double Lado;
    Cuadrado(double Lado) {
        this.Lado = Lado;
    }
    double Area(){
        return Lado *Lado;
    }
    double Perimetro() {
        return 4*Lado;
    }
}