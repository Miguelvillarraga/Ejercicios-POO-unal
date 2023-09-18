public class Circulo {
    double Radio;
    Circulo(double Radio){
        this.Radio = Radio;
    }
    double Area(){
        return Math.PI*Math.pow(Radio,2);
    }
    double Perimetro() {
        return 2*Math.PI*Radio;
    }
}
