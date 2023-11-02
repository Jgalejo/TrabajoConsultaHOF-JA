#Programación Funcional y Reactiva
##Trabajo de consulta
#Higher Order Functions

Objetivos:
-	Aplicar los conocimientos sobre funciones de orden superior.
-	Enviar una función como parámetro.


Descripción:
Uno de los métodos de integración numérica se denomina como Simpson 1/3. Ese método estable lo siguiente:

b  f (x)d x  ≅ (b − a) f (a) + 4f (x¯) + f (b)
 

En donde: corresponde a: x¯
 
∫a	6
= a + b
2
 
Un ejemplo de aproximación es el siguiente:
 
5
I = ∫
 
= (−x2 + 8x − 12)d x ≅ 7.33
 
3

Utilizando los conceptos expuestos anteriormente debe:

1.	Crear una función con nombre (integracion) que use el método de Simpson para calcular el valor aproximado de cualquier función f (x). Se recomienda analizar lo siguiente:
1.	El tipo de dato que devolverá la función integracion
2.	¿Cuáles son los parámetros que recibe la función?

2.	Aproxima el valor de las siguientes integrales definidas usando la función
integracion creada en el paso 1.
 
5
1. I = ∫
 
(−x2 + 8x − 12)d x ≅ 7.33
 
3
2
2.	I =
0
1
3. I = ∫
 

3x2d x ≅ 8

(x + 2x2 − x3 + 5x4)d x ≅ 3.333
 
−1
2 2x + 1
 
4.	I =
1
1
5.	I =
0
 
x2 + x d x ≅ 1.09861
exd x ≅ 1.71828
 
6.  I = ∫
 
3	1	
 
d x ≅ 0.828427
 
2
1	1	
 
7. I =
0
 
1 + x2 d x ≅ 0.785398
 

3.	Calcula el error que se presenta en cada aproximación. El error es igual al valor absoluto de la resta entre el valor esperado y el valor obtenido, así:

valorEsperado − valor Obtenido

Para calcular el error, debes elaborar una función que haga el cálculo respectivo.

