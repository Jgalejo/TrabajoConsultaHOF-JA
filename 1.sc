def integración(a:Int,b:Int,f:Double => Double):Double={
  (b-a)*(f(a)+4*f((a+b)/2)+f(b))/6
}
