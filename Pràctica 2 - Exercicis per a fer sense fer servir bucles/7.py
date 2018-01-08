""" Fer un programa que demani un nombre de només 3 xifres a un usuari (per exemple serien vàlids 201, 999 i 113 però no 1001, 99, 1 o 23).
Si l'usuari  entra un nombre que no sigui de 3 xifres ha de donar un error. """

num=int(input("Introduce un numero no superior a tres cifras: "))
num=str(num)
if len(num)!=3:
	print "El numero introducido no tiene tres cifras"
else:
	print "El numero introducido tiene tres cifras, y por lo tanto es correcto"
