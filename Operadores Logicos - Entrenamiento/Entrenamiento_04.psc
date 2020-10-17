Proceso Entrenamiento_04
	
	Definir resp1, resp2, resp3, resp4, k Como Entero;
	
	Escribir "¿Benjamin Franklin invento el pararrayos? [0]...Falso [1]...Verdad";
	Leer resp1;
	Escribir "¿Samuel Morse invento el telegrafo? [0]...Falso [1]...Verdad";
	Leer resp2;
	Escribir "¿Peru es un país suramericano? [0]...Falso [1]...Verdadero";
	Leer resp3;
	Escribir  "¿5 es un numero primo? [0]...Falso [1]...Verdadero";
	Leer resp4;
	
	SI (resp1 >= resp2) Y (resp3 = resp4) Entonces
		k <- 1;
	SiNo
		k <- 0;
	FinSi
	Escribir "El valor final vale: ", k; 
	
	
FinProceso
