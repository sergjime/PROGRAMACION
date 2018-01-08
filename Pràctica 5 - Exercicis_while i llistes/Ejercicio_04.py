""" Escriu un programa que te demani dos nombres,
de manera que el segon sigui major que el primer.
El programa termina escrivint els dos nombre tal i com es demana. """

num1=input("Introduce un número: ")
print "Introduce un número mayor que" ,num1,":",
num2=input()

while num1>=num2:
    print num2,"no es mayor que" ,num1,". Vuelve a introducir un número",;num2=input()
if num2>num1:
    print "Los números introducidos son",num1,"y",num2,"."
     
