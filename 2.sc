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
/*

val funcion1 = (x:Double) => -Math.pow(x,2)+(8*x)-12

val res1 = integración(3,5,funcion1)