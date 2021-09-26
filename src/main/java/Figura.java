public abstract class Figura implements Dibujable,Comparable<Figura>{

  //Aributos
  int id;
  String borde;
  String relleno;
  Punto origen;

  //Constructor
  public Figura(int id, String borde, String relleno, Punto origen) {
    this.id = id;
    this.borde = borde;
    this.relleno = relleno;
    this.origen = origen;
  }

  /**
   *
   * Caculamos el area
   *
   * @return area
   */
  public abstract double area();

  /**
   *
   * Calculamos el perimetro
   *
   * @return perimetro
   */
  public abstract double perimetro();

  /**
   *
   * Calculamos la distancia entre dos figuras
   *
   * @param f (figura)
   *
   * @return la distancia
   */
  public double distancia(Figura f){
    return Math.sqrt(Math.pow(f.origen.getX() - this.origen.getX(), 2) + Math.pow(f.origen.getY() - this.origen.getY(), 2));
  }

  /**
   *
   * Modificar el tamaño de la figura
   *
   * @param porcentaje (que queremos modificar)
   */
  public abstract void escalar(int porcentaje);

  /**
   *
   * Cambiar el punto de origen de una figura
   *
   * @param p (punto)
   */
  public void mover (Punto p){
    this.origen = p;
  }

  /**
   *
   * Desplazar la figura horizontalmente
   *
   * @param x (double)
   */
  public void desplazarh (double x){
    this.origen = new Punto(x + this.origen.getX(), this.origen.getY());
  }

  /**
   *
   * Desplazar la figura verticalmente
   *
   * @param y (double)
   */
  public void desplazarv ( double y){
    this.origen = new Punto(this.origen.getX(), y + this.origen.getY());
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getBorde() {
    return borde;
  }

  public void setBorde(String borde) {
    this.borde = borde;
  }

  public String getRelleno() {
    return relleno;
  }

  public void setRelleno(String relleno) {
    this.relleno = relleno;
  }

  @Override
  public void dibujar() {
    System.out.println(this);
  }

  @Override
  public void rellenar() {

  }

  @Override
  public int compareTo(Figura f) {
    return (int) (this.area()-f.area());
  }

  public int compareToP(Figura f) {
    return (int) (this.perimetro()-f.perimetro());
  }

  public int compareToD(Figura f) {
    return (int) (this.distancia(f)-f.distancia(this));
  }
}
