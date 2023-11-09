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


val funcion1: Double => Double = (x:Double) => -Math.pow(x,2)+(8*x)-12

val res1: Double = integración(3,5,funcion1)

val funcion2: Double => Double = (x : Double) => 3*Math.pow(x,2)

val res2: Double = integración(0,2,funcion2)

val funcion3: Double => Double = (x : Double) => x+2*Math.pow(x,2)- Math.pow(x,3)+5*Math.pow(x,4)

val res3: Double = integración(-1,1,funcion3)

val funcion4: Double => Double = (x : Double) => ((2*x+1)/(Math.pow(x,2)+x))

val res4: Double = integración(1,2,funcion4)

val funcion5: Double => Double = (x : Double) => Math.pow(Math.E,x)

val res5: Double =  integración(0,1,funcion5)

val funcion6: Double => Double = (x : Double) => (1/Math.sqrt(x-1))

val res6: Double = integración(2,3,funcion6)

val funcion7: Double => Double = (x : Double) => (1/(1+Math.pow(x,2)))

val res7: Double =  integración(0,1,funcion7)

/* Calcula el error que se presenta en cada aproximación. El error es igual al valor
absoluto de la resta entre el valor esperado y el valor obtenido, así:
|valorEsperado - valorObtenido|
Para calcular el error, debes elaborar una función que haga el cálculo respectivo.
*/

def errorcalcular(valesp : Double, valobt : Double) : Double = (valesp - valobt)


errorcalcular(7.33, res1)
errorcalcular(8, res2)
errorcalcular(3.33, res3)
errorcalcular(1.09861, res4)
errorcalcular(1.71828, res5)
errorcalcular(0.828427, res6)
errorcalcular(0.785398, res7)

