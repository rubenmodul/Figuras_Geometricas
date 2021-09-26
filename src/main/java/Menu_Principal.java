import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Menu_Principal {
  public static void main(String[] args) {

    //Llamamos a la funcion donde hemos creado ALEATORIAMENTE 10 figuras
    aleatorios();

    //Variable de Menu principal
    int opc;
    boolean seguir=true;
    Scanner teclat = new Scanner(System.in);
    //Creamos nuestro menu
    while(seguir) {
      System.out.println();
      System.out.println("************************");
      System.out.println("*    MENU PRINCIPAL    *");
      System.out.println("************************");
      System.out.println("1.- Listar");
      System.out.println("2.- Dibujar");
      System.out.println("3.- Perímetros");
      System.out.println("4.- Areas");
      System.out.println("5.- Escalar");
      System.out.println("6.- Mover");
      System.out.println("7.- Desplazar");
      System.out.println("8.- Ordenar");
      System.out.println("9.- Salir");
      do {
        System.out.println("Elige una opcion: ");
        opc = teclat.nextInt();
      } while (opc < 1 || opc > 9);

      switch (opc) {
        case 1:
          Lienzo.listar();
          break;
        case 2:
          Lienzo.dibujar();
          break;
        case 3:
          Lienzo.perimetro();
          break;
        case 4:
          Lienzo.area();
          break;
        case 5:
          int id = Leer.leerEntero("Dime la id de la figura: ");
          int porcentaje = Leer.leerEntero("Dime el porcentaje que quieres aumentar: ");
          Lienzo.escalar(id, porcentaje);
          break;
        case 6:
          id = Leer.leerEntero("Dime la id de la figura: ");
          Punto p = new Punto(Leer.leerDouble("Intruze x: "), Leer.leerDouble("Introduze la y: "));
          Lienzo.mover(id, p);
          break;
        case 7:
          id = Leer.leerEntero("Dime la id de la figura: ");
          String se = Leer.leerTexto("Mover en horizontal(h) o vertical(v): ");
          if (se.equalsIgnoreCase("h")) {
            double des = Leer.leerDouble("Cuanto quieres desplazarla: ");
            Lienzo.desplazarh(id, des);
          } else if (se.equalsIgnoreCase("v")) {
            double des = Leer.leerDouble("Cuanto quieres desplazarla: ");
            Lienzo.desplazarv(id, des);
          } else {
            System.out.println("No me has respondido bien!!");
          }
          break;

        case 8:

          //Variable de Menu Comparar
          int opc1;

          System.out.println("***********************");
          System.out.println("*    MENU COMPARAR    *");
          System.out.println("***********************");
          System.out.println("1.- Area");
          System.out.println("2.- Perímetro");
          System.out.println("3.- Posición");

          do {
            System.out.println("Elige una opcion: ");
            //Recogemos respuesta con la variable "opc1"
            opc1 = teclat.nextInt();
          } while (opc1 < 1 && opc1 > 4);

          String ord = Leer.leerTexto("Dime si quieres ordenarlo asc(a) o desc(d): ");


          switch (opc1) {
            case 1:
              Collections.sort(Lienzo.figures, Figura::compareTo);
              if (ord.equalsIgnoreCase("d")) {
                Collections.reverse(Lienzo.figures);
              }
              Lienzo.area();
              break;
            case 2:
              Collections.sort(Lienzo.figures, Figura::compareToP);
              if (ord.equalsIgnoreCase("d")) {
                Collections.reverse(Lienzo.figures);
              }
              Lienzo.perimetro();
              break;
            case 3:
              Collections.sort(Lienzo.figures, Figura::compareToD);
              if (ord.equalsIgnoreCase("a")) {
                Collections.reverse(Lienzo.figures);
              }
              Lienzo.dibujar();
              break;
          }
          break;
        case 9:
          seguir = false;
          System.out.println("Programa finalizado, gracias!");
          break;
      }

    }
  }
  public static void aleatorios() {
    String[] colores = {"azul", "rojo", "verde", "negro", "amarillo", "rosa", "blanco", "gris"};
    for (int i = 0; i < 10; i++) {
      int opc = (int) (Math.random() * 3);
      switch (opc) {
        case 0:
          Cuadrado a = new Cuadrado(i, colores[(int) (Math.random() * 7)], colores[(int) (Math.random() * 7)], new Punto(Math.random() * 100, Math.random() * 100), Math.random() * 100);
          Lienzo.figures.add(a);
          break;
        case 1:
          Circulo b = new Circulo(i, colores[(int) (Math.random() * 7)], colores[(int) (Math.random() * 7)], new Punto(Math.random() * 100, Math.random() * 100), Math.random() * 100);
          Lienzo.figures.add(b);
          break;
        case 2:
          Rectangulo c = new Rectangulo(i, colores[(int) (Math.random() * 7)], colores[(int) (Math.random() * 7)], new Punto(Math.random() * 100, Math.random() * 100), Math.random() * 100, Math.random() * 100);
          Lienzo.figures.add(c);
          break;
        case 3:
          Triangulo d = new Triangulo(i, colores[(int) (Math.random() * 7)], colores[(int) (Math.random() * 7)], new Punto(Math.random() * 100, Math.random() * 100), Math.random() * 100, Math.random() * 100);
          Lienzo.figures.add(d);
          break;
      }
    }
  }
}
