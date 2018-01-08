from funciones import *

""" Escribe un programa que pida una frase, y le pase como parámetro a
una función dicha frase. La función debe sustituir todos los espacios
en blanco de una frase por un asterisco, y devolver el resultado para
que el programa principal la imprima por pantalla. """

frase=raw_input("Escribe una frase: ")

asteriscos=sustituto(frase)

print asteriscos
