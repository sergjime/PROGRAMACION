from funciones import *

""" Escribe un programa que te pida una frase y una vocal, y pase estos datos como par�metro
a una funci�n que se encargar� de cambiar todas las vocales de la frase por la vocal seleccionada.
Devolver� la funci�n la frase modificada, y el programa principal la imprimir�: """

frase=raw_input("Escribe una frase: ")
vocal=raw_input("Escribe una vocal: ")

while len(vocal)!=1:
    vocal=raw_input("S�lo una vocal, por favor: ")
    
cadena_modificada=modificar(frase,vocal)

print cadena_modificada
