public class Circulo extends Figura{

  //Atributos
  double radio;

  public Circulo(int id, String borde, String relleno, Punto origen, double radio) {
    super(id, borde, relleno, origen);
    this.radio = radio;
  }

  @Override
  public double area() {
    return Math.PI*(this.radio*this.radio);
  }

  @Override
  public double perimetro() {
    return (2*Math.PI)*this.radio;
  }

  @Override
  public void escalar(int porcentaje) {
    this.radio = (porcentaje/100)*this.radio;
  }

  @Override
  public String toString() {
    return "Circulo{" +
        "id=" + this.id +
        ", x=" + this.origen.getX() +
        ", y=" + this.origen.getY() +
        '}';
  }
}

