/**
*fichero Interes.java
*leemos desde un Scanner los valores
*capital, tiempo y tasa de  interés

*y mediante el  método calcularInteres de la
*clase  Interes muestra por pantalla el interés
*calculado

*@author Pedro Torrebejano
*@version 1
**/
import java.util.Scanner;
public class TesInteres{
   public static void main(String[] arg){
      Scanner sc=new Scanner(System.in);
       System.out.println("Introduce el capital");
       double capital=sc.nextDouble();
       System.out.println("Introduce el tiempo");
       double tiempo=sc.nextDouble();
       System.out.println("Introduce el interés");
       double tasadeinteres=sc.nextDouble();
       double calculoInteres= Interes.calcularInter(capital,tiempo,tasadeinteres);
       System.out.printf("Cálculo resultante "+calculoInteres);
        //preparamos el scanner
        //lectura de lo datos
        //llamada al método calcularInteres
        //mostramos por pantalla el valor del interés
   }
}
