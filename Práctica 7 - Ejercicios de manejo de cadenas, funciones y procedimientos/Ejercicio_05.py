from funciones import *

""" Escribe un programa que te pida una frase y una vocal, y pase estos datos como parámetro
a una función que se encargará de cambiar todas las vocales de la frase por la vocal seleccionada.
Devolverá la función la frase modificada, y el programa principal la imprimirá: """

frase=raw_input("Escribe una frase: ")
vocal=raw_input("Escribe una vocal: ")

while len(vocal)!=1:
    vocal=raw_input("Sólo una vocal, por favor: ")
    
cadena_modificada=modificar(frase,vocal)

print cadena_modificada
