Proceso entrenamiento_07
	Definir N Como Entero;
	Definir b como logico;
	
	N <- 10;
	b <- Verdadero;
	
	Definir  dos Como Entero;
	Definir uno, tres como logico;
	Definir h Como Caracter;
	
	//el error del ejercicio
	uno <- b; dos <- N; //tres <- 'h';
	
	//ejercicio correcto
	h <- 'h';
	si h == 'h' Entonces
		tres <- Verdadero;
	SiNo
		tres <- Falso;
	FinSi
	
	Escribir "El valor de N es: " , N;
	Escribir "El valor de b es: " , b;
	Escribir "El valor de h es: " , h;	
	
FinProceso
