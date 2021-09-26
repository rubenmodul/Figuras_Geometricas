public class Triangulo extends Figura{


  //Atributos
  double base;
  double altura;


  public Triangulo(int id, String borde, String relleno, Punto origen, double base, double altura) {
    super(id, borde, relleno, origen);
    this.base = base;
    this.altura = altura;
  }

  @Override
  public double area() {
    return (this.base*this.altura)/2;
  }

  @Override
  public double perimetro() {

    double j = (this.altura*this.altura)+(this.base*this.base);
    double c = Math.sqrt(j);

    return (c+this.base+this.altura);
  }

  @Override
  public void escalar(int porcentaje) {
    this.base = (porcentaje/100)*this.base;
    this.altura = (porcentaje/100)*this.altura;
  }

  @Override
  public String toString() {
    return "Triangulo{" +
        "id=" + this.id +
        ", x=" + this.origen.getX() +
        ", y=" + this.origen.getY() +
        '}';
  }
}

