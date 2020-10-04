Proceso entrenamiento_05
	Definir  x Como Entero;
	Definir yy Como Logico;
	Definir c Como Caracter;
	
	x <- 10; 
	yy <- Falso; c <- 'a';
	SI X > 0 Entonces
		yy <- Verdadero;
	SiNo
		yy <- Falso;
	FinSi
	c <- 'b';
	yy <- Verdadero;
	
	Escribir "El valor de x es: " , x;
	Escribir "El valor de yy es: " , yy;
	Escribir "El valor de c es: " , c;
	
FinProceso
