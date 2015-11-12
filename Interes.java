/**
*fichero Interes.java
*Clase el interés (I) que produce un capital
*el cúal  es directamente proporcional al capital inicial (C),
*al tiempo (t), y a la tasa de interés (i) :
*I = C · i · t

*@author Pedro Torrebejano
*@version 1
**/
public class Interes {
	public static double calcularInter(double Capital, double tiempo, double tasadeinteres){
   /**
    * 
    * código para calcular el interes
	* return interes
	* @param Capital capital inicial
	* @param tiempo tiempo de amortización
	* @param tasadeinteres tasa de interes
	* @return resultado 
	**/
	double I= Capital*tiempo*tasadeinteres;
	return I;
	}
}
