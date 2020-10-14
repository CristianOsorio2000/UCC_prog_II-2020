Proceso Trabajo_Entregable
	
	Definir dividin, algebrin Como Entero;
	Definir hombre, pedazos_algebrin, pedazos_dividin Como Entero;
	
	algebrin <- 5 ; 
	dividin <- 3;
	
	pedazos_algebrin <- algebrin * 3; 
	pedazos_dividin <- dividin *3;
	hombre <- 0;
	
	pedazos_algebrin <- pedazos_algebrin - 8;
	pedazos_dividin <- pedazos_dividin - 8;
	hombre <- pedazos_algebrin - pedazos_dividin;
	
	Escribir "Total monedas hombre: " , hombre;
	Escribir "Total monedas algebrin: " , pedazos_algebrin;
	Escribir "Total monedas dividin: " , pedazos_dividin;
	
FinProceso
