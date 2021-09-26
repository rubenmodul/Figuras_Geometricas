public class Rectangulo extends Figura{

  //Atributos
  double base;
  double altura;

  public Rectangulo(int id, String borde, String relleno, Punto origen, double base, double altura) {
    super(id, borde, relleno, origen);
    this.base = base;
    this.altura = altura;
  }

  @Override
  public double area() {
    return this.base*this.altura;
  }

  @Override
  public double perimetro() {
    return this.base*2 + this.altura*2;
  }

  @Override
  public void escalar(int porcentaje) {
    this.base = (porcentaje/100)*this.base;
    this.altura = (porcentaje/100)*this.altura;
  }

  @Override
  public String toString() {
    return "Rectangulo{" +
        "id=" + this.id +
        ", x=" + this.origen.getX() +
        ", y=" + this.origen.getY() +
        '}';
  }
}

