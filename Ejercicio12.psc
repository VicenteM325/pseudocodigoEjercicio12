Algoritmo Ejercicio12
	Repetir
		Escribir "Ingrese su altura en centímetros: "
		Leer altura
		Escribir "Ingrese su edad: "
		Leer edad
		Escribir "Ingrese su sexo: 1 = Mujer, 2 = Hombre: "
		Leer sexo
		Si sexo == 1 Entonces
			sumamuj = sumamuj + altura
			a <- a+1
		FinSi
		Si sexo == 2 Entonces
			sumahom = sumahom + altura
			b <- b+1
		FinSi
		Si sexo == 1 | sexo == 2 Entonces
			sumaedad = sumaedad + edad
			c <- c+1
		FinSi
	Hasta Que altura <= 0
	promedio1 = sumamuj/a
	promedio2 = sumahom/b
	promedio3 = sumaedad/c
	Escribir "El promedio de la altura de las Mujeres es = " promedio1
	Escribir "El promedio de la altura de los Varones es = " promedio2
	Escribir "El promedio general de las edades es = " promedio3
FinAlgoritmo
