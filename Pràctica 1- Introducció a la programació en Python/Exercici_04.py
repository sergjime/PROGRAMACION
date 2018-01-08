""" Calcular cuál de los dos números es el mayor (en el caso que sean iguales mostrará que son iguales). """

num1=int(input("Introduce un primer numero "))
num2=int(input("Introduce un segundo numero "))
if num1==num2:
	print "Los dos numeros son iguales"
else:
	if num1>num2:
		print "El numero mayor es el primer numero introducido, que es el ",num1
	else:
		print "El numero mayor es el segundo numero introducido, que es el ",num2
