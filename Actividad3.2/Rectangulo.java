public class Rectangulo {
    double Base, Altura;
    Rectangulo(double Base, double Altura) {
        this.Base = Base;
        this.Altura = Altura;
    }
    double Area(){
        return Base *Altura;
    }
    double Perimetro() {
        return 2*Altura + 2*Base;
    }
}
