public class Cuadrado extends Figura{

  //Atributos
  double lado;


  public Cuadrado(int id, String borde, String relleno, Punto origen, double lado) {
    super(id, borde, relleno, origen);
    this.lado = lado;
  }

  @Override
  public double area() {

    return this.lado*this.lado;
  }

  @Override
  public double perimetro() {

    return this.lado*4;
  }

  @Override
  public void escalar(int porcentaje) {
    this.lado = (porcentaje / 100)*this.lado;
  }

  @Override
  public String toString() {
    return "Cuadrado{" +
        "id=" + this.id +
        ", x=" + this.origen.getX() +
        ", y=" + this.origen.getY() +
        '}';
  }
}
