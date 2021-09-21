print("Calcular Promedio Final de FP")
#Datos de entrada 
nota1=float(input("Ingrese nota de evaluación 1:"))
nota2=float(input("Ingrese nota de evaluación 2:"))
nota3=float(input("Ingrese nota de evaluación 3:"))
nota4=float(input("Ingrese nota de evaluación 4:"))
nota5=float(input("Ingrese nota de evaluación 5:"))
nota6=float(input("Ingrese nota de evaluación 6:"))
nota7=float(input("Ingrese nota de evaluación 7:"))
#Proceso
proFin=(0.15*nota1)+(0.15*nota2)+(0.10*nota3)+(0.15*nota4)+(0.05*nota5)+(0.10*nota6)+(0.30*nota7)
#Datos de Salida
print(type(proFin))
print("El promedio Final es:", round(proFin,2))