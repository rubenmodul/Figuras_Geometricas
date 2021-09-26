import org.w3c.dom.ls.LSOutput;

import java.io.DataOutputStream;
import java.util.ArrayList;

public class Lienzo{

  public static ArrayList<Figura> figures = new ArrayList<>();

  /**
   * Dibujara la figura
   */
  //Metodos
  public static void dibujar(){
    for (Figura f: figures){
      f.dibujar();
    }
  }

  /**
   * Nos muestra el area de las figuras
   */
  public static void area(){
    for(Figura f: figures){
      System.out.println("Id: " + f.id + " Area: " + f.area());
    }
  }

  /**
   * Muestra los perimetros de las figuras
   */
  public static void perimetro(){
    for(Figura f: figures){
      System.out.println("Id: " + f.id + " Perimetro: " + f.perimetro());
    }
  }

  /**
   *
   * Muetsra la distancia entre las figuras
   *
   * @param id
   */
  public static void distancia(int id){
    Figura f = buscar(id);
    for(Figura l : figures){
      if(l.id == id){
        continue;
      }
      System.out.println("Id 1: "+ f.id + " Id 2: " + l.id + " Distancia entre las dos: "+l.distancia(f));
    }
  }

  /**
   * Muestra todas las figuras
   */
  public static void listar(){
    for(Figura f: figures){
      System.out.println(f);
    }
  }

  /**
   *
   * Modificamos el tamaño de la figura
   *
   * @param id (identificador de la figura)
   * @param porcentaje (porcentaje que moveremos la figura)
   */
  public static void escalar(int id, int porcentaje ){
    Figura f = buscar(id);
    f.escalar(porcentaje);
  }

  /**
   *
   * Movemos la figura
   *
   * @param id  (identificador)
   * @param p (Punto)
   */
  public static void mover(int id, Punto p){
    Figura f = buscar(id);
    f.mover(p);
  }

  /**
   *
   * Desplazaremos la figura horizontalmente
   *
   * @param id (Identifiador)
   * @param x
   */
  public static void desplazarh(int id, double x){
    Figura f = buscar(id);
    f.desplazarh(x);
  }

  /**
   *
   * Desplazaremos la figura verticalmente
   *
   * @param id (identificador)
   * @param y
   */
  public static void desplazarv(int id, double y){
    Figura f = buscar(id);
    f.desplazarv(y);
  }


  public void rellenar() {

  }

  public static Figura buscar(int id){
    for(Figura f : figures){
      if(f.id==id){
        return f;
      }
    }
    return null;
  }


}
