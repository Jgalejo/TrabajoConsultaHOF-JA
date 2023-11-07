/*1. Crear una función con nombre (integracion) que use el 
método de Simpson para calcular el valor aproximado de cualquier función
*/

def integración(a:Int,b:Int,f:Double => Double):Double={
  (b-a)*(f(a)+4*f((a+b)/2)+f(b))/6
}

/* 1.1 El tipo de dato que devolverá la función integracion
R: La función integracion devolvera un Double
*/

/* 1.2  ¿Cuáles son los parámetros que recibe la función?
R:  (a:Int,b:Int,f:Double => Double)
*/

/*2. Aproxima el valor de las siguientes integrales definidas usando la función
integracion creada en el paso 1.
*/


val funcion1 = (x:Double) => -Math.pow(x,2)+(8*x)-12

val res1 = integración(3,5,funcion1)

val funcion2 = (x : Double) => 3*Math.pow(x,2)

val res2 = integración(0,2,funcion2)

val funcion3 = (x : Double) => x+2*Math.pow(x,2)- Math.pow(x,3)+5*Math.pow(x,4)

val res3 = integración(-1,1,funcion3)

val funcion4 = (x : Double) => ((2*x+1)/(Math.pow(x,2)+x))

val res4 = integración(1,2,funcion4)